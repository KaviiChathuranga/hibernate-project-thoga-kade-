/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice;

import java.util.List;
import lk.edu.ijse.hp4.entitiy.Orders;

/**
 *
 * @author Kavindu
 */
public interface OrderServise {
    public boolean addNewOrder(Orders order)throws Exception;
    public boolean modifyOrder(Orders order)throws Exception;
    public boolean removeOrder(int id)throws Exception;
    public Orders findOrder(int id)throws Exception;
    public List<Orders>getAllOrder()throws Exception;
}
