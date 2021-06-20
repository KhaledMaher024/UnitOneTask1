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
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Select the shape\n\t1- Circle\n\t2-Square\n\t3-Triangle\n\t4-Rectangle\nShape: ");
        int shapeID = sc.nextInt();

        System.out.printf("\n\t1- Area\n\t2-Circumference\nType: ");
        int calcType = sc.nextInt();
        Shape shape ;
        switch (shapeID) {
            case 1:
                shape = new Circle(calcType);
                break;
            case 2:
                shape = new Square(calcType);
                break;

            case 3:
                Triangle t = new Triangle(calcType);
                break;

            case 4:
                Rectangle r= new Rectangle(calcType);
                break;

            default:
                break;
        }

    }

}
