package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c,  u, alan;
        System.out.println("üçgenin kenar uzunluklarını giriniz : ");
        a= scanner.nextDouble();
        b= scanner.nextDouble();
        c= scanner.nextDouble();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı : "+ alan);



    }
}
