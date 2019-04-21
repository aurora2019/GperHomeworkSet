package gp.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author aurora
 * @Description
 * @Date Created in 15:37 2019/4/21
 * @Modified By
 */
public class GuavaEvent {

    // Subscribe : 订阅
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入参数是："+str);
    }

    @Subscribe
    public void myFun(String str){
        System.out.println("测试"+str);
    }
}

