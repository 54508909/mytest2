<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/8
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增图书</title>
</head>
<body style="text-align: center">
增加新书

<form id="myForm">
    <table style="margin: auto">
        <tr>
            <td>书名：</td>
            <td><input type="text" name="bookName" id="bookName"></td>
        </tr>
        <tr>
            <td>作者：</td>
            <td><input type="text" name="bookAuthor" id="bookAuthor"></td>
        </tr>
        <tr>
            <td>出版社：</td>
            <td><input type="text" name="bookPublish" id="bookPublish"></td>
        </tr>
        <tr>
            <td>页数：</td>
            <td><input type="text" name="bookPage" id="bookPage"></td>
        </tr>
        <tr>
            <td>价格：</td>
            <td><input type="text" name="bookPrice" id="bookPrice"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center"><input type="button" value="提交" id="subBtn"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>

<script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
    $("#subBtn").click(function () {
        var name=$("#bookName").val();
        var bookAuthor=$("#bookAuthor").val();
        var bookPublish=$("#bookPublish").val();
        var bookPage=$("#bookPage").val();
        var bookPrice=$("#bookPrice").val();

        var pageReg=/^[1-9]\d*$/;
        var priceReg=/(^[1-9]\d*(\.\d{1,2})?$)|(^0(\.\d{1,2})?$)/;

        if (name==null || name==""){
            alert("书名不能为空！");
            return;
        }
        if (bookAuthor==null || bookAuthor==""){
            alert("作者不能为空！");
            return;
        }
        if (bookPublish==null || bookPublish==""){
            alert("出版社不能为空！");
            return;
        }
        if (bookPage==null || bookPage==""){
            alert("页数不能为空！");
            return;
        }
        if (!pageReg.test(bookPage)){
            alert("页数必须为正整数！");
            return;
        }
        if (bookPrice==null || bookPrice==""){
            alert("价格不能为空！");
            return;
        }
        if (!priceReg.test(bookPrice)){
            alert("价格必须是数字类型！");
            return;
        }

        $.ajax({
            url:"/book/doBookAdd",
            data:$("#myForm").serialize(),
            type:"post",
            success:function (data) {
                if (data==1){
                    alert("新增成功！")
                    window.location.href="/book/getBooksList"
                }else{
                    alert("新增失败！")
                    window.location.href="bookAdd.jsp"
                }
            }
        })
    })

</script>

</body>
</html>
