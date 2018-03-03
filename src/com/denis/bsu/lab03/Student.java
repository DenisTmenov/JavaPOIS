package com.denis.bsu.lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Student {
	private String name;
	private String surename;
	private int age;
	private boolean alive;
	private boolean sleep;
	private boolean relax;
	private boolean learn;
	private List<Student> friends;

	public void startLern() {
		this.learn = true;
	}

	public Student() {
		this.alive = true;
		this.friends = new ArrayList<>();
	}

	public Student(String name, String surename, int age) {
		this();
		this.name = name;
		this.surename = surename;
		this.age = age;
	}

	public void startSleep() {
		this.sleep = true;
	}

	public void startRelax() {
		this.relax = true;
	}

	public void breakLern() {
		this.learn = false;
	}

	public void breakSleep() {
		this.sleep = false;
		;
	}

	public void breakRelax() {
		this.relax = false;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public boolean isLearn() {
		return this.learn;
	}

	public boolean isRelax() {
		return this.relax;
	}

	public boolean isSleep() {
		return this.sleep;
	}

	public void sayPhrase(String phrase) {
		StringJoiner sj = new StringJoiner(" ");
		sj.add(this.name).add(this.surename + ",").add("say").add("-->").add(phrase);
		System.out.println(sj.toString());
	}

	public String getName() {
		return name;
	}

	public String getSurename() {
		return surename;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public void setRelax(boolean relax) {
		this.relax = relax;
	}

	public void setLearn(boolean learn) {
		this.learn = learn;
	}

	public int getCountFriend() {
		return this.friends.size();
	}

	public boolean haveFriend() {
		if (this.friends.size() > 0) {
			return true;
		}
		return false;
	}

	public void setFriend(Student student) {
		this.friends.add(student);
	}

	public boolean removeFriend(Student student) {
		if (this.friends.contains(student)) {
			this.friends.remove(student);
			return true;
		}
		return false;
	}

	public List<Student> getFriends() {
		return friends;
	}

	public void setFriends(List<Student> friends) {
		this.friends = friends;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (alive ? 1231 : 1237);
		result = prime * result + (learn ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (relax ? 1231 : 1237);
		result = prime * result + (sleep ? 1231 : 1237);
		result = prime * result + ((surename == null) ? 0 : surename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (alive != other.alive)
			return false;
		if (learn != other.learn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (relax != other.relax)
			return false;
		if (sleep != other.sleep)
			return false;
		if (surename == null) {
			if (other.surename != null)
				return false;
		} else if (!surename.equals(other.surename))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surename=" + surename + ", age=" + age + ", alive=" + alive + ", sleep="
				+ sleep + ", relax=" + relax + ", learn=" + learn + "]";
	}

}
