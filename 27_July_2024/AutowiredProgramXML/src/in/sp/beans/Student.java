package in.sp.beans;

public class Student {
	
	private String name;
	private int rollno;
	private Address address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println(" address setter mthod is called");
		this.address = address;
	}
	public void display() {
		
		System.out.println("Name: "+ name);
		
		System.out.println("Rollno: "+ rollno);
		
		System.out.println("Address: "+ address);
	}

}
