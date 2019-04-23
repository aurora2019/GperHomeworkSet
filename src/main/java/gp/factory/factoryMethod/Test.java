package gp.factory.factoryMethod;



/**
 * @Author aurora
 * @Description
 * @Date Created in 18:12 2019/4/23
 * @Modified By
 */
public class Test {
    public static void main(String[] args) {
        IFoodFactory iFoodFactory = new ChocolateFactory();
        iFoodFactory.prepare();
        IFood iFood = iFoodFactory.getInstance();
        iFood.product();
        System.out.println("==========================================");
        iFoodFactory = new CookiesFactory();
        iFoodFactory.prepare();
        iFood = iFoodFactory.getInstance();
        iFood.product();

    }
}
