package com.ex.entity;

import java.io.Serializable;
import java.util.*;

public class Exhibition implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String subject;
	private Date startDate;
	private Date endDate;
	private double price;
	private int placeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getStartdate() {
		return startDate;
	}

	public void setStartdate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEnddate() {
		return endDate;
	}

	public void setEnddate(Date endDate) {
		this.endDate = endDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPlace_id() {
		return placeId;
	}

	public void setPlace_id(int Place_id) {
		this.placeId = Place_id;
	}

	public static class Builder {
		private String name;
		private String subject;
		private Date startDate;
		private Date endDate;
		private double price;
		private int placeId;

		public Builder name(String val) {
			name = val;
			return this;
		}

		public Builder subject(String val) {
			subject = val;
			return this;
		}

		public Builder startDate(Date val) {
			startDate = val;
			return this;
		}

		public Builder endDate(Date val) {
			endDate = val;
			return this;
		}

		public Builder price(double val) {
			price = val;
			return this;
		}

		public Builder placeId(int val) {
			placeId = val;
			return this;
		}

		public Exhibition build() {
			return new Exhibition(this);
		}
	}

	private Exhibition(Builder builder) {
		name = builder.name;
		subject = builder.subject;
		startDate = builder.startDate;
		endDate = builder.endDate;
		price = builder.price;
		placeId = builder.placeId;
	}
}
