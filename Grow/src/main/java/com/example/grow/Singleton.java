package com.example.grow;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Singleton {
    public static void main(String[] args) {

    }
    private Singleton instance = new Singleton();
    Singleton getInstance(){
        return instance;
    }
    private Singleton instance2 = null;
    synchronized Singleton getInsatnce(){
        if(instance2 == null){
            instance2 = new Singleton();
        }
        return instance2;
    }
    //get用于获取信息，无副作用，且可缓存。
    //post用于修改服务器数据，不可缓存。
}
