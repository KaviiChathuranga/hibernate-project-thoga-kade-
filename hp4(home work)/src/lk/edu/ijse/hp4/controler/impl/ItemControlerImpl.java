/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hp4.controler.impl;

import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hp4.cashierservice.ItemService;
import lk.edu.ijse.hp4.cashierservice.impl.ItemServiceImpl;
import lk.edu.ijse.hp4.controler.ItemControler;
import lk.edu.ijse.hp4.dto.ItemDto;
import lk.edu.ijse.hp4.entitiy.Item;

/**
 *
 * @author Kavindu
 */
public class ItemControlerImpl implements ItemControler{
    ItemService itemService=new ItemServiceImpl();
    
    @Override
    public boolean addItem(ItemDto itemDto) throws Exception {
        return itemService.addNewItem(new Item(itemDto.getDescription(),itemDto.getUnitprice(),itemDto.getQty()));
    }

    @Override
    public boolean updateItem(ItemDto itemDto) throws Exception {
        return itemService.modifyItem(new Item(itemDto.getId(),itemDto.getDescription(),itemDto.getUnitprice(),itemDto.getQty()));
    }

    @Override
    public boolean deleteItem(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemDto searchItem(int id) throws Exception {
          Item item=itemService.findItem(id); 
        List<Item>list=new ArrayList<>();
        list.add(item);
        
        
       for (Item customer1 : list) {
            if(item!=null){
                
                 return new ItemDto(item.getId(),item.getDescription(),item.getUnitprice(),item.getQty());
             
            }
        }
        return null;
    }

    @Override
    public List<ItemDto> getAllItem() throws Exception {
        List<ItemDto>list=new ArrayList<>();
        List<Item> item1 =itemService.getAllItem();
         ItemDto s=null;
        for (Item item : item1) {
            if(item!=null){
                
                 s=new ItemDto(item.getId(),item.getDescription(),item.getUnitprice(),item.getQty());
              list.add(s);
            }
        }
        
       
        return list;
        

    }
    
}
