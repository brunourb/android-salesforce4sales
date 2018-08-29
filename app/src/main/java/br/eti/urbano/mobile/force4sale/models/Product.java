package br.eti.urbano.mobile.force4sale.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {

	private String name;

	private String description;

	private BigDecimal value;

	private List<Photo> photo;

	private Integer quantity;

	public Product(String name, String description, BigDecimal value, Integer quantity) {
		this.name = name;
		this.description = description;
		this.value = value;
		this.quantity = quantity;
		this.photo = new ArrayList<Photo>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public List<Photo> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", value=" + value +
				", photo=" + photo +
				", quantity=" + quantity +
				'}';
	}
}
