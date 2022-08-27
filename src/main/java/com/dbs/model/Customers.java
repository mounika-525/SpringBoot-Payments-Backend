package com.dbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {

	@Id
	@Column
	private String cust_id;
	@Column
	private String cust_name;
	@Column
	private double clear_balance;
	@Column
	private String overdraft;
	
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(String cust_id, String cust_name, double clear_balance, String overdraft) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.clear_balance = clear_balance;
		this.overdraft = overdraft;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public double getClear_balance() {
		return clear_balance;
	}
	public void setClear_balance(double clear_balance) {
		this.clear_balance = clear_balance;
	}
	public String getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}
	
	
	
	@Override
	public String toString() {
		if(cust_name != null)
		return "Banks [cust_id=" + cust_id + ", cust_name=" + cust_name + ", clear_balance=" + clear_balance
				+ ", overdraft=" + overdraft + "]";
		
		else
			return "Customer not found";
		}
	}
	
	
	
	
