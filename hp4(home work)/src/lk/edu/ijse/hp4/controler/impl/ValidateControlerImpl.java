/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler.impl;

import lk.edu.ijse.hp4.controler.ValidateControler;

/**
 *
 * @author Kavindu
 */
public class ValidateControlerImpl implements ValidateControler{
    @Override
    public boolean setTelNumber(String telNumber) throws Exception {
        if(telNumber.matches(("\\d{3}-\\d{7}"))){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean setName(String name) throws Exception {
        if(name.matches("\\W[A-Za-z]")){
            return true;
        }else{
            return false;
        }
    }
}
