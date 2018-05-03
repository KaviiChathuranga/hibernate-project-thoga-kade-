/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dto;


/**
 *
 * @author Kavindu
 */

public class ItemDto {
  
    private int iid;
    private String description;
    private double unitprice;
    private int qty;

    public ItemDto() {
    }

    public ItemDto(int iid, String description, double unitprice, int qty) {
        this.iid = iid;
        this.description = description;
        this.unitprice = unitprice;
        this.qty = qty;
    }
    public ItemDto( String description, double unitprice, int qty) {
      
        this.description = description;
        this.unitprice = unitprice;
        this.qty = qty;
    }
    

    public int getId() {
        return iid;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public int getQty() {
        return qty;
    }

    public void setId(int iid) {
        this.iid = iid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
