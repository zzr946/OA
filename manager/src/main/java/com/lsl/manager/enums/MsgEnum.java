package com.lsl.manager.enums;


public enum MsgEnum {
    SYS_USER_NOT_FOUND(20100,"用户不存在！"),
    SYS_USERNAME_OR_PASSWORD_ERROR(20101,"用户名或密码错误！"),
    SYS_LOGIN_SUCCESS(20102,"登录成功！"),
    SYS_EDIT_OWN_SUCCESS(20103,"修改成功！"),
    SYS_EDIT_OWN_ERROR(20104,"修改失败，请稍后再试！"),
    SYS_DELETE_FAMILY_SUCCESS(20105,"删除成功！"),
    SYS_DELETE_FAMILY_ERROR(20106,"删除失败，请稍后再试！"),
    SYS_ADD_FAMILY_SUCCESS(20107,"添加成功！"),
    SYS_ADD_FAMILY_ERROR(20108,"添加失败！"),
    SYS_SELECT_SUCCESS(20109,"查询成功！"),
    SYS_SELECT_ERROR(20110,"查询失败！"),
    SYS_QIANDAO_ERROR(20111,"重复签到！"),
    SYS_QIANDAO_SUCCESS(20112,"签到成功！"),
    SYS_OLD_PASSWORD_ERROR(20113,"原密码输入错误！"),
    ;
    private Integer code;
    private String msg;

    //两个参数的构造函数
    MsgEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //code的 getting方法
    public Integer getCode() {
        return code;
    }
    //msg的 getting方法
    public String getMsg() {
        return msg;
    }
}
