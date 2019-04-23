package gp.factory.AbstractFactory;

/**
 * @Author aurora
 * @Description
 * @Date Created in 18:28 2019/4/23
 * @Modified By
 */
public class Test {
    public static void main(String[] args) {
        IFoodFactory iFoodFactory = new WangwangFactory();
        iFoodFactory.createChocolate().product();
        iFoodFactory.createCookies().product();
        iFoodFactory.createSyrup().product();
    }
}
