package com.kq.utils;

import org.junit.Test;

import java.util.UUID;

public class IDutils {

    public static String getId(){

        return UUID.randomUUID().toString().replace("-","");
    }

    @Test
    public void getUUID(){
        System.out.println(IDutils.getId());
    }
}
