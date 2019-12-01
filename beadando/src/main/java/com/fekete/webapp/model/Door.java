package com.fekete.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Door {
	@Id
	private int id;
	private String name;
	private int height;
	private int width;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Door [id=" + id + ", name=" + name + ", height=" + height + ", width=" + width + "]";
	}

}
