<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://bestpay.com/jsp/jstl/functions" prefix="myTld" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<core:set var="ctx" value="${pageContext.request.contextPath}"/>
<s:set var="title" value="@com.qdonepay.manager.utils.init.Constants@SYS_TITLE"/>
<html>
	<head>
		<title>${title}</title> 
		<link rel="icon" href="favicon.ico" type="image/x-icon"/>
		<link rel="shortcut icon" href="favicon.ico" type="image/x-icon"/>
		<meta http-equiv="Cache-Control" content="no-cache"/>
		<meta http-equiv="Content-Type" content="text/html charset=utf-8">
		<!-- ie中超连接不弹出新窗口 --> 
		<base target="_self">  
		<!-- 标签栏图标 -->
		<!-- 公共样式 -->
		<link rel="stylesheet" type="text/css" href="${ctx}/system/indexResource/css/style.css"/>
		<!-- jquery类库 -->
		<script type="text/javascript" src="${ctx}/js/jquery_validate/jquery-1.4.4.min.js"></script>         
		<!-- 操作等待 -->
		<script type="text/javascript" src="${ctx}/js/jquery_lockui/jquery.blockUI.js"></script> 
		<!-- ajax表单提交 -->
		<script type="text/javascript" src="${ctx}/js/jquery.form/jquery.form.js"></script>	
		<script type="text/javascript" src="${ctx}/js/nav.js?t=2"></script>
		<%@ include file="common/colorBoxUtils.jsp"%> 
		<!-- 分页 -->
		<!-- 日历(这个比表单验证的先引用) -->
		<%@ include file="common/dateUtils.jsp"%> 
		<!-- 自动补全 (这个要比表单验证的先引用)-->    
		<%@ include file="common/jquery_autocomplete.jsp"%> 
		<!-- 表单验证 --> 
		<%@ include file="common/jquery_validate.jsp"%>
		<!-- 显示和隐藏查询条件 --> 
		<%@ include file="common/divUtils.jsp"%>
		<!-- 字段排序 -->
		<%@ include file="common/sortUtils.jsp"%> 
		<!-- 显示和隐藏列 -->
		<%-- <%@ include file="common/optionCheck.jsp"%> --%>
		<!-- 复制到剪贴板(在火狐和google浏览器中没有效果) -->
		<%@ include file="common/jquery_clipboard.jsp"%>
		<!-- 自动匹配显示名称 -->
		<%@ include file="common/jqueryTopsyUtils.jsp"%>
		<!-- 帮助提示 -->
		<%@ include file="/system/common/easydialog.jsp"%>
		<script type="text/javascript">
			$(function(){
				//查看页面共用修改页面 
				var requestForSearchDetail = '<s:property value="requestForSearchDetail"/>';
				if(requestForSearchDetail == "true"){ 
					readOnlyForm();
				}
				readonlyStyle();
			});
			//返回到登录页面 
			function toLoginJsp(){
				parent.location.href="${ctx}/login.jsp";
			}
			//跳转到sessiontimeout 页面 
			function ajaxTimeOutContinue(){
				window.location.href="${ctx}/common/errorPage/sessionTimeOut.jsp";
			}
			//全选功能 用于商户银行与机构银行配置 
			function chooseAll(obj){
				var value = $(obj).attr("checked");
				$(obj).parent().parent().parent().find("input[type=checkbox]").attr("checked",value);
			}
		</script>
	</head>
</html>