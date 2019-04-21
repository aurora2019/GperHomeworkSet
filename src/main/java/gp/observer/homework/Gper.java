package gp.observer.homework;

import com.google.common.eventbus.Subscribe;
import gp.observer.gperadvice.Question;

/**
 * @Author aurora
 * @Description
 * @Date Created in 15:47 2019/4/21
 * @Modified By
 */
public class Gper {

    private String name = "Gper生态圈";

    // 单例
    private static Gper gper = null;
    private Gper(){
    }
    public static Gper getInstance(){
        if(null == gper){
            gper = new Gper();
        }
        return  gper;
    }

    public String getName(){
        return name;
    }

    @Subscribe
    public void publishQuestion(Question question){
        System.out.println(question.getUsername() +"在"+name+"发布了一个问题:"+question.getContent());
    };
}
