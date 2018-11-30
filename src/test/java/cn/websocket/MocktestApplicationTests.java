package cn.websocket;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import cn.websocket.te.IMathfun;
import cn.websocket.te.TestJunit4;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MocktestApplicationTests {
    @Autowired
    private TestJunit4 testJunit4;
    
    
    /**
     *  该测试方法，及使接口有实现类， 并且TestJunit4 自动注入了实现类，在该测试中，也只会找MockBean的实现方法。如果没有mockBean
     *  那么会去找工厂中的实现类。
     */
    @MockBean
    private IMathfun iMathfun;
    
    @Before
    public void init() {
        Mockito.when(iMathfun.abs(-20)).thenReturn(20);
        Mockito.when(iMathfun.abs(-10)).thenReturn(10);

    }
    
	@Test
	public void contextLoads() {
	    assertEquals(100, testJunit4.cal(-10));
	}
	
	/*@Bean
	public IMathfun retrunIMathfun() {
	    return iMathfun;
	}*/

}
