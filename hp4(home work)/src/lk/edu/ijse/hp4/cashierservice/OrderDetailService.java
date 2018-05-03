/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice;


import java.util.List;
import lk.edu.ijse.hp4.entitiy.OrderDetail;

/**
 *
 * @author Kavindu
 */
public interface OrderDetailService {
    public boolean placeNewOrder(List<OrderDetail> orderDetail)throws Exception;
}
