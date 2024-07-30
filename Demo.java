package LocalRepo;
import java.util.*;


 class Demo {
    
    void sum(){
    int c;
        System.out.println("Enter the value of a and b");
        Scanner sc = new Scanner(System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
    c=a+b;
        System.out.println("Sum of  a and b =" +c );
    }

    public static void main(String[] args) {4
        Demo d1 = new Demo();
        d1.sum();
        
    }

    
}