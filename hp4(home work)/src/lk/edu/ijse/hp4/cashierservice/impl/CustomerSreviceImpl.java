/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice.impl;



import java.util.List;
import lk.edu.ijse.hp4.dao.CustomerDao;
import lk.edu.ijse.hp4.dao.impl.CustomerDaoImpl;
import lk.edu.ijse.hp4.entitiy.Customer;
import lk.edu.ijse.hp4.cashierservice.CustomerServise;

import lk.edu.ijse.hp4.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Kavindu
 */
public class CustomerSreviceImpl implements CustomerServise{
    CustomerDao customerDao=new CustomerDaoImpl();
    Customer c=new Customer();

    @Override
    public boolean registerCustomer(Customer customer) throws Exception {
       SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            customerDao.setSession(session);
            boolean result=customerDao.addCustomer(customer);
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
    public boolean modifyCustomer(Customer customer) throws Exception {
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            customerDao.setSession(session);
            boolean result=customerDao.updateCustomer(customer);
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
    public boolean removeCustomer(int id) throws Exception {
        SessionFactory sf=NewHibernateUtil.getSessionFactory();
            Session session=sf.openSession();
            Transaction tr=null;
           
            try{
            tr=session.beginTransaction();
                    Customer customer=(Customer) session.get(Customer.class,id);
                    session.delete(customer);
                    tr.commit();
                    
            return true;
            }catch(HibernateException he){
                if(tr!=null)
                    tr.rollback();
                    he.printStackTrace();
                    return false;
                }finally{
                    session.close();
                 
            }
    }

    @Override
    public Customer findCustomer(int id) throws Exception {
         SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            customerDao.setSession(session);
            
             Customer result=customerDao.searchCustomer(id);
             
            
            return result;
             
        }catch(HibernateException exception){
            tx.rollback();
            exception.printStackTrace();
            return null;
        }finally{
            session.close();
        }
        
    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {
        
         SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            customerDao.setSession(session);
            
             List<Customer> result=customerDao.getAllCustomer();
             
            
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
