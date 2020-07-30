package cp01.demo01.store.entity.goodz;

import com.alibaba.fastjson.JSON;

public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
