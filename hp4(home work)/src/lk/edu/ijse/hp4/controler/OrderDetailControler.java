/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler;


import java.util.List;
import lk.edu.ijse.hp4.dto.OrderDetailDto;


/**
 *
 * @author Kavindu
 */
public interface OrderDetailControler {
    public boolean placeNewOrder(List<OrderDetailDto> orderDetailDto)throws Exception;
}
