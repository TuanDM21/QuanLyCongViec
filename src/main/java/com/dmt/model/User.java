package com.dmt.model;

import java.sql.Date;

public class User {
	private int ID;
	private String Username;
	private String Pass;
	private String Ten;
	private Date Tuoi;
	private int ID_Role;
	private int ID_Project;
	private boolean IsActive;
	private int CountTask;
	private int CountProject;
	private java.util.Date NgayKy;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int Id ,String username, String pass, String ten, Date tuoi, int iD_Role, int iD_Project, boolean isActive) {
		super();
		ID = Id;
		Username = username;
		Pass = pass;
		Ten = ten;
		Tuoi = tuoi;
		ID_Role = iD_Role;
		ID_Project = iD_Project;
		IsActive = isActive;
	}
	public User(int Id ,String username, String pass, String ten, Date tuoi, int iD_Role, int iD_Project, boolean isActive, int countTask, int countProject, java.util.Date ngayKy) {
		super();
		ID = Id;
		Username = username;
		Pass = pass;
		Ten = ten;
		Tuoi = tuoi;
		ID_Role = iD_Role;
		ID_Project = iD_Project;
		IsActive = isActive;
		CountProject = countProject;
		CountTask = countTask;
		NgayKy = ngayKy;
	}
	public User(int Id ,String username, String pass, String ten, Date tuoi, int iD_Role, boolean isActive) {
		super();
		ID = Id;
		Username = username;
		Pass = pass;
		Ten = ten;
		Tuoi = tuoi;
		ID_Role = iD_Role;
		IsActive = isActive;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public Date getTuoi() {
		return Tuoi;
	}
	public void setTuoi(Date tuoi) {
		Tuoi = tuoi;
	}
	public int getID_Role() {
		return ID_Role;
	}
	public void setID_Role(int iD_Role) {
		ID_Role = iD_Role;
	}
	public int getID_Project() {
		return ID_Project;
	}
	public void setID_Project(int iD_Project) {
		ID_Project = iD_Project;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCountTask() {
		return CountTask;
	}
	public void setCountTask(int countTask) {
		CountTask = countTask;
	}
	public int getCountProject() {
		return CountProject;
	}
	public void setCountProject(int countProject) {
		CountProject = countProject;
	}
	public java.util.Date getNgayKy() {
		return NgayKy;
	}
	public void setNgayKy(java.util.Date ngayKy) {
		NgayKy = ngayKy;
	}
	
	
	
}
