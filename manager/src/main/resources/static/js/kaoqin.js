// $(function () {
//     var states=$(".state").text();
//     console.info(states);
// })
/**
 * 点击签到按钮触发的事件
 */
function sign_in() {
    //alert("点击了签到按钮！！");
    $.ajax({
        type: "get",
        url: "/qiandao",
        success: function (result) {
            //成功的回调函数
            if (result.code == 0) {
                alert(result.msg);
            } else if(result.code == 1){
                alert(result.msg);
            }else{
                alert("系统异常！");
            }
            location.href="/kaoqin";
        }
    });

}