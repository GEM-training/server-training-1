package com.gem.nhom1.service;

import com.gem.nhom1.model.Bill;

import java.util.List;

/**
 * Created by phuongtd on 20/01/2016.
 */
public interface BillService {
    public Bill getBillById(int id);
    public void save(Bill bill);
    public List<Bill> getListBill();
}