/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice;

import java.util.List;
import lk.edu.ijse.hp4.entitiy.Customer;
import lk.edu.ijse.hp4.entitiy.Orders;



/**
 *
 * @author Kavindu
 */
public interface CustomerServise {
    
    /**
     *
     * @param customer
     * @param order
     * @return
     * @throws Exception
     */
    public boolean registerCustomer(Customer customer)throws Exception;
    public boolean modifyCustomer(Customer customer)throws Exception;
    public boolean removeCustomer(int id)throws Exception;
    public Customer findCustomer(int id)throws Exception;
    public List<Customer> getAllCustomer()throws Exception;
    
}
