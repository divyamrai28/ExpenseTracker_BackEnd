package com.rai.ExpenseTrackerBackEnd.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document("ExpenseTracker")
@ToString
public class ExpenseTracker {

	//https://youtu.be/G3IyZvR2VW0?t=3434
	
	@Id
	private Integer id;
	
	private String expenses;
	private String description;
	private Integer amount;
	
	public ExpenseTracker() {
		super();
	}

	public ExpenseTracker(Integer id, String expenses, String description, Integer amount) {
		super();
		this.id = id;
		this.expenses = expenses;
		this.description = description;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getExpenses() {
		return expenses;
	}
	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}

