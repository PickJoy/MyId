package com.idea.dao;

import com.idea.entity.Users_One;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDao extends BaseDao {

    /**
     * 注册用户
     * @param uone
     * @return
     */
    public boolean addUserOne(Users_One uone){
        try {
            getSession().save(uone);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public List findUsersList(String hql) {
        return getSession().createQuery(hql).list();
    }
}
