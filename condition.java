/*import java.util.*;

public class condition  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.close();

    }

}

import java.util.Scanner;

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("eligible for voting!!!");

        } else {
            System.out.println("not eligible");

        }
    }

}

import java.util.Scanner;

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd num");
            sc.close();        }
    }
}*/

import java.util.Scanner;

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

        sc.close();
    }
}