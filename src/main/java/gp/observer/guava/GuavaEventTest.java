package gp.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author aurora
 * @Description
 * @Date Created in 15:39 2019/4/21
 * @Modified By
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        // 消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Mr.J");
    }

}
