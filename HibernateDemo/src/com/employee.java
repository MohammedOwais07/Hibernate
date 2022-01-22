package com;

public class employee {
	

private int id;
private String name;
private int age;
private String addr;
private int sal;


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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + ", sal=" + sal + "]";
}


}
