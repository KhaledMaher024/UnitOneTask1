/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author GP65
 */
public class Square extends Shape {

    private static final Scanner inputs = new Scanner(System.in);

    public Square(int calculationType) {
        System.out.printf("Enter length of square\n");
        float length = inputs.nextFloat();
        if (calculationType == 1) {
            calculateArea(length);
        } else {
            calculateCircumference(length);
        }
    }

    @Override
    public void calculateArea(float length) {
        float area = length * length;
        System.out.print("Area of square : \n"+ area+"\n");
    }

    @Override
    public void calculateCircumference(float length) {
        float circumference = 4 * length;
        System.out.print("Circumference of square : \n"+ circumference+"\n");
    }

}
