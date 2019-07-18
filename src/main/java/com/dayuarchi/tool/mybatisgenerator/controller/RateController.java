package com.dayuarchi.tool.mybatisgenerator.controller;

import com.dayuarchi.tool.mybatisgenerator.dao.TpTradeRateMapper;
import com.dayuarchi.tool.mybatisgenerator.model.TpTradeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-07-18 08:56
 */
@Controller
@RequestMapping("/rate")
public class RateController {

    @Autowired
    private TpTradeRateMapper tradeRateMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public Object hello(){
        System.out.println("134");
        TpTradeRate tpTradeRate = tradeRateMapper.selectByPrimaryKey(1);
        System.out.println(tpTradeRate.toString());
//        tradeRateMapper.toString();
        return "success";
    }
}