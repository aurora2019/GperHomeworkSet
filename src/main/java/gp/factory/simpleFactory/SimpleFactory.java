package gp.factory.simpleFactory;

/**
 * @Author aurora
 * @Description
 * @Date Created in 17:56 2019/4/23
 * @Modified By
 */
public class SimpleFactory {

    public IFood create(String name){
        if (name == "鱼") {
            return new Fish();
        }else if (name == "肉"){
            return new Flesh();
        }else {
            return null;
        }
    }
}
