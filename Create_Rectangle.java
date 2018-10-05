/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
-----Part 1-----
1.
Object Oriented Programming is a programming methhod that utilizes objects methods to create programs.
2.
An object is an item with multiple variables assigned to it. A class is a group of objects.
3.A data field is a variable belonging to a class of objects. A method is a definable code that can be reused and organized for operations.
4.A constructor is a special method that helps creates classes.
A constructor has: 1. Same name as class name; 2. No return type; 3. No definition.
5.A default constructor is a constructor that is when no parameters are stated. A class should always have a default constructor.
6.A constructor helps create an object while a method helps give an object its values.
7.The "." operator is used to invoke data fields and methods. For example, the radius of c1 can be accessd by, "c1.radius". And the method to find the number ofobjects can be found with,"c1.numberOfObjects".
8.NullPointerException occurs when you make a method with areference to a null-valued variable.
9.Since int x and string y didn't have a value and weren't intialized, a NullPointerError occured.
For figure 9.8, the original value of "i" was 1, and the original value of "j" was two.  After setting "i" equal to "j", the value of "i" became equal to the value of "j", which is 2.
For figure 9.9, objects c1 and c2 referred to two different objects.  After object c1 was set equal to c2, object c1 referred to the same object as c2.
 */

/**
 *
 * @author royshawnmcclain
 */
public class Create_Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create Rectangle 1
        Rectangle r1 = new Rectangle(4, 40);

        //Create Rectangle 2
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("The Width of Rectangle 1 is: " + r1.width);
        System.out.println("The Height of Rectangle 1 is: " + r1.height);
        System.out.println("The Area of Rectangle 1 is: " + r1.getArea());
        System.out.println("The Perimeter of Rectangle 1 is: " + r1.getPerimeter());

        System.out.println("The Width of Rectangle 2 is: " + r2.width);
        System.out.println("The Height of Rectangle 2 is: " + r2.height);
        System.out.println("The Area of Rectangle 2 is: " + r2.getArea());
        System.out.println("The Perimeter of Rectangle 2 is: " + r2.getPerimeter());

        //Create Stock named Oracle Corporation
        Stock s1 = new Stock("ORCL", "Oracle Corporation");

        s1.setCurrentPrice(34.35);
        s1.setpreviousClosingPrice(34.5);
        s1.setChangePercent();
        s1.printInfo();

    }

}
