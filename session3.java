import java.util.*;
public class session3 {

    public static void main(String[] args) {
        session3 s=new session3();
        Scanner s1=new Scanner(System.in); // classname objname=new classname();
        
        System.out.println(args[0]);
        // System.out.println("enter value of a");
        // int a=s1.nextInt();

        // System.out.println("enter value of b");
        // int b=s1.nextInt();
    //    System.out.println(a+b);
    //    System.out.println(a-b);

    //    System.out.println(a*b);

    //    System.out.println(a/b); //Q=1
    //    System.out.println(a%b); //R=10
    //  a++;
    //  System.out.println(a);
    //  b--;
    //  System.out.println(b);

    //  if(a==b){
    //     System.out.println("a is equal to b");
    //  }
    //   if(a<b){
    //     System.out.println("a is less than b");
    //  }
    //   if(a>b){
    //     System.out.println("a is greater than b");
    //  }
    //   if(a!=b){
    //         System.out.println("a is not equal to b");
    //   }


    // if(a>b && a>50){
    //     System.out.println("a is greater than 50 and a is greater than b");
    // }


    // if(a>b || a>50){
    //     System.out.println("a is greater than 50 or a is greater than b");
    // }



    // a+=b; //a=a+b   a=25+5 a=30
    // System.out.println(a);

    // a-=b;  //a=a-b a=30-5 a=25
    // System.out.println(a);

    // a*=b;  //a=a*b a=25*5 a=125
    // System.out.println(a);

    // a/=b; // a=a/b a=125/5 a=25
    // System.out.println(a);

    // a%=b;  //a=a%b a=25%5 a=0
    // System.out.println(a);

    // a=b;
    // System.out.println(a);


    //Switch case
    // System.out.println("Enter the number of the day");
    // String day=s1.nextLine();
    
    // switch(day) {

    //     case "Monday":
    //           System.out.println("Monday");
    //           break;

    //     case "Tuesday":
    //         System.out.println("Tuesday");
    //         break;
        
    //     case "Wednesday":
    //         System.out.println("wednesday");
    //         break;
        
    //     case "Thursday":
    //     System.out.println("Thursday");
    //     break;

    //     case "Friday":
    //     System.out.println("Saturday");
    //     break;

    //     case "Saturday":
    //     System.out.println("Saturday");
    //     break;

    //     case "Sunday":
    //     System.out.println("Sunday");
    //     break;

    //     default:
    //     System.out.println("Invalid Input");

    // }

    //Arrays

     //0 length-1

    // System.out.println("arrays length="+a.length);

    // System.out.println("Array's 5th index ="+a[4]);
 
    int a[]={1,2,15, 13,12,3,4,5,6,7,8,9,10};
    // for(int i=0;i<a.length;i++){
    //     //0 1 2 3 a[2] 
    //     System.out.println(i+" th element of array ="+ a[i]);
    // }

    for (int i : a) {
        System.out.println(" array element =" +i);
        
    }

    }

}
