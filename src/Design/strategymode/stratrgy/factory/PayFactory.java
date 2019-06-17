package strategymode.stratrgy.factory;

import strategymode.stratrgy.IPay;
import strategymode.stratrgy.impl.AliPay;
import strategymode.stratrgy.impl.UnionPay;
import strategymode.stratrgy.impl.WeChatPat;

/**
 * @author chenyam
 * @title: PayFactory
 * @projectName DesignMode
 * @description: 支付方式的工厂
 * @date 2019/6/17 21:35
 */
public class PayFactory {

    public static IPay getPay(String payMethod) {
        switch (payMethod) {
            case "wecharPay":
                return new WeChatPat();
            case "aliPay":
                return new AliPay();
            case "unionPay":
                return new UnionPay();
            default:
                return null;
        }
    }
}
