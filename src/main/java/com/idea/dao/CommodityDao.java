package com.idea.dao;

import com.idea.entity.Commodity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commDao")
public class CommodityDao extends BaseDao {

    /**
     * 添加商品
     * @param comm
     * @return
     */
    public boolean addCommodity(Commodity comm){
      try {
          getSession().save(comm);
          return true;
      }catch (Exception e){
          e.printStackTrace();
      }
      return false;
    }

    /**
     * 显示商品信息
     * @param hql
     * @return
     */
    public List findCommodityList(String hql){
        return getSession().createQuery(hql).list();
    }

    /**
     * 修改商品的状态
     * @param comm
     * @return
     */
    public boolean updateCommodity(Commodity comm) {
        try {
            getSession().update(comm);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
