package gp.decorate.gpdecorate;

/**
 * @Author aurora
 * @Description
 * @Date Created in 19:53 2019/4/21
 * @Modified By
 */
public class BaseBatterCake extends BatterCake {
    protected String getMsg() {
        return "一个正儿八经的杂粮煎饼";
    }

    protected int getPrice() {
        return 5;
    }
}
