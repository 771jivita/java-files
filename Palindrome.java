public class Palindrome {
public static void main(String args[]){
int reverseNo=0;
int originalNo=2442;
int temp= originalNo;
int remainder=1;
while (temp>1)
{
remainder=temp%10;
reverseNo=((reverseNo*10)+remainder);
temp=temp/10;
} 
if(originalNo== reverseNo){
System.out.println("is palindrome");
}
else
{
System.out.println("not palindrome");
} 
}}