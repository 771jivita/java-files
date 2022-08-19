public class Factoriall{
public int fact(int a){
if(a>1){
return a*fact(a-1);
}else{
return 1;}
}
public static void main(String args[]){
Factoriall obj1=new Factoriall();
System.out.println("Factorial is "+obj1.fact(5));

}
}
