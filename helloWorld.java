package hello;

import java.util.Scanner;

public class helloWorld {

    public static void main(String args[]) {
       test t1 = new test();
       t1.testString();
        StringBuilder s = new StringBuilder("sami");
        s.append(" thapa");
        System.out.println(s);
       int length = s.length();
        System.out.println(length);
        String d = "saina";
        int len = d.length();
        System.out.println(len);
/*
Scanner scan = new Scanner(System.in);
System.out.println(" Please enter the number");
int num1 = scan.nextInt();

stringBuilder t1 = new stringBuilder();
        System.out.println("========================================");
t1.test1();
test t2 = new test();
t2.testExtend();
t2.test1();
t2.test(num1);
 */
    }
}


