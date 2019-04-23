package gp.factory.AbstractFactory;

/**
 * @Author aurora
 * @Description
 * @Date Created in 18:21 2019/4/23
 * @Modified By
 */
public interface IFoodFactory {

    IChocolate createChocolate();

    ICookies createCookies();

    ISyrup createSyrup();
}
