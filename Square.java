import java.util.*;
class Shape{
int a;
int b;
public void getLB(){
Scanner sc=new Scanner(System.in);
System.out.println("enter length");
a= sc.nextInt();
System.out.println("enter breadth");
b= sc.nextInt();
}
}
class Square extends Shape{
public void getLB(){
super.getLB();
int c=super.a*super.b;
System.out.println("Area is"+c);
} 
public static void main(String args[]){
Square obj=new Square();
obj.getLB();
}}