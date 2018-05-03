/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.cashierservice;

import java.util.List;
import lk.edu.ijse.hp4.entitiy.Item;



/**
 *
 * @author Kavindu
 */
public interface ItemService {
    public boolean addNewItem(Item item)throws Exception;
    public boolean modifyItem(Item item)throws Exception;
    public boolean removeItem(int id)throws Exception;
    public Item findItem(int id)throws Exception;
    public List<Item>getAllItem()throws Exception;
}
