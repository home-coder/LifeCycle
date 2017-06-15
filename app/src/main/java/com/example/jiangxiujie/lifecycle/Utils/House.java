package com.example.jiangxiujie.lifecycle.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiangxiujie on 17-6-15.
 */
public class House {
    private int img;
    private int no;
    private String name;

    public House(int img, int no, String name) {
        this.img = img;
        this.no = no;
        this.name = name;
    }

    public static void getmList(List<Map<String, Object>> mlist, House house) {
        Map<String, Object> map = new HashMap<>();
        map.put("img", house.getImg());
        map.put("id", house.getNo());
        map.put("name", house.getName());
        mlist.add(map);
    }

    public int getImg() {
        return this.img;
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return this.name;
    }
}
