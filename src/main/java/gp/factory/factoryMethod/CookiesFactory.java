package gp.factory.factoryMethod;


import gp.factory.factoryMethod.IFood;

/**
 * @Author aurora
 * @Description
 * @Date Created in 18:07 2019/4/23
 * @Modified By
 */
public class CookiesFactory extends IFoodFactory{

    public IFood getInstance() {
        return new Cookies();
    }
}
