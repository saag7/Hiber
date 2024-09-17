
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <H1> La liste de salarié de Sodisma</H1>
    <h2>Le nombre de salarié :<%=request.getAttribute("salr")%>  </h2>
    <table border="2">
        <tr>
            <th>Code Salarié</th>
            <th>Nom Salarié</th>
            <th>Ville Salarié</th>
            <th>Sexe Salarié</th>                
        </tr>
        
        <logic:iterate id="row" name="salarié" type="entities.salarié">
            <tr>
            <td> <bean:write property="codeemp" name="row"/></td>
            <td> <bean:write property="nomemp" name="row"/></td>
            <td> <bean:write property="ville" name="row"/></td>
            <td> <bean:write property="sexe" name="row"/></td>                
            </tr>
           
        </logic:iterate>
    </table>
    
    
</html:html>