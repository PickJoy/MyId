package com.idea.service;

import com.idea.dao.CommodityDao;
import com.idea.entity.Commodity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("commService")
@Transactional(propagation = Propagation.REQUIRED)
public class CommodityService {

    @Resource(name = "commDao")
    private CommodityDao commDao;

    /**
     * 添加商品
     * @param comm
     * @return
     */
    public boolean addCommodity(Commodity comm){
        return commDao.addCommodity(comm);
    }

    /**
     * 显示商品的详细信息
     * @return
     */
    public List findCommodityList(){
        String hql="from Commodity";
        return commDao.findCommodityList(hql);
    }


    public void setCommDao(CommodityDao commDao) {
        this.commDao = commDao;
    }

}
