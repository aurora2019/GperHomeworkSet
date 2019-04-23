package gp.decorate.gpdecorate;

/**
 * @Author aurora
 * @Description
 * @Date Created in 20:05 2019/4/21
 * @Modified By
 */
public class Test {

    public static void main(String[] args) {

        BatterCake batterCake;
        batterCake = new BaseBatterCake();

        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);

        System.out.println(batterCake.getMsg());
        System.out.println(batterCake.getPrice());
    }
}
