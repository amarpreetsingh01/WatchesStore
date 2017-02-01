package watchesstore.model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class Cart implements java.io.Serializable{
		@Id
		@GeneratedValue
		int cartId;
		private int itemId;
		private String custName ;
		@Transient
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		public int getCartId() {
			return cartId;
		}
		public void setCartId(int cartId) {
			this.cartId = cartId;
		}
		public ArrayList<Integer> getItems() {
			return al;
		}
		public void setItems(int itemId) {
			this.itemId=itemId;
			al.add(itemId);
			
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		
}
