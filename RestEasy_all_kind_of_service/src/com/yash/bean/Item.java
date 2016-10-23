package com.yash.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Items")
public class Item {
	public Item() {

	}

	public Item(String name, String color, String desc, int id) {
		this.name = name;
		this.description = desc;
		this.id = id;
		this.color = color;
	}

	private String name;
	private String color;
	private String description;
	private int id;

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "Item [name=" + name + ", color=" + color + ", description="
				+ description + ", id=" + id + "]";
	}

}
