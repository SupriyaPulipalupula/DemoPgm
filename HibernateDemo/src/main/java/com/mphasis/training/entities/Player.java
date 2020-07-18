package com.mphasis.training.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	private int pid;
    private String name;
    private String gender;
    private long contact;
    private String email;
    private String teamname;
    private int age;
    private LocalDate dob;
    private int score;
    public Player() {
    	
    }
	public Player(int pid, String name, String gender, long contact, String email, String teamname, int age, LocalDate dob,
			int score) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
		this.teamname = teamname;
		this.age = age;
		this.dob = dob;
		this.score = score;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", gender=" + gender + ", contact=" + contact + ", email="
				+ email + ", teamname=" + teamname + ", age=" + age + ", dob=" + dob + ", score=" + score + "]";
	}
    

}
