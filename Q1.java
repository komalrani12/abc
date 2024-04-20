 import java.util.Scanner;
 public  class Q1{
    public static void main(String[] args) {
        // System.out.println("hello world");
        // int a=10; 
        // int b=20;
        // int sum=a+b;
        // System.out.println(sum);
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your line");
        // String word=sc.next();
        int line=sc.nextInt();
        System.out.println("enter your line"+line);
        System.out.println("enter your float");
         float num=sc.nextFloat();
         System.out.println("enter your float"+num);
         System.out.println("enter your String");
         String str=sc.next();
         System.out.println("enter your String"+str);
        //circle
        System.out.println("enter your radious");
         int r=sc.nextInt();
         float  Pr=3.14f;
         float area=r*r *3.14f;
         System.out.println(area);

    }

}