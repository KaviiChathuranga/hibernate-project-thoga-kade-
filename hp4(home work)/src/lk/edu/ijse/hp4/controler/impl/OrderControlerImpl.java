/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler.impl;


import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hp4.cashierservice.OrderServise;
import lk.edu.ijse.hp4.cashierservice.impl.OrderServiseImpl;
import lk.edu.ijse.hp4.controler.OrderControler;
import lk.edu.ijse.hp4.dao.CustomerDao;
import lk.edu.ijse.hp4.dto.CustomerDto;
import lk.edu.ijse.hp4.dto.OrderDto;
import lk.edu.ijse.hp4.entitiy.Customer;
import lk.edu.ijse.hp4.entitiy.Orders;

/**
 *
 * @author Kavindu
 */
public class OrderControlerImpl implements OrderControler{
   OrderServise orderServise=new OrderServiseImpl();
        
    @Override
    public boolean addOrder(OrderDto orderDto,CustomerDto customerDto) throws Exception {
     Customer c=new Customer();
      c.setId(customerDto.getId());
      c.setName(customerDto.getName());
      c.setAddress(customerDto.getAddress());
      c.setTel(customerDto.getTel()); 
      return orderServise.addNewOrder(new Orders(orderDto.getDate(),c));
       
    }

    @Override
    public boolean updateOrder(OrderDto orderDto,CustomerDto customerDto) throws Exception {
          Customer c=new Customer();
      c.setId(customerDto.getId());
      c.setName(customerDto.getName());
      c.setAddress(customerDto.getAddress());
      c.setTel(customerDto.getTel()); 
      return orderServise.modifyOrder(new Orders(orderDto.getOid(),orderDto.getDate(),c));
       
    }

    @Override
    public boolean deleteOrder(int id) throws Exception {
       return orderServise.removeOrder(id);
    }

    @Override
    public OrderDto searchOrder(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<OrderDto> getAllOrder() throws Exception {
        
        List<OrderDto>orderDtolist=new ArrayList<>();
        List<CustomerDto>customerDtolist=new ArrayList<>();
        
        List<Orders> orderlist =orderServise.getAllOrder();

        for (Orders orders : orderlist) {
            OrderDto orderDto=new OrderDto();            
            CustomerDto customerDto=new CustomerDto();
            
            customerDto.setId(orders.getCustomer().getId());
            customerDto.setAddress(orders.getCustomer().getAddress());
            customerDto.setName(orders.getCustomer().getName());
            customerDto.setTel(orders.getCustomer().getTel());
            orderDto.setDate(orders.getDate());
            orderDto.setOid(orders.getOid());
            OrderDto dto=new OrderDto(orderDto.getOid(),orderDto.getDate(),customerDto);
            orderDtolist.add(dto);   
            
        }
     
        return orderDtolist;
    }

 
    
}
