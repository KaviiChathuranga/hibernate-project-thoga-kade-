/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 *
 * @author Kavindu
 */
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String description;
    private double unitprice;
    private int qty;

    public Item() {
    }

    public Item(int iid, String description, double unitprice, int qty) {
        this.id = iid;
        this.description = description;
        this.unitprice = unitprice;
        this.qty = qty;
    }
    public Item( String description, double unitprice, int qty) {
      
        this.description = description;
        this.unitprice = unitprice;
        this.qty = qty;
    }
    

    public int getId() {
        return id;
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
        this.id = iid;
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
