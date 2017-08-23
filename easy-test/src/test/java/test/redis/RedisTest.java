package test.redis;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;

import test.base.BaseJunit4Test;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月23日
 * @Version: 1.0
 */
public class RedisTest extends BaseJunit4Test {

    @Resource(name = "redisTemplateMaster")
    private RedisTemplate redisTemplate;

    @Test
    public void redisTest() {
        BoundValueOperations boundValueOperations = redisTemplate.boundValueOps("skeleton:test:yy");
        Long increment = boundValueOperations.increment(1L);
        System.out.println("--------------------> " + increment);
    }
}
