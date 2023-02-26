/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad3_bai2;

/**
 *
 * @author Administrator
 */
public class Student {
    private int stID;
    private String stName;
    private String stClass;

    public Student() {
    }
    
    public Student(int stID) {
        this.stID = stID;
    }

    public Student(int stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student{" + "stID=" + stID + ", stName=" + stName + ", stClass=" + stClass + '}';
    }

    
}
