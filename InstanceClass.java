class InstanceClass{
static int a=20;                  //static variable 
int b=30;                        //instance variable
public static void main(String args[]){
int c=40;                        //local variable
System.out.println(c);
InstanceClass obj1 = new InstanceClass();
System.out.println(a);
System.out.println(obj1.b);
}}