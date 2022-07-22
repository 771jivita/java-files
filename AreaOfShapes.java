public class AreaOfShapes{
double pi=3.14;
public void area(int a,int b){
System.out.println("area of rectangle="+(a*b));
}
public void area(int a){
System.out.println("area of square="+(a*a));
}
public void area(float r){
System.out.println("area of circle="+(pi*r*r));
}
public static void main(String args[]){
AreaOfShapes obj1= new AreaOfShapes();
obj1.area(1,2);
obj1.area(2);
obj1.area(6f);
}
}

