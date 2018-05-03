/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler.impl;

import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hp4.cashierservice.OrderDetailService;
import lk.edu.ijse.hp4.cashierservice.impl.OrderDetailServiceImpl;
import lk.edu.ijse.hp4.controler.OrderDetailControler;
import lk.edu.ijse.hp4.dto.ItemDto;
import lk.edu.ijse.hp4.dto.OrderDetailDto;
import lk.edu.ijse.hp4.dto.OrderDto;
import lk.edu.ijse.hp4.entitiy.Customer;
import lk.edu.ijse.hp4.entitiy.Item;
import lk.edu.ijse.hp4.entitiy.OrderDetail;
import lk.edu.ijse.hp4.entitiy.OrderDetail_pk;
import lk.edu.ijse.hp4.entitiy.Orders;

/**
 *
 * @author Kavindu
 */
public class OrderDetailControlerImpl implements OrderDetailControler{
    private OrderDetailService detailService=new OrderDetailServiceImpl();
         
        Orders orders=new Orders();
        Item item=new Item();
        
    @Override
    public boolean placeNewOrder(List<OrderDetailDto> orderDetailDto1) throws Exception {
        Item item=new Item();
        Orders orders=new Orders();
        Customer c=new Customer();
        List<OrderDetail>ordersList=new ArrayList<>();
        for (OrderDetailDto orderDetailDto : orderDetailDto1) {
            
        c.setId(orderDetailDto.getOrderDto().getCustomer().getId());
        c.setName(orderDetailDto.getOrderDto().getCustomer().getName());
        c.setAddress(orderDetailDto.getOrderDto().getCustomer().getAddress());
        c.setTel(orderDetailDto.getOrderDto().getCustomer().getTel());
        
        orders.setOid(orderDetailDto.getOrderDto().getOid());
        orders.setDate(orderDetailDto.getOrderDto().getDate());
        orders.setDate(orderDetailDto.getOrderDto().getDate());
        orders.setCustomer(c); 
        
        item.setId(orderDetailDto.getItemDto().getId());
        item.setDescription(orderDetailDto.getItemDto().getDescription());
        item.setUnitprice(orderDetailDto.getItemDto().getUnitprice());
        item.setQty(orderDetailDto.getQty());
        
        OrderDetail enti=new OrderDetail();
        enti.setItem(item);
        enti.setOrder(orders);
        enti.setQty(item.getQty());

        enti.setUp(item.getUnitprice());
        OrderDetail_pk orderDetail_pk=new OrderDetail_pk((item.getId()),orders.getOid());
        enti.setOrderDetailDto_pk(orderDetail_pk); 
        ordersList.add(enti);
        }
       
        return detailService.placeNewOrder(ordersList);
    }
    
}
