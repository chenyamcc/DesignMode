package strategymode.stratrgy.test;

import strategymode.stratrgy.context.MyContext;
import strategymode.stratrgy.factory.PayFactory;

/**
 * @author chenyam
 * @title: test
 * @projectName DesignMode
 * @description: 测试类
 * @date 2019/6/17 21:39
 */
public class test {
    public static void main(String[] args) {
        MyContext context = new MyContext(PayFactory.getPay("aliPay"));
        context.mypay();
    }
}
