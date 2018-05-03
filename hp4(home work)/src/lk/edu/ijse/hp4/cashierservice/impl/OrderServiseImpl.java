/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice.impl;

import java.util.List;
import lk.edu.ijse.hp4.cashierservice.OrderServise;
import lk.edu.ijse.hp4.dao.OrderDao;
import lk.edu.ijse.hp4.dao.impl.OrderDaoImpl;
import lk.edu.ijse.hp4.entitiy.Orders;
import lk.edu.ijse.hp4.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Kavindu
 */
public class OrderServiseImpl implements OrderServise{
    OrderDao orderDao=new OrderDaoImpl();
    
    @Override
    public boolean addNewOrder(Orders order) throws Exception {
         SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            orderDao.setSession(session);
            boolean result=orderDao.addOrder(order);
            if(result){
              
                tx.commit();
                return true;
            }else{
                tx.rollback();
                return false;
            }
            
            
        }catch(HibernateException exception){
            tx.rollback();
            exception.printStackTrace();
            return false;
        }finally{
            session.close();
        }
    }

    @Override
    public boolean modifyOrder(Orders order) throws Exception {
            SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            orderDao.setSession(session);
            boolean result=orderDao.updateOrder(order);
            if(result){
              
                tx.commit();
                return true;
            }else{
                tx.rollback();
                return false;
            }
            
            
        }catch(HibernateException exception){
            tx.rollback();
            exception.printStackTrace();
            return false;
        }finally{
            session.close();
        }
    }

    @Override
    public boolean removeOrder(int id) throws Exception {
             SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
           
            try{
            tx=session.beginTransaction();
                    Orders sql=  (Orders) session.createCriteria("delete from Orders where customer_id='"+id+"'");
                    session.delete(sql);
                    tx.commit();
                    
            return true;
            }catch(HibernateException he){
                if(tx!=null)
                    tx.rollback();
                    he.printStackTrace();
                    return false;
                }finally{
                    session.close();
                 
            }
    }

    @Override
    public Orders findOrder(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orders> getAllOrder() throws Exception {
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            orderDao.setSession(session);
            
             List<Orders> result=orderDao.getAllOrder();
             return result;
             
        }catch(HibernateException exception){
            tx.rollback();
            exception.printStackTrace();
            return null;
        }finally{
            session.close();
        }

    }
    
}
