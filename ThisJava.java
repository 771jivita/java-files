public class ThisJava{
String name;
String college;
ThisJava(){
System.out.println("default called");
}
ThisJava(String name, String college)
{
this();
this.name=name;
this.college=college;
System.out.println("name="+this.name+"college="+this.college);
}
void getName(String name){
this.name=name;
}
void getCollege(String college,String name)
{
this.getName(name);
this.college=college;
System.out.println("name is"+this.name+"college is ="+this.college);
}
public static void main(String args[]){
ThisJava thisj=new ThisJava("name", "college");
thisj.getCollege("college name","student name");
}
}
