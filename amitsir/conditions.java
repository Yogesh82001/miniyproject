package amitsir;
import java.util.Scanner;


public class conditions {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // find odd number for a give range:->
       /*  System.out.println("Enter the value of Range");
        int n=sc.nextInt();
         for(int i=1;i<=n;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    }*/
    
    // to find factors and find the given number is perfect or not
    // perfect number-> n=6  factors of 6=1,2,3;
    //1+2+3=6   6=6 
    System.out.println("enter the value to find factors");

    int m=sc.nextInt();
    for(int i=1;i<=m;i++){
        if(m%i==0){
            i+=i;
          //  System.out.println(i);
          if(i==m){
            System.out.println(m+" is perfact number ");
          }

        }
        
    }

    
}
}