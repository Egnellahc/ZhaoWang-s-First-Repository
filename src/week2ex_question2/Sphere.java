/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2ex_question2;

/**
 *
 * @author wangz
 */
public class Sphere {
    private double radius;
    
    public Sphere(){
        
    }
    
    public Sphere(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double calcArea(){
        return radius * 4 * Math.PI;
    }
    
    public double calcVolume(){
        return 4.0/3 * Math.PI * radius * radius * radius;
    }
    
    public String toString(){
        return "The radius of this sphere is " + getRadius() 
                + "\nThe surface area of this sphere is " + calcArea()
                + "\nThe volume of this sphere is " + calcVolume();
    }
    
    public boolean equals(Sphere s){
        return true;
    }
}
