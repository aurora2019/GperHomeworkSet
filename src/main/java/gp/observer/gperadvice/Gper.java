package gp.observer.gperadvice;

import java.util.Observable;

/**
 * @Author aurora
 * @Description  观察得到的， 被观察者
 * @Date Created in 14:55 2019/4/21
 * @Modified By
 */
public class Gper extends Observable {
    private String name = "Gper生态圈";
    // 单例
    private static Gper gper = null;
    private Gper(){
    }
    public synchronized static Gper getInstance(){
        if(null == gper){
            gper = new Gper();
        }
        return  gper;
    }

    public String getName(){
        return  name;
    }

    // gper生态圈提问
    public void publishQuestion(Question question){
        System.out.println(question.getUsername() +"在"+this.name+"提出一问题。");
        //Marks this Observable object as having been changed;
        setChanged();
        // notify 通知private Vector<Observer> obs;
        // Vector类 是在 java 中可以实现自动增长的对象数组
        notifyObservers(question);
    }
}
