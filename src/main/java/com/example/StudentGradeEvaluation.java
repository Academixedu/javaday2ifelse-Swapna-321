package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("enter your age");
        int age = in.nextInt();
        System.out.println("enter your marks");
        int marks = in.nextInt();
        System.out.println("entered name :"+name);
        System.out.println("entered age:"+age);
        System.out.println("entered marks : "+marks);
         if (marks >= 90) {
           System.out.println("grade=A");
        }
        else if (marks >= 80) {
            System.out.println("grade = B");
        }
        else if (marks >= 70) {
            System.out.println("grade = c");

        }
        else if (marks >=60){
            System.out.println("grade = D");
        }
        else {
            System.out.println("grade = F");
        }
        
    }
}

