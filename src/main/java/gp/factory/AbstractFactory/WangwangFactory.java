package gp.factory.AbstractFactory;



/**
 * @Author aurora
 * @Description
 * @Date Created in 18:31 2019/4/23
 * @Modified By
 */
public class WangwangFactory implements IFoodFactory {
    public IChocolate createChocolate() {
        return new WangwangChocolate();

    }

    public ICookies createCookies() {
        return new WangwangCookies();
    }

    public ISyrup createSyrup() {
        return new WangwangSyrup();
    }
}
