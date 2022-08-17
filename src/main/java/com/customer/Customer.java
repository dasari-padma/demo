package com.customer;
import java.util.*;

 class Customer implements Comparable<Customer>
{
	int cid;
	String name;
	int purchaseAmount;
	int age;
	
	
	Customer(int cid, String name, int purchaseAmount, int age) 
	{
		
		this.cid = cid;
		this.name = name;
		this.purchaseAmount = purchaseAmount;
		this.age = age;
	}
	
	public void setpurchaseAmount(int cid)
	{
		this.purchaseAmount = cid;
	}

	

	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPurchaseAmount() {
		return purchaseAmount;
	}


	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Customer st) {
		if(name==st.name)
			return 0;
		else if(name.compareTo(st.name)<0)
			return 1;
		else
		return -1;
	}

	
}
