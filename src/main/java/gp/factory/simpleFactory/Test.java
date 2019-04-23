package gp.factory.simpleFactory;

/**
 * @Author aurora
 * @Description
 * @Date Created in 18:00 2019/4/23
 * @Modified By
 */
public class Test {
    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        IFood food = simpleFactory.create("鱼");
        food.cook();
        food  = simpleFactory.create("肉");
        food.cook();
    }
}
