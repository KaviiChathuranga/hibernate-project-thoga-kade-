/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dao.impl;

import java.io.Serializable;
import java.util.List;
import lk.edu.ijse.hp4.dao.ItemDao;
import lk.edu.ijse.hp4.entitiy.Item;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public class ItemDaoImpl implements ItemDao{
    private Session session;
    
    @Override
    public boolean addItem(Item item) throws Exception {
        Serializable saveItem=session.save(item);
        if (saveItem!=null) {
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean updateItem(Item item) throws Exception {
         session.update(item);
        return true;

    }

    @Override
    public boolean deleteItem(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item searchItem(int id) throws Exception {
       Item customer = (Item) session.get(Item.class,id);
        return customer;
    }

    @Override
    public void setSession(Session session) {
       this.session=session;
    }

    @Override
    public List<Item> getAllItem() throws Exception {
        Criteria criteria= session.createCriteria(Item.class);
         List<Item>list=criteria.list();
         
        return list;
    }
    
}
