package com.swu.user.bean;

public class User {
	private int uid;
	private String uname;
	private String upass;
	private String udes;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUdes() {
		return udes;
	}
	public void setUdes(String udes) {
		this.udes = udes;
	}
	public User(int uid, String uname, String upass, String udes) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.udes = udes;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass
				+ ", udes=" + udes + "]";
	}
	public static String mytest()
	{
		return "mytest";
	}
}
