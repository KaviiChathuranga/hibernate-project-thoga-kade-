/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler;

import java.util.List;
import lk.edu.ijse.hp4.dto.ItemDto;


/**
 *
 * @author Kavindu
 */
public interface ItemControler {
    public boolean addItem(ItemDto itemDto)throws Exception;
    public boolean updateItem(ItemDto itemDto)throws Exception;
    public boolean deleteItem(int id)throws Exception;
    public ItemDto searchItem(int id)throws Exception;
    public List<ItemDto>getAllItem()throws Exception;
}
