package strategymode.stratrgy.impl;

import strategymode.stratrgy.IPay;

/**
 * @author chenyam
 * @title: UnionPay
 * @projectName DesignMode
 * @description: 银联支付
 * @date 2019/6/17 21:24
 */
public class UnionPay implements IPay {
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
