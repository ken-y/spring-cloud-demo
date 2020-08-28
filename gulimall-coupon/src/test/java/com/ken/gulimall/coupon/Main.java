package com.ken.gulimall.coupon;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello World!");

        String result = "{\"returnCode\":\"0000\",\"returnMessage\":\"查询成功\",\"logisticsInfo\":[{\"wbInfo\":[{\"time\":\"2020-08-16 16:12:51\",\"message\":\"上海市,顺丰速运 已收取快件\",\"seq\":\"1\"},{\"time\":\"2020-08-16 17:18:18\",\"message\":\"上海市,顺丰速运 已收取快件\",\"seq\":\"2\"},{\"time\":\"2020-08-16 22:01:11\",\"message\":\"上海市,快件在【上海嘉定宝园营业点】已装车,准备发往 【上海华新集散中心】\",\"seq\":\"3\"},{\"time\":\"2020-08-16 22:10:23\",\"message\":\"上海市,快件已发车\",\"seq\":\"4\"},{\"time\":\"2020-08-16 22:35:15\",\"message\":\"上海市,快件到达 【上海华新集散中心】\",\"seq\":\"5\"},{\"time\":\"2020-08-16 22:49:54\",\"message\":\"上海市,快件在【上海华新集散中心】已装车,准备发往 【上海浦江集散中心】\",\"seq\":\"6\"},{\"time\":\"2020-08-16 22:54:40\",\"message\":\"上海市,快件已发车\",\"seq\":\"7\"},{\"time\":\"2020-08-17 00:03:15\",\"message\":\"上海市,快件到达 【上海浦江集散中心】\",\"seq\":\"8\"},{\"time\":\"2020-08-17 02:26:15\",\"message\":\"上海市,快件在【上海浦江集散中心】已装车,准备发往 【上海闵行江川营业点】\",\"seq\":\"9\"},{\"time\":\"2020-08-17 02:26:22\",\"message\":\"上海市,快件已发车\",\"seq\":\"10\"},{\"time\":\"2020-08-17 05:18:40\",\"message\":\"上海市,快件到达 【上海闵行江川营业点】\",\"seq\":\"11\"},{\"time\":\"2020-08-17 07:35:22\",\"message\":\"上海市,快件交给朱献涛,正在派送途中（联系电话：13695559574,顺丰已开启“安全呼叫”保护您的电话隐私,请放心接听！）（主单总件数：1件）\",\"seq\":\"12\"},{\"time\":\"2020-08-17 09:52:36\",\"message\":\"上海市,您的快件已签收，如有疑问请电联小哥【朱献涛，电话：13695559574】。疫情期间顺丰每日对网点消毒、小哥每日测温、配戴口罩，感谢您使用顺丰，期待再次为您服务。（主单总件数：1件）\",\"seq\":\"13\"},{\"time\":\"2020-08-17 09:52:37\",\"message\":\"上海市,在官网\\\"运单资料&签收图\\\",可查看签收人信息\",\"seq\":\"14\"}],\"wbNo\":\"SF1040245060669\"}]}";
        JSONObject jsonObject = JSONObject.parseObject(result);
        JSONArray logisticsInfo = jsonObject.getJSONArray("logisticsInfo");
        System.out.println(logisticsInfo);
        JSONArray member1=new JSONArray();
        for(int i=0;i<logisticsInfo.size();i++){
            JSONArray wbInfo = logisticsInfo.getJSONObject(i).getJSONArray("wbInfo");

            //JSONArray ABC = new JSONArray();
            if(wbInfo.size() > 0){
                JSONArray jsonArraySort = jsonArraySort(wbInfo);

                System.out.println(wbInfo);
                logisticsInfo.getJSONObject(i).put("wbInfo",jsonArraySort);
            }


            //logisticsInfo.getJSONObject(i).setWbInfo(jsonArraySort);


            //System.out.println("\n================\n");
        }

        System.out.println(logisticsInfo);
    }


    public static JSONArray jsonArraySort(JSONArray jsonArr) {
        //JSONArray jsonArr = JSON.parseArray(jsonArrStr);
        JSONArray sortedJsonArray = new JSONArray();
        List<JSONObject> jsonValues = new ArrayList<JSONObject>();
        for (int i = 0; i < jsonArr.size(); i++) {
            jsonValues.add(jsonArr.getJSONObject(i));
        }

        Collections.sort(jsonValues, new Comparator<JSONObject>() {
            // You can change "Name" with "ID" if you want to sort by ID
            private static final String KEY_NAME = "time";

            @Override
            public int compare(JSONObject a, JSONObject b) {
                String valA = new String();
                String valB = new String();
                try {
                    // 这里是a、b需要处理的业务，需要根据你的规则进行修改。
                    String aStr = a.getString(KEY_NAME);
                    valA = aStr.replaceAll("-", "");
                    String bStr = b.getString(KEY_NAME);
                    valB = bStr.replaceAll("-", "");
                } catch (JSONException e) {
                    // do something
                }
                return -valA.compareTo(valB);
                // if you want to change the sort order, simply use the following:
                // return -valA.compareTo(valB);
            }
        });
        for (int i = 0; i < jsonArr.size(); i++) {
            sortedJsonArray.add(jsonValues.get(i));
        }
        return sortedJsonArray;
    }
}
