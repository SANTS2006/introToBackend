package learnjava;

import java.util.Scanner;

class Student{
    int age;
    String name;
    double GPA;
}

public class first {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");

        Student stud = new Student();
        stud.name = "Newton";
        stud.age = 45;
        stud.GPA = 5.0;

        System.out.println("Hello Java, my name is " + stud.name + " and I am "+ stud.age + " years old. I am praying and hoping to get " + stud.GPA + " this semester.");

        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("My name is "+ name);

        System.out.println();

        Newton();

        System.out.println();

        int result = add(4,6);
        System.out.println("The sum of the number are " + result);

        String show = knowName();
        System.out.println();
        System.out.println(show);

        scan.close();
    }

    public static void Newton(){
        Scanner new1 = new Scanner(System.in);
       int[] arr  = new int[5];
       String[] names = new String[5];

       System.out.println("Please Enter five (5) numbers");
        for(int i= 0; i<5; i++){
            arr[i] = new1.nextInt();
        }
        System.out.println("The five numbers are");
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        System.out.println("The sum of the five(5) numbers are");
        for(int i=0; i<5; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("Please Enter five (5) names");
        for(int i= 0; i<5; i++){
            names[i] = new1.nextLine();
        }
        System.out.println("The five names are");
        for(int i=0; i<5; i++){
            System.out.print(names[i] + " ");
        }

        new1.close();
    }

    public static int add(int x, int y){
        return x + y;
    }
    public static String knowName(){
        return "My name is Newton Tamba Sam";
    }

}


