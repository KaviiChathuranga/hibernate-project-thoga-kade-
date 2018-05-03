/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler;


import java.util.List;
import lk.edu.ijse.hp4.dto.CustomerDto;



/**
 *
 * @author Kavindu
 */
public interface CustomerControler {
    public boolean addCustomer(CustomerDto customerDto)throws Exception;
    public boolean updateCustomer(CustomerDto customerDto)throws Exception;
    public boolean deleteCustomer(int id)throws Exception;
    public CustomerDto searchCustomer(int id)throws Exception;
    public List<CustomerDto> getAllCustomer()throws Exception;
          
}
