package java_generics.WarehouseManagement_System;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem>{
    List<T> items = new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }

    public List<T> getAllItems() {
        return items;
    }

}
