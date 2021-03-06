package com.situ.mall.vo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CartVo {
	private List<CartItemsVo> itemsList = new ArrayList<CartItemsVo>();
	
	private Integer productId;
	
	public void addItems(CartItemsVo items) {
		boolean flag = false;
		for (CartItemsVo item : itemsList) {
			if (item.getProduct().getId() == items.getProduct().getId()) {
				flag = true;
				int amount = item.getAmount() + items.getAmount();
				if (amount > item.getProduct().getStock()) {
					item.setAmount(item.getProduct().getStock());
				} else {
					item.setAmount(amount);
				}
			}
		}
		if (!flag) {
			itemsList.add(items);
		}
	}

	public void delteItems(Integer productId) {
		Iterator<CartItemsVo> iterator = itemsList.iterator();
		while (iterator.hasNext()) {
			CartItemsVo cartItems = iterator.next();
			if (cartItems.getProduct().getId() == productId) {
				iterator.remove();
			}
		}
	}
	
	@JsonIgnore
	public double getTotalPrice() {
		Double totalPrice = 0.0;
		for (CartItemsVo item : itemsList) {
			if (item.getChecked() == 1) {
				totalPrice += item.getAmount() * item.getProduct().getPrice().doubleValue();
			}
		}
		return totalPrice;
	}
	public List<CartItemsVo> getItemsList() {
		return itemsList;
	}



	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setItemsList(List<CartItemsVo> itemsList) {
		this.itemsList = itemsList;
	}

	@Override
	public String toString() {
		return "Cart [itemsList=" + itemsList + ", productId=" + productId + "]";
	}





	
	
	
}
