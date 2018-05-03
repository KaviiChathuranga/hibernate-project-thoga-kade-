/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler;

import java.util.List;
import lk.edu.ijse.hp4.dto.CustomerDto;
import lk.edu.ijse.hp4.dto.OrderDto;

/**
 *
 * @author Kavindu
 */
public interface OrderControler {
    public boolean addOrder(OrderDto orderDto,CustomerDto customerDto)throws Exception;
    public boolean updateOrder(OrderDto orderDto,CustomerDto customerDto)throws Exception;
    public boolean deleteOrder(int id)throws Exception;
//    public boolean deleteOrderdCustomer(int id)throws Exception;
    public OrderDto searchOrder(int id)throws Exception;
    public List<OrderDto>getAllOrder()throws Exception;
}
