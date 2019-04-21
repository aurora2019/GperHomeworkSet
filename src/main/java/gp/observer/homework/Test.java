package gp.observer.homework;


import com.google.common.eventbus.EventBus;
import gp.observer.gperadvice.Question;

/**
 * @Author aurora
 * @Description
 * @Date Created in 15:56 2019/4/21
 * @Modified By
 */
public class Test {

    public static void main(String[] args) {
        // 消息总线
        EventBus eventBus = new EventBus();

        Gper Gper = gp.observer.homework.Gper.getInstance();

        // 问题
        Question question = new Question();
        question.setContent("观察者应用场景有哪些？");
        question.setUsername("stu.aurora");

        eventBus.register(Gper);
        eventBus.post(question);
    }
}
