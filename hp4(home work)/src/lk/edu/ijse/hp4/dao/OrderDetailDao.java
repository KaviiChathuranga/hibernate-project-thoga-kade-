/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dao;

import lk.edu.ijse.hp4.entitiy.OrderDetail;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public interface OrderDetailDao {

    public boolean placeNewOrder(OrderDetail orderDetail) throws Exception;

    public void setSesion(Session session);
}
