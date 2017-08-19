/**  
 *BaseTests.java         2015年7月20日下午2:16:45
 *@Copyright:Copyright © 2014 VIVO Communication Technology Co., Ltd. All rights reserved.
 *@Company:Vivo----http://www.vivo.com.cn/
 * 
 */
package com.yuhaibo.test.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title:
 * @Description:
 * @Author:zhoufeng
 * @Since:2015年7月20日
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring-test.xml")
@Transactional
@Rollback
public class BaseJunit4Test extends AbstractTransactionalJUnit4SpringContextTests {

    @Test
    public void init() {
        System.out.println("init BaseJunit4Test successful!");
    }
}
