/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.entitiy;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author Kavindu
 */
@Entity
public class OrderDetail {
    private double up;
    private int qty;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "id",referencedColumnName = "id",insertable = false,updatable = false))
    private Orders order;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name="id",referencedColumnName = "id" ,insertable = false,updatable = false))
    private Item item;
    
    @EmbeddedId
    private OrderDetail_pk orderDetailDto_pk;

    public OrderDetail() {
        
    }

    /**
     * @return the up
     */
    public double getUp() {
        return up;
    }

    /**
     * @param up the up to set
     */
    public void setUp(double up) {
        this.up = up;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the order
     */
    public Orders getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Orders order) {
        this.order = order;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the orderDetailDto_pk
     */
    public OrderDetail_pk getOrderDetailDto_pk() {
        return orderDetailDto_pk;
    }

    /**
     * @param orderDetailDto_pk the orderDetailDto_pk to set
     */
    public void setOrderDetailDto_pk(OrderDetail_pk orderDetailDto_pk) {
        this.orderDetailDto_pk = orderDetailDto_pk;
    }

   
    
}
