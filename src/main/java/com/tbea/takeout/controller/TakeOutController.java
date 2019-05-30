package com.tbea.takeout.controller;

import com.alibaba.fastjson.JSONObject;
import com.tbea.takeout.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


/**
 * @author hanchen
 * @create 2019-05-28 16:42
 */
@Controller
public class TakeOutController {

    @RequestMapping("getDetails")
    @ResponseBody
    public Map<String, Object> getUser() {
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wanger");
        list.add("mazi");
        map.put("list", list);
        System.out.println("微信小程序调用完成。。。");
        return map;
    }
    @Autowired
    OrderInfoService orderInfoService;

    @RequestMapping("getInfo")
    @ResponseBody
    public JSONObject getValues(@RequestBody JSONObject json) {
        JSONObject result = new JSONObject();
        result.put("msg", "fail");
        if("success"==orderInfoService.InsertOrderInfo(json))
            result.put("msg","success");
        return result;
    }
}
