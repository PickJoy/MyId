package com.idea.web;

import com.idea.entity.Commodity;
import com.idea.service.CommodityService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/commAction")
public class CommodityAction{

    private List commList;

    @Resource(name = "commService")
    private CommodityService commService;


    /**
     * 添加商品
     * @param uimage
     * @param comm
     * @param model
     * @param session
     * @param result
     * @return
     */
    @RequestMapping("/addCommodity")
    public String doAddCommodity(MultipartFile uimage,Commodity comm,Model model,HttpSession session,BindingResult result){
        //上传文件
        if(!uimage.isEmpty()){
            //获取服务器路径
            String basePath=session.getServletContext().getRealPath("/images");
            String realName=uimage.getOriginalFilename();//真实上传的文件名
            System.out.println("要上传的文件名是:"+realName);
            //执行上传操作
            try {
                uimage.transferTo(new File(basePath+"/"+realName));
                System.out.println("上传路径:"+basePath+"/"+realName);
                model.addAttribute("fileName",realName);
                comm.setUfile(basePath+"/"+realName);
            } catch (IOException e) {
                e.printStackTrace();
                return "error";
            }
        }
        commService.addCommodity(comm);
        return "commodityList";
    }

    /**
     * 显示商品的详细信息
     * @return
     */
    @RequestMapping("/findList")
    public String findCommodityList(){
        List commList=commService.findCommodityList();
        return "commodityList";
    }

    public void setCommService(CommodityService commService) {
        this.commService = commService;
    }

    public List getCommList() {
        return commList;
    }

    public void setCommList(List commList) {
        this.commList = commList;
    }
}
