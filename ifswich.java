/*
 * Filename: d:\11zijing\git\java\ifswich.java
 * Path: d:\11zijing\git\java
 * Created Date: Monday, May 3rd 2021, 10:04:37 am
 * Author: zijing
 * 
 * Copyright (c) 2021 Your Company
 */
import java.util.Scanner;

public class ifswich {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade > 100){
            System.out.println("what?");
        } else if (grade > 80){
            System.out.println("great");
        } else if (grade > 60){
            System.out.println("it's OK");
        } else {
            System.out.println("add oil");
        }

        switch(grade){
            case 90:
                System.out.println("ai~~");
                break;
            default:
                System.out.println("hh");
        }


        sc.close();
    }
}
