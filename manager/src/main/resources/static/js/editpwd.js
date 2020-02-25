/**
 * 修改密码js
 * 点击返回按钮，返回主页面
 */
function editpwd_fanhui() {
    location.href = "/main";
}

/**
 * 点击修改按钮
 */
function editpwd_save(t) {
    //获取用户id
    var id=$(t).prev().val();
    //获取原密码
    var oldpwd=$(".oldpwd").val();
    //获取新密码
    var newpwd=$(".newpwd").val();
    //获取确认密码
    var repwd=$(".repwd").val();
    //数据校验
    if(oldpwd==""||oldpwd==null||newpwd==""||newpwd==null||repwd==""||repwd==null){
        alert("请将数据补充完整！");
        return false;
    }
    if(oldpwd.length>16||oldpwd.length<6||newpwd.length>16||newpwd.length<6||repwd.length>16||repwd.length<6){
        alert("密码长度应介于6~16位");
        return false;
    }
    if(newpwd!=repwd){
        alert("新密码与确认密码输入不一致");
        return false;
    }

    //请求后端
    $.ajax({
        type:"post",
        url:"/editpwd/"+id+"/"+oldpwd+"/"+newpwd,
        success:function (result) {
            //成功的回调
            if(result.code==0){
                //修改成功
                alert("修改成功");
                location.href="/logout";
            }else if(result.code==1){
                //修改是失败
                alert("修改失败，请稍后再试！")
            }else if(result.code==2){
                //原密码输入错误
                alert("原密码输入错误！")
            }
        }
    });





}