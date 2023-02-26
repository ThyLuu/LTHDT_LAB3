/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTThem;

/**
 *
 * @author Administrator
 */
public class HinhVuong {
    private int canh;

    public HinhVuong() {
    }

    public HinhVuong(int canh) {
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh + '}';
    }
    
}
