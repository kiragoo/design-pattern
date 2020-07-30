package cp01.demo01.store.service;

import java.util.Map;

public interface ICommodity {
    
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
