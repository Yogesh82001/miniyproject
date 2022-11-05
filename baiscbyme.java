import java.util.Scanner;
public class baiscbyme {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:->");
        //char a=sc.next().charAt(0);
        //int num=sc.nextInt();
        //int i=1;
        // problem 1-> print the given range using while loop
        //while(i<=num){
          //  System.out.println(i);
            //i++};
        // problem 2-> Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
          
          //  while(num>0){
          //System.out.println(num);
            //num--;
            //}
            // problem 3->Write a C program to print all alphabets from A to Z. - using while loop
        // char b='A';
         //while(b<=a){
           // System.out.println(b);
            //b++;
         //}
// prime number 
int a=sc.nextInt();
int t;
int rev=0;
int count=0;
while(a>0){
  rev=(rev*10)+a%10;
  a/=10;
  count++;
}
System.out.println("total number of count "+count);
/* 
System.out.println("reverse of a "+t+"="+rev);
if(rev==t){
  System.out.println("it is palindrome");
}
else{
  System.out.println("it is not a palindrom");

}*/




        }

    }
    

