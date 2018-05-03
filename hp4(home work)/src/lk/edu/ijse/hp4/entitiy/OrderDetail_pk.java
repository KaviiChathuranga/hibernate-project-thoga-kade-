/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.entitiy;

import java.io.Serializable;
import javax.persistence.Embeddable;


/**
 *
 * @author Kavindu
 */
@Embeddable
public class OrderDetail_pk implements Serializable{
    private int id;
    private int oid;

    public OrderDetail_pk() {
    }
    
    public OrderDetail_pk(int id, int oid) {
        this.id = id;
        this.oid = oid;
    } 
}
