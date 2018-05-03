/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dto;

import java.io.Serializable;

          
/**
 *
 * @author Kavindu
 * 
 */
  

public class OrderDto implements Serializable {

    private int oid;
    
    private String date;
    
    private CustomerDto customer;
  
       public OrderDto() {
    }

    public OrderDto(int oid, String date, CustomerDto customer) {
        this.oid = oid;
        this.date = date;
        this.customer = customer;
    }
     public OrderDto(String date,CustomerDto customer) {
     
        this.date = date;
        this.customer = customer;
    }

    /**
     * @return the oid
     */
    public int getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customer
     */
    public CustomerDto getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }
       
}
