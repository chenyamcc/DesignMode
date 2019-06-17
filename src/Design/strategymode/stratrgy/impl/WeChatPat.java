package strategymode.stratrgy.impl;

import strategymode.stratrgy.IPay;

/**
 * @author chenyam
 * @title: WeChatPat
 * @projectName DesignMode
 * @description: 微信支付
 * @date 2019/6/17 21:23
 */
public class WeChatPat implements IPay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
