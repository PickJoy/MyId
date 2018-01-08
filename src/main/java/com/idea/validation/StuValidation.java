//package com.idea.validation;
//
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
///**
// * 为Stu对象构建一个验证器
// * Created by Administrator on 2017/11/2.
// */
//public class StuValidation implements Validator{
//
//    //是否验证Stu类型
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return Users.class.equals(aClass);
//    }
//
//    //定义验证规则
//    @Override
//    public void validate(Object o, Errors errors) {
//        //将Object强转为Stu对象
//        if(o!=null){
//            Users user=(Users)o;
//            if(user.getUname()==null){
//                errors.rejectValue("uname",null,"用户姓名不能为空");
//            }else{
//                String regex="^[\\w\\u4e00-\\u9fa5]{2,100}$";
//                if(!user.getUname().matches(regex)) {
//                    errors.rejectValue("uname", null, "姓名必须是长度为2-100之间字母数字与中文构成");
//                }
//            }
//        }
//    }
//}
