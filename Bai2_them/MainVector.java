/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTThem;

/**
 *
 * @author Administrator
 */
public class MainVector {
    public static void main(String[] args) {
        Vector vt1 = new Vector(10,20,30);
        Vector vt2 = new Vector(30,20,10);
        System.out.println("Vector cong: " + vt1.cong(vt2));
        System.out.println("Vector tru: " + vt1.tru(vt2));
        System.out.println("Vector nhan hang so : " + vt1.nhanHangSo(4)); //cho 4 là hằng số 
        System.out.println("Vector nhan vo huong la: " + vt1.nhanVoHuong(vt2));
    }

}
