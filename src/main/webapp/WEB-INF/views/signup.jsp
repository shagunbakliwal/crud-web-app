<%@taglib uri='/WEB-INF/tlds/acg-common.tld' prefix='acg-common' %>
<acg-common:RequestValidator>
<jsp:forward page='/invalidRequest' />
</acg-common:RequestValidator>
<acg-common:FormResubmissionChecker>
<jsp:forward page='/${param.source}' />
</acg-common:FormResubmissionChecker>
<jsp:useBean id='user' class='com.acg.web.beans.UserBean' scope='request' />
<jsp:setProperty name='user' property='*' />
<acg-common:BeanValidator nameOfBean='user' scope='request'>
<jsp:forward page='/${param.source}' />
</acg-common:BeanValidator>
<jsp:forward page='/signup' />