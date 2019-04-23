package gp.decorate.gpdecorate;

/**
 * @Author aurora
 * @Description
 * @Date Created in 20:03 2019/4/21
 * @Modified By
 */
public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
