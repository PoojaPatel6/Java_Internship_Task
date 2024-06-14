class Demo1{

int x,y;
Demo1(){
x = 5;
y = 6;

}
void f1(){
x = 22;
y = 34;

}

}

class Construct1{

public static void main(String[]args){

Demo1 d1 = new Demo1();
d1.f1();
System.out.println(d1.x);
System.out.println(d1.y);

}
}


