package strategymode.stratrgy.impl;

import strategymode.stratrgy.IPay;

/**
 * @author chenyam
 * @title: AliPay
 * @projectName DesignMode
 * @description: 支付宝支付
 * @date 2019/6/17 21:25
 */
public class AliPay  implements IPay {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
