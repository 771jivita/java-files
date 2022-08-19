class AnimalSuperClass{
String color="Black";
String activity;
final float gst=0.18f;
AnimalSuperClass(String activity){
this.activity=activity;
System.out.println("Constructor called");
}
void getActivity(){
System.out.println("Animal is walking");
}
}

class Dog extends AnimalSuperClass{
private String color;
Dog(String activity){
super(activity);
}
void setColor(String color){
this.color=color;
System.out.println("color is"+this.color+"parent color"+super.color);
}

 void getActivity(){
 super.getActivity();
 System.out.println("Animal is barking");
 } 
 }
 public class superjava{
 public static void main(String args[]){
 Dog dog=new Dog("walk");
 dog.setColor("white");
 dog.getActivity();
 }
}