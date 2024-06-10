class Student{

private int rolln;
private double per;
private int marks;


void setData(){
rolln = 1;
per = 60.5;
marks = 450;

}

void display(){
System.out.println(rolln);
System.out.println(per);
System.out.println(marks);
}
}

class CAndO{
public static void main(String[] args){

Student s1 = new Student();
s1.display();
s1.setData();
s1.display();

}

}


