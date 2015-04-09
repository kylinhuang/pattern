package com.kylin.pattern.singleton;

/** 
 * @author     kylin
 * 饿汉式 单例
 * 
 * 优点
 * 在内存中只有一个对象，节省内存空间。
	避免频繁的创建销毁对象，可以提高性能。
	避免对共享资源的多重占用。
	可以全局访问。
	
	用于管理类  Utils 等 只需要一个管理者
 * @creatDate：2015-3-24
 */ 
public class HungrySingleton {
	
	 /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static HungrySingleton singleton = new HungrySingleton();
  
    /* 私有构造方法，防止被实例化 */  
    private HungrySingleton(){}  

    /* 静态工程方法，创建实例 */
    public static HungrySingleton getInstance(){  
        return singleton;  
    } 

}
