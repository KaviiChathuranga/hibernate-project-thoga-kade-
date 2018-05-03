/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dao.impl;

import java.io.Serializable;
import java.util.List;
import lk.edu.ijse.hp4.dao.OrderDao;
import lk.edu.ijse.hp4.entitiy.Orders;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public class OrderDaoImpl implements OrderDao{ 
    private Session session;
    @Override
    public boolean addOrder(Orders order) throws Exception {
        Serializable saveOrder=session.save(order);
        if(saveOrder!=null){
            return true;
        }
        return false;

    }

    @Override
    public boolean updateOrder(Orders order) throws Exception {
          session.update(order);
        return true;
    }

    @Override
    public boolean deleteOrder(int id) throws Exception {
       Orders sql= (Orders) session.createCriteria("delete from Orders where customer_id='"+id+"'");
        session.delete(sql); 
        return true;
    }

    @Override
    public Orders searchOrder(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSession(Session session) {
       this.session=session;
    }

    @Override
    public List<Orders> getAllOrder() throws Exception {
        Criteria criteria= session.createCriteria(Orders.class);
         List<Orders>list=criteria.list();
         
        return list;
    }
    
}
