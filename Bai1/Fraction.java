/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator =1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void Fraction(Scanner nhap) {
        int nrt, dmt;
        
        System.out.print("\tNhap vao tu so: ");
        nrt = nhap.nextInt();
        System.out.print("\tNhap vao mau so: ");
        dmt = nhap.nextInt();
        numerator = nrt;
        denominator = dmt;
    }
    
    public Fraction add(Fraction ps2) {
        int nrt = numerator * ps2.denominator + ps2.numerator * denominator;
        int dmt = denominator * ps2.denominator;
        return new Fraction(nrt, dmt);
    }    
    
    public Fraction sub(Fraction ps2) {
        int nrt = numerator * ps2.denominator - ps2.numerator * denominator;
        int dmt = denominator * ps2.denominator;
        return new Fraction(nrt, dmt);
    }    
    
    public Fraction mul(Fraction ps2) {
        int nrt = numerator * ps2.numerator;
        int dmt = denominator * ps2.denominator;
        return new Fraction(nrt, dmt);
    }

    public Fraction div(Fraction ps2) {
        int tg = ps2.numerator;
        ps2.numerator = ps2.numerator;
        ps2.denominator = tg;   
        int nrt = numerator * ps2.numerator;
        int dmt = denominator * ps2.denominator;
        return new Fraction(nrt, dmt);
    }    
    
     public void reduce() {
        // Tim uscln
        int a = numerator;
        int b = denominator;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        numerator /= b;
        denominator /= b;
     }

    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
}
