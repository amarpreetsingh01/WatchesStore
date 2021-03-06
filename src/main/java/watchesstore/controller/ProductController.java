package watchesstore.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import watchesstore.model.Authentication;
import watchesstore.model.Authorization;
import watchesstore.model.Cart;
import watchesstore.model.Customer;
import watchesstore.model.Product;
import watchesstore.service.AuthenticationService;
import watchesstore.service.AuthorizationService;
import watchesstore.service.CartService;
import watchesstore.service.CustomerService;
import watchesstore.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ServletContext ctx;
	public ProductController() {

	}

	@Autowired
	ProductService pservice;

	public ProductController(ProductService pservice) {
		this.pservice = pservice;

	}

	@Autowired
	AuthenticationService aservice;

	public ProductController(AuthenticationService aservice) {
		this.aservice = aservice;

	}

	@Autowired
	AuthorizationService bservice;

	public ProductController(AuthorizationService bservice) {
		this.bservice = bservice;

	}
	
	@Autowired
	CartService cservice;
	public ProductController(CartService cservice) {
		this.cservice = cservice;

	}
	@Autowired
	CustomerService custservice;
	public ProductController(CustomerService custservice) {
		this.custservice = custservice;

	}

	@Autowired
	ServletContext context;
//-------------------PRODUCT----------------------------------------------------------------------------------------
	@RequestMapping("/addaproduct")
	public ModelAndView showAddProductPage() {
		return new ModelAndView("addaproduct", "product", new Product());
	}

	@RequestMapping("/addproductdb")
	public String addProductPage(@Valid @ModelAttribute("product") Product p, BindingResult result) {
		if (result.hasErrors())
			return "addaproduct";
		else {
			pservice.add(p);
			// ---------------file upload---------------------------------
			String path = context.getRealPath("/resources/" + p.getId() + ".jpg");
			System.out.println("Path = " + path);
			System.out.println("File name = " + p.getImage().getOriginalFilename());
			File f = new File(path);
			if (!p.getImage().isEmpty()) {
				try {

					byte[] bytes = p.getImage().getBytes();
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
					bs.write(bytes);
					bs.close();
					System.out.println("Image uploaded");

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
			return "index";
		}
	}

	@RequestMapping("/showallproducts")
	public String showProductsPage(ModelMap model) {
		ArrayList<Product> plist = pservice.getAllProducts();
		model.addAttribute("prodlist", plist);
		return "products";
	}

	@RequestMapping("/update")
	public ModelAndView showupdatePage(@RequestParam("pid") String pid) {
		Product p = pservice.getProduct(Integer.parseInt(pid));
		// model.addAttribute("prod",p);
		return new ModelAndView("update", "product", p);
	}

	@RequestMapping("/updateproductdb")
	public String update(@ModelAttribute("product") Product p) {
		/*
		 * Product prod=pservice.getProduct(Integer.parseInt(pid));
		 * prod.setId(p.getId()); prod.setName(p.getName());
		 * prod.setDescription(p.getDescription()); prod.setPrice(p.getPrice());
		 * prod.setCategory(p.getCategory());
		 */

		pservice.update(p);
		return "index";
	}

	@RequestMapping("delete")
	public String delete(@RequestParam("pid") String pid) {
		Product p = pservice.getProduct(Integer.parseInt(pid));
		pservice.delete(p);
		return "index";
	}
//-----------------------------LOGIN---------------------------------------------------------------------
	@RequestMapping("/signup")
	public ModelAndView AuthenticationPage() {
		return new ModelAndView("signup", "authentication", new Authentication());
	}

	@RequestMapping("/register")
	public String addUser(@Valid @ModelAttribute("authentication") Authentication a, BindingResult result) {
		System.out.println("register" + a.getUsername() + " " + a.getContact());

		if (result.hasErrors())
			return "signup";
		else {
			// ADD USER IN AUTHENTICATION
			aservice.add(a);

			Authorization auth = new Authorization();
			auth.setRoleName("USER");
			auth.setUserName(a.getUsername());
			// ADD USER IN AUTHORIZATION
			bservice.add(auth);
			return "index";
		}
	}
//-------------------------------------CART----------------------------------------------------------------
	@RequestMapping("cart")
	public String cartPage(@RequestParam("pid")String pid) {
		ctx.setAttribute("pid", Integer.parseInt(pid));
		return "cart";
	}
	@RequestMapping("addToCart")
	public ModelAndView addToCart(@RequestParam("itemId")String itemId,@RequestParam("custName")String custName) {
		Cart c=new Cart();
		c.setCustName(custName);
		c.setItems(Integer.parseInt(itemId));		
		//add cart
		cservice.add(c);	
		long itemCount=cservice.count(custName);
		ctx.setAttribute("itemCount", itemCount);
		return new ModelAndView("viewCart");
	}
	/*@RequestMapping("viewCart")
	public String showViewCartPage() {
		int itemCount=cservice.count("xxx");
		ctx.setAttribute("itemCount", itemCount);
		return "viewCart";
	}*/
	@RequestMapping("orderNow")
	public String showCollectCustomerInfo(@Valid @ModelAttribute("customer")Customer cust,BindingResult result) {
		if(result.hasErrors()){
			return "collectCustomerInfo";
		}
		else{
			custservice.add(cust);
		}
		return "orderConfirm";
	}
	@RequestMapping("orderConfirm")
	public String showConfirmPage() {
		return "orderConfirm";
	}
	@RequestMapping("thanks")
	public String showThanksPage() {
		return "thanks";
	}
	
}
