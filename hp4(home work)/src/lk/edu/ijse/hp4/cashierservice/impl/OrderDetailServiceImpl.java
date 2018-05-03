/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice.impl;

import java.util.List;
import lk.edu.ijse.hp4.cashierservice.OrderDetailService;
import lk.edu.ijse.hp4.dao.OrderDetailDao;
import lk.edu.ijse.hp4.dao.impl.OrderDetailDaoImpl;
import lk.edu.ijse.hp4.entitiy.OrderDetail;
import lk.edu.ijse.hp4.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Kavindu
 */
public class OrderDetailServiceImpl implements OrderDetailService {

    OrderDetailDao orderDetailDao = new OrderDetailDaoImpl();

    @Override
    public boolean placeNewOrder(List<OrderDetail> orderDetail) throws Exception {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean result=false;
        try {
            tx = session.beginTransaction();
            orderDetailDao.setSesion(session);
            for (OrderDetail orderDetail1 : orderDetail) {
                result = orderDetailDao.placeNewOrder(orderDetail1);
            }
            
            if (result) {

                tx.commit();
                return true;
            } else {
                tx.rollback();
                return false;
            }

        } catch (HibernateException exception) {
            tx.rollback();
            exception.printStackTrace();
            return false;
        } finally {
            session.close();
        }

    }

}
