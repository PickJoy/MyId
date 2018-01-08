package com.idea.web;

import com.idea.entity.Users_One;
import com.idea.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Scope("prototype")
@RequestMapping("/userAction")
public class UserAction{

    private Users_One user;

    @Resource(name ="userService")
    private UserService userService;

    /**
     * 处理用户注册请求
     * @param uone
     * @return
     */
    @RequestMapping("/doRegister")
    public String doRegister(Users_One uone){
        userService.addUserOne(uone);
        return "login";
    }

    /**
     * 处理用户登录请求
     * @param uone
     * @return
     */
    @RequestMapping("/doLogin")
    public String doLogin(Users_One uone){
        return "commodityList";
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
