package com.erwindev.job.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int id;
	private Date createdDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

    @Override
	public String toString() {
        StringBuffer ret = new StringBuffer();
        ret.append("id='" + id + "'\n");
        ret.append("name='" + name + "'\n");
        ret.append("createdDate='" + createdDate + "'\n");
        return ret.toString();
    }	
}
