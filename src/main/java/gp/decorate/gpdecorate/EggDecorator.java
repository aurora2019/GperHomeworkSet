package gp.decorate.gpdecorate;

/**
 * @Author aurora
 * @Description
 * @Date Created in 20:01 2019/4/21
 * @Modified By
 */
public class EggDecorator extends BatterCakeDecorator {
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
