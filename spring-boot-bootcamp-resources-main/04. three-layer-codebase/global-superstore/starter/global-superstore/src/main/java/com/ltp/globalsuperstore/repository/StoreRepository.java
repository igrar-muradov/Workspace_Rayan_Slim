package com.ltp.globalsuperstore.repository;

import com.ltp.globalsuperstore.Item;

import java.util.ArrayList;
import java.util.List;

public class StoreRepository {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems(){
        return items;
    }
}
