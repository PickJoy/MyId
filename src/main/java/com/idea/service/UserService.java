package com.idea.service;

import com.idea.dao.UserDao;
import com.idea.entity.Users_One;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    /**
     *注册用户
     * @param uone
     * @return
     */
    public boolean addUserOne(Users_One uone){
        return userDao.addUserOne(uone);
    }

    /**
     * 用户登录
     * @param uone
     * @return
     */
    public Users_One doLogin(Users_One uone) {
        String hql="from Users_One u where u.uname='"+uone.getUname()+"' and u.ustatus=1";
        //取出同名的所有用户
        List<Users_One> list=userDao.findUsersList(hql);
        if(list!=null&&list.size()>0){
            for (Users_One user : list) {
                if(uone.getUname().equals(uone.getUname())&&uone.getUpwd().equals(uone.getUpwd())){
                        return user;
                }
            }
        }
        return null;
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
