package com.gem.nhom1.dao;

import com.gem.nhom1.model.Staff;
import com.gem.nhom1.model.Unit;

import java.util.List;

/**
 * Created by vanhop on 1/18/16.
 */
public interface UnitDao {

    public Unit getById(int id);
    public List<Unit> getList(int page);
    public int insert(Unit unit);
    public boolean delete(int id);
    public void update(Unit unit);
}
