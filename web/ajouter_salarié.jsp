<%@page contentType="text/html"pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html>
    <h2>Saisir les informations d'un nouveau salarié</h2>
    <html:form    action="/ajouter.do" method="post">
        <p>Code Salarié : <html:text property="codepers" name="f1" /></p>
        <p>Nom Salarié : <html:text property="nompers" name="f1" /></p>
        <p>Ville Salarié : <html:text property="villepers" name="f1" /></p>
        <p>Sexe Salarié : <html:text property="agepers" name="f1" /></p>
        <p><html:submit value="Add" /></p>
        
    </html:form>
    
</html:html>


