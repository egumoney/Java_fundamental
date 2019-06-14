package java_20190610_re;

import java.util.ArrayList;

public class Manager extends Parent{
/*	String name;
	String cphone;*/
	String address;
	String id;
	String password;
	ArrayList<Manager> list= new ArrayList<Manager>();
	
	public Manager(String name, String cphone, String address, String id, String password) {
		super();
		this.name = name;
		this.cphone = cphone;
		this.address = address;
		this.id = id;
		this.password = password;
	}
	
	
	
	public void insert(){
		list.add(new Manager(name, cphone, address, id, password));// 아래소스를 관략화 한것 
		/*
		Manager m= new Manager();
		m.name="";
		m.cphone="";
		m.address="";
		m.id="";
		m.password="";
		list.add(m);*/
		
		
		/*
		  
		 * */
	}
	
	public void delete(int i){
		list.remove(i);
	}
	
	
}
