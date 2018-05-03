/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice.impl;

import java.util.List;
import lk.edu.ijse.hp4.cashierservice.ItemService;
import lk.edu.ijse.hp4.dao.ItemDao;
import lk.edu.ijse.hp4.dao.impl.ItemDaoImpl;
import lk.edu.ijse.hp4.entitiy.Item;
import lk.edu.ijse.hp4.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Kavindu
 */
public class ItemServiceImpl implements ItemService{
    ItemDao itemDao=new ItemDaoImpl();

    @Override
    public boolean addNewItem(Item item) throws Exception {
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=null;
        
        try {
            t=session.beginTransaction();
            itemDao.setSession(session);
            boolean result=itemDao.addItem(item);
            if (result) {
                t.commit();
                return true;
            }else{
                return false;
            }
                
        } catch (HibernateException e) {
            t.rollback();
            e.printStackTrace();
            return false;
        }
        
        finally{
            session.close();
        }


    }

    @Override
    public boolean modifyItem(Item item) throws Exception {
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            itemDao.setSession(session);
            boolean result=itemDao.updateItem(item);
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
    public boolean removeItem(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item findItem(int id) throws Exception {
         SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            itemDao.setSession(session);
            
             Item result=itemDao.searchItem(id);
             
            
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
    public List<Item> getAllItem() throws Exception {
        
         SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
       
        Session session=sessionFactory.openSession();
        Transaction tx=null;
    
        try{
            tx=session.beginTransaction();
            itemDao.setSession(session);
            
             List<Item> result=itemDao.getAllItem();
             
            
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
