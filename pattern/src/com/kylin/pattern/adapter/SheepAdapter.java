package com.kylin.pattern.adapter;

public class SheepAdapter implements Sheep {
    private Wolf wolf;
    /**
     * 传进被适配对象(狼)
     * @param wolf
     */
    public SheepAdapter(Wolf wolf){
        this.wolf = wolf;
    }
 
    @Override
    public void ho() {
        wolf.ho();
    }
 
    @Override
    public void run() {
        wolf.run();
    }
}
