package gp.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author aurora
 * @Description JDK观察者模式   观察者
 * @Date Created in 14:47 2019/4/21
 * @Modified By
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Gper gper = (Gper) o;
        Question question = (Question) arg;

        System.out.println("==================================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUsername());
    }
}
