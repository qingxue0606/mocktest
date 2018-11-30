 package cn.websocket.te;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiang
 * @date 2018/11/30
 */
 @Component
public class TestJunit4 {
    @Autowired
    private IMathfun util;

    /*public TestJunit4(IMathfun util) {
        this.util = util;
    }*/

    public int cal(int num) {
        return 10 * util.abs(num);
    }
}
