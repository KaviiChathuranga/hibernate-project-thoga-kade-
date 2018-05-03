/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dao;

import java.util.List;
import lk.edu.ijse.hp4.entitiy.Customer;
import lk.edu.ijse.hp4.entitiy.Orders;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public interface CustomerDao {

    public boolean addCustomer(Customer customer) throws Exception;

    public boolean updateCustomer(Customer customer) throws Exception;

    public boolean deleteCustomer(int id) throws Exception;

    public Customer searchCustomer(int id) throws Exception;

    public List<Customer> getAllCustomer() throws Exception;

    public void setSession(Session session);

}
