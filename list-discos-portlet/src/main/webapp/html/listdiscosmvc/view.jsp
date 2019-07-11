<%@ page import="cl.az.test.service.model.Disco" %>
<%@ page import="cl.az.test.service.DiscoServiceUtil" %>
<%@ page import="cl.az.test.service.model.ListCount" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>

<portlet:defineObjects />

<portlet:renderURL var="searchURL"></portlet:renderURL>
<aui:form method="POST" action="${searchURL}" name="fm">
    <liferay-ui:search-container delta="${delta}" total="${discos.count }">
        <liferay-ui:search-container-results>
            <%
                ListCount<Disco> discos = DiscoServiceUtil.list(searchContainer.getStart(), searchContainer.getDelta());
                total= discos.getCount();
                results=discos.getList();
                pageContext.setAttribute("results", results);
                pageContext.setAttribute("total", total);
            %>
        </liferay-ui:search-container-results>
        <liferay-ui:search-container-row
                className="cl.az.test.service.model.Disco"
                keyProperty="discoId" modelVar="disco">
            <liferay-ui:search-container-column-text property="discoId"
                                                     name="#" />
            <liferay-ui:search-container-column-text property="ranking"
                                                     name="# Ranking" />
            <liferay-ui:search-container-column-text property="nombre"
                                                     name="Nombre Disco" />
            <liferay-ui:search-container-column-text property="autor"
                                                     name="Autor" />
            <liferay-ui:search-container-column-date property="fechaLanzamiento"
                                                     name="Fecha de Lanzamiento" />
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator paginate="true" />
    </liferay-ui:search-container>
</aui:form>