/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dao;

import java.util.List;
import lk.edu.ijse.hp4.entitiy.Orders;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public interface OrderDao {

    public boolean addOrder(Orders order) throws Exception;

    public boolean updateOrder(Orders order) throws Exception;

    public boolean deleteOrder(int id) throws Exception;

    public Orders searchOrder(int id) throws Exception;

    public List<Orders> getAllOrder() throws Exception;

    public void setSession(Session session);
}
