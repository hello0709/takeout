package com.tbea.takeout.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author hanchen
 * @create 2019-05-29 17:50
 */
@Mapper
public interface OrderInfoDao {

    @Insert("insert into buyorderinfo(good_info,buyaddress,receiveaddress,phonenumber) value(#{good_info},#{buyaddress},#{receiveaddress},#{phonenumber})")
    int InsertOrderInfo(JSONObject json);
}
