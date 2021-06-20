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
public class Rectangle {

    private static final Scanner inputs = new Scanner(System.in);

    public Rectangle(int calculationType) {

        System.out.printf("Enter width of rectangle\n");
        float width = inputs.nextFloat();

        System.out.printf("Enter height of rectangle\n");
        float height = inputs.nextFloat();
        if (calculationType == 1) {
            calculateArea(height, width);
        } else {
            calculateCircumference(height, width);
        }
    }

    public void calculateArea(float height, float width) {
        float area = height * width;
        System.out.print("Area of rectangle : \n"+ area+"\n");
    }

    public void calculateCircumference(float height, float width) {
        float circumference = 2 * (height + width);
        System.out.print("Circumference of rectangle : \n"+ circumference+"\n");
    }
}
