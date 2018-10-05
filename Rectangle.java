/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author royshawnmcclain
 */
public class Rectangle {

    double width = 1;
    double height = 1;


    Rectangle(double width, double height) {
        //Added "this" keyword.
        this.height = height;
        this.width = width;
    }
    
        Rectangle() {
        this(4,40);
    }


    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width * 2) + (height * 2);
    }

}
