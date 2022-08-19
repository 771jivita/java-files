class Girl{
void method1(){
int age=21;
String name="Jivita";
System.out.println("Age is "+age+", Name is "+name+", This is parent class");
}}
public class Jivita extends Girl{
void method2(){
int a=1;
int b=2;
int c=a+b;
System.out.println(c+", This is child class");
}
public static void main(String args[]){
Girl objj=new Girl();
objj.method1();
Jivita obj=new Jivita();
obj.method1();
obj.method2();
}
}