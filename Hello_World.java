import java.util.Scanner;
public class Hello_World {
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
int i=1;
int enteredNumber=1;
while(enteredNumber>=1&& enteredNumber<10){
System.out.println("enter any no. between 1 and 9");
enteredNumber= scanner.nextInt();
for(int j=1;j<i;j++){
System.out.println("Hello World");
}
i++;
}
System.out.println("bye bye");
}
}