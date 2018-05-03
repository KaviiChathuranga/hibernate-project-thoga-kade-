/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler.impl;

import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hp4.controler.CustomerControler;
import lk.edu.ijse.hp4.dto.CustomerDto;
import lk.edu.ijse.hp4.entitiy.Customer;
import lk.edu.ijse.hp4.cashierservice.CustomerServise;
import lk.edu.ijse.hp4.cashierservice.impl.CustomerSreviceImpl;

/**
 *
 * @author Kavindu
 */
public class CustomerControlerImpl implements CustomerControler{

    CustomerServise customerServise=new CustomerSreviceImpl();
    
    @Override
    public boolean addCustomer(CustomerDto customerDto) throws Exception {
     
       return customerServise.registerCustomer(new Customer(customerDto.getName(),customerDto.getAddress(),customerDto.getTel()));
   
    }

    @Override
    public boolean updateCustomer(CustomerDto customerDto) throws Exception {
        return customerServise.modifyCustomer(new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress(),customerDto.getTel()));//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCustomer(int id) throws Exception {
        return customerServise.removeCustomer(id);
    }

    @Override
    public CustomerDto searchCustomer(int id) throws Exception {
        Customer customer=customerServise.findCustomer(id);
        List<Customer>list=new ArrayList<>();
        list.add(customer);
        CustomerDto customerDto=null;
        
       for (Customer customer1 : list) {
            if(customer!=null){
                
                 return new CustomerDto(customer.getId(),customer.getName(),customer.getAddress(),customer.getTel());
             
            }
        }
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomer() throws Exception {
        List<CustomerDto>list=new ArrayList<>();
        List<Customer> customer1 =customerServise.getAllCustomer();
         CustomerDto s=null;
        for (Customer customer : customer1) {
            if(customer!=null){
                
                 s=new CustomerDto(customer.getId(),customer.getName(),customer.getAddress(),customer.getTel());
              list.add(s);
            }
        }
        
       
        return list;
        

    }
    
}
