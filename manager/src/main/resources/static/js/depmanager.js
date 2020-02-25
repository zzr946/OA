/**
 * 查看部门信息按钮
 */
function dep_info(t) {
    //alert("点击了查看部门信息按钮");
    //显示详情框
    $("#dep_item").removeClass("hidden");
    //获取部门id
    var id=$(t).prev().val();
    //获取部门名称
    var depname=$(t).parent().prev().prev().text();
    //获取部门总人数
    var count=$(t).parent().prev().text();
    //显示详情框
    $("#dep_item").removeClass("hidden");
    //将数据回显到框中
    $("#id_item").val(id);
    $("#depname_item").val(depname);
    $("#count_item").val(count);

}

/**
 * 新增部门
 */
function add_dep() {
    //alert("新增部门");
    //显示新增部门的表格
    $("#add_tab").removeClass("hidden");

}

/**
 * 新增部门，点击保存按钮
 */
function save_addDep() {
    //获取部门名称
    var depname = $("#add_empname").val();
    // console.info(depname);
    $.ajax({
        type:"post",
        url:"/adddep/"+depname,
        success:function (result) {
            //成功的回调
            if(result.code==0){
                //成功
                alert(result.msg);
                location.href="/depmanager";
            }else{
                //失败
                alert(result.msg);
            }
        }
    });
}

/**
 * 新增部门，点击取消按钮
 */
function quxiao_addDep() {
    //将新增部门输入框隐藏
    $("#add_tab").addClass("hidden");
}

/**
 * 查看部门详情  点击返回按钮，隐藏显示框
 */
function fanhui() {
    $("#dep_item").addClass("hidden");
}

/**
 * 查看部门详情   点击保存，修改部门信息，将部门信息传到后端处理
 */
function edit_savedep(t) {
    //获取部门id
    var id=$(t).prev().val();
    //获取部门名称
    var depname=$(t).parent().prev().prev().children("input").val();
    //获取部门总人数
    var count=$(t).parent().prev().children("input").val();
    //console.info(id+"-"+depname+"-"+count);
    //请求后端
    $.ajax({
        type:"post",
        url:"/editdep/"+id+"/"+depname+"/"+count,
        success:function (result) {
            //成功的回调函数
            if(result.code==0){
                //成功
                alert(result.msg);
                location.href="/depmanager";
            }else{
                //失败
                alert(result.msg);
            }
        }
    });


}
