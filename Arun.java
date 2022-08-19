class Boy{
void method1(){
int age=9;
String name="Arun";
System.out.println(age+name);
}}
public class Arun extends Boy{
void method2(){
int a=1;
int b=2;
int c=a+b;
System.out.println(c);
}
public static void main(String args[]){
Arun obj=new Arun();
obj.method1();
obj.method2();
}
}