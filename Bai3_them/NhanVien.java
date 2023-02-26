/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTThem;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double Luong_MAX;

    public NhanVien() {
    }

    public NhanVien(String tenNhanVien, double luongCanBan, double heSoLuong, double Luong_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.Luong_MAX = Luong_MAX;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCanBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuong_MAX() {
        return Luong_MAX;
    }

    public void setLuong_MAX(double Luong_MAX) {
        this.Luong_MAX = Luong_MAX;
    }
    
    
    public double tinhLuong(){
        double luong;
        luong = this.heSoLuong * this.luongCoBan;
        return luong;
    }
    
    public boolean tangLuong(double a) {
        setHeSoLuong(a);
        if (tinhLuong() > this.Luong_MAX){
            return false;
        } 
        else {
            return true;
        }
    }
    
    public void inTTin() {
        System.out.println("Ten nhan vien " + tenNhanVien + "Luong co ban" + luongCoBan + "He so luong" + heSoLuong
                + "Luong toi da" + Luong_MAX);
    }
    
    
}
