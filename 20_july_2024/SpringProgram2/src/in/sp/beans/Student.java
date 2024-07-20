package in.sp.beans;

public class Student {
    private String name;
    private int rollno;
    private String email;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollno
    public int getRollno() {
        return rollno;
    }

    // Setter for rollno
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
        System.out.println("Email: " + email);
    }
}
