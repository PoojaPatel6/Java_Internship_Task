package in.sp.beans;

public class Employee {
	
	String name;
	String mail;
	String phone;
	String skill;

	
	
	// self make
	
//	public void Employee() {
//	
//	
//}
//public String getName() {
//	
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}

	
	
	
	// generate getter and setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

public void interview() {
	System.out.println(name +" has been called for interview"+phone+"--"+mail);
	System.out.println(skill);
}
	
}
