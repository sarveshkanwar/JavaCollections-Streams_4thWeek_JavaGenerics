package java_generics.WarehouseManagement_System;

import java.util.List;

public class Warehouse {
    public static void displayItem(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            System.out.println("Name: " + item.name + " price: " + item.price);
        }
    }
}
