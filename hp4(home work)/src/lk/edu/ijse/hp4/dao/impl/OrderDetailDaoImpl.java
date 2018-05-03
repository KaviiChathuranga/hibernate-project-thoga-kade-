/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dao.impl;

import java.io.Serializable;
import lk.edu.ijse.hp4.dao.OrderDetailDao;
import lk.edu.ijse.hp4.entitiy.OrderDetail;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public class OrderDetailDaoImpl implements OrderDetailDao{
    private Session session;
    @Override
    public boolean placeNewOrder(OrderDetail orderDetail) throws Exception {
        Serializable saveOrder=session.save(orderDetail);
        if(saveOrder!=null){
            return true;
        }
        return false;
    }

    @Override
    public void setSesion(Session session) {
        this.session=session;
    }
    
}
