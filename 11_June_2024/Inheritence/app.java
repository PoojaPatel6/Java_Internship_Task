 
// import javax.management.ObjectName;

import calc.Addition;
public class app{
public static void main(String[]args){

// making multiple objects

Addition obj = new Addition();
int res = obj.add(2,6);
int res1 = obj.sub(8,4);
int res2 = obj.div(8,4);
int res3 = obj.multi(3,4);
System.out.println("Addition: " + res);
System.out.println("Subtraction: " + res1);
System.out.println("Division: " + res2);
System.out.println("Multiply: " + res3);



// 2nd method  make single object

// Addition obj = new Addition();
// System.out.println("Addition: " + obj.add(5,8));
// System.out.println("Subtraction: " +obj.sub(8,4));
// System.out.println("Division: " + obj.div(4,2));
// System.out.println("Multiply: " + obj.multi(3,3));


    }
}