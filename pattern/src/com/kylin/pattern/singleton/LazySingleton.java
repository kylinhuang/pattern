package com.kylin.pattern.singleton;

/** 
 * @author     kylin
 * 懒汉式 单例 
 *  
 * 对于懒汉式 创建的时候注意线程安全  ---- 加锁 或者同步代码块
 * @creatDate：2015-3-24
 */ 
public class LazySingleton {
	
    private static LazySingleton singleton;  
    private LazySingleton(){}  
      
    public static synchronized LazySingleton getInstance(){  
        if(singleton==null){  
            singleton = new LazySingleton();  
        }  
        return singleton;  
    }  

}
