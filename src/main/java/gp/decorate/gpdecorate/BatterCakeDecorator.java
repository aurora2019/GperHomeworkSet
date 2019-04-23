package gp.decorate.gpdecorate;

/**
 * @Author aurora
 * @Description
 * @Date Created in 19:56 2019/4/21
 * @Modified By
 */
public abstract class BatterCakeDecorator extends BatterCake{

    // 静态代理，委派
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected  abstract void doSomething();

    // ctrl + o
    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
