/**
 * 查看员工详细信息
 * @param t
 */
function employee_info(t) {
    //获取查看的员工的id
    var userid=$(t).prev().val();
    //console.info(userid);
    //location.href="/employee/"+userid;
    $.ajax({
        type: "get",
        url: "/employee/" + userid,
        success: function (result) {
            //成功的回调函数
            if(result.code==0){
                //成功
                location.href="employee";
            }else{
                //失败
                alert("系统异常！")
            }
        }
    });
}

/**
 * 添加新员工
 */
function add_employee() {
    location.href="/addemp";
}