package com.thoughtworks.capability.gtb.entrancequiz.Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StuList {
    Map<String, String> stuList = new HashMap<>();

    public StuList() {
        stuList.put("1","沈乐棋");
        stuList.put("2","徐慧慧");
        stuList.put("3","陈思聪");
        stuList.put("4","王江林");
        stuList.put("5","王登宇");
        stuList.put("6","杨思雨");
        stuList.put("7","江雨舟");
        stuList.put("8","廖燊");
        stuList.put("9","胡晓");
        stuList.put("10","但杰");
        stuList.put("11","盖迈达");
        stuList.put("12","肖美琦");
        stuList.put("13","黄云洁");
        stuList.put("14","齐瑾浩");
        stuList.put("15","刘亮亮");
        stuList.put("16","肖逸凡");
        stuList.put("17","王作文");
        stuList.put("18","郭瑞凌");
        stuList.put("19","李明豪");
        stuList.put("20","党泽");
        stuList.put("21","肖伊佐");
        stuList.put("22","贠晨曦");
        stuList.put("23","李康宁");
        stuList.put("24","马庆");
        stuList.put("25","商婕");
        stuList.put("26","余榕");
        stuList.put("27","谌哲");
        stuList.put("28","董翔锐");
        stuList.put("29","陈泰宇");
        stuList.put("30","赵允齐");
        stuList.put("31","张柯");
        stuList.put("32","廖文强");
        stuList.put("33","刘轲");
        stuList.put("34","廖浚斌");
        stuList.put("35","凌凤仪");
    }

    public List<String> convertToList() {
        List<String> resultList = new ArrayList<>();
        stuList.forEach((key, value) -> {
            resultList.add(key+"."+value);
        });
        return resultList;
    }

    public Map<String, String> getStuList() {
        return stuList;
    }

}