/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes int input for plus, minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{
    //changing access specifier to private to force encapsulation
 private double x,y;
//creating getters and setters to implement encapsulation
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
 public int prompt()
 {
     System.out.println("Enter\n1 for addition\n2 for subtraction\n3 for "
             + "multiplication\n4 for division");
     Scanner sc = new Scanner(System.in);
     int s= sc.nextInt();
     return s;
 }
    double calculate(double x, double y, int op)
        {
        switch (op) 
        {
            case 1:
                return x + y;
            case 2:
                return x - y;
            case 3:
                return x * y;
            case 4:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
