package in.sp.beans;

public class Student {
	
	private int rollno;
	private String name;
	private String address;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("setter method rollno");
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter method name");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("setter method address");
		this.address = address;
	}
	public void display() {
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}

}
