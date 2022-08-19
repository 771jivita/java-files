public class Pattern5{

public void star1(){
int n=5;
int count=1;
for(int i=n;i>=1;i--){

for(int j=1;j<=i;j++){

if(j==i){
System.out.print(count);
count++;
}

else{
System.out.print("*");
}

}        //for j

System.out.println();
}        //for i
 }        //method 1


public void star2(){
int n=6;
int count=5;
for(int i=n;i>=1;i--){

for(int j=1;j<=i;j++){

if(j==i){
System.out.print(count);
count--;
}

else{
System.out.print("*");
}

}        //for j

System.out.println();
}        //for i
 }        //method 2

public static void main(String args[]){
Pattern5 obj1= new Pattern5();
obj1.star1();
obj1.star2();
}                //main method
}                //class
