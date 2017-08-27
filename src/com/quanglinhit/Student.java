package com.quanglinhit;

public class Student {
	private String name;
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	private String phone;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String name,String code, String phone, String address) {
		super();
		this.name = name;
		this.code = code;
		this.phone = phone;
		this.address = address;
	}
	public Student() {
		super();
	}
}
