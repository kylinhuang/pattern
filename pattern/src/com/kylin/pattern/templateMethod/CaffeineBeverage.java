package com.kylin.pattern.templateMethod;

public abstract class CaffeineBeverage {
	
	 final void prepareRecipe() {  
        boilWater();//把水煮沸  
        brew();//用热水泡咖啡或茶  
        pourInCup();//把饮料（咖啡或茶）倒进杯子  
        addCondiments();//加入调料  
        
        if (isaddCondiments()) {  
            addCondiments();  
        } 
     }  
	 
	 abstract Boolean isaddCondiments();

	/**用热水泡咖啡或茶*/
	abstract void brew();  
	    
    /** 
    * addCondiments 
    * @Description: 添加调味品
    * @return void    返回类型 
    * @date 2015-3-25 下午3:19:11
    */
    abstract void addCondiments();  
   
    /** 把水煮沸*/  
    void boilWater() {  
        System.out.println("Boiling water");  
    }
    
    /**把饮料（咖啡或茶）倒进杯子*/
    void pourInCup() {  
        System.out.println("Pouring into cup");  
    }  
}
