package cp01.demo02;


import cp01.demo02.adapter.impl.EGMCacheAdapter;
import cp01.demo02.adapter.impl.IIRCacheAdapter;
import cp01.demo02.proxy.JDKProxy;
import cp01.demo02.service.impl.CacheServiceImpl;
import org.junit.Test;

public class CacheServiceTest {
    
    @Test
    public void testCacheService() throws Exception{
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "kirago");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "kirago");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
    

}