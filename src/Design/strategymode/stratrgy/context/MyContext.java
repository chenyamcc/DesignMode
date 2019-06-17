package strategymode.stratrgy.context;

import strategymode.stratrgy.IPay;

/**
 * @author chenyam
 * @title: MyContext
 * @projectName DesignMode
 * @description: 客户端
 * @date 2019/6/17 21:41
 */
public class MyContext {
    private IPay iPay;

    public MyContext(IPay iPay) {
        this.iPay = iPay;
    }

    public void mypay(){
        iPay.pay();
    }
}
