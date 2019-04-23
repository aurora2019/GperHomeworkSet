package gp.factory.factoryMethod;

/**
 * @Author aurora
 * @Description food的工厂
 * @Date Created in 18:04 2019/4/23
 * @Modified By
 */
public abstract class IFoodFactory {
    public void prepare(){
        System.out.println("准备工作");
    }
    abstract IFood getInstance();
}
