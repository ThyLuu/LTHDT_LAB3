/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTThem;

/**
 *
 * @author Administrator
 */
public class HinhTron {
    private int duongkinh;
    private int bankinh;

    public HinhTron() {
    }

    public HinhTron(int duongkinh, int bankinh) {
        this.duongkinh = duongkinh;
        this.bankinh = bankinh;
    }

    public int getDuongkinh() {
        return duongkinh;
    }

    public void setDuongkinh(int duongkinh) {
        this.duongkinh = duongkinh;
    }

    public int getBankinh() {
        return bankinh;
    }

    public void setBankinh(int bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "duongkinh=" + duongkinh + ", bankinh=" + bankinh + '}';
    }
    
}
