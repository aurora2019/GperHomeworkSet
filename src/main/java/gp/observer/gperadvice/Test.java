package gp.observer.gperadvice;

/**
 * @Author aurora
 * @Description jdk 观察者模式
 * @Date Created in 14:48 2019/4/21
 * @Modified By
 */
public class Test {
    public static void main(String[] args) {
        // 监听者
        Teacher teacher = new Teacher("Mr.J");
        // 问题
        Question question = new Question();
        question.setUsername("boy");
        question.setContent("学习的正确方式？");
        // 被监听者
        Gper gper = Gper.getInstance();
        gper.addObserver(teacher);
        // 发布问题
        gper.publishQuestion(question);
    }
}
