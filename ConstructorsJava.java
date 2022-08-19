public class ConstructorsJava{
String studentName;
String subject;
public ConstructorsJava(){
System.out.println("default costructor");
}
public ConstructorsJava(String sName,String subject){
studentName=sName;
this.subject=subject;
}
public ConstructorsJava(ConstructorsJava variable){
studentName= variable.studentName;
subject= variable.subject;
}
public static void main(String args[]){
ConstructorsJava Sheral=new ConstructorsJava();
Sheral.studentName="Sheral";
Sheral.subject="Java";
System.out.println("Sheral"+ Sheral.studentName);
System.out.println("Sheral"+ Sheral.subject);

ConstructorsJava Anshu =new ConstructorsJava("Anshu","Java");
System.out.println("Anshu"+ Anshu.studentName);
System.out.println("Anshu"+ Anshu.subject);

ConstructorsJava Ajay=new ConstructorsJava(Anshu);
System.out.println("Ajay"+ Ajay.studentName);
System.out.println("Ajay"+ Ajay.subject);

}}