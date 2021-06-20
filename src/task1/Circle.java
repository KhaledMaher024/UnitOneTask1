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
public class Circle extends Shape {

    private static final Scanner inputs = new Scanner(System.in);

    public Circle(int calculationType) {
        System.out.printf("Enter radius of circle\n");
        float radius = inputs.nextFloat();
        if (calculationType == 1) {
            calculateArea(radius);
        } else {
            calculateCircumference(radius);
        }

    }

    @Override
    public void calculateArea(float radius) {
        float area = super.PI * radius * radius;
        System.out.print("Area of circle : \n"+ area+"\n");
    }

    @Override
    public void calculateCircumference(float radius) {
        float circumference = 2 * PI * radius;
        System.out.print("Circumference of circle :\n"+ circumference+"\n");
    }

}
