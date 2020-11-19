package com.example.okr.okrproject;

import com.example.okr.okrproject.util.CodeUtil;
import org.junit.jupiter.api.Test;

public class md5Test {

    @Test
    public void md5Create(){
        System.out.println(CodeUtil.encode("1","MD5"));;
    }
}
