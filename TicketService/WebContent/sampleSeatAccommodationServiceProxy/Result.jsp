<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSeatAccommodationServiceProxyid" scope="session" class="ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSeatAccommodationServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSeatAccommodationServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSeatAccommodationServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        ua.be.dc.services.seatAccommodation.service.SeatAccommodationService getSeatAccommodationService10mtemp = sampleSeatAccommodationServiceProxyid.getSeatAccommodationService();
if(getSeatAccommodationService10mtemp == null){
%>
<%=getSeatAccommodationService10mtemp %>
<%
}else{
        if(getSeatAccommodationService10mtemp!= null){
        String tempreturnp11 = getSeatAccommodationService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String test13mtemp = sampleSeatAccommodationServiceProxyid.test();
if(test13mtemp == null){
%>
<%=test13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(test13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 16:
        gotMethod = true;
        String name_2id=  request.getParameter("name21");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String id_3id=  request.getParameter("id23");
            java.lang.Integer id_3idTemp = null;
        if(!id_3id.equals("")){
         id_3idTemp  = java.lang.Integer.valueOf(id_3id);
        }
        %>
        <jsp:useBean id="ua1be1dc1services1seatAccommodation1service1Event_1id" scope="session" class="ua.be.dc.services.seatAccommodation.service.Event" />
        <%
        ua1be1dc1services1seatAccommodation1service1Event_1id.setName(name_2idTemp);
        ua1be1dc1services1seatAccommodation1service1Event_1id.setId(id_3idTemp);
        String name_5id=  request.getParameter("name27");
            java.lang.String name_5idTemp = null;
        if(!name_5id.equals("")){
         name_5idTemp  = name_5id;
        }
        String id_6id=  request.getParameter("id29");
            java.lang.Integer id_6idTemp = null;
        if(!id_6id.equals("")){
         id_6idTemp  = java.lang.Integer.valueOf(id_6id);
        }
        %>
        <jsp:useBean id="ua1be1dc1services1seatAccommodation1service1SeatType_4id" scope="session" class="ua.be.dc.services.seatAccommodation.service.SeatType" />
        <%
        ua1be1dc1services1seatAccommodation1service1SeatType_4id.setName(name_5idTemp);
        ua1be1dc1services1seatAccommodation1service1SeatType_4id.setId(id_6idTemp);
        ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEventAndType16mtemp = sampleSeatAccommodationServiceProxyid.getSeatsByEventAndType(ua1be1dc1services1seatAccommodation1service1Event_1id,ua1be1dc1services1seatAccommodation1service1SeatType_4id);
if(getSeatsByEventAndType16mtemp == null){
%>
<%=getSeatsByEventAndType16mtemp %>
<%
}else{
        String tempreturnp17 = null;
        if(getSeatsByEventAndType16mtemp != null){
        java.util.List listreturnp17= java.util.Arrays.asList(getSeatsByEventAndType16mtemp);
        tempreturnp17 = listreturnp17.toString();
        }
        %>
        <%=tempreturnp17%>
        <%
}
break;
case 31:
        gotMethod = true;
        String arg0_7id=  request.getParameter("arg042");
            java.lang.Integer arg0_7idTemp = null;
        if(!arg0_7id.equals("")){
         arg0_7idTemp  = java.lang.Integer.valueOf(arg0_7id);
        }
        ua.be.dc.services.seatAccommodation.service.Seat getSeatById31mtemp = sampleSeatAccommodationServiceProxyid.getSeatById(arg0_7idTemp);
if(getSeatById31mtemp == null){
%>
<%=getSeatById31mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">type:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getSeatById31mtemp != null){
ua.be.dc.services.seatAccommodation.service.SeatType tebece0=getSeatById31mtemp.getType();
if(tebece0 != null){
java.lang.String typename36 = tebece0.getName();
        String tempResultname36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename36));
        %>
        <%= tempResultname36 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getSeatById31mtemp != null){
ua.be.dc.services.seatAccommodation.service.SeatType tebece0=getSeatById31mtemp.getType();
if(tebece0 != null){
java.lang.Integer typeid38 = tebece0.getId();
        String tempResultid38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid38));
        %>
        <%= tempResultid38 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getSeatById31mtemp != null){
java.lang.Integer typeid40 = getSeatById31mtemp.getId();
        String tempResultid40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid40));
        %>
        <%= tempResultid40 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 44:
        gotMethod = true;
        String name_9id=  request.getParameter("name49");
            java.lang.String name_9idTemp = null;
        if(!name_9id.equals("")){
         name_9idTemp  = name_9id;
        }
        String id_10id=  request.getParameter("id51");
            java.lang.Integer id_10idTemp = null;
        if(!id_10id.equals("")){
         id_10idTemp  = java.lang.Integer.valueOf(id_10id);
        }
        %>
        <jsp:useBean id="ua1be1dc1services1seatAccommodation1service1Event_8id" scope="session" class="ua.be.dc.services.seatAccommodation.service.Event" />
        <%
        ua1be1dc1services1seatAccommodation1service1Event_8id.setName(name_9idTemp);
        ua1be1dc1services1seatAccommodation1service1Event_8id.setId(id_10idTemp);
        ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEvent44mtemp = sampleSeatAccommodationServiceProxyid.getSeatsByEvent(ua1be1dc1services1seatAccommodation1service1Event_8id);
if(getSeatsByEvent44mtemp == null){
%>
<%=getSeatsByEvent44mtemp %>
<%
}else{
        String tempreturnp45 = null;
        if(getSeatsByEvent44mtemp != null){
        java.util.List listreturnp45= java.util.Arrays.asList(getSeatsByEvent44mtemp);
        tempreturnp45 = listreturnp45.toString();
        }
        %>
        <%=tempreturnp45%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>