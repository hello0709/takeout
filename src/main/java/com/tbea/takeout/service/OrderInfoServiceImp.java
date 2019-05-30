package com.tbea.takeout.service;

import com.alibaba.fastjson.JSONObject;
import com.tbea.takeout.dao.OrderInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hanchen
 * @create 2019-05-30 10:47
 */
@Service
public class OrderInfoServiceImp implements OrderInfoService{
    @Autowired
    OrderInfoDao orderInfo;
    @Override
   public String  InsertOrderInfo(JSONObject json){
        if(null==json)
        return null;
        int resultNum=orderInfo.InsertOrderInfo(json);
        if(1==resultNum)
            return "success";
        return null;
    }
}
