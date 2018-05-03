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

public class OrderDetailDto {
    private double up;
    private int qty;
    private OrderDto orderDto;
    private ItemDto itemDto;

    public OrderDetailDto() {
        
    }

    public OrderDetailDto(double up, int qty, OrderDto orderDto, ItemDto itemDto) {
        this.up = up;
        this.qty = qty;
        this.orderDto = orderDto;
        this.itemDto = itemDto;
        //this.orderDetailDto_pk = orderDetailDto_pk;
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
     * @return the orderDto
     */
    public OrderDto getOrderDto() {
        return orderDto;
    }

    /**
     * @param orderDto the orderDto to set
     */
    public void setOrderDto(OrderDto orderDto) {
        this.orderDto = orderDto;
    }

    /**
     * @return the itemDto
     */
    public ItemDto getItemDto() {
        return itemDto;
    }

    /**
     * @param itemDto the itemDto to set
     */
    public void setItemDto(ItemDto itemDto) {
        this.itemDto = itemDto;
    }

    /**
     * @return the orderDetailDto_pk
     */
   

    /**
     * @param orderDetailDto_pk the orderDetailDto_pk to set
     */
   
    
}
