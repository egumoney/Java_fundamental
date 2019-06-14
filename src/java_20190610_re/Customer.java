package java_20190610_re;

import java.util.ArrayList;

public class Customer extends Parent {
	/*
	String name;
	String cphone;
	*/
	ArrayList<Customer> list = new ArrayList<Customer>();
	//원래는 이러면 안좋지만 예시를 위해 만듬 
	

	public Customer(String name, String cphone) {
		super();
		this.name = name;
		this.cphone = cphone; 
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void insert(){ // 
		list.add(new Customer(name,cphone));
	}
	
	public void delete(int i){
		list.remove(i);
	}
	
	
	
	
}
