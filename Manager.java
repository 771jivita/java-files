class Member{
void printSalary(String Name,int Age,String Phone_Number,String Address,int Salary){
System.out.println(Salary);
}
public class Employee extends Member{
void method1(){
String Specialization="CSE";
String Department= "BTECH";
System.out.println(Specialization + Department);
}}
public class Manager extends Member{
void method2(){	
String Specialization= "CSE";
String Department= "BTECH";
System.out.println(Specialization + Department);
}}
public static void main(String args[]){
Employee obj=new Employee();
obj.printSalary("Jivita",21,"981111111111",Garhdiwala,50000);
Manager obj1 =new Employee();
obj1.printSalary("aaa",21,"981111111111",Garhdiwala,80000);
obj1.method2();
obj1.method1();
}
}
