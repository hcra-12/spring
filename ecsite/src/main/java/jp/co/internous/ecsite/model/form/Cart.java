package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String goodsName;
	private long price;
	private long count;
	
	//ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//GOODSNAME
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	//PRICE
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	//COUNT
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
}
