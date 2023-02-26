/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTThem;
/**
 *
 * @author Administrator
 */
public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
        
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector cong(Vector a) {
        int newx = this.x + a.x;
        int newy = this.y + a.y;
        int newz = this.z + a.z;
        return new Vector(newx, newy, newz);
    }

    public Vector tru(Vector a) {
        int newx = this.x - a.x;
        int newy = this.y - a.y;
        int newz = this.z - a.z;
        return new Vector(newx, newy, newz);
    }

    public Vector nhanHangSo(int a) {
        int newx = (this.x * a);
        int newy = (this.y * a);
        int newz = (this.z * a);
        return new Vector(newx, newy, newz);
    }

    public double nhanVoHuong(Vector a) {
        return this.x * a.x + this.y * a.y + this.z * a.z;
    }

    @Override
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

}
