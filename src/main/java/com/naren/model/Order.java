package com.naren.model;

import lombok.Data;

@Data
public class Order {
	private String name;
	private String cardType;
	private Integer discount;
	private Integer price;
}
