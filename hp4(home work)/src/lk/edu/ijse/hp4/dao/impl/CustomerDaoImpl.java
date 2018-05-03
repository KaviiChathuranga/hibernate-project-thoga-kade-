/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dao.impl;

import java.io.Serializable;
import java.util.List;
import lk.edu.ijse.hp4.dao.CustomerDao;
import lk.edu.ijse.hp4.entitiy.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public class CustomerDaoImpl implements CustomerDao{
    private Session session;
    
    
    @Override
    public void setSession(Session session) {
       this.session=session;
    }

    @Override
    public boolean addCustomer(Customer customer) throws Exception {
         Serializable saveCustomer=session.save(customer);
        if(saveCustomer!=null){
            return true;
        }
        return false;

    }

    @Override
    public boolean updateCustomer(Customer customer) throws Exception {
        session.update(customer);
       
        return true;

    }

    @Override
    public boolean deleteCustomer(int id) throws Exception {
        Customer customer=(Customer) session.get(Customer.class, id);
        session.delete(customer);
        return true;
    }

    @Override
    public Customer searchCustomer(int id) throws Exception {
       Customer customer = (Customer) session.get(Customer.class,id);
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {
        Criteria criteria= session.createCriteria(Customer.class);
         List<Customer>list=criteria.list();
         
        return list;
       
       

    }
}
