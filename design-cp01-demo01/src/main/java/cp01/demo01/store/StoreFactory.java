package cp01.demo01.store;

import cp01.demo01.store.service.ICommodity;
import cp01.demo01.store.service.impl.CardCommodityService;
import cp01.demo01.store.service.impl.CouponCommodityService;
import cp01.demo01.store.service.impl.GoodzCommodityService;

public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodzCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
