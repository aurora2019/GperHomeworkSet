package gp.factory.factoryMethod;



/**
 * @Author aurora
 * @Description
 * @Date Created in 18:09 2019/4/23
 * @Modified By
 */
public class ChocolateFactory extends IFoodFactory {

    public IFood getInstance() {
        return new Chocolate();
    }
}
