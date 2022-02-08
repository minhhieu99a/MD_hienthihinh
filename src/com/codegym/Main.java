package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int choice= -1 ;
        while (choice!=0){
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choice=scanner.nextInt();
            switch (choice){
                case 1 :
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    for (int i = 0; i <=5 ; i++) {
                        for (int j = 0; j <= i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 6; i >0 ; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 6 ; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 6-i; k >0; k--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 6; i > 0; i--) {
                        for (int j = 0; j < i-1; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < 7-i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int k=0 ;
                    for (int i = 1; i <=4 ; i++,k=0) {
                        for (int j = 1; j <= 4-i ; j++) {
                            System.out.print("  ");
                        }
                        while (k !=2*i-1){
                            System.out.print("* ");
                            k++;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Mời bạn nhập lại");
            }
        }
    }
}
