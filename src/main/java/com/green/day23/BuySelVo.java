package com.green.day23;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class BuySelVo { // Vo = value Object
    private String memId;
    private int buyCount;

    public BuySelVo(String memId, int buyCount) {
        this.memId = memId;
        this.buyCount = buyCount;
    }

    public String getMemId() {
        return memId;
    }

    public int getBuyCount() {
        return buyCount;
    }

    @Override
    public String toString() {
        return "BuySelVo{" +
                "memId='" + memId + '\'' +
                ", buyCount=" + buyCount +
                '}';
    }
} // class BuySelVo









