/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Administrator
 */
public class Triangle {
    private float width;
    private float hegth;

    public Triangle() {
    }

    public Triangle(float width, float hegth) {
        this.width = width;
        this.hegth = hegth;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHegth() {
        return hegth;
    }

    public void setHegth(float hegth) {
        this.hegth = hegth;
    }
    
    public String toString(){
        return "Triangle{" + "width=" + width + ", hegth=" + hegth + '}';
    }
}
