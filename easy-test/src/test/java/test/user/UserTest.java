package test.user;

import com.easy.dal.user.dao.UserDao;
import com.easy.dal.user.model.User;
import com.yuhaibo.core.user.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseJunit4Test;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月19日
 * @Version: 1.0
 */
public class UserTest extends BaseJunit4Test {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @Test
    public void userTest() {
        //User user = userService.getUserById(1);
        User user = userDao.selectByPrimaryKey(1);
        System.out.println("---------------->" + user.getUserName());
    }
}
