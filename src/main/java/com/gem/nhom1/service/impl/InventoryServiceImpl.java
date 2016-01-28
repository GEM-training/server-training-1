package com.gem.nhom1.service.impl;

import com.gem.nhom1.dao.InventoryDao;
import com.gem.nhom1.model.Inventory;
import com.gem.nhom1.service.InventoryService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nghicv on 21/01/2016.
 */
@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryDao dao;
    public int insert(Inventory inventory) {
        return dao.insert(inventory);
    }

    public List<Inventory> getList(int page) {
        return dao.getList(page);
    }

    public Inventory getById(int id) {

        Inventory inventory = dao.getById(id);
        Hibernate.initialize(inventory.getInventoryUnits());
        return inventory;
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public void update(Inventory inventory) {
        dao.update(inventory);
    }
}
