/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad3_bai2;

/**
 *
 * @author Administrator
 */
public class LibraryCard {
    private long lbCode;
    private String owner;
    private int borrowCount;

    public LibraryCard() {
    }

    public LibraryCard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }

    public long getLbCode() {
        return lbCode;
    }

    public void setLbCode(long lbCode) {
        this.lbCode = lbCode;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }
    
    public void checkOut(int num){
        
    }

    @Override
    public String toString() {
        return "LibraryCard{" + "lbCode=" + lbCode + ", owner=" + owner + ", borrowCount=" + borrowCount + '}';
    }
    
}
