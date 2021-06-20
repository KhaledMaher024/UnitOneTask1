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
public class Triangle {

    private static final Scanner inputs = new Scanner(System.in);

    public Triangle(int calculationType) {

        if (calculationType == 1) {
            System.out.printf("Enter base of triangle\n");
            float base = inputs.nextFloat();

            System.out.printf("Enter height triangle\n");
            float height = inputs.nextFloat();
            calculateArea(height, base);
        } else {
            System.out.printf("Enter first Edge of triangle\n");
            float firstEdge = inputs.nextFloat();
            System.out.printf("Enter second Edge triangle\n");
            float secondEdge = inputs.nextFloat();
            System.out.printf("Enter third Edge of triangle\n");
            float thirdEdge = inputs.nextFloat();
            calculateCircumference(firstEdge, secondEdge, thirdEdge);
        }
    }

    public void calculateArea(float height, float base) {
        float area = 0.5f * height * base;
        System.out.print("Area of rectangle :\n"+ area+"\n");
    }

    public void calculateCircumference(float firstEdge, float secondEdge, float thirdEdge) {
        float circumference = firstEdge + secondEdge + thirdEdge;
        System.out.print("Circumference of rectangle : \n"+ circumference+"\n");
    }
}
