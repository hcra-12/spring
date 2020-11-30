package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long userId;
	private List<Cart> cartList;
	
	//ID
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	//CARTLIST
	public List<Cart> getCartList(){
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
}
