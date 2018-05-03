/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.dto;

import java.io.Serializable;
import javax.persistence.Embeddable;


/**
 *
 * @author Kavindu
 */
@Embeddable
public class OrderDetailDto_pk implements Serializable{
    private String iid;
    private String oid;

    public OrderDetailDto_pk() {
    }
    
    public OrderDetailDto_pk(String iid, String oid) {
        this.iid = iid;
        this.oid = oid;
    } 
}
