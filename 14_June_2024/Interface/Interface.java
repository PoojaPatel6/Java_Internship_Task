interface  i1{
int x = 5;

void f1();
static void f2()
{
System.out.println(x);

}
}
interface i2 extends i1{
int y = 2;

static void f2()
{
System.out.println(x);

}
void f3();
}
class c1  implements i2{

public void f1(){

}
public void f3(){

}
static void f2()
{
System.out.println(x);

}

}


class Interface{

public static void main(String[]args){
c1 C1 = new c1();
i2.f2();
//c1.f2();
//System.out.println(c1.y);


//i1.f2();

}

}
