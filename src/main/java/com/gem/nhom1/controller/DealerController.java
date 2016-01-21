package com.gem.nhom1.controller;

import com.gem.nhom1.model.*;
import com.gem.nhom1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by phuong on 1/19/2016.
 */
@Controller
@RequestMapping("/dealer")
public class DealerController {

    @Autowired
    private BillDetailService billDetailService;

    @Autowired
    private UnitDealerService unitDealerService;

    @Autowired
    private UnitService unitService;

    @Autowired
    private DealerService dealerService;

    @Autowired
    private BillService billService;

    @RequestMapping("/insert")
    public @ResponseBody String  home(ModelMap mm){

        Dealer dealer = new Dealer("Test Dealer" , "HN");

        return dealerService.insert(dealer)+"";

    }
    @RequestMapping("/update")
    public @ResponseBody String update(){
        Dealer dealer = dealerService.getById(5);
        dealer.setName("Demo update");
        dealerService.update(dealer);
        return "OK";
    }

    @RequestMapping("/list")
    public @ResponseBody String list(){
        List<Dealer> list = dealerService.getList();

        return "Size dealer: "+ list.size();
    }

    @RequestMapping("/delete")
    public @ResponseBody String delete(){

        return "Delete: "+ dealerService.delete(5);
    }



}
