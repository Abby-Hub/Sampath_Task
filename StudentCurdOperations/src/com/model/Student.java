package com.model;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private String addr;
	private Date joinDate;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	
	@Override
	public String toString() {
		return getId()+"\t"+getName()+" \t"+getAddr()+"\t"+getJoinDate();
	}

}