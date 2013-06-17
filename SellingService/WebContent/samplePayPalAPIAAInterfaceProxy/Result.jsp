<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePayPalAPIAAInterfaceProxyid" scope="session" class="PayPalAPI.api.ebay.PayPalAPIAAInterfaceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePayPalAPIAAInterfaceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = samplePayPalAPIAAInterfaceProxyid.getEndpoint();
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
        samplePayPalAPIAAInterfaceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        PayPalAPI.api.ebay.PayPalAPIAAInterface getPayPalAPIAAInterface10mtemp = samplePayPalAPIAAInterfaceProxyid.getPayPalAPIAAInterface();
if(getPayPalAPIAAInterface10mtemp == null){
%>
<%=getPayPalAPIAAInterface10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 385:
        gotMethod = true;
        String promoOverrideFlag_4id=  request.getParameter("promoOverrideFlag430");
            java.lang.String promoOverrideFlag_4idTemp = null;
        if(!promoOverrideFlag_4id.equals("")){
         promoOverrideFlag_4idTemp  = promoOverrideFlag_4id;
        }
        String skipBACreation_5id=  request.getParameter("skipBACreation432");
            java.lang.Boolean skipBACreation_5idTemp = null;
        if(!skipBACreation_5id.equals("")){
         skipBACreation_5idTemp  = java.lang.Boolean.valueOf(skipBACreation_5id);
        }
        String softDescriptor_6id=  request.getParameter("softDescriptor434");
            java.lang.String softDescriptor_6idTemp = null;
        if(!softDescriptor_6id.equals("")){
         softDescriptor_6idTemp  = softDescriptor_6id;
        }
        String giftMessage_7id=  request.getParameter("giftMessage436");
            java.lang.String giftMessage_7idTemp = null;
        if(!giftMessage_7id.equals("")){
         giftMessage_7idTemp  = giftMessage_7id;
        }
        String token_8id=  request.getParameter("token438");
            java.lang.String token_8idTemp = null;
        if(!token_8id.equals("")){
         token_8idTemp  = token_8id;
        }
        String buttonSource_9id=  request.getParameter("buttonSource440");
            java.lang.String buttonSource_9idTemp = null;
        if(!buttonSource_9id.equals("")){
         buttonSource_9idTemp  = buttonSource_9id;
        }
        String _value_11id=  request.getParameter("_value444");
            java.lang.String _value_11idTemp = null;
        if(!_value_11id.equals("")){
         _value_11idTemp  = _value_11id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_10id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_10id.set_value(_value_11idTemp);
        String shippingCalculationMode_13id=  request.getParameter("shippingCalculationMode448");
            java.lang.String shippingCalculationMode_13idTemp = null;
        if(!shippingCalculationMode_13id.equals("")){
         shippingCalculationMode_13idTemp  = shippingCalculationMode_13id;
        }
        String _value_15id=  request.getParameter("_value452");
            java.lang.String _value_15idTemp = null;
        if(!_value_15id.equals("")){
         _value_15idTemp  = _value_15id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_14id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_14id.set_value(_value_15idTemp);
        String shippingOptionIsDefault_16id=  request.getParameter("shippingOptionIsDefault454");
            java.lang.String shippingOptionIsDefault_16idTemp = null;
        if(!shippingOptionIsDefault_16id.equals("")){
         shippingOptionIsDefault_16idTemp  = shippingOptionIsDefault_16id;
        }
        String insuranceOptionSelected_17id=  request.getParameter("insuranceOptionSelected456");
            java.lang.String insuranceOptionSelected_17idTemp = null;
        if(!insuranceOptionSelected_17id.equals("")){
         insuranceOptionSelected_17idTemp  = insuranceOptionSelected_17id;
        }
        String shippingOptionName_18id=  request.getParameter("shippingOptionName458");
            java.lang.String shippingOptionName_18idTemp = null;
        if(!shippingOptionName_18id.equals("")){
         shippingOptionName_18idTemp  = shippingOptionName_18id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1UserSelectedOptionType_12id" scope="session" class="eBLBaseComponents.apis.ebay.UserSelectedOptionType" />
        <%
        eBLBaseComponents1apis1ebay1UserSelectedOptionType_12id.setShippingCalculationMode(shippingCalculationMode_13idTemp);
        eBLBaseComponents1apis1ebay1UserSelectedOptionType_12id.setShippingOptionAmount(CoreComponentTypes1apis1ebay1BasicAmountType_14id);
        eBLBaseComponents1apis1ebay1UserSelectedOptionType_12id.setShippingOptionIsDefault(shippingOptionIsDefault_16idTemp);
        eBLBaseComponents1apis1ebay1UserSelectedOptionType_12id.setInsuranceOptionSelected(insuranceOptionSelected_17idTemp);
        eBLBaseComponents1apis1ebay1UserSelectedOptionType_12id.setShippingOptionName(shippingOptionName_18idTemp);
        String surveyQuestion_19id=  request.getParameter("surveyQuestion460");
            java.lang.String surveyQuestion_19idTemp = null;
        if(!surveyQuestion_19id.equals("")){
         surveyQuestion_19idTemp  = surveyQuestion_19id;
        }
        String giftWrapName_20id=  request.getParameter("giftWrapName462");
            java.lang.String giftWrapName_20idTemp = null;
        if(!giftWrapName_20id.equals("")){
         giftWrapName_20idTemp  = giftWrapName_20id;
        }
        String promoCode_21id=  request.getParameter("promoCode464");
            java.lang.String promoCode_21idTemp = null;
        if(!promoCode_21id.equals("")){
         promoCode_21idTemp  = promoCode_21id;
        }
        String payerID_22id=  request.getParameter("payerID466");
            java.lang.String payerID_22idTemp = null;
        if(!payerID_22id.equals("")){
         payerID_22idTemp  = payerID_22id;
        }
        String orderURL_23id=  request.getParameter("orderURL468");
            java.lang.String orderURL_23idTemp = null;
        if(!orderURL_23id.equals("")){
         orderURL_23idTemp  = orderURL_23id;
        }
        String buyerMarketingEmail_24id=  request.getParameter("buyerMarketingEmail470");
            java.lang.String buyerMarketingEmail_24idTemp = null;
        if(!buyerMarketingEmail_24id.equals("")){
         buyerMarketingEmail_24idTemp  = buyerMarketingEmail_24id;
        }
        String giftReceiptEnable_25id=  request.getParameter("giftReceiptEnable472");
            java.lang.String giftReceiptEnable_25idTemp = null;
        if(!giftReceiptEnable_25id.equals("")){
         giftReceiptEnable_25idTemp  = giftReceiptEnable_25id;
        }
        String _value_29id=  request.getParameter("_value480");
            java.lang.String _value_29idTemp = null;
        if(!_value_29id.equals("")){
         _value_29idTemp  = _value_29id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_28id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_28id.set_value(_value_29idTemp);
        String passengerName_30id=  request.getParameter("passengerName482");
            java.lang.String passengerName_30idTemp = null;
        if(!passengerName_30id.equals("")){
         passengerName_30idTemp  = passengerName_30id;
        }
        String travelAgencyName_31id=  request.getParameter("travelAgencyName484");
            java.lang.String travelAgencyName_31idTemp = null;
        if(!travelAgencyName_31id.equals("")){
         travelAgencyName_31idTemp  = travelAgencyName_31id;
        }
        String travelAgencyCode_32id=  request.getParameter("travelAgencyCode486");
            java.lang.String travelAgencyCode_32idTemp = null;
        if(!travelAgencyCode_32id.equals("")){
         travelAgencyCode_32idTemp  = travelAgencyCode_32id;
        }
        String customerCode_33id=  request.getParameter("customerCode488");
            java.lang.String customerCode_33idTemp = null;
        if(!customerCode_33id.equals("")){
         customerCode_33idTemp  = customerCode_33id;
        }
        String _value_35id=  request.getParameter("_value492");
            java.lang.String _value_35idTemp = null;
        if(!_value_35id.equals("")){
         _value_35idTemp  = _value_35id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_34id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_34id.set_value(_value_35idTemp);
        String ticketNumber_36id=  request.getParameter("ticketNumber494");
            java.lang.String ticketNumber_36idTemp = null;
        if(!ticketNumber_36id.equals("")){
         ticketNumber_36idTemp  = ticketNumber_36id;
        }
        String restrictedTicket_37id=  request.getParameter("restrictedTicket496");
            java.lang.String restrictedTicket_37idTemp = null;
        if(!restrictedTicket_37id.equals("")){
         restrictedTicket_37idTemp  = restrictedTicket_37id;
        }
        String issuingCarrierCode_38id=  request.getParameter("issuingCarrierCode498");
            java.lang.String issuingCarrierCode_38idTemp = null;
        if(!issuingCarrierCode_38id.equals("")){
         issuingCarrierCode_38idTemp  = issuingCarrierCode_38id;
        }
        String clearingSequence_39id=  request.getParameter("clearingSequence500");
            java.lang.String clearingSequence_39idTemp = null;
        if(!clearingSequence_39id.equals("")){
         clearingSequence_39idTemp  = clearingSequence_39id;
        }
        String clearingCount_40id=  request.getParameter("clearingCount502");
            java.lang.String clearingCount_40idTemp = null;
        if(!clearingCount_40id.equals("")){
         clearingCount_40idTemp  = clearingCount_40id;
        }
        String _value_42id=  request.getParameter("_value506");
            java.lang.String _value_42idTemp = null;
        if(!_value_42id.equals("")){
         _value_42idTemp  = _value_42id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_41id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_41id.set_value(_value_42idTemp);
        String issueDate_43id=  request.getParameter("issueDate508");
            java.lang.String issueDate_43idTemp = null;
        if(!issueDate_43id.equals("")){
         issueDate_43idTemp  = issueDate_43id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AirlineItineraryType_27id" scope="session" class="eBLBaseComponents.apis.ebay.AirlineItineraryType" />
        <%
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setTotalFee(CoreComponentTypes1apis1ebay1BasicAmountType_28id);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setPassengerName(passengerName_30idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setTravelAgencyName(travelAgencyName_31idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setTravelAgencyCode(travelAgencyCode_32idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setCustomerCode(customerCode_33idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setTotalFare(CoreComponentTypes1apis1ebay1BasicAmountType_34id);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setTicketNumber(ticketNumber_36idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setRestrictedTicket(restrictedTicket_37idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setIssuingCarrierCode(issuingCarrierCode_38idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setClearingSequence(clearingSequence_39idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setClearingCount(clearingCount_40idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setTotalTaxes(CoreComponentTypes1apis1ebay1BasicAmountType_41id);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_27id.setIssueDate(issueDate_43idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1EnhancedDataType_26id" scope="session" class="eBLBaseComponents.apis.ebay.EnhancedDataType" />
        <%
        eBLBaseComponents1apis1ebay1EnhancedDataType_26id.setAirlineItinerary(eBLBaseComponents1apis1ebay1AirlineItineraryType_27id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id" scope="session" class="eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setPromoOverrideFlag(promoOverrideFlag_4idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setSkipBACreation(skipBACreation_5idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setSoftDescriptor(softDescriptor_6idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setGiftMessage(giftMessage_7idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setToken(token_8idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setButtonSource(buttonSource_9idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setGiftWrapAmount(CoreComponentTypes1apis1ebay1BasicAmountType_10id);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setUserSelectedOptions(eBLBaseComponents1apis1ebay1UserSelectedOptionType_12id);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setSurveyQuestion(surveyQuestion_19idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setGiftWrapName(giftWrapName_20idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setPromoCode(promoCode_21idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setPayerID(payerID_22idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setOrderURL(orderURL_23idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setBuyerMarketingEmail(buyerMarketingEmail_24idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setGiftReceiptEnable(giftReceiptEnable_25idTemp);
        eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id.setEnhancedData(eBLBaseComponents1apis1ebay1EnhancedDataType_26id);
        String returnFMFDetails_44id=  request.getParameter("returnFMFDetails510");
            java.lang.Integer returnFMFDetails_44idTemp = null;
        if(!returnFMFDetails_44id.equals("")){
         returnFMFDetails_44idTemp  = java.lang.Integer.valueOf(returnFMFDetails_44id);
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoExpressCheckoutPaymentRequestType_2id" scope="session" class="PayPalAPI.api.ebay.DoExpressCheckoutPaymentRequestType" />
        <%
        PayPalAPI1api1ebay1DoExpressCheckoutPaymentRequestType_2id.setDoExpressCheckoutPaymentRequestDetails(eBLBaseComponents1apis1ebay1DoExpressCheckoutPaymentRequestDetailsType_3id);
        PayPalAPI1api1ebay1DoExpressCheckoutPaymentRequestType_2id.setReturnFMFDetails(returnFMFDetails_44idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoExpressCheckoutPaymentReq_1id" scope="session" class="PayPalAPI.api.ebay.DoExpressCheckoutPaymentReq" />
        <%
        PayPalAPI1api1ebay1DoExpressCheckoutPaymentReq_1id.setDoExpressCheckoutPaymentRequest(PayPalAPI1api1ebay1DoExpressCheckoutPaymentRequestType_2id);
        PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment385mtemp = samplePayPalAPIAAInterfaceProxyid.doExpressCheckoutPayment(PayPalAPI1api1ebay1DoExpressCheckoutPaymentReq_1id);
if(doExpressCheckoutPayment385mtemp == null){
%>
<%=doExpressCheckoutPayment385mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">doExpressCheckoutPaymentResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">token:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
java.lang.String typetoken390 = tebece0.getToken();
        String tempResulttoken390 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken390));
        %>
        <%= tempResulttoken390 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">redirectRequired:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
java.lang.String typeredirectRequired392 = tebece0.getRedirectRequired();
        String tempResultredirectRequired392 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeredirectRequired392));
        %>
        <%= tempResultredirectRequired392 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">successPageRedirectRequested:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
java.lang.String typesuccessPageRedirectRequested394 = tebece0.getSuccessPageRedirectRequested();
        String tempResultsuccessPageRedirectRequested394 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesuccessPageRedirectRequested394));
        %>
        <%= tempResultsuccessPageRedirectRequested394 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userSelectedOptions:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingCalculationMode:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeshippingCalculationMode398 = tebece1.getShippingCalculationMode();
        String tempResultshippingCalculationMode398 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingCalculationMode398));
        %>
        <%= tempResultshippingCalculationMode398 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingOptionAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getShippingOptionAmount();
if(tebece2 != null){
java.lang.String type_value402 = tebece2.get_value();
        String tempResult_value402 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value402));
        %>
        <%= tempResult_value402 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingOptionIsDefault:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeshippingOptionIsDefault404 = tebece1.getShippingOptionIsDefault();
        String tempResultshippingOptionIsDefault404 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingOptionIsDefault404));
        %>
        <%= tempResultshippingOptionIsDefault404 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">insuranceOptionSelected:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeinsuranceOptionSelected406 = tebece1.getInsuranceOptionSelected();
        String tempResultinsuranceOptionSelected406 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinsuranceOptionSelected406));
        %>
        <%= tempResultinsuranceOptionSelected406 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingOptionName:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeshippingOptionName408 = tebece1.getShippingOptionName();
        String tempResultshippingOptionName408 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingOptionName408));
        %>
        <%= tempResultshippingOptionName408 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">billingAgreementID:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
java.lang.String typebillingAgreementID410 = tebece0.getBillingAgreementID();
        String tempResultbillingAgreementID410 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebillingAgreementID410));
        %>
        <%= tempResultbillingAgreementID410 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">note:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType tebece0=doExpressCheckoutPayment385mtemp.getDoExpressCheckoutPaymentResponseDetails();
if(tebece0 != null){
java.lang.String typenote412 = tebece0.getNote();
        String tempResultnote412 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenote412));
        %>
        <%= tempResultnote412 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fMFDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">reportFilters:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doExpressCheckoutPayment385mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typereportFilters416 = tebece0.getReportFilters();
        String tempreportFilters416 = null;
        if(typereportFilters416 != null){
        java.util.List listreportFilters416= java.util.Arrays.asList(typereportFilters416);
        tempreportFilters416 = listreportFilters416.toString();
        }
        %>
        <%=tempreportFilters416%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">denyFilters:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doExpressCheckoutPayment385mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typedenyFilters418 = tebece0.getDenyFilters();
        String tempdenyFilters418 = null;
        if(typedenyFilters418 != null){
        java.util.List listdenyFilters418= java.util.Arrays.asList(typedenyFilters418);
        tempdenyFilters418 = listdenyFilters418.toString();
        }
        %>
        <%=tempdenyFilters418%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">pendingFilters:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doExpressCheckoutPayment385mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typependingFilters420 = tebece0.getPendingFilters();
        String temppendingFilters420 = null;
        if(typependingFilters420 != null){
        java.util.List listpendingFilters420= java.util.Arrays.asList(typependingFilters420);
        temppendingFilters420 = listpendingFilters420.toString();
        }
        %>
        <%=temppendingFilters420%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">acceptFilters:</TD>
<TD>
<%
if(doExpressCheckoutPayment385mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doExpressCheckoutPayment385mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typeacceptFilters422 = tebece0.getAcceptFilters();
        String tempacceptFilters422 = null;
        if(typeacceptFilters422 != null){
        java.util.List listacceptFilters422= java.util.Arrays.asList(typeacceptFilters422);
        tempacceptFilters422 = listacceptFilters422.toString();
        }
        %>
        <%=tempacceptFilters422%>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 512:
        gotMethod = true;
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoUATPExpressCheckoutPaymentRequestType_46id" scope="session" class="PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentRequestType" />
        <%
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoUATPExpressCheckoutPaymentReq_45id" scope="session" class="PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentReq" />
        <%
        PayPalAPI1api1ebay1DoUATPExpressCheckoutPaymentReq_45id.setDoUATPExpressCheckoutPaymentRequest(PayPalAPI1api1ebay1DoUATPExpressCheckoutPaymentRequestType_46id);
        PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType doUATPExpressCheckoutPayment512mtemp = samplePayPalAPIAAInterfaceProxyid.doUATPExpressCheckoutPayment(PayPalAPI1api1ebay1DoUATPExpressCheckoutPaymentReq_45id);
if(doUATPExpressCheckoutPayment512mtemp == null){
%>
<%=doUATPExpressCheckoutPayment512mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">uATPDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">expYear:</TD>
<TD>
<%
if(doUATPExpressCheckoutPayment512mtemp != null){
eBLBaseComponents.apis.ebay.UATPDetailsType tebece0=doUATPExpressCheckoutPayment512mtemp.getUATPDetails();
if(tebece0 != null){
%>
<%=tebece0.getExpYear()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">uATPNumber:</TD>
<TD>
<%
if(doUATPExpressCheckoutPayment512mtemp != null){
eBLBaseComponents.apis.ebay.UATPDetailsType tebece0=doUATPExpressCheckoutPayment512mtemp.getUATPDetails();
if(tebece0 != null){
java.lang.String typeuATPNumber519 = tebece0.getUATPNumber();
        String tempResultuATPNumber519 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuATPNumber519));
        %>
        <%= tempResultuATPNumber519 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">expMonth:</TD>
<TD>
<%
if(doUATPExpressCheckoutPayment512mtemp != null){
eBLBaseComponents.apis.ebay.UATPDetailsType tebece0=doUATPExpressCheckoutPayment512mtemp.getUATPDetails();
if(tebece0 != null){
%>
<%=tebece0.getExpMonth()
%><%}}%>
</TD>
</TABLE>
<%
}
break;
case 527:
        gotMethod = true;
        String firstName_50id=  request.getParameter("firstName538");
            java.lang.String firstName_50idTemp = null;
        if(!firstName_50id.equals("")){
         firstName_50idTemp  = firstName_50id;
        }
        String pageStyle_51id=  request.getParameter("pageStyle540");
            java.lang.String pageStyle_51idTemp = null;
        if(!pageStyle_51id.equals("")){
         pageStyle_51idTemp  = pageStyle_51id;
        }
        String localeCode_52id=  request.getParameter("localeCode542");
            java.lang.String localeCode_52idTemp = null;
        if(!localeCode_52id.equals("")){
         localeCode_52idTemp  = localeCode_52id;
        }
        String serviceName2_53id=  request.getParameter("serviceName2544");
            java.lang.String serviceName2_53idTemp = null;
        if(!serviceName2_53id.equals("")){
         serviceName2_53idTemp  = serviceName2_53id;
        }
        String serviceName1_54id=  request.getParameter("serviceName1546");
            java.lang.String serviceName1_54idTemp = null;
        if(!serviceName1_54id.equals("")){
         serviceName1_54idTemp  = serviceName1_54id;
        }
        String cppHeaderImage_55id=  request.getParameter("cppHeaderImage548");
            java.lang.String cppHeaderImage_55idTemp = null;
        if(!cppHeaderImage_55id.equals("")){
         cppHeaderImage_55idTemp  = cppHeaderImage_55id;
        }
        String countryName_57id=  request.getParameter("countryName552");
            java.lang.String countryName_57idTemp = null;
        if(!countryName_57id.equals("")){
         countryName_57idTemp  = countryName_57id;
        }
        String internationalStreet_58id=  request.getParameter("internationalStreet554");
            java.lang.String internationalStreet_58idTemp = null;
        if(!internationalStreet_58id.equals("")){
         internationalStreet_58idTemp  = internationalStreet_58id;
        }
        String externalAddressID_59id=  request.getParameter("externalAddressID556");
            java.lang.String externalAddressID_59idTemp = null;
        if(!externalAddressID_59id.equals("")){
         externalAddressID_59idTemp  = externalAddressID_59id;
        }
        String stateOrProvince_60id=  request.getParameter("stateOrProvince558");
            java.lang.String stateOrProvince_60idTemp = null;
        if(!stateOrProvince_60id.equals("")){
         stateOrProvince_60idTemp  = stateOrProvince_60id;
        }
        String internationalName_61id=  request.getParameter("internationalName560");
            java.lang.String internationalName_61idTemp = null;
        if(!internationalName_61id.equals("")){
         internationalName_61idTemp  = internationalName_61id;
        }
        String cityName_62id=  request.getParameter("cityName562");
            java.lang.String cityName_62idTemp = null;
        if(!cityName_62id.equals("")){
         cityName_62idTemp  = cityName_62id;
        }
        String phone_63id=  request.getParameter("phone564");
            java.lang.String phone_63idTemp = null;
        if(!phone_63id.equals("")){
         phone_63idTemp  = phone_63id;
        }
        String postalCode_64id=  request.getParameter("postalCode566");
            java.lang.String postalCode_64idTemp = null;
        if(!postalCode_64id.equals("")){
         postalCode_64idTemp  = postalCode_64id;
        }
        String street2_65id=  request.getParameter("street2568");
            java.lang.String street2_65idTemp = null;
        if(!street2_65id.equals("")){
         street2_65idTemp  = street2_65id;
        }
        String street1_66id=  request.getParameter("street1570");
            java.lang.String street1_66idTemp = null;
        if(!street1_66id.equals("")){
         street1_66idTemp  = street1_66id;
        }
        String addressID_67id=  request.getParameter("addressID572");
            java.lang.String addressID_67idTemp = null;
        if(!addressID_67id.equals("")){
         addressID_67idTemp  = addressID_67id;
        }
        String internationalStateAndCity_68id=  request.getParameter("internationalStateAndCity574");
            java.lang.String internationalStateAndCity_68idTemp = null;
        if(!internationalStateAndCity_68id.equals("")){
         internationalStateAndCity_68idTemp  = internationalStateAndCity_68id;
        }
        String name_69id=  request.getParameter("name576");
            java.lang.String name_69idTemp = null;
        if(!name_69id.equals("")){
         name_69idTemp  = name_69id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_56id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_56id.setCountryName(countryName_57idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setInternationalStreet(internationalStreet_58idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setExternalAddressID(externalAddressID_59idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setStateOrProvince(stateOrProvince_60idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setInternationalName(internationalName_61idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setCityName(cityName_62idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setPhone(phone_63idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setPostalCode(postalCode_64idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setStreet2(street2_65idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setStreet1(street1_66idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setAddressID(addressID_67idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setInternationalStateAndCity(internationalStateAndCity_68idTemp);
        eBLBaseComponents1apis1ebay1AddressType_56id.setName(name_69idTemp);
        String cancelURL_70id=  request.getParameter("cancelURL578");
            java.lang.String cancelURL_70idTemp = null;
        if(!cancelURL_70id.equals("")){
         cancelURL_70idTemp  = cancelURL_70id;
        }
        String initFlowType_71id=  request.getParameter("initFlowType580");
            java.lang.String initFlowType_71idTemp = null;
        if(!initFlowType_71id.equals("")){
         initFlowType_71idTemp  = initFlowType_71id;
        }
        String skipLoginPage_72id=  request.getParameter("skipLoginPage582");
            java.lang.String skipLoginPage_72idTemp = null;
        if(!skipLoginPage_72id.equals("")){
         skipLoginPage_72idTemp  = skipLoginPage_72id;
        }
        String cppHeaderBorderColor_73id=  request.getParameter("cppHeaderBorderColor584");
            java.lang.String cppHeaderBorderColor_73idTemp = null;
        if(!cppHeaderBorderColor_73id.equals("")){
         cppHeaderBorderColor_73idTemp  = cppHeaderBorderColor_73id;
        }
        String cppHeaderBackColor_74id=  request.getParameter("cppHeaderBackColor586");
            java.lang.String cppHeaderBackColor_74idTemp = null;
        if(!cppHeaderBackColor_74id.equals("")){
         cppHeaderBackColor_74idTemp  = cppHeaderBackColor_74id;
        }
        String lastName_75id=  request.getParameter("lastName588");
            java.lang.String lastName_75idTemp = null;
        if(!lastName_75id.equals("")){
         lastName_75idTemp  = lastName_75id;
        }
        String logoutURL_76id=  request.getParameter("logoutURL590");
            java.lang.String logoutURL_76idTemp = null;
        if(!logoutURL_76id.equals("")){
         logoutURL_76idTemp  = logoutURL_76id;
        }
        String serviceDefReq2_77id=  request.getParameter("serviceDefReq2592");
            java.lang.String serviceDefReq2_77idTemp = null;
        if(!serviceDefReq2_77id.equals("")){
         serviceDefReq2_77idTemp  = serviceDefReq2_77id;
        }
        String serviceDefReq1_78id=  request.getParameter("serviceDefReq1594");
            java.lang.String serviceDefReq1_78idTemp = null;
        if(!serviceDefReq1_78id.equals("")){
         serviceDefReq1_78idTemp  = serviceDefReq1_78id;
        }
        String returnURL_79id=  request.getParameter("returnURL596");
            java.lang.String returnURL_79idTemp = null;
        if(!returnURL_79id.equals("")){
         returnURL_79idTemp  = returnURL_79id;
        }
        String cppPayflowColor_80id=  request.getParameter("cppPayflowColor598");
            java.lang.String cppPayflowColor_80idTemp = null;
        if(!cppPayflowColor_80id.equals("")){
         cppPayflowColor_80idTemp  = cppPayflowColor_80id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id" scope="session" class="eBLBaseComponents.apis.ebay.SetAuthFlowParamRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setFirstName(firstName_50idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setPageStyle(pageStyle_51idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setLocaleCode(localeCode_52idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setServiceName2(serviceName2_53idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setServiceName1(serviceName1_54idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setCppHeaderImage(cppHeaderImage_55idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setAddress(eBLBaseComponents1apis1ebay1AddressType_56id);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setCancelURL(cancelURL_70idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setInitFlowType(initFlowType_71idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setSkipLoginPage(skipLoginPage_72idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setCppHeaderBorderColor(cppHeaderBorderColor_73idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setCppHeaderBackColor(cppHeaderBackColor_74idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setLastName(lastName_75idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setLogoutURL(logoutURL_76idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setServiceDefReq2(serviceDefReq2_77idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setServiceDefReq1(serviceDefReq1_78idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setReturnURL(returnURL_79idTemp);
        eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id.setCppPayflowColor(cppPayflowColor_80idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetAuthFlowParamRequestType_48id" scope="session" class="PayPalAPI.api.ebay.SetAuthFlowParamRequestType" />
        <%
        PayPalAPI1api1ebay1SetAuthFlowParamRequestType_48id.setSetAuthFlowParamRequestDetails(eBLBaseComponents1apis1ebay1SetAuthFlowParamRequestDetailsType_49id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetAuthFlowParamReq_47id" scope="session" class="PayPalAPI.api.ebay.SetAuthFlowParamReq" />
        <%
        PayPalAPI1api1ebay1SetAuthFlowParamReq_47id.setSetAuthFlowParamRequest(PayPalAPI1api1ebay1SetAuthFlowParamRequestType_48id);
        PayPalAPI.api.ebay.SetAuthFlowParamResponseType setAuthFlowParam527mtemp = samplePayPalAPIAAInterfaceProxyid.setAuthFlowParam(PayPalAPI1api1ebay1SetAuthFlowParamReq_47id);
if(setAuthFlowParam527mtemp == null){
%>
<%=setAuthFlowParam527mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">token:</TD>
<TD>
<%
if(setAuthFlowParam527mtemp != null){
java.lang.String typetoken530 = setAuthFlowParam527mtemp.getToken();
        String tempResulttoken530 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken530));
        %>
        <%= tempResulttoken530 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 600:
        gotMethod = true;
        String token_83id=  request.getParameter("token617");
            java.lang.String token_83idTemp = null;
        if(!token_83id.equals("")){
         token_83idTemp  = token_83id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetAuthDetailsRequestType_82id" scope="session" class="PayPalAPI.api.ebay.GetAuthDetailsRequestType" />
        <%
        PayPalAPI1api1ebay1GetAuthDetailsRequestType_82id.setToken(token_83idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetAuthDetailsReq_81id" scope="session" class="PayPalAPI.api.ebay.GetAuthDetailsReq" />
        <%
        PayPalAPI1api1ebay1GetAuthDetailsReq_81id.setGetAuthDetailsRequest(PayPalAPI1api1ebay1GetAuthDetailsRequestType_82id);
        PayPalAPI.api.ebay.GetAuthDetailsResponseType getAuthDetails600mtemp = samplePayPalAPIAAInterfaceProxyid.getAuthDetails(PayPalAPI1api1ebay1GetAuthDetailsReq_81id);
if(getAuthDetails600mtemp == null){
%>
<%=getAuthDetails600mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">getAuthDetailsResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">payerID:</TD>
<TD>
<%
if(getAuthDetails600mtemp != null){
eBLBaseComponents.apis.ebay.GetAuthDetailsResponseDetailsType tebece0=getAuthDetails600mtemp.getGetAuthDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typepayerID605 = tebece0.getPayerID();
        String tempResultpayerID605 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerID605));
        %>
        <%= tempResultpayerID605 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getAuthDetails600mtemp != null){
eBLBaseComponents.apis.ebay.GetAuthDetailsResponseDetailsType tebece0=getAuthDetails600mtemp.getGetAuthDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typeemail607 = tebece0.getEmail();
        String tempResultemail607 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail607));
        %>
        <%= tempResultemail607 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(getAuthDetails600mtemp != null){
eBLBaseComponents.apis.ebay.GetAuthDetailsResponseDetailsType tebece0=getAuthDetails600mtemp.getGetAuthDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typelastName609 = tebece0.getLastName();
        String tempResultlastName609 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName609));
        %>
        <%= tempResultlastName609 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(getAuthDetails600mtemp != null){
eBLBaseComponents.apis.ebay.GetAuthDetailsResponseDetailsType tebece0=getAuthDetails600mtemp.getGetAuthDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typefirstName611 = tebece0.getFirstName();
        String tempResultfirstName611 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName611));
        %>
        <%= tempResultfirstName611 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 619:
        gotMethod = true;
        String localeCode_87id=  request.getParameter("localeCode630");
            java.lang.String localeCode_87idTemp = null;
        if(!localeCode_87id.equals("")){
         localeCode_87idTemp  = localeCode_87id;
        }
        String returnURL_88id=  request.getParameter("returnURL632");
            java.lang.String returnURL_88idTemp = null;
        if(!returnURL_88id.equals("")){
         returnURL_88idTemp  = returnURL_88id;
        }
        String cancelURL_89id=  request.getParameter("cancelURL634");
            java.lang.String cancelURL_89idTemp = null;
        if(!cancelURL_89id.equals("")){
         cancelURL_89idTemp  = cancelURL_89id;
        }
        String cppHeaderBorderColor_90id=  request.getParameter("cppHeaderBorderColor636");
            java.lang.String cppHeaderBorderColor_90idTemp = null;
        if(!cppHeaderBorderColor_90id.equals("")){
         cppHeaderBorderColor_90idTemp  = cppHeaderBorderColor_90id;
        }
        String cppPayflowColor_91id=  request.getParameter("cppPayflowColor638");
            java.lang.String cppPayflowColor_91idTemp = null;
        if(!cppPayflowColor_91id.equals("")){
         cppPayflowColor_91idTemp  = cppPayflowColor_91id;
        }
        String initFlowType_92id=  request.getParameter("initFlowType640");
            java.lang.String initFlowType_92idTemp = null;
        if(!initFlowType_92id.equals("")){
         initFlowType_92idTemp  = initFlowType_92id;
        }
        String skipLoginPage_93id=  request.getParameter("skipLoginPage642");
            java.lang.String skipLoginPage_93idTemp = null;
        if(!skipLoginPage_93id.equals("")){
         skipLoginPage_93idTemp  = skipLoginPage_93id;
        }
        String cppHeaderBackColor_94id=  request.getParameter("cppHeaderBackColor644");
            java.lang.String cppHeaderBackColor_94idTemp = null;
        if(!cppHeaderBackColor_94id.equals("")){
         cppHeaderBackColor_94idTemp  = cppHeaderBackColor_94id;
        }
        String cppHeaderImage_95id=  request.getParameter("cppHeaderImage646");
            java.lang.String cppHeaderImage_95idTemp = null;
        if(!cppHeaderImage_95id.equals("")){
         cppHeaderImage_95idTemp  = cppHeaderImage_95id;
        }
        String pageStyle_96id=  request.getParameter("pageStyle648");
            java.lang.String pageStyle_96idTemp = null;
        if(!pageStyle_96id.equals("")){
         pageStyle_96idTemp  = pageStyle_96id;
        }
        String countryName_98id=  request.getParameter("countryName652");
            java.lang.String countryName_98idTemp = null;
        if(!countryName_98id.equals("")){
         countryName_98idTemp  = countryName_98id;
        }
        String internationalStreet_99id=  request.getParameter("internationalStreet654");
            java.lang.String internationalStreet_99idTemp = null;
        if(!internationalStreet_99id.equals("")){
         internationalStreet_99idTemp  = internationalStreet_99id;
        }
        String externalAddressID_100id=  request.getParameter("externalAddressID656");
            java.lang.String externalAddressID_100idTemp = null;
        if(!externalAddressID_100id.equals("")){
         externalAddressID_100idTemp  = externalAddressID_100id;
        }
        String stateOrProvince_101id=  request.getParameter("stateOrProvince658");
            java.lang.String stateOrProvince_101idTemp = null;
        if(!stateOrProvince_101id.equals("")){
         stateOrProvince_101idTemp  = stateOrProvince_101id;
        }
        String internationalName_102id=  request.getParameter("internationalName660");
            java.lang.String internationalName_102idTemp = null;
        if(!internationalName_102id.equals("")){
         internationalName_102idTemp  = internationalName_102id;
        }
        String cityName_103id=  request.getParameter("cityName662");
            java.lang.String cityName_103idTemp = null;
        if(!cityName_103id.equals("")){
         cityName_103idTemp  = cityName_103id;
        }
        String phone_104id=  request.getParameter("phone664");
            java.lang.String phone_104idTemp = null;
        if(!phone_104id.equals("")){
         phone_104idTemp  = phone_104id;
        }
        String postalCode_105id=  request.getParameter("postalCode666");
            java.lang.String postalCode_105idTemp = null;
        if(!postalCode_105id.equals("")){
         postalCode_105idTemp  = postalCode_105id;
        }
        String street2_106id=  request.getParameter("street2668");
            java.lang.String street2_106idTemp = null;
        if(!street2_106id.equals("")){
         street2_106idTemp  = street2_106id;
        }
        String street1_107id=  request.getParameter("street1670");
            java.lang.String street1_107idTemp = null;
        if(!street1_107id.equals("")){
         street1_107idTemp  = street1_107id;
        }
        String addressID_108id=  request.getParameter("addressID672");
            java.lang.String addressID_108idTemp = null;
        if(!addressID_108id.equals("")){
         addressID_108idTemp  = addressID_108id;
        }
        String internationalStateAndCity_109id=  request.getParameter("internationalStateAndCity674");
            java.lang.String internationalStateAndCity_109idTemp = null;
        if(!internationalStateAndCity_109id.equals("")){
         internationalStateAndCity_109idTemp  = internationalStateAndCity_109id;
        }
        String name_110id=  request.getParameter("name676");
            java.lang.String name_110idTemp = null;
        if(!name_110id.equals("")){
         name_110idTemp  = name_110id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_97id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_97id.setCountryName(countryName_98idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setInternationalStreet(internationalStreet_99idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setExternalAddressID(externalAddressID_100idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setStateOrProvince(stateOrProvince_101idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setInternationalName(internationalName_102idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setCityName(cityName_103idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setPhone(phone_104idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setPostalCode(postalCode_105idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setStreet2(street2_106idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setStreet1(street1_107idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setAddressID(addressID_108idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setInternationalStateAndCity(internationalStateAndCity_109idTemp);
        eBLBaseComponents1apis1ebay1AddressType_97id.setName(name_110idTemp);
        String firstName_111id=  request.getParameter("firstName678");
            java.lang.String firstName_111idTemp = null;
        if(!firstName_111id.equals("")){
         firstName_111idTemp  = firstName_111id;
        }
        String lastName_112id=  request.getParameter("lastName680");
            java.lang.String lastName_112idTemp = null;
        if(!lastName_112id.equals("")){
         lastName_112idTemp  = lastName_112id;
        }
        String logoutURL_113id=  request.getParameter("logoutURL682");
            java.lang.String logoutURL_113idTemp = null;
        if(!logoutURL_113id.equals("")){
         logoutURL_113idTemp  = logoutURL_113id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id" scope="session" class="eBLBaseComponents.apis.ebay.SetAccessPermissionsRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setLocaleCode(localeCode_87idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setReturnURL(returnURL_88idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setCancelURL(cancelURL_89idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setCppHeaderBorderColor(cppHeaderBorderColor_90idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setCppPayflowColor(cppPayflowColor_91idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setInitFlowType(initFlowType_92idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setSkipLoginPage(skipLoginPage_93idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setCppHeaderBackColor(cppHeaderBackColor_94idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setCppHeaderImage(cppHeaderImage_95idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setPageStyle(pageStyle_96idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setAddress(eBLBaseComponents1apis1ebay1AddressType_97id);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setFirstName(firstName_111idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setLastName(lastName_112idTemp);
        eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id.setLogoutURL(logoutURL_113idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetAccessPermissionsRequestType_85id" scope="session" class="PayPalAPI.api.ebay.SetAccessPermissionsRequestType" />
        <%
        PayPalAPI1api1ebay1SetAccessPermissionsRequestType_85id.setSetAccessPermissionsRequestDetails(eBLBaseComponents1apis1ebay1SetAccessPermissionsRequestDetailsType_86id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetAccessPermissionsReq_84id" scope="session" class="PayPalAPI.api.ebay.SetAccessPermissionsReq" />
        <%
        PayPalAPI1api1ebay1SetAccessPermissionsReq_84id.setSetAccessPermissionsRequest(PayPalAPI1api1ebay1SetAccessPermissionsRequestType_85id);
        PayPalAPI.api.ebay.SetAccessPermissionsResponseType setAccessPermissions619mtemp = samplePayPalAPIAAInterfaceProxyid.setAccessPermissions(PayPalAPI1api1ebay1SetAccessPermissionsReq_84id);
if(setAccessPermissions619mtemp == null){
%>
<%=setAccessPermissions619mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">token:</TD>
<TD>
<%
if(setAccessPermissions619mtemp != null){
java.lang.String typetoken622 = setAccessPermissions619mtemp.getToken();
        String tempResulttoken622 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken622));
        %>
        <%= tempResulttoken622 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 684:
        gotMethod = true;
        String payerID_116id=  request.getParameter("payerID693");
            java.lang.String payerID_116idTemp = null;
        if(!payerID_116id.equals("")){
         payerID_116idTemp  = payerID_116id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1UpdateAccessPermissionsRequestType_115id" scope="session" class="PayPalAPI.api.ebay.UpdateAccessPermissionsRequestType" />
        <%
        PayPalAPI1api1ebay1UpdateAccessPermissionsRequestType_115id.setPayerID(payerID_116idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1UpdateAccessPermissionsReq_114id" scope="session" class="PayPalAPI.api.ebay.UpdateAccessPermissionsReq" />
        <%
        PayPalAPI1api1ebay1UpdateAccessPermissionsReq_114id.setUpdateAccessPermissionsRequest(PayPalAPI1api1ebay1UpdateAccessPermissionsRequestType_115id);
        PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType updateAccessPermissions684mtemp = samplePayPalAPIAAInterfaceProxyid.updateAccessPermissions(PayPalAPI1api1ebay1UpdateAccessPermissionsReq_114id);
if(updateAccessPermissions684mtemp == null){
%>
<%=updateAccessPermissions684mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(updateAccessPermissions684mtemp != null){
java.lang.String typestatus687 = updateAccessPermissions684mtemp.getStatus();
        String tempResultstatus687 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus687));
        %>
        <%= tempResultstatus687 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 695:
        gotMethod = true;
        String token_119id=  request.getParameter("token712");
            java.lang.String token_119idTemp = null;
        if(!token_119id.equals("")){
         token_119idTemp  = token_119id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetAccessPermissionDetailsRequestType_118id" scope="session" class="PayPalAPI.api.ebay.GetAccessPermissionDetailsRequestType" />
        <%
        PayPalAPI1api1ebay1GetAccessPermissionDetailsRequestType_118id.setToken(token_119idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetAccessPermissionDetailsReq_117id" scope="session" class="PayPalAPI.api.ebay.GetAccessPermissionDetailsReq" />
        <%
        PayPalAPI1api1ebay1GetAccessPermissionDetailsReq_117id.setGetAccessPermissionDetailsRequest(PayPalAPI1api1ebay1GetAccessPermissionDetailsRequestType_118id);
        PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType getAccessPermissionDetails695mtemp = samplePayPalAPIAAInterfaceProxyid.getAccessPermissionDetails(PayPalAPI1api1ebay1GetAccessPermissionDetailsReq_117id);
if(getAccessPermissionDetails695mtemp == null){
%>
<%=getAccessPermissionDetails695mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">getAccessPermissionDetailsResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">payerID:</TD>
<TD>
<%
if(getAccessPermissionDetails695mtemp != null){
eBLBaseComponents.apis.ebay.GetAccessPermissionDetailsResponseDetailsType tebece0=getAccessPermissionDetails695mtemp.getGetAccessPermissionDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typepayerID700 = tebece0.getPayerID();
        String tempResultpayerID700 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerID700));
        %>
        <%= tempResultpayerID700 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getAccessPermissionDetails695mtemp != null){
eBLBaseComponents.apis.ebay.GetAccessPermissionDetailsResponseDetailsType tebece0=getAccessPermissionDetails695mtemp.getGetAccessPermissionDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typeemail702 = tebece0.getEmail();
        String tempResultemail702 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail702));
        %>
        <%= tempResultemail702 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(getAccessPermissionDetails695mtemp != null){
eBLBaseComponents.apis.ebay.GetAccessPermissionDetailsResponseDetailsType tebece0=getAccessPermissionDetails695mtemp.getGetAccessPermissionDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typelastName704 = tebece0.getLastName();
        String tempResultlastName704 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName704));
        %>
        <%= tempResultlastName704 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(getAccessPermissionDetails695mtemp != null){
eBLBaseComponents.apis.ebay.GetAccessPermissionDetailsResponseDetailsType tebece0=getAccessPermissionDetails695mtemp.getGetAccessPermissionDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typefirstName706 = tebece0.getFirstName();
        String tempResultfirstName706 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName706));
        %>
        <%= tempResultfirstName706 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 714:
        gotMethod = true;
        String _value_124id=  request.getParameter("_value729");
            java.lang.String _value_124idTemp = null;
        if(!_value_124id.equals("")){
         _value_124idTemp  = _value_124id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_123id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_123id.set_value(_value_124idTemp);
        String requestId_126id=  request.getParameter("requestId733");
            java.lang.String requestId_126idTemp = null;
        if(!requestId_126id.equals("")){
         requestId_126idTemp  = requestId_126id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1IncentiveRequestDetailsType_125id" scope="session" class="eBLBaseComponents.apis.ebay.IncentiveRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1IncentiveRequestDetailsType_125id.setRequestId(requestId_126idTemp);
        String externalBuyerId_127id=  request.getParameter("externalBuyerId735");
            java.lang.String externalBuyerId_127idTemp = null;
        if(!externalBuyerId_127id.equals("")){
         externalBuyerId_127idTemp  = externalBuyerId_127id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1GetIncentiveEvaluationRequestDetailsType_122id" scope="session" class="eBLBaseComponents.apis.ebay.GetIncentiveEvaluationRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1GetIncentiveEvaluationRequestDetailsType_122id.setCartTotalAmt(CoreComponentTypes1apis1ebay1BasicAmountType_123id);
        eBLBaseComponents1apis1ebay1GetIncentiveEvaluationRequestDetailsType_122id.setRequestDetails(eBLBaseComponents1apis1ebay1IncentiveRequestDetailsType_125id);
        eBLBaseComponents1apis1ebay1GetIncentiveEvaluationRequestDetailsType_122id.setExternalBuyerId(externalBuyerId_127idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetIncentiveEvaluationRequestType_121id" scope="session" class="PayPalAPI.api.ebay.GetIncentiveEvaluationRequestType" />
        <%
        PayPalAPI1api1ebay1GetIncentiveEvaluationRequestType_121id.setGetIncentiveEvaluationRequestDetails(eBLBaseComponents1apis1ebay1GetIncentiveEvaluationRequestDetailsType_122id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetIncentiveEvaluationReq_120id" scope="session" class="PayPalAPI.api.ebay.GetIncentiveEvaluationReq" />
        <%
        PayPalAPI1api1ebay1GetIncentiveEvaluationReq_120id.setGetIncentiveEvaluationRequest(PayPalAPI1api1ebay1GetIncentiveEvaluationRequestType_121id);
        PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType getIncentiveEvaluation714mtemp = samplePayPalAPIAAInterfaceProxyid.getIncentiveEvaluation(PayPalAPI1api1ebay1GetIncentiveEvaluationReq_120id);
if(getIncentiveEvaluation714mtemp == null){
%>
<%=getIncentiveEvaluation714mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">getIncentiveEvaluationResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">requestId:</TD>
<TD>
<%
if(getIncentiveEvaluation714mtemp != null){
eBLBaseComponents.apis.ebay.GetIncentiveEvaluationResponseDetailsType tebece0=getIncentiveEvaluation714mtemp.getGetIncentiveEvaluationResponseDetails();
if(tebece0 != null){
java.lang.String typerequestId719 = tebece0.getRequestId();
        String tempResultrequestId719 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerequestId719));
        %>
        <%= tempResultrequestId719 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 737:
        gotMethod = true;
        String errorURL_132id=  request.getParameter("errorURL750");
            java.lang.String errorURL_132idTemp = null;
        if(!errorURL_132id.equals("")){
         errorURL_132idTemp  = errorURL_132id;
        }
        String inContextReturnURL_133id=  request.getParameter("inContextReturnURL752");
            java.lang.String inContextReturnURL_133idTemp = null;
        if(!inContextReturnURL_133id.equals("")){
         inContextReturnURL_133idTemp  = inContextReturnURL_133id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1FlowControlDetailsType_131id" scope="session" class="eBLBaseComponents.apis.ebay.FlowControlDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1FlowControlDetailsType_131id.setErrorURL(errorURL_132idTemp);
        eBLBaseComponents1apis1ebay1FlowControlDetailsType_131id.setInContextReturnURL(inContextReturnURL_133idTemp);
        String allowNote_134id=  request.getParameter("allowNote754");
            java.lang.String allowNote_134idTemp = null;
        if(!allowNote_134id.equals("")){
         allowNote_134idTemp  = allowNote_134id;
        }
        %>
        <jsp:useBean id="EnhancedDataTypes1apis1ebay1EnhancedCheckoutDataType_135id" scope="session" class="EnhancedDataTypes.apis.ebay.EnhancedCheckoutDataType" />
        <%
        String allowPushFunding_137id=  request.getParameter("allowPushFunding760");
            java.lang.String allowPushFunding_137idTemp = null;
        if(!allowPushFunding_137id.equals("")){
         allowPushFunding_137idTemp  = allowPushFunding_137id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1FundingSourceDetailsType_136id" scope="session" class="eBLBaseComponents.apis.ebay.FundingSourceDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1FundingSourceDetailsType_136id.setAllowPushFunding(allowPushFunding_137idTemp);
        String cppCartBorderColor_138id=  request.getParameter("cppCartBorderColor762");
            java.lang.String cppCartBorderColor_138idTemp = null;
        if(!cppCartBorderColor_138id.equals("")){
         cppCartBorderColor_138idTemp  = cppCartBorderColor_138id;
        }
        String profileAddressChangeDate_139id=  request.getParameter("profileAddressChangeDate764");
            java.util.Calendar profileAddressChangeDate_139idTemp = null;
        if(!profileAddressChangeDate_139id.equals("")){
        java.text.DateFormat dateFormatprofileAddressChangeDate764 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempprofileAddressChangeDate764  = dateFormatprofileAddressChangeDate764.parse(profileAddressChangeDate_139id);
         profileAddressChangeDate_139idTemp = new java.util.GregorianCalendar();
        profileAddressChangeDate_139idTemp.setTime(dateTempprofileAddressChangeDate764);
        }
        String cppHeaderBackColor_140id=  request.getParameter("cppHeaderBackColor766");
            java.lang.String cppHeaderBackColor_140idTemp = null;
        if(!cppHeaderBackColor_140id.equals("")){
         cppHeaderBackColor_140idTemp  = cppHeaderBackColor_140id;
        }
        String addressOverride_141id=  request.getParameter("addressOverride768");
            java.lang.String addressOverride_141idTemp = null;
        if(!addressOverride_141id.equals("")){
         addressOverride_141idTemp  = addressOverride_141id;
        }
        String externalPartnerSegmentID_143id=  request.getParameter("externalPartnerSegmentID772");
            java.lang.String externalPartnerSegmentID_143idTemp = null;
        if(!externalPartnerSegmentID_143id.equals("")){
         externalPartnerSegmentID_143idTemp  = externalPartnerSegmentID_143id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ExternalPartnerTrackingDetailsType_142id" scope="session" class="eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ExternalPartnerTrackingDetailsType_142id.setExternalPartnerSegmentID(externalPartnerSegmentID_143idTemp);
        String buyerEmailOptInEnable_144id=  request.getParameter("buyerEmailOptInEnable774");
            java.lang.String buyerEmailOptInEnable_144idTemp = null;
        if(!buyerEmailOptInEnable_144id.equals("")){
         buyerEmailOptInEnable_144idTemp  = buyerEmailOptInEnable_144id;
        }
        String reqConfirmShipping_145id=  request.getParameter("reqConfirmShipping776");
            java.lang.String reqConfirmShipping_145idTemp = null;
        if(!reqConfirmShipping_145id.equals("")){
         reqConfirmShipping_145idTemp  = reqConfirmShipping_145id;
        }
        String cppPayflowColor_146id=  request.getParameter("cppPayflowColor778");
            java.lang.String cppPayflowColor_146idTemp = null;
        if(!cppPayflowColor_146id.equals("")){
         cppPayflowColor_146idTemp  = cppPayflowColor_146id;
        }
        String banktxnPendingURL_147id=  request.getParameter("banktxnPendingURL780");
            java.lang.String banktxnPendingURL_147idTemp = null;
        if(!banktxnPendingURL_147id.equals("")){
         banktxnPendingURL_147idTemp  = banktxnPendingURL_147id;
        }
        String noShipping_148id=  request.getParameter("noShipping782");
            java.lang.String noShipping_148idTemp = null;
        if(!noShipping_148id.equals("")){
         noShipping_148idTemp  = noShipping_148id;
        }
        String pageStyle_149id=  request.getParameter("pageStyle784");
            java.lang.String pageStyle_149idTemp = null;
        if(!pageStyle_149id.equals("")){
         pageStyle_149idTemp  = pageStyle_149id;
        }
        String token_150id=  request.getParameter("token786");
            java.lang.String token_150idTemp = null;
        if(!token_150id.equals("")){
         token_150idTemp  = token_150id;
        }
        String cancelURL_151id=  request.getParameter("cancelURL788");
            java.lang.String cancelURL_151idTemp = null;
        if(!cancelURL_151id.equals("")){
         cancelURL_151idTemp  = cancelURL_151id;
        }
        String _value_153id=  request.getParameter("_value792");
            java.lang.String _value_153idTemp = null;
        if(!_value_153id.equals("")){
         _value_153idTemp  = _value_153id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_152id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_152id.set_value(_value_153idTemp);
        String callbackTimeout_154id=  request.getParameter("callbackTimeout794");
            java.lang.String callbackTimeout_154idTemp = null;
        if(!callbackTimeout_154id.equals("")){
         callbackTimeout_154idTemp  = callbackTimeout_154id;
        }
        String brandName_155id=  request.getParameter("brandName796");
            java.lang.String brandName_155idTemp = null;
        if(!brandName_155id.equals("")){
         brandName_155idTemp  = brandName_155id;
        }
        String callbackVersion_156id=  request.getParameter("callbackVersion798");
            java.lang.String callbackVersion_156idTemp = null;
        if(!callbackVersion_156id.equals("")){
         callbackVersion_156idTemp  = callbackVersion_156id;
        }
        String trackingImageURL_157id=  request.getParameter("trackingImageURL800");
            java.lang.String trackingImageURL_157idTemp = null;
        if(!trackingImageURL_157id.equals("")){
         trackingImageURL_157idTemp  = trackingImageURL_157id;
        }
        String custom_158id=  request.getParameter("custom802");
            java.lang.String custom_158idTemp = null;
        if(!custom_158id.equals("")){
         custom_158idTemp  = custom_158id;
        }
        String reqInstrumentDetails_159id=  request.getParameter("reqInstrumentDetails804");
            java.lang.String reqInstrumentDetails_159idTemp = null;
        if(!reqInstrumentDetails_159id.equals("")){
         reqInstrumentDetails_159idTemp  = reqInstrumentDetails_159id;
        }
        String giftWrapEnable_160id=  request.getParameter("giftWrapEnable806");
            java.lang.String giftWrapEnable_160idTemp = null;
        if(!giftWrapEnable_160id.equals("")){
         giftWrapEnable_160idTemp  = giftWrapEnable_160id;
        }
        String callbackURL_161id=  request.getParameter("callbackURL808");
            java.lang.String callbackURL_161idTemp = null;
        if(!callbackURL_161id.equals("")){
         callbackURL_161idTemp  = callbackURL_161id;
        }
        String cppHeaderImage_162id=  request.getParameter("cppHeaderImage810");
            java.lang.String cppHeaderImage_162idTemp = null;
        if(!cppHeaderImage_162id.equals("")){
         cppHeaderImage_162idTemp  = cppHeaderImage_162id;
        }
        String giftWrapName_163id=  request.getParameter("giftWrapName812");
            java.lang.String giftWrapName_163idTemp = null;
        if(!giftWrapName_163id.equals("")){
         giftWrapName_163idTemp  = giftWrapName_163id;
        }
        String invoiceID_164id=  request.getParameter("invoiceID814");
            java.lang.String invoiceID_164idTemp = null;
        if(!invoiceID_164id.equals("")){
         invoiceID_164idTemp  = invoiceID_164id;
        }
        String cppHeaderBorderColor_165id=  request.getParameter("cppHeaderBorderColor816");
            java.lang.String cppHeaderBorderColor_165idTemp = null;
        if(!cppHeaderBorderColor_165id.equals("")){
         cppHeaderBorderColor_165idTemp  = cppHeaderBorderColor_165id;
        }
        String reqBillingAddress_166id=  request.getParameter("reqBillingAddress818");
            java.lang.String reqBillingAddress_166idTemp = null;
        if(!reqBillingAddress_166id.equals("")){
         reqBillingAddress_166idTemp  = reqBillingAddress_166id;
        }
        String giftReceiptEnable_167id=  request.getParameter("giftReceiptEnable820");
            java.lang.String giftReceiptEnable_167idTemp = null;
        if(!giftReceiptEnable_167id.equals("")){
         giftReceiptEnable_167idTemp  = giftReceiptEnable_167id;
        }
        String returnURL_168id=  request.getParameter("returnURL822");
            java.lang.String returnURL_168idTemp = null;
        if(!returnURL_168id.equals("")){
         returnURL_168idTemp  = returnURL_168id;
        }
        String noteToBuyer_169id=  request.getParameter("noteToBuyer824");
            java.lang.String noteToBuyer_169idTemp = null;
        if(!noteToBuyer_169id.equals("")){
         noteToBuyer_169idTemp  = noteToBuyer_169id;
        }
        String sessionToken_173id=  request.getParameter("sessionToken832");
            java.lang.String sessionToken_173idTemp = null;
        if(!sessionToken_173id.equals("")){
         sessionToken_173idTemp  = sessionToken_173id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1MobileIDInfoType_172id" scope="session" class="eBLBaseComponents.apis.ebay.MobileIDInfoType" />
        <%
        eBLBaseComponents1apis1ebay1MobileIDInfoType_172id.setSessionToken(sessionToken_173idTemp);
        String accessToken_175id=  request.getParameter("accessToken836");
            java.lang.String accessToken_175idTemp = null;
        if(!accessToken_175id.equals("")){
         accessToken_175idTemp  = accessToken_175id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1IdentityTokenInfoType_174id" scope="session" class="eBLBaseComponents.apis.ebay.IdentityTokenInfoType" />
        <%
        eBLBaseComponents1apis1ebay1IdentityTokenInfoType_174id.setAccessToken(accessToken_175idTemp);
        String externalRememberMeID_177id=  request.getParameter("externalRememberMeID840");
            java.lang.String externalRememberMeID_177idTemp = null;
        if(!externalRememberMeID_177id.equals("")){
         externalRememberMeID_177idTemp  = externalRememberMeID_177id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1RememberMeIDInfoType_176id" scope="session" class="eBLBaseComponents.apis.ebay.RememberMeIDInfoType" />
        <%
        eBLBaseComponents1apis1ebay1RememberMeIDInfoType_176id.setExternalRememberMeID(externalRememberMeID_177idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1IdentificationInfoType_171id" scope="session" class="eBLBaseComponents.apis.ebay.IdentificationInfoType" />
        <%
        eBLBaseComponents1apis1ebay1IdentificationInfoType_171id.setMobileIDInfo(eBLBaseComponents1apis1ebay1MobileIDInfoType_172id);
        eBLBaseComponents1apis1ebay1IdentificationInfoType_171id.setIdentityTokenInfo(eBLBaseComponents1apis1ebay1IdentityTokenInfoType_174id);
        eBLBaseComponents1apis1ebay1IdentificationInfoType_171id.setRememberMeIDInfo(eBLBaseComponents1apis1ebay1RememberMeIDInfoType_176id);
        String taxId_179id=  request.getParameter("taxId844");
            java.lang.String taxId_179idTemp = null;
        if(!taxId_179id.equals("")){
         taxId_179idTemp  = taxId_179id;
        }
        String taxIdType_180id=  request.getParameter("taxIdType846");
            java.lang.String taxIdType_180idTemp = null;
        if(!taxIdType_180id.equals("")){
         taxIdType_180idTemp  = taxIdType_180id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1TaxIdDetailsType_178id" scope="session" class="eBLBaseComponents.apis.ebay.TaxIdDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_178id.setTaxId(taxId_179idTemp);
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_178id.setTaxIdType(taxIdType_180idTemp);
        String buyerRegistrationDate_181id=  request.getParameter("buyerRegistrationDate848");
            java.util.Calendar buyerRegistrationDate_181idTemp = null;
        if(!buyerRegistrationDate_181id.equals("")){
        java.text.DateFormat dateFormatbuyerRegistrationDate848 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempbuyerRegistrationDate848  = dateFormatbuyerRegistrationDate848.parse(buyerRegistrationDate_181id);
         buyerRegistrationDate_181idTemp = new java.util.GregorianCalendar();
        buyerRegistrationDate_181idTemp.setTime(dateTempbuyerRegistrationDate848);
        }
        String buyerUserName_182id=  request.getParameter("buyerUserName850");
            java.lang.String buyerUserName_182idTemp = null;
        if(!buyerUserName_182id.equals("")){
         buyerUserName_182idTemp  = buyerUserName_182id;
        }
        String buyerId_183id=  request.getParameter("buyerId852");
            java.lang.String buyerId_183idTemp = null;
        if(!buyerId_183id.equals("")){
         buyerId_183idTemp  = buyerId_183id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BuyerDetailsType_170id" scope="session" class="eBLBaseComponents.apis.ebay.BuyerDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1BuyerDetailsType_170id.setIdentificationInfo(eBLBaseComponents1apis1ebay1IdentificationInfoType_171id);
        eBLBaseComponents1apis1ebay1BuyerDetailsType_170id.setTaxIdDetails(eBLBaseComponents1apis1ebay1TaxIdDetailsType_178id);
        eBLBaseComponents1apis1ebay1BuyerDetailsType_170id.setBuyerRegistrationDate(buyerRegistrationDate_181idTemp);
        eBLBaseComponents1apis1ebay1BuyerDetailsType_170id.setBuyerUserName(buyerUserName_182idTemp);
        eBLBaseComponents1apis1ebay1BuyerDetailsType_170id.setBuyerId(buyerId_183idTemp);
        String surveyQuestion_184id=  request.getParameter("surveyQuestion854");
            java.lang.String surveyQuestion_184idTemp = null;
        if(!surveyQuestion_184id.equals("")){
         surveyQuestion_184idTemp  = surveyQuestion_184id;
        }
        String externalRememberMeOptIn_186id=  request.getParameter("externalRememberMeOptIn858");
            java.lang.String externalRememberMeOptIn_186idTemp = null;
        if(!externalRememberMeOptIn_186id.equals("")){
         externalRememberMeOptIn_186idTemp  = externalRememberMeOptIn_186id;
        }
        String externalRememberMeOwnerID_188id=  request.getParameter("externalRememberMeOwnerID862");
            java.lang.String externalRememberMeOwnerID_188idTemp = null;
        if(!externalRememberMeOwnerID_188id.equals("")){
         externalRememberMeOwnerID_188idTemp  = externalRememberMeOwnerID_188id;
        }
        String externalRememberMeOwnerIDType_189id=  request.getParameter("externalRememberMeOwnerIDType864");
            java.lang.String externalRememberMeOwnerIDType_189idTemp = null;
        if(!externalRememberMeOwnerIDType_189id.equals("")){
         externalRememberMeOwnerIDType_189idTemp  = externalRememberMeOwnerIDType_189id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_187id" scope="session" class="eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_187id.setExternalRememberMeOwnerID(externalRememberMeOwnerID_188idTemp);
        eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_187id.setExternalRememberMeOwnerIDType(externalRememberMeOwnerIDType_189idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ExternalRememberMeOptInDetailsType_185id" scope="session" class="eBLBaseComponents.apis.ebay.ExternalRememberMeOptInDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ExternalRememberMeOptInDetailsType_185id.setExternalRememberMeOptIn(externalRememberMeOptIn_186idTemp);
        eBLBaseComponents1apis1ebay1ExternalRememberMeOptInDetailsType_185id.setExternalRememberMeOwnerDetails(eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_187id);
        String localeCode_190id=  request.getParameter("localeCode866");
            java.lang.String localeCode_190idTemp = null;
        if(!localeCode_190id.equals("")){
         localeCode_190idTemp  = localeCode_190id;
        }
        String giropayCancelURL_191id=  request.getParameter("giropayCancelURL868");
            java.lang.String giropayCancelURL_191idTemp = null;
        if(!giropayCancelURL_191id.equals("")){
         giropayCancelURL_191idTemp  = giropayCancelURL_191id;
        }
        String payPalCheckOutBtnType_192id=  request.getParameter("payPalCheckOutBtnType870");
            java.lang.String payPalCheckOutBtnType_192idTemp = null;
        if(!payPalCheckOutBtnType_192id.equals("")){
         payPalCheckOutBtnType_192idTemp  = payPalCheckOutBtnType_192id;
        }
        String countryName_194id=  request.getParameter("countryName874");
            java.lang.String countryName_194idTemp = null;
        if(!countryName_194id.equals("")){
         countryName_194idTemp  = countryName_194id;
        }
        String internationalStreet_195id=  request.getParameter("internationalStreet876");
            java.lang.String internationalStreet_195idTemp = null;
        if(!internationalStreet_195id.equals("")){
         internationalStreet_195idTemp  = internationalStreet_195id;
        }
        String externalAddressID_196id=  request.getParameter("externalAddressID878");
            java.lang.String externalAddressID_196idTemp = null;
        if(!externalAddressID_196id.equals("")){
         externalAddressID_196idTemp  = externalAddressID_196id;
        }
        String stateOrProvince_197id=  request.getParameter("stateOrProvince880");
            java.lang.String stateOrProvince_197idTemp = null;
        if(!stateOrProvince_197id.equals("")){
         stateOrProvince_197idTemp  = stateOrProvince_197id;
        }
        String internationalName_198id=  request.getParameter("internationalName882");
            java.lang.String internationalName_198idTemp = null;
        if(!internationalName_198id.equals("")){
         internationalName_198idTemp  = internationalName_198id;
        }
        String cityName_199id=  request.getParameter("cityName884");
            java.lang.String cityName_199idTemp = null;
        if(!cityName_199id.equals("")){
         cityName_199idTemp  = cityName_199id;
        }
        String phone_200id=  request.getParameter("phone886");
            java.lang.String phone_200idTemp = null;
        if(!phone_200id.equals("")){
         phone_200idTemp  = phone_200id;
        }
        String postalCode_201id=  request.getParameter("postalCode888");
            java.lang.String postalCode_201idTemp = null;
        if(!postalCode_201id.equals("")){
         postalCode_201idTemp  = postalCode_201id;
        }
        String street2_202id=  request.getParameter("street2890");
            java.lang.String street2_202idTemp = null;
        if(!street2_202id.equals("")){
         street2_202idTemp  = street2_202id;
        }
        String street1_203id=  request.getParameter("street1892");
            java.lang.String street1_203idTemp = null;
        if(!street1_203id.equals("")){
         street1_203idTemp  = street1_203id;
        }
        String addressID_204id=  request.getParameter("addressID894");
            java.lang.String addressID_204idTemp = null;
        if(!addressID_204id.equals("")){
         addressID_204idTemp  = addressID_204id;
        }
        String internationalStateAndCity_205id=  request.getParameter("internationalStateAndCity896");
            java.lang.String internationalStateAndCity_205idTemp = null;
        if(!internationalStateAndCity_205id.equals("")){
         internationalStateAndCity_205idTemp  = internationalStateAndCity_205id;
        }
        String name_206id=  request.getParameter("name898");
            java.lang.String name_206idTemp = null;
        if(!name_206id.equals("")){
         name_206idTemp  = name_206id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_193id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_193id.setCountryName(countryName_194idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setInternationalStreet(internationalStreet_195idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setExternalAddressID(externalAddressID_196idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setStateOrProvince(stateOrProvince_197idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setInternationalName(internationalName_198idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setCityName(cityName_199idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setPhone(phone_200idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setPostalCode(postalCode_201idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setStreet2(street2_202idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setStreet1(street1_203idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setAddressID(addressID_204idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setInternationalStateAndCity(internationalStateAndCity_205idTemp);
        eBLBaseComponents1apis1ebay1AddressType_193id.setName(name_206idTemp);
        String orderDescription_207id=  request.getParameter("orderDescription900");
            java.lang.String orderDescription_207idTemp = null;
        if(!orderDescription_207id.equals("")){
         orderDescription_207idTemp  = orderDescription_207id;
        }
        String surveyEnable_208id=  request.getParameter("surveyEnable902");
            java.lang.String surveyEnable_208idTemp = null;
        if(!surveyEnable_208id.equals("")){
         surveyEnable_208idTemp  = surveyEnable_208id;
        }
        String giftMessageEnable_209id=  request.getParameter("giftMessageEnable904");
            java.lang.String giftMessageEnable_209idTemp = null;
        if(!giftMessageEnable_209id.equals("")){
         giftMessageEnable_209idTemp  = giftMessageEnable_209id;
        }
        String customerServiceNumber_210id=  request.getParameter("customerServiceNumber906");
            java.lang.String customerServiceNumber_210idTemp = null;
        if(!customerServiceNumber_210id.equals("")){
         customerServiceNumber_210idTemp  = customerServiceNumber_210id;
        }
        String _value_212id=  request.getParameter("_value910");
            java.lang.String _value_212idTemp = null;
        if(!_value_212id.equals("")){
         _value_212idTemp  = _value_212id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_211id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_211id.set_value(_value_212idTemp);
        String inContextPaymentButtonImage_214id=  request.getParameter("inContextPaymentButtonImage914");
            java.lang.String inContextPaymentButtonImage_214idTemp = null;
        if(!inContextPaymentButtonImage_214id.equals("")){
         inContextPaymentButtonImage_214idTemp  = inContextPaymentButtonImage_214id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1DisplayControlDetailsType_213id" scope="session" class="eBLBaseComponents.apis.ebay.DisplayControlDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1DisplayControlDetailsType_213id.setInContextPaymentButtonImage(inContextPaymentButtonImage_214idTemp);
        String giropaySuccessURL_215id=  request.getParameter("giropaySuccessURL916");
            java.lang.String giropaySuccessURL_215idTemp = null;
        if(!giropaySuccessURL_215id.equals("")){
         giropaySuccessURL_215idTemp  = giropaySuccessURL_215id;
        }
        String countryName_217id=  request.getParameter("countryName920");
            java.lang.String countryName_217idTemp = null;
        if(!countryName_217id.equals("")){
         countryName_217idTemp  = countryName_217id;
        }
        String internationalStreet_218id=  request.getParameter("internationalStreet922");
            java.lang.String internationalStreet_218idTemp = null;
        if(!internationalStreet_218id.equals("")){
         internationalStreet_218idTemp  = internationalStreet_218id;
        }
        String externalAddressID_219id=  request.getParameter("externalAddressID924");
            java.lang.String externalAddressID_219idTemp = null;
        if(!externalAddressID_219id.equals("")){
         externalAddressID_219idTemp  = externalAddressID_219id;
        }
        String stateOrProvince_220id=  request.getParameter("stateOrProvince926");
            java.lang.String stateOrProvince_220idTemp = null;
        if(!stateOrProvince_220id.equals("")){
         stateOrProvince_220idTemp  = stateOrProvince_220id;
        }
        String internationalName_221id=  request.getParameter("internationalName928");
            java.lang.String internationalName_221idTemp = null;
        if(!internationalName_221id.equals("")){
         internationalName_221idTemp  = internationalName_221id;
        }
        String cityName_222id=  request.getParameter("cityName930");
            java.lang.String cityName_222idTemp = null;
        if(!cityName_222id.equals("")){
         cityName_222idTemp  = cityName_222id;
        }
        String phone_223id=  request.getParameter("phone932");
            java.lang.String phone_223idTemp = null;
        if(!phone_223id.equals("")){
         phone_223idTemp  = phone_223id;
        }
        String postalCode_224id=  request.getParameter("postalCode934");
            java.lang.String postalCode_224idTemp = null;
        if(!postalCode_224id.equals("")){
         postalCode_224idTemp  = postalCode_224id;
        }
        String street2_225id=  request.getParameter("street2936");
            java.lang.String street2_225idTemp = null;
        if(!street2_225id.equals("")){
         street2_225idTemp  = street2_225id;
        }
        String street1_226id=  request.getParameter("street1938");
            java.lang.String street1_226idTemp = null;
        if(!street1_226id.equals("")){
         street1_226idTemp  = street1_226id;
        }
        String addressID_227id=  request.getParameter("addressID940");
            java.lang.String addressID_227idTemp = null;
        if(!addressID_227id.equals("")){
         addressID_227idTemp  = addressID_227id;
        }
        String internationalStateAndCity_228id=  request.getParameter("internationalStateAndCity942");
            java.lang.String internationalStateAndCity_228idTemp = null;
        if(!internationalStateAndCity_228id.equals("")){
         internationalStateAndCity_228idTemp  = internationalStateAndCity_228id;
        }
        String name_229id=  request.getParameter("name944");
            java.lang.String name_229idTemp = null;
        if(!name_229id.equals("")){
         name_229idTemp  = name_229id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_216id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_216id.setCountryName(countryName_217idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setInternationalStreet(internationalStreet_218idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setExternalAddressID(externalAddressID_219idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setStateOrProvince(stateOrProvince_220idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setInternationalName(internationalName_221idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setCityName(cityName_222idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setPhone(phone_223idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setPostalCode(postalCode_224idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setStreet2(street2_225idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setStreet1(street1_226idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setAddressID(addressID_227idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setInternationalStateAndCity(internationalStateAndCity_228idTemp);
        eBLBaseComponents1apis1ebay1AddressType_216id.setName(name_229idTemp);
        String _value_231id=  request.getParameter("_value948");
            java.lang.String _value_231idTemp = null;
        if(!_value_231id.equals("")){
         _value_231idTemp  = _value_231id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_230id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_230id.set_value(_value_231idTemp);
        String cppLogoImage_232id=  request.getParameter("cppLogoImage950");
            java.lang.String cppLogoImage_232idTemp = null;
        if(!cppLogoImage_232id.equals("")){
         cppLogoImage_232idTemp  = cppLogoImage_232id;
        }
        String buyerEmail_233id=  request.getParameter("buyerEmail952");
            java.lang.String buyerEmail_233idTemp = null;
        if(!buyerEmail_233id.equals("")){
         buyerEmail_233idTemp  = buyerEmail_233id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id" scope="session" class="eBLBaseComponents.apis.ebay.SetExpressCheckoutRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setFlowControlDetails(eBLBaseComponents1apis1ebay1FlowControlDetailsType_131id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setAllowNote(allowNote_134idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setEnhancedCheckoutData(EnhancedDataTypes1apis1ebay1EnhancedCheckoutDataType_135id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setFundingSourceDetails(eBLBaseComponents1apis1ebay1FundingSourceDetailsType_136id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCppCartBorderColor(cppCartBorderColor_138idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setProfileAddressChangeDate(profileAddressChangeDate_139idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCppHeaderBackColor(cppHeaderBackColor_140idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setAddressOverride(addressOverride_141idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setExternalPartnerTrackingDetails(eBLBaseComponents1apis1ebay1ExternalPartnerTrackingDetailsType_142id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setBuyerEmailOptInEnable(buyerEmailOptInEnable_144idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setReqConfirmShipping(reqConfirmShipping_145idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCppPayflowColor(cppPayflowColor_146idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setBanktxnPendingURL(banktxnPendingURL_147idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setNoShipping(noShipping_148idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setPageStyle(pageStyle_149idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setToken(token_150idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCancelURL(cancelURL_151idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setGiftWrapAmount(CoreComponentTypes1apis1ebay1BasicAmountType_152id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCallbackTimeout(callbackTimeout_154idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setBrandName(brandName_155idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCallbackVersion(callbackVersion_156idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setTrackingImageURL(trackingImageURL_157idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCustom(custom_158idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setReqInstrumentDetails(reqInstrumentDetails_159idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setGiftWrapEnable(giftWrapEnable_160idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCallbackURL(callbackURL_161idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCppHeaderImage(cppHeaderImage_162idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setGiftWrapName(giftWrapName_163idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setInvoiceID(invoiceID_164idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCppHeaderBorderColor(cppHeaderBorderColor_165idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setReqBillingAddress(reqBillingAddress_166idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setGiftReceiptEnable(giftReceiptEnable_167idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setReturnURL(returnURL_168idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setNoteToBuyer(noteToBuyer_169idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setBuyerDetails(eBLBaseComponents1apis1ebay1BuyerDetailsType_170id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setSurveyQuestion(surveyQuestion_184idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setExternalRememberMeOptInDetails(eBLBaseComponents1apis1ebay1ExternalRememberMeOptInDetailsType_185id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setLocaleCode(localeCode_190idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setGiropayCancelURL(giropayCancelURL_191idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setPayPalCheckOutBtnType(payPalCheckOutBtnType_192idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setAddress(eBLBaseComponents1apis1ebay1AddressType_193id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setOrderDescription(orderDescription_207idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setSurveyEnable(surveyEnable_208idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setGiftMessageEnable(giftMessageEnable_209idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCustomerServiceNumber(customerServiceNumber_210idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setOrderTotal(CoreComponentTypes1apis1ebay1BasicAmountType_211id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setDisplayControlDetails(eBLBaseComponents1apis1ebay1DisplayControlDetailsType_213id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setGiropaySuccessURL(giropaySuccessURL_215idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setBillingAddress(eBLBaseComponents1apis1ebay1AddressType_216id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setMaxAmount(CoreComponentTypes1apis1ebay1BasicAmountType_230id);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setCppLogoImage(cppLogoImage_232idTemp);
        eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id.setBuyerEmail(buyerEmail_233idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetExpressCheckoutRequestType_129id" scope="session" class="PayPalAPI.api.ebay.SetExpressCheckoutRequestType" />
        <%
        PayPalAPI1api1ebay1SetExpressCheckoutRequestType_129id.setSetExpressCheckoutRequestDetails(eBLBaseComponents1apis1ebay1SetExpressCheckoutRequestDetailsType_130id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetExpressCheckoutReq_128id" scope="session" class="PayPalAPI.api.ebay.SetExpressCheckoutReq" />
        <%
        PayPalAPI1api1ebay1SetExpressCheckoutReq_128id.setSetExpressCheckoutRequest(PayPalAPI1api1ebay1SetExpressCheckoutRequestType_129id);
        PayPalAPI.api.ebay.SetExpressCheckoutResponseType setExpressCheckout737mtemp = samplePayPalAPIAAInterfaceProxyid.setExpressCheckout(PayPalAPI1api1ebay1SetExpressCheckoutReq_128id);
if(setExpressCheckout737mtemp == null){
%>
<%=setExpressCheckout737mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">token:</TD>
<TD>
<%
if(setExpressCheckout737mtemp != null){
java.lang.String typetoken740 = setExpressCheckout737mtemp.getToken();
        String tempResulttoken740 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken740));
        %>
        <%= tempResulttoken740 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 954:
        gotMethod = true;
        String isRequested_238id=  request.getParameter("isRequested973");
        boolean isRequested_238idTemp  = Boolean.valueOf(isRequested_238id).booleanValue();
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AuthorizationRequestType_237id" scope="session" class="eBLBaseComponents.apis.ebay.AuthorizationRequestType" />
        <%
        eBLBaseComponents1apis1ebay1AuthorizationRequestType_237id.setIsRequested(isRequested_238idTemp);
        String token_239id=  request.getParameter("token975");
            java.lang.String token_239idTemp = null;
        if(!token_239id.equals("")){
         token_239idTemp  = token_239id;
        }
        String reqBillingAddress_242id=  request.getParameter("reqBillingAddress981");
            java.lang.String reqBillingAddress_242idTemp = null;
        if(!reqBillingAddress_242id.equals("")){
         reqBillingAddress_242idTemp  = reqBillingAddress_242id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1InfoSharingDirectivesType_241id" scope="session" class="eBLBaseComponents.apis.ebay.InfoSharingDirectivesType" />
        <%
        eBLBaseComponents1apis1ebay1InfoSharingDirectivesType_241id.setReqBillingAddress(reqBillingAddress_242idTemp);
        String sessionToken_246id=  request.getParameter("sessionToken989");
            java.lang.String sessionToken_246idTemp = null;
        if(!sessionToken_246id.equals("")){
         sessionToken_246idTemp  = sessionToken_246id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1MobileIDInfoType_245id" scope="session" class="eBLBaseComponents.apis.ebay.MobileIDInfoType" />
        <%
        eBLBaseComponents1apis1ebay1MobileIDInfoType_245id.setSessionToken(sessionToken_246idTemp);
        String accessToken_248id=  request.getParameter("accessToken993");
            java.lang.String accessToken_248idTemp = null;
        if(!accessToken_248id.equals("")){
         accessToken_248idTemp  = accessToken_248id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1IdentityTokenInfoType_247id" scope="session" class="eBLBaseComponents.apis.ebay.IdentityTokenInfoType" />
        <%
        eBLBaseComponents1apis1ebay1IdentityTokenInfoType_247id.setAccessToken(accessToken_248idTemp);
        String externalRememberMeID_250id=  request.getParameter("externalRememberMeID997");
            java.lang.String externalRememberMeID_250idTemp = null;
        if(!externalRememberMeID_250id.equals("")){
         externalRememberMeID_250idTemp  = externalRememberMeID_250id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1RememberMeIDInfoType_249id" scope="session" class="eBLBaseComponents.apis.ebay.RememberMeIDInfoType" />
        <%
        eBLBaseComponents1apis1ebay1RememberMeIDInfoType_249id.setExternalRememberMeID(externalRememberMeID_250idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1IdentificationInfoType_244id" scope="session" class="eBLBaseComponents.apis.ebay.IdentificationInfoType" />
        <%
        eBLBaseComponents1apis1ebay1IdentificationInfoType_244id.setMobileIDInfo(eBLBaseComponents1apis1ebay1MobileIDInfoType_245id);
        eBLBaseComponents1apis1ebay1IdentificationInfoType_244id.setIdentityTokenInfo(eBLBaseComponents1apis1ebay1IdentityTokenInfoType_247id);
        eBLBaseComponents1apis1ebay1IdentificationInfoType_244id.setRememberMeIDInfo(eBLBaseComponents1apis1ebay1RememberMeIDInfoType_249id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BuyerDetailType_243id" scope="session" class="eBLBaseComponents.apis.ebay.BuyerDetailType" />
        <%
        eBLBaseComponents1apis1ebay1BuyerDetailType_243id.setIdentificationInfo(eBLBaseComponents1apis1ebay1IdentificationInfoType_244id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SetDataRequestType_240id" scope="session" class="eBLBaseComponents.apis.ebay.SetDataRequestType" />
        <%
        eBLBaseComponents1apis1ebay1SetDataRequestType_240id.setInfoSharingDirectives(eBLBaseComponents1apis1ebay1InfoSharingDirectivesType_241id);
        eBLBaseComponents1apis1ebay1SetDataRequestType_240id.setBuyerDetail(eBLBaseComponents1apis1ebay1BuyerDetailType_243id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ExecuteCheckoutOperationsRequestDetailsType_236id" scope="session" class="eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ExecuteCheckoutOperationsRequestDetailsType_236id.setAuthorizationRequest(eBLBaseComponents1apis1ebay1AuthorizationRequestType_237id);
        eBLBaseComponents1apis1ebay1ExecuteCheckoutOperationsRequestDetailsType_236id.setToken(token_239idTemp);
        eBLBaseComponents1apis1ebay1ExecuteCheckoutOperationsRequestDetailsType_236id.setSetDataRequest(eBLBaseComponents1apis1ebay1SetDataRequestType_240id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ExecuteCheckoutOperationsRequestType_235id" scope="session" class="PayPalAPI.api.ebay.ExecuteCheckoutOperationsRequestType" />
        <%
        PayPalAPI1api1ebay1ExecuteCheckoutOperationsRequestType_235id.setExecuteCheckoutOperationsRequestDetails(eBLBaseComponents1apis1ebay1ExecuteCheckoutOperationsRequestDetailsType_236id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ExecuteCheckoutOperationsReq_234id" scope="session" class="PayPalAPI.api.ebay.ExecuteCheckoutOperationsReq" />
        <%
        PayPalAPI1api1ebay1ExecuteCheckoutOperationsReq_234id.setExecuteCheckoutOperationsRequest(PayPalAPI1api1ebay1ExecuteCheckoutOperationsRequestType_235id);
        PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType executeCheckoutOperations954mtemp = samplePayPalAPIAAInterfaceProxyid.executeCheckoutOperations(PayPalAPI1api1ebay1ExecuteCheckoutOperationsReq_234id);
if(executeCheckoutOperations954mtemp == null){
%>
<%=executeCheckoutOperations954mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">executeCheckoutOperationsResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">authorizationResponse:</TD>
<TD>
<%
if(executeCheckoutOperations954mtemp != null){
eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsResponseDetailsType tebece0=executeCheckoutOperations954mtemp.getExecuteCheckoutOperationsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AuthorizationResponseType typeauthorizationResponse959 = tebece0.getAuthorizationResponse();
        if(typeauthorizationResponse959!= null){
        String tempauthorizationResponse959 = typeauthorizationResponse959.toString();
        %>
        <%=tempauthorizationResponse959%>
        <%
        }}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">setDataResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">token:</TD>
<TD>
<%
if(executeCheckoutOperations954mtemp != null){
eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsResponseDetailsType tebece0=executeCheckoutOperations954mtemp.getExecuteCheckoutOperationsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.SetDataResponseType tebece1=tebece0.getSetDataResponse();
if(tebece1 != null){
java.lang.String typetoken963 = tebece1.getToken();
        String tempResulttoken963 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken963));
        %>
        <%= tempResulttoken963 %>
        <%
}}}%>
</TD>
</TABLE>
<%
}
break;
case 999:
        gotMethod = true;
        String token_253id=  request.getParameter("token1156");
            java.lang.String token_253idTemp = null;
        if(!token_253id.equals("")){
         token_253idTemp  = token_253id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetExpressCheckoutDetailsRequestType_252id" scope="session" class="PayPalAPI.api.ebay.GetExpressCheckoutDetailsRequestType" />
        <%
        PayPalAPI1api1ebay1GetExpressCheckoutDetailsRequestType_252id.setToken(token_253idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetExpressCheckoutDetailsReq_251id" scope="session" class="PayPalAPI.api.ebay.GetExpressCheckoutDetailsReq" />
        <%
        PayPalAPI1api1ebay1GetExpressCheckoutDetailsReq_251id.setGetExpressCheckoutDetailsRequest(PayPalAPI1api1ebay1GetExpressCheckoutDetailsRequestType_252id);
        PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails999mtemp = samplePayPalAPIAAInterfaceProxyid.getExpressCheckoutDetails(PayPalAPI1api1ebay1GetExpressCheckoutDetailsReq_251id);
if(getExpressCheckoutDetails999mtemp == null){
%>
<%=getExpressCheckoutDetails999mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">getExpressCheckoutDetailsResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">custom:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typecustom1004 = tebece0.getCustom();
        String tempResultcustom1004 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecustom1004));
        %>
        <%= tempResultcustom1004 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">note:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typenote1006 = tebece0.getNote();
        String tempResultnote1006 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenote1006));
        %>
        <%= tempResultnote1006 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">refreshTokenStatusDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">refreshToken:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType tebece1=tebece0.getRefreshTokenStatusDetails();
if(tebece1 != null){
java.lang.String typerefreshToken1010 = tebece1.getRefreshToken();
        String tempResultrefreshToken1010 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerefreshToken1010));
        %>
        <%= tempResultrefreshToken1010 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">immutableID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType tebece1=tebece0.getRefreshTokenStatusDetails();
if(tebece1 != null){
java.lang.String typeimmutableID1012 = tebece1.getImmutableID();
        String tempResultimmutableID1012 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimmutableID1012));
        %>
        <%= tempResultimmutableID1012 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">refreshTokenStatus:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType tebece1=tebece0.getRefreshTokenStatusDetails();
if(tebece1 != null){
java.math.BigInteger typerefreshTokenStatus1014 = tebece1.getRefreshTokenStatus();
        String tempResultrefreshTokenStatus1014 = org.eclipse.jst.ws.util.JspUtils.markup(typerefreshTokenStatus1014.toString());
        %>
        <%= tempResultrefreshTokenStatus1014 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">billingAddress:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">countryName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typecountryName1018 = tebece1.getCountryName();
        String tempResultcountryName1018 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountryName1018));
        %>
        <%= tempResultcountryName1018 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">internationalStreet:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeinternationalStreet1020 = tebece1.getInternationalStreet();
        String tempResultinternationalStreet1020 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStreet1020));
        %>
        <%= tempResultinternationalStreet1020 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">externalAddressID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeexternalAddressID1022 = tebece1.getExternalAddressID();
        String tempResultexternalAddressID1022 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalAddressID1022));
        %>
        <%= tempResultexternalAddressID1022 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">stateOrProvince:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typestateOrProvince1024 = tebece1.getStateOrProvince();
        String tempResultstateOrProvince1024 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestateOrProvince1024));
        %>
        <%= tempResultstateOrProvince1024 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">internationalName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeinternationalName1026 = tebece1.getInternationalName();
        String tempResultinternationalName1026 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalName1026));
        %>
        <%= tempResultinternationalName1026 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">cityName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typecityName1028 = tebece1.getCityName();
        String tempResultcityName1028 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecityName1028));
        %>
        <%= tempResultcityName1028 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typephone1030 = tebece1.getPhone();
        String tempResultphone1030 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone1030));
        %>
        <%= tempResultphone1030 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">postalCode:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typepostalCode1032 = tebece1.getPostalCode();
        String tempResultpostalCode1032 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepostalCode1032));
        %>
        <%= tempResultpostalCode1032 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">street2:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typestreet21034 = tebece1.getStreet2();
        String tempResultstreet21034 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet21034));
        %>
        <%= tempResultstreet21034 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">street1:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typestreet11036 = tebece1.getStreet1();
        String tempResultstreet11036 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet11036));
        %>
        <%= tempResultstreet11036 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">addressID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeaddressID1038 = tebece1.getAddressID();
        String tempResultaddressID1038 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressID1038));
        %>
        <%= tempResultaddressID1038 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">internationalStateAndCity:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeinternationalStateAndCity1040 = tebece1.getInternationalStateAndCity();
        String tempResultinternationalStateAndCity1040 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStateAndCity1040));
        %>
        <%= tempResultinternationalStateAndCity1040 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typename1042 = tebece1.getName();
        String tempResultname1042 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename1042));
        %>
        <%= tempResultname1042 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">giftMessage:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typegiftMessage1044 = tebece0.getGiftMessage();
        String tempResultgiftMessage1044 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegiftMessage1044));
        %>
        <%= tempResultgiftMessage1044 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">token:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typetoken1046 = tebece0.getToken();
        String tempResulttoken1046 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken1046));
        %>
        <%= tempResulttoken1046 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">redirectRequired:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typeredirectRequired1048 = tebece0.getRedirectRequired();
        String tempResultredirectRequired1048 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeredirectRequired1048));
        %>
        <%= tempResultredirectRequired1048 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">billingAgreementAcceptedStatus:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.Boolean typebillingAgreementAcceptedStatus1050 = tebece0.getBillingAgreementAcceptedStatus();
        String tempResultbillingAgreementAcceptedStatus1050 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebillingAgreementAcceptedStatus1050));
        %>
        <%= tempResultbillingAgreementAcceptedStatus1050 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">externalRememberMeStatusDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">externalRememberMeID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.ExternalRememberMeStatusDetailsType tebece1=tebece0.getExternalRememberMeStatusDetails();
if(tebece1 != null){
java.lang.String typeexternalRememberMeID1054 = tebece1.getExternalRememberMeID();
        String tempResultexternalRememberMeID1054 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalRememberMeID1054));
        %>
        <%= tempResultexternalRememberMeID1054 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">externalRememberMeStatus:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.ExternalRememberMeStatusDetailsType tebece1=tebece0.getExternalRememberMeStatusDetails();
if(tebece1 != null){
java.math.BigInteger typeexternalRememberMeStatus1056 = tebece1.getExternalRememberMeStatus();
        String tempResultexternalRememberMeStatus1056 = org.eclipse.jst.ws.util.JspUtils.markup(typeexternalRememberMeStatus1056.toString());
        %>
        <%= tempResultexternalRememberMeStatus1056 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">giftWrapAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getGiftWrapAmount();
if(tebece1 != null){
java.lang.String type_value1060 = tebece1.get_value();
        String tempResult_value1060 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1060));
        %>
        <%= tempResult_value1060 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userSelectedOptions:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingCalculationMode:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeshippingCalculationMode1064 = tebece1.getShippingCalculationMode();
        String tempResultshippingCalculationMode1064 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingCalculationMode1064));
        %>
        <%= tempResultshippingCalculationMode1064 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingOptionAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getShippingOptionAmount();
if(tebece2 != null){
java.lang.String type_value1068 = tebece2.get_value();
        String tempResult_value1068 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1068));
        %>
        <%= tempResult_value1068 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingOptionIsDefault:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeshippingOptionIsDefault1070 = tebece1.getShippingOptionIsDefault();
        String tempResultshippingOptionIsDefault1070 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingOptionIsDefault1070));
        %>
        <%= tempResultshippingOptionIsDefault1070 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">insuranceOptionSelected:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeinsuranceOptionSelected1072 = tebece1.getInsuranceOptionSelected();
        String tempResultinsuranceOptionSelected1072 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinsuranceOptionSelected1072));
        %>
        <%= tempResultinsuranceOptionSelected1072 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingOptionName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.UserSelectedOptionType tebece1=tebece0.getUserSelectedOptions();
if(tebece1 != null){
java.lang.String typeshippingOptionName1074 = tebece1.getShippingOptionName();
        String tempResultshippingOptionName1074 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingOptionName1074));
        %>
        <%= tempResultshippingOptionName1074 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">surveyQuestion:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typesurveyQuestion1076 = tebece0.getSurveyQuestion();
        String tempResultsurveyQuestion1076 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesurveyQuestion1076));
        %>
        <%= tempResultsurveyQuestion1076 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">payPalAdjustment:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getPayPalAdjustment();
if(tebece1 != null){
java.lang.String type_value1080 = tebece1.get_value();
        String tempResult_value1080 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1080));
        %>
        <%= tempResult_value1080 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">giftWrapName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typegiftWrapName1082 = tebece0.getGiftWrapName();
        String tempResultgiftWrapName1082 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegiftWrapName1082));
        %>
        <%= tempResultgiftWrapName1082 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">invoiceID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typeinvoiceID1084 = tebece0.getInvoiceID();
        String tempResultinvoiceID1084 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinvoiceID1084));
        %>
        <%= tempResultinvoiceID1084 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">payerInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payerID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typepayerID1088 = tebece1.getPayerID();
        String tempResultpayerID1088 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerID1088));
        %>
        <%= tempResultpayerID1088 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">taxIdDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">taxId:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.TaxIdDetailsType tebece2=tebece1.getTaxIdDetails();
if(tebece2 != null){
java.lang.String typetaxId1092 = tebece2.getTaxId();
        String tempResulttaxId1092 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetaxId1092));
        %>
        <%= tempResulttaxId1092 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">taxIdType:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.TaxIdDetailsType tebece2=tebece1.getTaxIdDetails();
if(tebece2 != null){
java.lang.String typetaxIdType1094 = tebece2.getTaxIdType();
        String tempResulttaxIdType1094 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetaxIdType1094));
        %>
        <%= tempResulttaxIdType1094 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payerName:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typelastName1098 = tebece2.getLastName();
        String tempResultlastName1098 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName1098));
        %>
        <%= tempResultlastName1098 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">middleName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typemiddleName1100 = tebece2.getMiddleName();
        String tempResultmiddleName1100 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemiddleName1100));
        %>
        <%= tempResultmiddleName1100 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typefirstName1102 = tebece2.getFirstName();
        String tempResultfirstName1102 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName1102));
        %>
        <%= tempResultfirstName1102 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">suffix:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typesuffix1104 = tebece2.getSuffix();
        String tempResultsuffix1104 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesuffix1104));
        %>
        <%= tempResultsuffix1104 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">salutation:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typesalutation1106 = tebece2.getSalutation();
        String tempResultsalutation1106 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesalutation1106));
        %>
        <%= tempResultsalutation1106 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payer:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typepayer1108 = tebece1.getPayer();
        String tempResultpayer1108 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayer1108));
        %>
        <%= tempResultpayer1108 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">enhancedPayerInfo:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType typeenhancedPayerInfo1110 = tebece1.getEnhancedPayerInfo();
        if(typeenhancedPayerInfo1110!= null){
        String tempenhancedPayerInfo1110 = typeenhancedPayerInfo1110.toString();
        %>
        <%=tempenhancedPayerInfo1110%>
        <%
        }}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">contactPhone:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typecontactPhone1112 = tebece1.getContactPhone();
        String tempResultcontactPhone1112 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecontactPhone1112));
        %>
        <%= tempResultcontactPhone1112 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payerBusiness:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typepayerBusiness1114 = tebece1.getPayerBusiness();
        String tempResultpayerBusiness1114 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerBusiness1114));
        %>
        <%= tempResultpayerBusiness1114 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">address:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">countryName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typecountryName1118 = tebece2.getCountryName();
        String tempResultcountryName1118 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountryName1118));
        %>
        <%= tempResultcountryName1118 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalStreet:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeinternationalStreet1120 = tebece2.getInternationalStreet();
        String tempResultinternationalStreet1120 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStreet1120));
        %>
        <%= tempResultinternationalStreet1120 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">externalAddressID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeexternalAddressID1122 = tebece2.getExternalAddressID();
        String tempResultexternalAddressID1122 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalAddressID1122));
        %>
        <%= tempResultexternalAddressID1122 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">stateOrProvince:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typestateOrProvince1124 = tebece2.getStateOrProvince();
        String tempResultstateOrProvince1124 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestateOrProvince1124));
        %>
        <%= tempResultstateOrProvince1124 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeinternationalName1126 = tebece2.getInternationalName();
        String tempResultinternationalName1126 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalName1126));
        %>
        <%= tempResultinternationalName1126 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">cityName:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typecityName1128 = tebece2.getCityName();
        String tempResultcityName1128 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecityName1128));
        %>
        <%= tempResultcityName1128 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typephone1130 = tebece2.getPhone();
        String tempResultphone1130 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone1130));
        %>
        <%= tempResultphone1130 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">postalCode:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typepostalCode1132 = tebece2.getPostalCode();
        String tempResultpostalCode1132 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepostalCode1132));
        %>
        <%= tempResultpostalCode1132 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">street2:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typestreet21134 = tebece2.getStreet2();
        String tempResultstreet21134 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet21134));
        %>
        <%= tempResultstreet21134 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">street1:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typestreet11136 = tebece2.getStreet1();
        String tempResultstreet11136 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet11136));
        %>
        <%= tempResultstreet11136 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">addressID:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeaddressID1138 = tebece2.getAddressID();
        String tempResultaddressID1138 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressID1138));
        %>
        <%= tempResultaddressID1138 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalStateAndCity:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeinternationalStateAndCity1140 = tebece2.getInternationalStateAndCity();
        String tempResultinternationalStateAndCity1140 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStateAndCity1140));
        %>
        <%= tempResultinternationalStateAndCity1140 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typename1142 = tebece2.getName();
        String tempResultname1142 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename1142));
        %>
        <%= tempResultname1142 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">checkoutStatus:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typecheckoutStatus1144 = tebece0.getCheckoutStatus();
        String tempResultcheckoutStatus1144 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecheckoutStatus1144));
        %>
        <%= tempResultcheckoutStatus1144 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">buyerMarketingEmail:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typebuyerMarketingEmail1146 = tebece0.getBuyerMarketingEmail();
        String tempResultbuyerMarketingEmail1146 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebuyerMarketingEmail1146));
        %>
        <%= tempResultbuyerMarketingEmail1146 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">giftReceiptEnable:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typegiftReceiptEnable1148 = tebece0.getGiftReceiptEnable();
        String tempResultgiftReceiptEnable1148 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegiftReceiptEnable1148));
        %>
        <%= tempResultgiftReceiptEnable1148 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">contactPhone:</TD>
<TD>
<%
if(getExpressCheckoutDetails999mtemp != null){
eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType tebece0=getExpressCheckoutDetails999mtemp.getGetExpressCheckoutDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typecontactPhone1150 = tebece0.getContactPhone();
        String tempResultcontactPhone1150 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecontactPhone1150));
        %>
        <%= tempResultcontactPhone1150 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 1158:
        gotMethod = true;
        String merchantSessionId_257id=  request.getParameter("merchantSessionId1195");
            java.lang.String merchantSessionId_257idTemp = null;
        if(!merchantSessionId_257id.equals("")){
         merchantSessionId_257idTemp  = merchantSessionId_257id;
        }
        String authStatus3Ds_260id=  request.getParameter("authStatus3Ds1201");
            java.lang.String authStatus3Ds_260idTemp = null;
        if(!authStatus3Ds_260id.equals("")){
         authStatus3Ds_260idTemp  = authStatus3Ds_260id;
        }
        String xid_261id=  request.getParameter("xid1203");
            java.lang.String xid_261idTemp = null;
        if(!xid_261id.equals("")){
         xid_261idTemp  = xid_261id;
        }
        String cavv_262id=  request.getParameter("cavv1205");
            java.lang.String cavv_262idTemp = null;
        if(!cavv_262id.equals("")){
         cavv_262idTemp  = cavv_262id;
        }
        String eci3Ds_263id=  request.getParameter("eci3Ds1207");
            java.lang.String eci3Ds_263idTemp = null;
        if(!eci3Ds_263id.equals("")){
         eci3Ds_263idTemp  = eci3Ds_263id;
        }
        String mpiVendor3Ds_264id=  request.getParameter("mpiVendor3Ds1209");
            java.lang.String mpiVendor3Ds_264idTemp = null;
        if(!mpiVendor3Ds_264id.equals("")){
         mpiVendor3Ds_264idTemp  = mpiVendor3Ds_264id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_259id" scope="session" class="eBLBaseComponents.apis.ebay.ThreeDSecureRequestType" />
        <%
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_259id.setAuthStatus3Ds(authStatus3Ds_260idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_259id.setXid(xid_261idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_259id.setCavv(cavv_262idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_259id.setEci3Ds(eci3Ds_263idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_259id.setMpiVendor3Ds(mpiVendor3Ds_264idTemp);
        String startYear_265id=  request.getParameter("startYear1211");
            java.lang.Integer startYear_265idTemp = null;
        if(!startYear_265id.equals("")){
         startYear_265idTemp  = java.lang.Integer.valueOf(startYear_265id);
        }
        String payerID_267id=  request.getParameter("payerID1215");
            java.lang.String payerID_267idTemp = null;
        if(!payerID_267id.equals("")){
         payerID_267idTemp  = payerID_267id;
        }
        String taxId_269id=  request.getParameter("taxId1219");
            java.lang.String taxId_269idTemp = null;
        if(!taxId_269id.equals("")){
         taxId_269idTemp  = taxId_269id;
        }
        String taxIdType_270id=  request.getParameter("taxIdType1221");
            java.lang.String taxIdType_270idTemp = null;
        if(!taxIdType_270id.equals("")){
         taxIdType_270idTemp  = taxIdType_270id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1TaxIdDetailsType_268id" scope="session" class="eBLBaseComponents.apis.ebay.TaxIdDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_268id.setTaxId(taxId_269idTemp);
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_268id.setTaxIdType(taxIdType_270idTemp);
        String lastName_272id=  request.getParameter("lastName1225");
            java.lang.String lastName_272idTemp = null;
        if(!lastName_272id.equals("")){
         lastName_272idTemp  = lastName_272id;
        }
        String middleName_273id=  request.getParameter("middleName1227");
            java.lang.String middleName_273idTemp = null;
        if(!middleName_273id.equals("")){
         middleName_273idTemp  = middleName_273id;
        }
        String firstName_274id=  request.getParameter("firstName1229");
            java.lang.String firstName_274idTemp = null;
        if(!firstName_274id.equals("")){
         firstName_274idTemp  = firstName_274id;
        }
        String suffix_275id=  request.getParameter("suffix1231");
            java.lang.String suffix_275idTemp = null;
        if(!suffix_275id.equals("")){
         suffix_275idTemp  = suffix_275id;
        }
        String salutation_276id=  request.getParameter("salutation1233");
            java.lang.String salutation_276idTemp = null;
        if(!salutation_276id.equals("")){
         salutation_276idTemp  = salutation_276id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PersonNameType_271id" scope="session" class="eBLBaseComponents.apis.ebay.PersonNameType" />
        <%
        eBLBaseComponents1apis1ebay1PersonNameType_271id.setLastName(lastName_272idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_271id.setMiddleName(middleName_273idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_271id.setFirstName(firstName_274idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_271id.setSuffix(suffix_275idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_271id.setSalutation(salutation_276idTemp);
        String payer_277id=  request.getParameter("payer1235");
            java.lang.String payer_277idTemp = null;
        if(!payer_277id.equals("")){
         payer_277idTemp  = payer_277id;
        }
        %>
        <jsp:useBean id="EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_278id" scope="session" class="EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType" />
        <%
        String contactPhone_279id=  request.getParameter("contactPhone1239");
            java.lang.String contactPhone_279idTemp = null;
        if(!contactPhone_279id.equals("")){
         contactPhone_279idTemp  = contactPhone_279id;
        }
        String payerBusiness_280id=  request.getParameter("payerBusiness1241");
            java.lang.String payerBusiness_280idTemp = null;
        if(!payerBusiness_280id.equals("")){
         payerBusiness_280idTemp  = payerBusiness_280id;
        }
        String countryName_282id=  request.getParameter("countryName1245");
            java.lang.String countryName_282idTemp = null;
        if(!countryName_282id.equals("")){
         countryName_282idTemp  = countryName_282id;
        }
        String internationalStreet_283id=  request.getParameter("internationalStreet1247");
            java.lang.String internationalStreet_283idTemp = null;
        if(!internationalStreet_283id.equals("")){
         internationalStreet_283idTemp  = internationalStreet_283id;
        }
        String externalAddressID_284id=  request.getParameter("externalAddressID1249");
            java.lang.String externalAddressID_284idTemp = null;
        if(!externalAddressID_284id.equals("")){
         externalAddressID_284idTemp  = externalAddressID_284id;
        }
        String stateOrProvince_285id=  request.getParameter("stateOrProvince1251");
            java.lang.String stateOrProvince_285idTemp = null;
        if(!stateOrProvince_285id.equals("")){
         stateOrProvince_285idTemp  = stateOrProvince_285id;
        }
        String internationalName_286id=  request.getParameter("internationalName1253");
            java.lang.String internationalName_286idTemp = null;
        if(!internationalName_286id.equals("")){
         internationalName_286idTemp  = internationalName_286id;
        }
        String cityName_287id=  request.getParameter("cityName1255");
            java.lang.String cityName_287idTemp = null;
        if(!cityName_287id.equals("")){
         cityName_287idTemp  = cityName_287id;
        }
        String phone_288id=  request.getParameter("phone1257");
            java.lang.String phone_288idTemp = null;
        if(!phone_288id.equals("")){
         phone_288idTemp  = phone_288id;
        }
        String postalCode_289id=  request.getParameter("postalCode1259");
            java.lang.String postalCode_289idTemp = null;
        if(!postalCode_289id.equals("")){
         postalCode_289idTemp  = postalCode_289id;
        }
        String street2_290id=  request.getParameter("street21261");
            java.lang.String street2_290idTemp = null;
        if(!street2_290id.equals("")){
         street2_290idTemp  = street2_290id;
        }
        String street1_291id=  request.getParameter("street11263");
            java.lang.String street1_291idTemp = null;
        if(!street1_291id.equals("")){
         street1_291idTemp  = street1_291id;
        }
        String addressID_292id=  request.getParameter("addressID1265");
            java.lang.String addressID_292idTemp = null;
        if(!addressID_292id.equals("")){
         addressID_292idTemp  = addressID_292id;
        }
        String internationalStateAndCity_293id=  request.getParameter("internationalStateAndCity1267");
            java.lang.String internationalStateAndCity_293idTemp = null;
        if(!internationalStateAndCity_293id.equals("")){
         internationalStateAndCity_293idTemp  = internationalStateAndCity_293id;
        }
        String name_294id=  request.getParameter("name1269");
            java.lang.String name_294idTemp = null;
        if(!name_294id.equals("")){
         name_294idTemp  = name_294id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_281id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_281id.setCountryName(countryName_282idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setInternationalStreet(internationalStreet_283idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setExternalAddressID(externalAddressID_284idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setStateOrProvince(stateOrProvince_285idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setInternationalName(internationalName_286idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setCityName(cityName_287idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setPhone(phone_288idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setPostalCode(postalCode_289idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setStreet2(street2_290idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setStreet1(street1_291idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setAddressID(addressID_292idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setInternationalStateAndCity(internationalStateAndCity_293idTemp);
        eBLBaseComponents1apis1ebay1AddressType_281id.setName(name_294idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PayerInfoType_266id" scope="session" class="eBLBaseComponents.apis.ebay.PayerInfoType" />
        <%
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setPayerID(payerID_267idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setTaxIdDetails(eBLBaseComponents1apis1ebay1TaxIdDetailsType_268id);
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setPayerName(eBLBaseComponents1apis1ebay1PersonNameType_271id);
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setPayer(payer_277idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setEnhancedPayerInfo(EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_278id);
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setContactPhone(contactPhone_279idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setPayerBusiness(payerBusiness_280idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_266id.setAddress(eBLBaseComponents1apis1ebay1AddressType_281id);
        String issueNumber_295id=  request.getParameter("issueNumber1271");
            java.lang.String issueNumber_295idTemp = null;
        if(!issueNumber_295id.equals("")){
         issueNumber_295idTemp  = issueNumber_295id;
        }
        String cVV2_296id=  request.getParameter("cVV21273");
            java.lang.String cVV2_296idTemp = null;
        if(!cVV2_296id.equals("")){
         cVV2_296idTemp  = cVV2_296id;
        }
        String expMonth_297id=  request.getParameter("expMonth1275");
            java.lang.Integer expMonth_297idTemp = null;
        if(!expMonth_297id.equals("")){
         expMonth_297idTemp  = java.lang.Integer.valueOf(expMonth_297id);
        }
        String startMonth_298id=  request.getParameter("startMonth1277");
            java.lang.Integer startMonth_298idTemp = null;
        if(!startMonth_298id.equals("")){
         startMonth_298idTemp  = java.lang.Integer.valueOf(startMonth_298id);
        }
        String creditCardNumber_299id=  request.getParameter("creditCardNumber1279");
            java.lang.String creditCardNumber_299idTemp = null;
        if(!creditCardNumber_299id.equals("")){
         creditCardNumber_299idTemp  = creditCardNumber_299id;
        }
        String expYear_300id=  request.getParameter("expYear1281");
            java.lang.Integer expYear_300idTemp = null;
        if(!expYear_300id.equals("")){
         expYear_300idTemp  = java.lang.Integer.valueOf(expYear_300id);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id" scope="session" class="eBLBaseComponents.apis.ebay.CreditCardDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setThreeDSecureRequest(eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_259id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setStartYear(startYear_265idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setCardOwner(eBLBaseComponents1apis1ebay1PayerInfoType_266id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setIssueNumber(issueNumber_295idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setCVV2(cVV2_296idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setExpMonth(expMonth_297idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setStartMonth(startMonth_298idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setCreditCardNumber(creditCardNumber_299idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id.setExpYear(expYear_300idTemp);
        String returnFMFDetails_301id=  request.getParameter("returnFMFDetails1283");
            java.lang.Boolean returnFMFDetails_301idTemp = null;
        if(!returnFMFDetails_301id.equals("")){
         returnFMFDetails_301idTemp  = java.lang.Boolean.valueOf(returnFMFDetails_301id);
        }
        String iPAddress_302id=  request.getParameter("iPAddress1285");
            java.lang.String iPAddress_302idTemp = null;
        if(!iPAddress_302id.equals("")){
         iPAddress_302idTemp  = iPAddress_302id;
        }
        String custom_304id=  request.getParameter("custom1289");
            java.lang.String custom_304idTemp = null;
        if(!custom_304id.equals("")){
         custom_304idTemp  = custom_304id;
        }
        String softDescriptor_305id=  request.getParameter("softDescriptor1291");
            java.lang.String softDescriptor_305idTemp = null;
        if(!softDescriptor_305id.equals("")){
         softDescriptor_305idTemp  = softDescriptor_305id;
        }
        String profileAddressChangeDate_306id=  request.getParameter("profileAddressChangeDate1293");
            java.util.Calendar profileAddressChangeDate_306idTemp = null;
        if(!profileAddressChangeDate_306id.equals("")){
        java.text.DateFormat dateFormatprofileAddressChangeDate1293 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempprofileAddressChangeDate1293  = dateFormatprofileAddressChangeDate1293.parse(profileAddressChangeDate_306id);
         profileAddressChangeDate_306idTemp = new java.util.GregorianCalendar();
        profileAddressChangeDate_306idTemp.setTime(dateTempprofileAddressChangeDate1293);
        }
        String orderDescription_307id=  request.getParameter("orderDescription1295");
            java.lang.String orderDescription_307idTemp = null;
        if(!orderDescription_307id.equals("")){
         orderDescription_307idTemp  = orderDescription_307id;
        }
        String insuranceOptionOffered_308id=  request.getParameter("insuranceOptionOffered1297");
            java.lang.String insuranceOptionOffered_308idTemp = null;
        if(!insuranceOptionOffered_308id.equals("")){
         insuranceOptionOffered_308idTemp  = insuranceOptionOffered_308id;
        }
        String branchLevel_309id=  request.getParameter("branchLevel1299");
            java.math.BigInteger branchLevel_309idTemp = null;
        if(!branchLevel_309id.equals("")){
         branchLevel_309idTemp  = new java.math.BigInteger(branchLevel_309id);
        }
        String _value_311id=  request.getParameter("_value1303");
            java.lang.String _value_311idTemp = null;
        if(!_value_311id.equals("")){
         _value_311idTemp  = _value_311id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_310id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_310id.set_value(_value_311idTemp);
        String _value_313id=  request.getParameter("_value1307");
            java.lang.String _value_313idTemp = null;
        if(!_value_313id.equals("")){
         _value_313idTemp  = _value_313id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_312id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_312id.set_value(_value_313idTemp);
        String countryName_315id=  request.getParameter("countryName1311");
            java.lang.String countryName_315idTemp = null;
        if(!countryName_315id.equals("")){
         countryName_315idTemp  = countryName_315id;
        }
        String internationalStreet_316id=  request.getParameter("internationalStreet1313");
            java.lang.String internationalStreet_316idTemp = null;
        if(!internationalStreet_316id.equals("")){
         internationalStreet_316idTemp  = internationalStreet_316id;
        }
        String externalAddressID_317id=  request.getParameter("externalAddressID1315");
            java.lang.String externalAddressID_317idTemp = null;
        if(!externalAddressID_317id.equals("")){
         externalAddressID_317idTemp  = externalAddressID_317id;
        }
        String stateOrProvince_318id=  request.getParameter("stateOrProvince1317");
            java.lang.String stateOrProvince_318idTemp = null;
        if(!stateOrProvince_318id.equals("")){
         stateOrProvince_318idTemp  = stateOrProvince_318id;
        }
        String internationalName_319id=  request.getParameter("internationalName1319");
            java.lang.String internationalName_319idTemp = null;
        if(!internationalName_319id.equals("")){
         internationalName_319idTemp  = internationalName_319id;
        }
        String cityName_320id=  request.getParameter("cityName1321");
            java.lang.String cityName_320idTemp = null;
        if(!cityName_320id.equals("")){
         cityName_320idTemp  = cityName_320id;
        }
        String phone_321id=  request.getParameter("phone1323");
            java.lang.String phone_321idTemp = null;
        if(!phone_321id.equals("")){
         phone_321idTemp  = phone_321id;
        }
        String postalCode_322id=  request.getParameter("postalCode1325");
            java.lang.String postalCode_322idTemp = null;
        if(!postalCode_322id.equals("")){
         postalCode_322idTemp  = postalCode_322id;
        }
        String street2_323id=  request.getParameter("street21327");
            java.lang.String street2_323idTemp = null;
        if(!street2_323id.equals("")){
         street2_323idTemp  = street2_323id;
        }
        String street1_324id=  request.getParameter("street11329");
            java.lang.String street1_324idTemp = null;
        if(!street1_324id.equals("")){
         street1_324idTemp  = street1_324id;
        }
        String addressID_325id=  request.getParameter("addressID1331");
            java.lang.String addressID_325idTemp = null;
        if(!addressID_325id.equals("")){
         addressID_325idTemp  = addressID_325id;
        }
        String internationalStateAndCity_326id=  request.getParameter("internationalStateAndCity1333");
            java.lang.String internationalStateAndCity_326idTemp = null;
        if(!internationalStateAndCity_326id.equals("")){
         internationalStateAndCity_326idTemp  = internationalStateAndCity_326id;
        }
        String name_327id=  request.getParameter("name1335");
            java.lang.String name_327idTemp = null;
        if(!name_327id.equals("")){
         name_327idTemp  = name_327id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_314id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_314id.setCountryName(countryName_315idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setInternationalStreet(internationalStreet_316idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setExternalAddressID(externalAddressID_317idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setStateOrProvince(stateOrProvince_318idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setInternationalName(internationalName_319idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setCityName(cityName_320idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setPhone(phone_321idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setPostalCode(postalCode_322idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setStreet2(street2_323idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setStreet1(street1_324idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setAddressID(addressID_325idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setInternationalStateAndCity(internationalStateAndCity_326idTemp);
        eBLBaseComponents1apis1ebay1AddressType_314id.setName(name_327idTemp);
        String _value_329id=  request.getParameter("_value1339");
            java.lang.String _value_329idTemp = null;
        if(!_value_329id.equals("")){
         _value_329idTemp  = _value_329id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_328id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_328id.set_value(_value_329idTemp);
        String buttonSource_330id=  request.getParameter("buttonSource1341");
            java.lang.String buttonSource_330idTemp = null;
        if(!buttonSource_330id.equals("")){
         buttonSource_330idTemp  = buttonSource_330id;
        }
        String paymentRequestID_331id=  request.getParameter("paymentRequestID1343");
            java.lang.String paymentRequestID_331idTemp = null;
        if(!paymentRequestID_331id.equals("")){
         paymentRequestID_331idTemp  = paymentRequestID_331id;
        }
        String _value_333id=  request.getParameter("_value1347");
            java.lang.String _value_333idTemp = null;
        if(!_value_333id.equals("")){
         _value_333idTemp  = _value_333id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_332id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_332id.set_value(_value_333idTemp);
        String _value_335id=  request.getParameter("_value1351");
            java.lang.String _value_335idTemp = null;
        if(!_value_335id.equals("")){
         _value_335idTemp  = _value_335id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_334id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_334id.set_value(_value_335idTemp);
        String sellerUserName_337id=  request.getParameter("sellerUserName1355");
            java.lang.String sellerUserName_337idTemp = null;
        if(!sellerUserName_337id.equals("")){
         sellerUserName_337idTemp  = sellerUserName_337id;
        }
        String secureMerchantAccountID_338id=  request.getParameter("secureMerchantAccountID1357");
            java.lang.String secureMerchantAccountID_338idTemp = null;
        if(!secureMerchantAccountID_338id.equals("")){
         secureMerchantAccountID_338idTemp  = secureMerchantAccountID_338id;
        }
        String payPalAccountID_339id=  request.getParameter("payPalAccountID1359");
            java.lang.String payPalAccountID_339idTemp = null;
        if(!payPalAccountID_339id.equals("")){
         payPalAccountID_339idTemp  = payPalAccountID_339id;
        }
        String sellerId_340id=  request.getParameter("sellerId1361");
            java.lang.String sellerId_340idTemp = null;
        if(!sellerId_340id.equals("")){
         sellerId_340idTemp  = sellerId_340id;
        }
        String sellerRegistrationDate_341id=  request.getParameter("sellerRegistrationDate1363");
            java.util.Calendar sellerRegistrationDate_341idTemp = null;
        if(!sellerRegistrationDate_341id.equals("")){
        java.text.DateFormat dateFormatsellerRegistrationDate1363 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempsellerRegistrationDate1363  = dateFormatsellerRegistrationDate1363.parse(sellerRegistrationDate_341id);
         sellerRegistrationDate_341idTemp = new java.util.GregorianCalendar();
        sellerRegistrationDate_341idTemp.setTime(dateTempsellerRegistrationDate1363);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SellerDetailsType_336id" scope="session" class="eBLBaseComponents.apis.ebay.SellerDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1SellerDetailsType_336id.setSellerUserName(sellerUserName_337idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_336id.setSecureMerchantAccountID(secureMerchantAccountID_338idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_336id.setPayPalAccountID(payPalAccountID_339idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_336id.setSellerId(sellerId_340idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_336id.setSellerRegistrationDate(sellerRegistrationDate_341idTemp);
        String fulfillmentReferenceNumber_342id=  request.getParameter("fulfillmentReferenceNumber1365");
            java.lang.String fulfillmentReferenceNumber_342idTemp = null;
        if(!fulfillmentReferenceNumber_342id.equals("")){
         fulfillmentReferenceNumber_342idTemp  = fulfillmentReferenceNumber_342id;
        }
        String countryName_344id=  request.getParameter("countryName1369");
            java.lang.String countryName_344idTemp = null;
        if(!countryName_344id.equals("")){
         countryName_344idTemp  = countryName_344id;
        }
        String internationalStreet_345id=  request.getParameter("internationalStreet1371");
            java.lang.String internationalStreet_345idTemp = null;
        if(!internationalStreet_345id.equals("")){
         internationalStreet_345idTemp  = internationalStreet_345id;
        }
        String externalAddressID_346id=  request.getParameter("externalAddressID1373");
            java.lang.String externalAddressID_346idTemp = null;
        if(!externalAddressID_346id.equals("")){
         externalAddressID_346idTemp  = externalAddressID_346id;
        }
        String stateOrProvince_347id=  request.getParameter("stateOrProvince1375");
            java.lang.String stateOrProvince_347idTemp = null;
        if(!stateOrProvince_347id.equals("")){
         stateOrProvince_347idTemp  = stateOrProvince_347id;
        }
        String internationalName_348id=  request.getParameter("internationalName1377");
            java.lang.String internationalName_348idTemp = null;
        if(!internationalName_348id.equals("")){
         internationalName_348idTemp  = internationalName_348id;
        }
        String cityName_349id=  request.getParameter("cityName1379");
            java.lang.String cityName_349idTemp = null;
        if(!cityName_349id.equals("")){
         cityName_349idTemp  = cityName_349id;
        }
        String phone_350id=  request.getParameter("phone1381");
            java.lang.String phone_350idTemp = null;
        if(!phone_350id.equals("")){
         phone_350idTemp  = phone_350id;
        }
        String postalCode_351id=  request.getParameter("postalCode1383");
            java.lang.String postalCode_351idTemp = null;
        if(!postalCode_351id.equals("")){
         postalCode_351idTemp  = postalCode_351id;
        }
        String street2_352id=  request.getParameter("street21385");
            java.lang.String street2_352idTemp = null;
        if(!street2_352id.equals("")){
         street2_352idTemp  = street2_352id;
        }
        String street1_353id=  request.getParameter("street11387");
            java.lang.String street1_353idTemp = null;
        if(!street1_353id.equals("")){
         street1_353idTemp  = street1_353id;
        }
        String addressID_354id=  request.getParameter("addressID1389");
            java.lang.String addressID_354idTemp = null;
        if(!addressID_354id.equals("")){
         addressID_354idTemp  = addressID_354id;
        }
        String internationalStateAndCity_355id=  request.getParameter("internationalStateAndCity1391");
            java.lang.String internationalStateAndCity_355idTemp = null;
        if(!internationalStateAndCity_355id.equals("")){
         internationalStateAndCity_355idTemp  = internationalStateAndCity_355id;
        }
        String name_356id=  request.getParameter("name1393");
            java.lang.String name_356idTemp = null;
        if(!name_356id.equals("")){
         name_356idTemp  = name_356id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_343id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_343id.setCountryName(countryName_344idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setInternationalStreet(internationalStreet_345idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setExternalAddressID(externalAddressID_346idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setStateOrProvince(stateOrProvince_347idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setInternationalName(internationalName_348idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setCityName(cityName_349idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setPhone(phone_350idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setPostalCode(postalCode_351idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setStreet2(street2_352idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setStreet1(street1_353idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setAddressID(addressID_354idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setInternationalStateAndCity(internationalStateAndCity_355idTemp);
        eBLBaseComponents1apis1ebay1AddressType_343id.setName(name_356idTemp);
        String noteText_357id=  request.getParameter("noteText1395");
            java.lang.String noteText_357idTemp = null;
        if(!noteText_357id.equals("")){
         noteText_357idTemp  = noteText_357id;
        }
        String _value_359id=  request.getParameter("_value1399");
            java.lang.String _value_359idTemp = null;
        if(!_value_359id.equals("")){
         _value_359idTemp  = _value_359id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_358id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_358id.set_value(_value_359idTemp);
        String invoiceID_360id=  request.getParameter("invoiceID1401");
            java.lang.String invoiceID_360idTemp = null;
        if(!invoiceID_360id.equals("")){
         invoiceID_360idTemp  = invoiceID_360id;
        }
        String _value_362id=  request.getParameter("_value1405");
            java.lang.String _value_362idTemp = null;
        if(!_value_362id.equals("")){
         _value_362idTemp  = _value_362id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_361id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_361id.set_value(_value_362idTemp);
        String offerTrackingID_365id=  request.getParameter("offerTrackingID1411");
            java.lang.String offerTrackingID_365idTemp = null;
        if(!offerTrackingID_365id.equals("")){
         offerTrackingID_365idTemp  = offerTrackingID_365id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BMLOfferInfoType_364id" scope="session" class="eBLBaseComponents.apis.ebay.BMLOfferInfoType" />
        <%
        eBLBaseComponents1apis1ebay1BMLOfferInfoType_364id.setOfferTrackingID(offerTrackingID_365idTemp);
        String offerCode_366id=  request.getParameter("offerCode1413");
            java.lang.String offerCode_366idTemp = null;
        if(!offerCode_366id.equals("")){
         offerCode_366idTemp  = offerCode_366id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1OfferDetailsType_363id" scope="session" class="eBLBaseComponents.apis.ebay.OfferDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1OfferDetailsType_363id.setBMLOfferInfo(eBLBaseComponents1apis1ebay1BMLOfferInfoType_364id);
        eBLBaseComponents1apis1ebay1OfferDetailsType_363id.setOfferCode(offerCode_366idTemp);
        String transactionId_367id=  request.getParameter("transactionId1415");
            java.lang.String transactionId_367idTemp = null;
        if(!transactionId_367id.equals("")){
         transactionId_367idTemp  = transactionId_367id;
        }
        String orderURL_368id=  request.getParameter("orderURL1417");
            java.lang.String orderURL_368idTemp = null;
        if(!orderURL_368id.equals("")){
         orderURL_368idTemp  = orderURL_368id;
        }
        %>
        <jsp:useBean id="EnhancedDataTypes1apis1ebay1EnhancedPaymentDataType_369id" scope="session" class="EnhancedDataTypes.apis.ebay.EnhancedPaymentDataType" />
        <%
        String notifyURL_370id=  request.getParameter("notifyURL1421");
            java.lang.String notifyURL_370idTemp = null;
        if(!notifyURL_370id.equals("")){
         notifyURL_370idTemp  = notifyURL_370id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PaymentDetailsType_303id" scope="session" class="eBLBaseComponents.apis.ebay.PaymentDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setCustom(custom_304idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setSoftDescriptor(softDescriptor_305idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setProfileAddressChangeDate(profileAddressChangeDate_306idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setOrderDescription(orderDescription_307idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setInsuranceOptionOffered(insuranceOptionOffered_308idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setBranchLevel(branchLevel_309idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setHandlingTotal(CoreComponentTypes1apis1ebay1BasicAmountType_310id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setShippingTotal(CoreComponentTypes1apis1ebay1BasicAmountType_312id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setShipToAddress(eBLBaseComponents1apis1ebay1AddressType_314id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setOrderTotal(CoreComponentTypes1apis1ebay1BasicAmountType_328id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setButtonSource(buttonSource_330idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setPaymentRequestID(paymentRequestID_331idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setShippingDiscount(CoreComponentTypes1apis1ebay1BasicAmountType_332id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setItemTotal(CoreComponentTypes1apis1ebay1BasicAmountType_334id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setSellerDetails(eBLBaseComponents1apis1ebay1SellerDetailsType_336id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setFulfillmentReferenceNumber(fulfillmentReferenceNumber_342idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setFulfillmentAddress(eBLBaseComponents1apis1ebay1AddressType_343id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setNoteText(noteText_357idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setTaxTotal(CoreComponentTypes1apis1ebay1BasicAmountType_358id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setInvoiceID(invoiceID_360idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setInsuranceTotal(CoreComponentTypes1apis1ebay1BasicAmountType_361id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setOfferDetails(eBLBaseComponents1apis1ebay1OfferDetailsType_363id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setTransactionId(transactionId_367idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setOrderURL(orderURL_368idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setEnhancedPaymentData(EnhancedDataTypes1apis1ebay1EnhancedPaymentDataType_369id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_303id.setNotifyURL(notifyURL_370idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1DoDirectPaymentRequestDetailsType_256id" scope="session" class="eBLBaseComponents.apis.ebay.DoDirectPaymentRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1DoDirectPaymentRequestDetailsType_256id.setMerchantSessionId(merchantSessionId_257idTemp);
        eBLBaseComponents1apis1ebay1DoDirectPaymentRequestDetailsType_256id.setCreditCard(eBLBaseComponents1apis1ebay1CreditCardDetailsType_258id);
        eBLBaseComponents1apis1ebay1DoDirectPaymentRequestDetailsType_256id.setReturnFMFDetails(returnFMFDetails_301idTemp);
        eBLBaseComponents1apis1ebay1DoDirectPaymentRequestDetailsType_256id.setIPAddress(iPAddress_302idTemp);
        eBLBaseComponents1apis1ebay1DoDirectPaymentRequestDetailsType_256id.setPaymentDetails(eBLBaseComponents1apis1ebay1PaymentDetailsType_303id);
        String returnFMFDetails_371id=  request.getParameter("returnFMFDetails1423");
            java.lang.Integer returnFMFDetails_371idTemp = null;
        if(!returnFMFDetails_371id.equals("")){
         returnFMFDetails_371idTemp  = java.lang.Integer.valueOf(returnFMFDetails_371id);
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoDirectPaymentRequestType_255id" scope="session" class="PayPalAPI.api.ebay.DoDirectPaymentRequestType" />
        <%
        PayPalAPI1api1ebay1DoDirectPaymentRequestType_255id.setDoDirectPaymentRequestDetails(eBLBaseComponents1apis1ebay1DoDirectPaymentRequestDetailsType_256id);
        PayPalAPI1api1ebay1DoDirectPaymentRequestType_255id.setReturnFMFDetails(returnFMFDetails_371idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoDirectPaymentReq_254id" scope="session" class="PayPalAPI.api.ebay.DoDirectPaymentReq" />
        <%
        PayPalAPI1api1ebay1DoDirectPaymentReq_254id.setDoDirectPaymentRequest(PayPalAPI1api1ebay1DoDirectPaymentRequestType_255id);
        PayPalAPI.api.ebay.DoDirectPaymentResponseType doDirectPayment1158mtemp = samplePayPalAPIAAInterfaceProxyid.doDirectPayment(PayPalAPI1api1ebay1DoDirectPaymentReq_254id);
if(doDirectPayment1158mtemp == null){
%>
<%=doDirectPayment1158mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
java.lang.String typetransactionID1161 = doDirectPayment1158mtemp.getTransactionID();
        String tempResulttransactionID1161 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID1161));
        %>
        <%= tempResulttransactionID1161 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">aVSCode:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
java.lang.String typeaVSCode1163 = doDirectPayment1158mtemp.getAVSCode();
        String tempResultaVSCode1163 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaVSCode1163));
        %>
        <%= tempResultaVSCode1163 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">paymentAdviceCode:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
java.lang.String typepaymentAdviceCode1165 = doDirectPayment1158mtemp.getPaymentAdviceCode();
        String tempResultpaymentAdviceCode1165 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepaymentAdviceCode1165));
        %>
        <%= tempResultpaymentAdviceCode1165 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cVV2Code:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
java.lang.String typecVV2Code1167 = doDirectPayment1158mtemp.getCVV2Code();
        String tempResultcVV2Code1167 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecVV2Code1167));
        %>
        <%= tempResultcVV2Code1167 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fMFDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">reportFilters:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doDirectPayment1158mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typereportFilters1171 = tebece0.getReportFilters();
        String tempreportFilters1171 = null;
        if(typereportFilters1171 != null){
        java.util.List listreportFilters1171= java.util.Arrays.asList(typereportFilters1171);
        tempreportFilters1171 = listreportFilters1171.toString();
        }
        %>
        <%=tempreportFilters1171%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">denyFilters:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doDirectPayment1158mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typedenyFilters1173 = tebece0.getDenyFilters();
        String tempdenyFilters1173 = null;
        if(typedenyFilters1173 != null){
        java.util.List listdenyFilters1173= java.util.Arrays.asList(typedenyFilters1173);
        tempdenyFilters1173 = listdenyFilters1173.toString();
        }
        %>
        <%=tempdenyFilters1173%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">pendingFilters:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doDirectPayment1158mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typependingFilters1175 = tebece0.getPendingFilters();
        String temppendingFilters1175 = null;
        if(typependingFilters1175 != null){
        java.util.List listpendingFilters1175= java.util.Arrays.asList(typependingFilters1175);
        temppendingFilters1175 = listpendingFilters1175.toString();
        }
        %>
        <%=temppendingFilters1175%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">acceptFilters:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doDirectPayment1158mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typeacceptFilters1177 = tebece0.getAcceptFilters();
        String tempacceptFilters1177 = null;
        if(typeacceptFilters1177 != null){
        java.util.List listacceptFilters1177= java.util.Arrays.asList(typeacceptFilters1177);
        tempacceptFilters1177 = listacceptFilters1177.toString();
        }
        %>
        <%=tempacceptFilters1177%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">amount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece0=doDirectPayment1158mtemp.getAmount();
if(tebece0 != null){
java.lang.String type_value1181 = tebece0.get_value();
        String tempResult_value1181 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1181));
        %>
        <%= tempResult_value1181 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">threeDSecureResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">vpas:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
eBLBaseComponents.apis.ebay.ThreeDSecureResponseType tebece0=doDirectPayment1158mtemp.getThreeDSecureResponse();
if(tebece0 != null){
java.lang.String typevpas1185 = tebece0.getVpas();
        String tempResultvpas1185 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevpas1185));
        %>
        <%= tempResultvpas1185 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">eciSubmitted3DS:</TD>
<TD>
<%
if(doDirectPayment1158mtemp != null){
eBLBaseComponents.apis.ebay.ThreeDSecureResponseType tebece0=doDirectPayment1158mtemp.getThreeDSecureResponse();
if(tebece0 != null){
java.lang.String typeeciSubmitted3DS1187 = tebece0.getEciSubmitted3DS();
        String tempResulteciSubmitted3DS1187 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeeciSubmitted3DS1187));
        %>
        <%= tempResulteciSubmitted3DS1187 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 1425:
        gotMethod = true;
        String transactionID_374id=  request.getParameter("transactionID1436");
            java.lang.String transactionID_374idTemp = null;
        if(!transactionID_374id.equals("")){
         transactionID_374idTemp  = transactionID_374id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ManagePendingTransactionStatusRequestType_373id" scope="session" class="PayPalAPI.api.ebay.ManagePendingTransactionStatusRequestType" />
        <%
        PayPalAPI1api1ebay1ManagePendingTransactionStatusRequestType_373id.setTransactionID(transactionID_374idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ManagePendingTransactionStatusReq_372id" scope="session" class="PayPalAPI.api.ebay.ManagePendingTransactionStatusReq" />
        <%
        PayPalAPI1api1ebay1ManagePendingTransactionStatusReq_372id.setManagePendingTransactionStatusRequest(PayPalAPI1api1ebay1ManagePendingTransactionStatusRequestType_373id);
        PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType managePendingTransactionStatus1425mtemp = samplePayPalAPIAAInterfaceProxyid.managePendingTransactionStatus(PayPalAPI1api1ebay1ManagePendingTransactionStatusReq_372id);
if(managePendingTransactionStatus1425mtemp == null){
%>
<%=managePendingTransactionStatus1425mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(managePendingTransactionStatus1425mtemp != null){
java.lang.String typestatus1428 = managePendingTransactionStatus1425mtemp.getStatus();
        String tempResultstatus1428 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus1428));
        %>
        <%= tempResultstatus1428 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(managePendingTransactionStatus1425mtemp != null){
java.lang.String typetransactionID1430 = managePendingTransactionStatus1425mtemp.getTransactionID();
        String tempResulttransactionID1430 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID1430));
        %>
        <%= tempResulttransactionID1430 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1438:
        gotMethod = true;
        String msgSubID_377id=  request.getParameter("msgSubID1447");
            java.lang.String msgSubID_377idTemp = null;
        if(!msgSubID_377id.equals("")){
         msgSubID_377idTemp  = msgSubID_377id;
        }
        String cancelMsgSubID_378id=  request.getParameter("cancelMsgSubID1449");
            java.lang.String cancelMsgSubID_378idTemp = null;
        if(!cancelMsgSubID_378id.equals("")){
         cancelMsgSubID_378idTemp  = cancelMsgSubID_378id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoCancelRequestType_376id" scope="session" class="PayPalAPI.api.ebay.DoCancelRequestType" />
        <%
        PayPalAPI1api1ebay1DoCancelRequestType_376id.setMsgSubID(msgSubID_377idTemp);
        PayPalAPI1api1ebay1DoCancelRequestType_376id.setCancelMsgSubID(cancelMsgSubID_378idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoCancelReq_375id" scope="session" class="PayPalAPI.api.ebay.DoCancelReq" />
        <%
        PayPalAPI1api1ebay1DoCancelReq_375id.setDoCancelRequest(PayPalAPI1api1ebay1DoCancelRequestType_376id);
        PayPalAPI.api.ebay.DoCancelResponseType doCancel1438mtemp = samplePayPalAPIAAInterfaceProxyid.doCancel(PayPalAPI1api1ebay1DoCancelReq_375id);
if(doCancel1438mtemp == null){
%>
<%=doCancel1438mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">msgSubID:</TD>
<TD>
<%
if(doCancel1438mtemp != null){
java.lang.String typemsgSubID1441 = doCancel1438mtemp.getMsgSubID();
        String tempResultmsgSubID1441 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemsgSubID1441));
        %>
        <%= tempResultmsgSubID1441 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1451:
        gotMethod = true;
        String descriptor_381id=  request.getParameter("descriptor1570");
            java.lang.String descriptor_381idTemp = null;
        if(!descriptor_381id.equals("")){
         descriptor_381idTemp  = descriptor_381id;
        }
        String authorizationID_382id=  request.getParameter("authorizationID1572");
            java.lang.String authorizationID_382idTemp = null;
        if(!authorizationID_382id.equals("")){
         authorizationID_382idTemp  = authorizationID_382id;
        }
        String _value_386id=  request.getParameter("_value1580");
            java.lang.String _value_386idTemp = null;
        if(!_value_386id.equals("")){
         _value_386idTemp  = _value_386id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_385id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_385id.set_value(_value_386idTemp);
        String passengerName_387id=  request.getParameter("passengerName1582");
            java.lang.String passengerName_387idTemp = null;
        if(!passengerName_387id.equals("")){
         passengerName_387idTemp  = passengerName_387id;
        }
        String travelAgencyName_388id=  request.getParameter("travelAgencyName1584");
            java.lang.String travelAgencyName_388idTemp = null;
        if(!travelAgencyName_388id.equals("")){
         travelAgencyName_388idTemp  = travelAgencyName_388id;
        }
        String travelAgencyCode_389id=  request.getParameter("travelAgencyCode1586");
            java.lang.String travelAgencyCode_389idTemp = null;
        if(!travelAgencyCode_389id.equals("")){
         travelAgencyCode_389idTemp  = travelAgencyCode_389id;
        }
        String customerCode_390id=  request.getParameter("customerCode1588");
            java.lang.String customerCode_390idTemp = null;
        if(!customerCode_390id.equals("")){
         customerCode_390idTemp  = customerCode_390id;
        }
        String _value_392id=  request.getParameter("_value1592");
            java.lang.String _value_392idTemp = null;
        if(!_value_392id.equals("")){
         _value_392idTemp  = _value_392id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_391id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_391id.set_value(_value_392idTemp);
        String ticketNumber_393id=  request.getParameter("ticketNumber1594");
            java.lang.String ticketNumber_393idTemp = null;
        if(!ticketNumber_393id.equals("")){
         ticketNumber_393idTemp  = ticketNumber_393id;
        }
        String restrictedTicket_394id=  request.getParameter("restrictedTicket1596");
            java.lang.String restrictedTicket_394idTemp = null;
        if(!restrictedTicket_394id.equals("")){
         restrictedTicket_394idTemp  = restrictedTicket_394id;
        }
        String issuingCarrierCode_395id=  request.getParameter("issuingCarrierCode1598");
            java.lang.String issuingCarrierCode_395idTemp = null;
        if(!issuingCarrierCode_395id.equals("")){
         issuingCarrierCode_395idTemp  = issuingCarrierCode_395id;
        }
        String clearingSequence_396id=  request.getParameter("clearingSequence1600");
            java.lang.String clearingSequence_396idTemp = null;
        if(!clearingSequence_396id.equals("")){
         clearingSequence_396idTemp  = clearingSequence_396id;
        }
        String clearingCount_397id=  request.getParameter("clearingCount1602");
            java.lang.String clearingCount_397idTemp = null;
        if(!clearingCount_397id.equals("")){
         clearingCount_397idTemp  = clearingCount_397id;
        }
        String _value_399id=  request.getParameter("_value1606");
            java.lang.String _value_399idTemp = null;
        if(!_value_399id.equals("")){
         _value_399idTemp  = _value_399id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_398id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_398id.set_value(_value_399idTemp);
        String issueDate_400id=  request.getParameter("issueDate1608");
            java.lang.String issueDate_400idTemp = null;
        if(!issueDate_400id.equals("")){
         issueDate_400idTemp  = issueDate_400id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AirlineItineraryType_384id" scope="session" class="eBLBaseComponents.apis.ebay.AirlineItineraryType" />
        <%
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setTotalFee(CoreComponentTypes1apis1ebay1BasicAmountType_385id);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setPassengerName(passengerName_387idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setTravelAgencyName(travelAgencyName_388idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setTravelAgencyCode(travelAgencyCode_389idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setCustomerCode(customerCode_390idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setTotalFare(CoreComponentTypes1apis1ebay1BasicAmountType_391id);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setTicketNumber(ticketNumber_393idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setRestrictedTicket(restrictedTicket_394idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setIssuingCarrierCode(issuingCarrierCode_395idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setClearingSequence(clearingSequence_396idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setClearingCount(clearingCount_397idTemp);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setTotalTaxes(CoreComponentTypes1apis1ebay1BasicAmountType_398id);
        eBLBaseComponents1apis1ebay1AirlineItineraryType_384id.setIssueDate(issueDate_400idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1EnhancedDataType_383id" scope="session" class="eBLBaseComponents.apis.ebay.EnhancedDataType" />
        <%
        eBLBaseComponents1apis1ebay1EnhancedDataType_383id.setAirlineItinerary(eBLBaseComponents1apis1ebay1AirlineItineraryType_384id);
        String storeID_402id=  request.getParameter("storeID1612");
            java.lang.String storeID_402idTemp = null;
        if(!storeID_402id.equals("")){
         storeID_402idTemp  = storeID_402id;
        }
        String terminalID_403id=  request.getParameter("terminalID1614");
            java.lang.String terminalID_403idTemp = null;
        if(!terminalID_403id.equals("")){
         terminalID_403idTemp  = terminalID_403id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1MerchantStoreDetailsType_401id" scope="session" class="eBLBaseComponents.apis.ebay.MerchantStoreDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1MerchantStoreDetailsType_401id.setStoreID(storeID_402idTemp);
        eBLBaseComponents1apis1ebay1MerchantStoreDetailsType_401id.setTerminalID(terminalID_403idTemp);
        String invoiceID_404id=  request.getParameter("invoiceID1616");
            java.lang.String invoiceID_404idTemp = null;
        if(!invoiceID_404id.equals("")){
         invoiceID_404idTemp  = invoiceID_404id;
        }
        String _value_406id=  request.getParameter("_value1620");
            java.lang.String _value_406idTemp = null;
        if(!_value_406id.equals("")){
         _value_406idTemp  = _value_406id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_405id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_405id.set_value(_value_406idTemp);
        String msgSubID_407id=  request.getParameter("msgSubID1622");
            java.lang.String msgSubID_407idTemp = null;
        if(!msgSubID_407id.equals("")){
         msgSubID_407idTemp  = msgSubID_407id;
        }
        String note_408id=  request.getParameter("note1624");
            java.lang.String note_408idTemp = null;
        if(!note_408id.equals("")){
         note_408idTemp  = note_408id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoCaptureRequestType_380id" scope="session" class="PayPalAPI.api.ebay.DoCaptureRequestType" />
        <%
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setDescriptor(descriptor_381idTemp);
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setAuthorizationID(authorizationID_382idTemp);
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setEnhancedData(eBLBaseComponents1apis1ebay1EnhancedDataType_383id);
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setMerchantStoreDetails(eBLBaseComponents1apis1ebay1MerchantStoreDetailsType_401id);
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setInvoiceID(invoiceID_404idTemp);
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_405id);
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setMsgSubID(msgSubID_407idTemp);
        PayPalAPI1api1ebay1DoCaptureRequestType_380id.setNote(note_408idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoCaptureReq_379id" scope="session" class="PayPalAPI.api.ebay.DoCaptureReq" />
        <%
        PayPalAPI1api1ebay1DoCaptureReq_379id.setDoCaptureRequest(PayPalAPI1api1ebay1DoCaptureRequestType_380id);
        PayPalAPI.api.ebay.DoCaptureResponseType doCapture1451mtemp = samplePayPalAPIAAInterfaceProxyid.doCapture(PayPalAPI1api1ebay1DoCaptureReq_379id);
if(doCapture1451mtemp == null){
%>
<%=doCapture1451mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">doCaptureResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">authorizationID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
java.lang.String typeauthorizationID1456 = tebece0.getAuthorizationID();
        String tempResultauthorizationID1456 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthorizationID1456));
        %>
        <%= tempResultauthorizationID1456 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">msgSubID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
java.lang.String typemsgSubID1458 = tebece0.getMsgSubID();
        String tempResultmsgSubID1458 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemsgSubID1458));
        %>
        <%= tempResultmsgSubID1458 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">paymentInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">enhancedPaymentInfo:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
EnhancedDataTypes.apis.ebay.EnhancedPaymentInfoType typeenhancedPaymentInfo1462 = tebece1.getEnhancedPaymentInfo();
        if(typeenhancedPaymentInfo1462!= null){
        String tempenhancedPaymentInfo1462 = typeenhancedPaymentInfo1462.toString();
        %>
        <%=tempenhancedPaymentInfo1462%>
        <%
        }}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">protectionEligibilityType:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeprotectionEligibilityType1464 = tebece1.getProtectionEligibilityType();
        String tempResultprotectionEligibilityType1464 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibilityType1464));
        %>
        <%= tempResultprotectionEligibilityType1464 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shipHandleAmount:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshipHandleAmount1466 = tebece1.getShipHandleAmount();
        String tempResultshipHandleAmount1466 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshipHandleAmount1466));
        %>
        <%= tempResultshipHandleAmount1466 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">receiptID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typereceiptID1468 = tebece1.getReceiptID();
        String tempResultreceiptID1468 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiptID1468));
        %>
        <%= tempResultreceiptID1468 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">ebayTransactionID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeebayTransactionID1470 = tebece1.getEbayTransactionID();
        String tempResultebayTransactionID1470 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeebayTransactionID1470));
        %>
        <%= tempResultebayTransactionID1470 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">holdDecision:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeholdDecision1472 = tebece1.getHoldDecision();
        String tempResultholdDecision1472 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeholdDecision1472));
        %>
        <%= tempResultholdDecision1472 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">subject:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typesubject1474 = tebece1.getSubject();
        String tempResultsubject1474 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesubject1474));
        %>
        <%= tempResultsubject1474 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">terminalID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeterminalID1476 = tebece1.getTerminalID();
        String tempResultterminalID1476 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeterminalID1476));
        %>
        <%= tempResultterminalID1476 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">paymentDate:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.util.Calendar typepaymentDate1478 = tebece1.getPaymentDate();
        java.text.DateFormat dateFormatpaymentDate1478 = java.text.DateFormat.getDateInstance();
        java.util.Date datepaymentDate1478 = typepaymentDate1478.getTime();
        String tempResultpaymentDate1478 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatpaymentDate1478.format(datepaymentDate1478));
        %>
        <%= tempResultpaymentDate1478 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typetransactionID1480 = tebece1.getTransactionID();
        String tempResulttransactionID1480 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID1480));
        %>
        <%= tempResulttransactionID1480 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">offerDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">bMLOfferInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">offerTrackingID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.OfferDetailsType tebece2=tebece1.getOfferDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.BMLOfferInfoType tebece3=tebece2.getBMLOfferInfo();
if(tebece3 != null){
java.lang.String typeofferTrackingID1486 = tebece3.getOfferTrackingID();
        String tempResultofferTrackingID1486 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeofferTrackingID1486));
        %>
        <%= tempResultofferTrackingID1486 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">offerCode:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.OfferDetailsType tebece2=tebece1.getOfferDetails();
if(tebece2 != null){
java.lang.String typeofferCode1488 = tebece2.getOfferCode();
        String tempResultofferCode1488 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeofferCode1488));
        %>
        <%= tempResultofferCode1488 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">feeAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getFeeAmount();
if(tebece2 != null){
java.lang.String type_value1492 = tebece2.get_value();
        String tempResult_value1492 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1492));
        %>
        <%= tempResult_value1492 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">fMFDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">reportFilters:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typereportFilters1496 = tebece2.getReportFilters();
        String tempreportFilters1496 = null;
        if(typereportFilters1496 != null){
        java.util.List listreportFilters1496= java.util.Arrays.asList(typereportFilters1496);
        tempreportFilters1496 = listreportFilters1496.toString();
        }
        %>
        <%=tempreportFilters1496%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">denyFilters:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typedenyFilters1498 = tebece2.getDenyFilters();
        String tempdenyFilters1498 = null;
        if(typedenyFilters1498 != null){
        java.util.List listdenyFilters1498= java.util.Arrays.asList(typedenyFilters1498);
        tempdenyFilters1498 = listdenyFilters1498.toString();
        }
        %>
        <%=tempdenyFilters1498%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">pendingFilters:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typependingFilters1500 = tebece2.getPendingFilters();
        String temppendingFilters1500 = null;
        if(typependingFilters1500 != null){
        java.util.List listpendingFilters1500= java.util.Arrays.asList(typependingFilters1500);
        temppendingFilters1500 = listpendingFilters1500.toString();
        }
        %>
        <%=temppendingFilters1500%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">acceptFilters:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typeacceptFilters1502 = tebece2.getAcceptFilters();
        String tempacceptFilters1502 = null;
        if(typeacceptFilters1502 != null){
        java.util.List listacceptFilters1502= java.util.Arrays.asList(typeacceptFilters1502);
        tempacceptFilters1502 = listacceptFilters1502.toString();
        }
        %>
        <%=tempacceptFilters1502%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">paymentRequestID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typepaymentRequestID1504 = tebece1.getPaymentRequestID();
        String tempResultpaymentRequestID1504 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepaymentRequestID1504));
        %>
        <%= tempResultpaymentRequestID1504 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shipAmount:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshipAmount1506 = tebece1.getShipAmount();
        String tempResultshipAmount1506 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshipAmount1506));
        %>
        <%= tempResultshipAmount1506 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">sellerDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">sellerUserName:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typesellerUserName1510 = tebece2.getSellerUserName();
        String tempResultsellerUserName1510 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesellerUserName1510));
        %>
        <%= tempResultsellerUserName1510 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">secureMerchantAccountID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typesecureMerchantAccountID1512 = tebece2.getSecureMerchantAccountID();
        String tempResultsecureMerchantAccountID1512 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesecureMerchantAccountID1512));
        %>
        <%= tempResultsecureMerchantAccountID1512 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">payPalAccountID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typepayPalAccountID1514 = tebece2.getPayPalAccountID();
        String tempResultpayPalAccountID1514 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayPalAccountID1514));
        %>
        <%= tempResultpayPalAccountID1514 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">sellerId:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typesellerId1516 = tebece2.getSellerId();
        String tempResultsellerId1516 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesellerId1516));
        %>
        <%= tempResultsellerId1516 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">sellerRegistrationDate:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.util.Calendar typesellerRegistrationDate1518 = tebece2.getSellerRegistrationDate();
        java.text.DateFormat dateFormatsellerRegistrationDate1518 = java.text.DateFormat.getDateInstance();
        java.util.Date datesellerRegistrationDate1518 = typesellerRegistrationDate1518.getTime();
        String tempResultsellerRegistrationDate1518 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatsellerRegistrationDate1518.format(datesellerRegistrationDate1518));
        %>
        <%= tempResultsellerRegistrationDate1518 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">storeID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typestoreID1520 = tebece1.getStoreID();
        String tempResultstoreID1520 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestoreID1520));
        %>
        <%= tempResultstoreID1520 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">insuranceAmount:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeinsuranceAmount1522 = tebece1.getInsuranceAmount();
        String tempResultinsuranceAmount1522 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinsuranceAmount1522));
        %>
        <%= tempResultinsuranceAmount1522 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingMethod:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshippingMethod1524 = tebece1.getShippingMethod();
        String tempResultshippingMethod1524 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingMethod1524));
        %>
        <%= tempResultshippingMethod1524 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">exchangeRate:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeexchangeRate1526 = tebece1.getExchangeRate();
        String tempResultexchangeRate1526 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexchangeRate1526));
        %>
        <%= tempResultexchangeRate1526 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">paymentError:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">shortMessage:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ErrorType tebece2=tebece1.getPaymentError();
if(tebece2 != null){
java.lang.String typeshortMessage1530 = tebece2.getShortMessage();
        String tempResultshortMessage1530 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshortMessage1530));
        %>
        <%= tempResultshortMessage1530 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">errorCode:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">longMessage:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ErrorType tebece2=tebece1.getPaymentError();
if(tebece2 != null){
java.lang.String typelongMessage1536 = tebece2.getLongMessage();
        String tempResultlongMessage1536 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelongMessage1536));
        %>
        <%= tempResultlongMessage1536 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">instrumentDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">instrumentCategory:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.InstrumentDetailsType tebece2=tebece1.getInstrumentDetails();
if(tebece2 != null){
java.lang.String typeinstrumentCategory1540 = tebece2.getInstrumentCategory();
        String tempResultinstrumentCategory1540 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinstrumentCategory1540));
        %>
        <%= tempResultinstrumentCategory1540 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shipDiscount:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshipDiscount1542 = tebece1.getShipDiscount();
        String tempResultshipDiscount1542 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshipDiscount1542));
        %>
        <%= tempResultshipDiscount1542 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">parentTransactionID:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeparentTransactionID1544 = tebece1.getParentTransactionID();
        String tempResultparentTransactionID1544 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeparentTransactionID1544));
        %>
        <%= tempResultparentTransactionID1544 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">protectionEligibility:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeprotectionEligibility1546 = tebece1.getProtectionEligibility();
        String tempResultprotectionEligibility1546 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibility1546));
        %>
        <%= tempResultprotectionEligibility1546 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">receiptReferenceNumber:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typereceiptReferenceNumber1548 = tebece1.getReceiptReferenceNumber();
        String tempResultreceiptReferenceNumber1548 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiptReferenceNumber1548));
        %>
        <%= tempResultreceiptReferenceNumber1548 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">grossAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getGrossAmount();
if(tebece2 != null){
java.lang.String type_value1552 = tebece2.get_value();
        String tempResult_value1552 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1552));
        %>
        <%= tempResult_value1552 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">binEligibility:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typebinEligibility1554 = tebece1.getBinEligibility();
        String tempResultbinEligibility1554 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebinEligibility1554));
        %>
        <%= tempResultbinEligibility1554 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">settleAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getSettleAmount();
if(tebece2 != null){
java.lang.String type_value1558 = tebece2.get_value();
        String tempResult_value1558 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1558));
        %>
        <%= tempResult_value1558 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">expectedeCheckClearDate:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.util.Calendar typeexpectedeCheckClearDate1560 = tebece1.getExpectedeCheckClearDate();
        java.text.DateFormat dateFormatexpectedeCheckClearDate1560 = java.text.DateFormat.getDateInstance();
        java.util.Date dateexpectedeCheckClearDate1560 = typeexpectedeCheckClearDate1560.getTime();
        String tempResultexpectedeCheckClearDate1560 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatexpectedeCheckClearDate1560.format(dateexpectedeCheckClearDate1560));
        %>
        <%= tempResultexpectedeCheckClearDate1560 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">taxAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doCapture1451mtemp != null){
eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType tebece0=doCapture1451mtemp.getDoCaptureResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getTaxAmount();
if(tebece2 != null){
java.lang.String type_value1564 = tebece2.get_value();
        String tempResult_value1564 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1564));
        %>
        <%= tempResult_value1564 %>
        <%
}}}}%>
</TD>
</TABLE>
<%
}
break;
case 1626:
        gotMethod = true;
        String authorizationID_411id=  request.getParameter("authorizationID1643");
            java.lang.String authorizationID_411idTemp = null;
        if(!authorizationID_411id.equals("")){
         authorizationID_411idTemp  = authorizationID_411id;
        }
        String msgSubID_412id=  request.getParameter("msgSubID1645");
            java.lang.String msgSubID_412idTemp = null;
        if(!msgSubID_412id.equals("")){
         msgSubID_412idTemp  = msgSubID_412id;
        }
        String _value_414id=  request.getParameter("_value1649");
            java.lang.String _value_414idTemp = null;
        if(!_value_414id.equals("")){
         _value_414idTemp  = _value_414id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_413id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_413id.set_value(_value_414idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoReauthorizationRequestType_410id" scope="session" class="PayPalAPI.api.ebay.DoReauthorizationRequestType" />
        <%
        PayPalAPI1api1ebay1DoReauthorizationRequestType_410id.setAuthorizationID(authorizationID_411idTemp);
        PayPalAPI1api1ebay1DoReauthorizationRequestType_410id.setMsgSubID(msgSubID_412idTemp);
        PayPalAPI1api1ebay1DoReauthorizationRequestType_410id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_413id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoReauthorizationReq_409id" scope="session" class="PayPalAPI.api.ebay.DoReauthorizationReq" />
        <%
        PayPalAPI1api1ebay1DoReauthorizationReq_409id.setDoReauthorizationRequest(PayPalAPI1api1ebay1DoReauthorizationRequestType_410id);
        PayPalAPI.api.ebay.DoReauthorizationResponseType doReauthorization1626mtemp = samplePayPalAPIAAInterfaceProxyid.doReauthorization(PayPalAPI1api1ebay1DoReauthorizationReq_409id);
if(doReauthorization1626mtemp == null){
%>
<%=doReauthorization1626mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">authorizationID:</TD>
<TD>
<%
if(doReauthorization1626mtemp != null){
java.lang.String typeauthorizationID1629 = doReauthorization1626mtemp.getAuthorizationID();
        String tempResultauthorizationID1629 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthorizationID1629));
        %>
        <%= tempResultauthorizationID1629 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">msgSubID:</TD>
<TD>
<%
if(doReauthorization1626mtemp != null){
java.lang.String typemsgSubID1631 = doReauthorization1626mtemp.getMsgSubID();
        String tempResultmsgSubID1631 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemsgSubID1631));
        %>
        <%= tempResultmsgSubID1631 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">authorizationInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">protectionEligibility:</TD>
<TD>
<%
if(doReauthorization1626mtemp != null){
eBLBaseComponents.apis.ebay.AuthorizationInfoType tebece0=doReauthorization1626mtemp.getAuthorizationInfo();
if(tebece0 != null){
java.lang.String typeprotectionEligibility1635 = tebece0.getProtectionEligibility();
        String tempResultprotectionEligibility1635 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibility1635));
        %>
        <%= tempResultprotectionEligibility1635 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">protectionEligibilityType:</TD>
<TD>
<%
if(doReauthorization1626mtemp != null){
eBLBaseComponents.apis.ebay.AuthorizationInfoType tebece0=doReauthorization1626mtemp.getAuthorizationInfo();
if(tebece0 != null){
java.lang.String typeprotectionEligibilityType1637 = tebece0.getProtectionEligibilityType();
        String tempResultprotectionEligibilityType1637 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibilityType1637));
        %>
        <%= tempResultprotectionEligibilityType1637 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 1651:
        gotMethod = true;
        String authorizationID_417id=  request.getParameter("authorizationID1662");
            java.lang.String authorizationID_417idTemp = null;
        if(!authorizationID_417id.equals("")){
         authorizationID_417idTemp  = authorizationID_417id;
        }
        String msgSubID_418id=  request.getParameter("msgSubID1664");
            java.lang.String msgSubID_418idTemp = null;
        if(!msgSubID_418id.equals("")){
         msgSubID_418idTemp  = msgSubID_418id;
        }
        String note_419id=  request.getParameter("note1666");
            java.lang.String note_419idTemp = null;
        if(!note_419id.equals("")){
         note_419idTemp  = note_419id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoVoidRequestType_416id" scope="session" class="PayPalAPI.api.ebay.DoVoidRequestType" />
        <%
        PayPalAPI1api1ebay1DoVoidRequestType_416id.setAuthorizationID(authorizationID_417idTemp);
        PayPalAPI1api1ebay1DoVoidRequestType_416id.setMsgSubID(msgSubID_418idTemp);
        PayPalAPI1api1ebay1DoVoidRequestType_416id.setNote(note_419idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoVoidReq_415id" scope="session" class="PayPalAPI.api.ebay.DoVoidReq" />
        <%
        PayPalAPI1api1ebay1DoVoidReq_415id.setDoVoidRequest(PayPalAPI1api1ebay1DoVoidRequestType_416id);
        PayPalAPI.api.ebay.DoVoidResponseType doVoid1651mtemp = samplePayPalAPIAAInterfaceProxyid.doVoid(PayPalAPI1api1ebay1DoVoidReq_415id);
if(doVoid1651mtemp == null){
%>
<%=doVoid1651mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">authorizationID:</TD>
<TD>
<%
if(doVoid1651mtemp != null){
java.lang.String typeauthorizationID1654 = doVoid1651mtemp.getAuthorizationID();
        String tempResultauthorizationID1654 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthorizationID1654));
        %>
        <%= tempResultauthorizationID1654 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">msgSubID:</TD>
<TD>
<%
if(doVoid1651mtemp != null){
java.lang.String typemsgSubID1656 = doVoid1651mtemp.getMsgSubID();
        String tempResultmsgSubID1656 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemsgSubID1656));
        %>
        <%= tempResultmsgSubID1656 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1668:
        gotMethod = true;
        String msgSubID_422id=  request.getParameter("msgSubID1689");
            java.lang.String msgSubID_422idTemp = null;
        if(!msgSubID_422id.equals("")){
         msgSubID_422idTemp  = msgSubID_422id;
        }
        String _value_424id=  request.getParameter("_value1693");
            java.lang.String _value_424idTemp = null;
        if(!_value_424id.equals("")){
         _value_424idTemp  = _value_424id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_423id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_423id.set_value(_value_424idTemp);
        String transactionID_425id=  request.getParameter("transactionID1695");
            java.lang.String transactionID_425idTemp = null;
        if(!transactionID_425id.equals("")){
         transactionID_425idTemp  = transactionID_425id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoAuthorizationRequestType_421id" scope="session" class="PayPalAPI.api.ebay.DoAuthorizationRequestType" />
        <%
        PayPalAPI1api1ebay1DoAuthorizationRequestType_421id.setMsgSubID(msgSubID_422idTemp);
        PayPalAPI1api1ebay1DoAuthorizationRequestType_421id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_423id);
        PayPalAPI1api1ebay1DoAuthorizationRequestType_421id.setTransactionID(transactionID_425idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoAuthorizationReq_420id" scope="session" class="PayPalAPI.api.ebay.DoAuthorizationReq" />
        <%
        PayPalAPI1api1ebay1DoAuthorizationReq_420id.setDoAuthorizationRequest(PayPalAPI1api1ebay1DoAuthorizationRequestType_421id);
        PayPalAPI.api.ebay.DoAuthorizationResponseType doAuthorization1668mtemp = samplePayPalAPIAAInterfaceProxyid.doAuthorization(PayPalAPI1api1ebay1DoAuthorizationReq_420id);
if(doAuthorization1668mtemp == null){
%>
<%=doAuthorization1668mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">msgSubID:</TD>
<TD>
<%
if(doAuthorization1668mtemp != null){
java.lang.String typemsgSubID1671 = doAuthorization1668mtemp.getMsgSubID();
        String tempResultmsgSubID1671 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemsgSubID1671));
        %>
        <%= tempResultmsgSubID1671 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">amount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doAuthorization1668mtemp != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece0=doAuthorization1668mtemp.getAmount();
if(tebece0 != null){
java.lang.String type_value1675 = tebece0.get_value();
        String tempResult_value1675 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1675));
        %>
        <%= tempResult_value1675 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">authorizationInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">protectionEligibility:</TD>
<TD>
<%
if(doAuthorization1668mtemp != null){
eBLBaseComponents.apis.ebay.AuthorizationInfoType tebece0=doAuthorization1668mtemp.getAuthorizationInfo();
if(tebece0 != null){
java.lang.String typeprotectionEligibility1679 = tebece0.getProtectionEligibility();
        String tempResultprotectionEligibility1679 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibility1679));
        %>
        <%= tempResultprotectionEligibility1679 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">protectionEligibilityType:</TD>
<TD>
<%
if(doAuthorization1668mtemp != null){
eBLBaseComponents.apis.ebay.AuthorizationInfoType tebece0=doAuthorization1668mtemp.getAuthorizationInfo();
if(tebece0 != null){
java.lang.String typeprotectionEligibilityType1681 = tebece0.getProtectionEligibilityType();
        String tempResultprotectionEligibilityType1681 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibilityType1681));
        %>
        <%= tempResultprotectionEligibilityType1681 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(doAuthorization1668mtemp != null){
java.lang.String typetransactionID1683 = doAuthorization1668mtemp.getTransactionID();
        String tempResulttransactionID1683 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID1683));
        %>
        <%= tempResulttransactionID1683 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1697:
        gotMethod = true;
        String localeCode_429id=  request.getParameter("localeCode1708");
            java.lang.String localeCode_429idTemp = null;
        if(!localeCode_429id.equals("")){
         localeCode_429idTemp  = localeCode_429id;
        }
        String returnURL_430id=  request.getParameter("returnURL1710");
            java.lang.String returnURL_430idTemp = null;
        if(!returnURL_430id.equals("")){
         returnURL_430idTemp  = returnURL_430id;
        }
        String cancelURL_431id=  request.getParameter("cancelURL1712");
            java.lang.String cancelURL_431idTemp = null;
        if(!cancelURL_431id.equals("")){
         cancelURL_431idTemp  = cancelURL_431id;
        }
        String reqBillingAddress_432id=  request.getParameter("reqBillingAddress1714");
            java.lang.String reqBillingAddress_432idTemp = null;
        if(!reqBillingAddress_432id.equals("")){
         reqBillingAddress_432idTemp  = reqBillingAddress_432id;
        }
        String cppHeaderBorderColor_433id=  request.getParameter("cppHeaderBorderColor1716");
            java.lang.String cppHeaderBorderColor_433idTemp = null;
        if(!cppHeaderBorderColor_433id.equals("")){
         cppHeaderBorderColor_433idTemp  = cppHeaderBorderColor_433id;
        }
        String cppPayflowColor_434id=  request.getParameter("cppPayflowColor1718");
            java.lang.String cppPayflowColor_434idTemp = null;
        if(!cppPayflowColor_434id.equals("")){
         cppPayflowColor_434idTemp  = cppPayflowColor_434id;
        }
        String buyerEmail_435id=  request.getParameter("buyerEmail1720");
            java.lang.String buyerEmail_435idTemp = null;
        if(!buyerEmail_435id.equals("")){
         buyerEmail_435idTemp  = buyerEmail_435id;
        }
        String cppHeaderBackColor_436id=  request.getParameter("cppHeaderBackColor1722");
            java.lang.String cppHeaderBackColor_436idTemp = null;
        if(!cppHeaderBackColor_436id.equals("")){
         cppHeaderBackColor_436idTemp  = cppHeaderBackColor_436id;
        }
        String cppHeaderImage_437id=  request.getParameter("cppHeaderImage1724");
            java.lang.String cppHeaderImage_437idTemp = null;
        if(!cppHeaderImage_437id.equals("")){
         cppHeaderImage_437idTemp  = cppHeaderImage_437id;
        }
        String pageStyle_438id=  request.getParameter("pageStyle1726");
            java.lang.String pageStyle_438idTemp = null;
        if(!pageStyle_438id.equals("")){
         pageStyle_438idTemp  = pageStyle_438id;
        }
        String billingAgreementCustom_440id=  request.getParameter("billingAgreementCustom1730");
            java.lang.String billingAgreementCustom_440idTemp = null;
        if(!billingAgreementCustom_440id.equals("")){
         billingAgreementCustom_440idTemp  = billingAgreementCustom_440id;
        }
        String billingAgreementDescription_441id=  request.getParameter("billingAgreementDescription1732");
            java.lang.String billingAgreementDescription_441idTemp = null;
        if(!billingAgreementDescription_441id.equals("")){
         billingAgreementDescription_441idTemp  = billingAgreementDescription_441id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BillingAgreementDetailsType_439id" scope="session" class="eBLBaseComponents.apis.ebay.BillingAgreementDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1BillingAgreementDetailsType_439id.setBillingAgreementCustom(billingAgreementCustom_440idTemp);
        eBLBaseComponents1apis1ebay1BillingAgreementDetailsType_439id.setBillingAgreementDescription(billingAgreementDescription_441idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id" scope="session" class="eBLBaseComponents.apis.ebay.SetCustomerBillingAgreementRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setLocaleCode(localeCode_429idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setReturnURL(returnURL_430idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setCancelURL(cancelURL_431idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setReqBillingAddress(reqBillingAddress_432idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setCppHeaderBorderColor(cppHeaderBorderColor_433idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setCppPayflowColor(cppPayflowColor_434idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setBuyerEmail(buyerEmail_435idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setCppHeaderBackColor(cppHeaderBackColor_436idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setCppHeaderImage(cppHeaderImage_437idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setPageStyle(pageStyle_438idTemp);
        eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id.setBillingAgreementDetails(eBLBaseComponents1apis1ebay1BillingAgreementDetailsType_439id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetCustomerBillingAgreementRequestType_427id" scope="session" class="PayPalAPI.api.ebay.SetCustomerBillingAgreementRequestType" />
        <%
        PayPalAPI1api1ebay1SetCustomerBillingAgreementRequestType_427id.setSetCustomerBillingAgreementRequestDetails(eBLBaseComponents1apis1ebay1SetCustomerBillingAgreementRequestDetailsType_428id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1SetCustomerBillingAgreementReq_426id" scope="session" class="PayPalAPI.api.ebay.SetCustomerBillingAgreementReq" />
        <%
        PayPalAPI1api1ebay1SetCustomerBillingAgreementReq_426id.setSetCustomerBillingAgreementRequest(PayPalAPI1api1ebay1SetCustomerBillingAgreementRequestType_427id);
        PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType setCustomerBillingAgreement1697mtemp = samplePayPalAPIAAInterfaceProxyid.setCustomerBillingAgreement(PayPalAPI1api1ebay1SetCustomerBillingAgreementReq_426id);
if(setCustomerBillingAgreement1697mtemp == null){
%>
<%=setCustomerBillingAgreement1697mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">token:</TD>
<TD>
<%
if(setCustomerBillingAgreement1697mtemp != null){
java.lang.String typetoken1700 = setCustomerBillingAgreement1697mtemp.getToken();
        String tempResulttoken1700 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken1700));
        %>
        <%= tempResulttoken1700 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1734:
        gotMethod = true;
        String token_444id=  request.getParameter("token1829");
            java.lang.String token_444idTemp = null;
        if(!token_444id.equals("")){
         token_444idTemp  = token_444id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetBillingAgreementCustomerDetailsRequestType_443id" scope="session" class="PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsRequestType" />
        <%
        PayPalAPI1api1ebay1GetBillingAgreementCustomerDetailsRequestType_443id.setToken(token_444idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetBillingAgreementCustomerDetailsReq_442id" scope="session" class="PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsReq" />
        <%
        PayPalAPI1api1ebay1GetBillingAgreementCustomerDetailsReq_442id.setGetBillingAgreementCustomerDetailsRequest(PayPalAPI1api1ebay1GetBillingAgreementCustomerDetailsRequestType_443id);
        PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails1734mtemp = samplePayPalAPIAAInterfaceProxyid.getBillingAgreementCustomerDetails(PayPalAPI1api1ebay1GetBillingAgreementCustomerDetailsReq_442id);
if(getBillingAgreementCustomerDetails1734mtemp == null){
%>
<%=getBillingAgreementCustomerDetails1734mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">getBillingAgreementCustomerDetailsResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">payerInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payerID:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typepayerID1741 = tebece1.getPayerID();
        String tempResultpayerID1741 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerID1741));
        %>
        <%= tempResultpayerID1741 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">taxIdDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">taxId:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.TaxIdDetailsType tebece2=tebece1.getTaxIdDetails();
if(tebece2 != null){
java.lang.String typetaxId1745 = tebece2.getTaxId();
        String tempResulttaxId1745 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetaxId1745));
        %>
        <%= tempResulttaxId1745 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">taxIdType:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.TaxIdDetailsType tebece2=tebece1.getTaxIdDetails();
if(tebece2 != null){
java.lang.String typetaxIdType1747 = tebece2.getTaxIdType();
        String tempResulttaxIdType1747 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetaxIdType1747));
        %>
        <%= tempResulttaxIdType1747 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payerName:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typelastName1751 = tebece2.getLastName();
        String tempResultlastName1751 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName1751));
        %>
        <%= tempResultlastName1751 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">middleName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typemiddleName1753 = tebece2.getMiddleName();
        String tempResultmiddleName1753 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemiddleName1753));
        %>
        <%= tempResultmiddleName1753 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typefirstName1755 = tebece2.getFirstName();
        String tempResultfirstName1755 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName1755));
        %>
        <%= tempResultfirstName1755 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">suffix:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typesuffix1757 = tebece2.getSuffix();
        String tempResultsuffix1757 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesuffix1757));
        %>
        <%= tempResultsuffix1757 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">salutation:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece2=tebece1.getPayerName();
if(tebece2 != null){
java.lang.String typesalutation1759 = tebece2.getSalutation();
        String tempResultsalutation1759 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesalutation1759));
        %>
        <%= tempResultsalutation1759 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payer:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typepayer1761 = tebece1.getPayer();
        String tempResultpayer1761 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayer1761));
        %>
        <%= tempResultpayer1761 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">enhancedPayerInfo:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType typeenhancedPayerInfo1763 = tebece1.getEnhancedPayerInfo();
        if(typeenhancedPayerInfo1763!= null){
        String tempenhancedPayerInfo1763 = typeenhancedPayerInfo1763.toString();
        %>
        <%=tempenhancedPayerInfo1763%>
        <%
        }}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">contactPhone:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typecontactPhone1765 = tebece1.getContactPhone();
        String tempResultcontactPhone1765 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecontactPhone1765));
        %>
        <%= tempResultcontactPhone1765 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">payerBusiness:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
java.lang.String typepayerBusiness1767 = tebece1.getPayerBusiness();
        String tempResultpayerBusiness1767 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerBusiness1767));
        %>
        <%= tempResultpayerBusiness1767 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">address:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">countryName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typecountryName1771 = tebece2.getCountryName();
        String tempResultcountryName1771 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountryName1771));
        %>
        <%= tempResultcountryName1771 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalStreet:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeinternationalStreet1773 = tebece2.getInternationalStreet();
        String tempResultinternationalStreet1773 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStreet1773));
        %>
        <%= tempResultinternationalStreet1773 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">externalAddressID:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeexternalAddressID1775 = tebece2.getExternalAddressID();
        String tempResultexternalAddressID1775 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalAddressID1775));
        %>
        <%= tempResultexternalAddressID1775 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">stateOrProvince:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typestateOrProvince1777 = tebece2.getStateOrProvince();
        String tempResultstateOrProvince1777 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestateOrProvince1777));
        %>
        <%= tempResultstateOrProvince1777 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeinternationalName1779 = tebece2.getInternationalName();
        String tempResultinternationalName1779 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalName1779));
        %>
        <%= tempResultinternationalName1779 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">cityName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typecityName1781 = tebece2.getCityName();
        String tempResultcityName1781 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecityName1781));
        %>
        <%= tempResultcityName1781 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typephone1783 = tebece2.getPhone();
        String tempResultphone1783 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone1783));
        %>
        <%= tempResultphone1783 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">postalCode:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typepostalCode1785 = tebece2.getPostalCode();
        String tempResultpostalCode1785 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepostalCode1785));
        %>
        <%= tempResultpostalCode1785 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">street2:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typestreet21787 = tebece2.getStreet2();
        String tempResultstreet21787 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet21787));
        %>
        <%= tempResultstreet21787 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">street1:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typestreet11789 = tebece2.getStreet1();
        String tempResultstreet11789 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet11789));
        %>
        <%= tempResultstreet11789 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">addressID:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeaddressID1791 = tebece2.getAddressID();
        String tempResultaddressID1791 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressID1791));
        %>
        <%= tempResultaddressID1791 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalStateAndCity:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typeinternationalStateAndCity1793 = tebece2.getInternationalStateAndCity();
        String tempResultinternationalStateAndCity1793 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStateAndCity1793));
        %>
        <%= tempResultinternationalStateAndCity1793 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece1=tebece0.getPayerInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getAddress();
if(tebece2 != null){
java.lang.String typename1795 = tebece2.getName();
        String tempResultname1795 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename1795));
        %>
        <%= tempResultname1795 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">billingAddress:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">countryName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typecountryName1799 = tebece1.getCountryName();
        String tempResultcountryName1799 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountryName1799));
        %>
        <%= tempResultcountryName1799 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">internationalStreet:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeinternationalStreet1801 = tebece1.getInternationalStreet();
        String tempResultinternationalStreet1801 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStreet1801));
        %>
        <%= tempResultinternationalStreet1801 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">externalAddressID:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeexternalAddressID1803 = tebece1.getExternalAddressID();
        String tempResultexternalAddressID1803 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalAddressID1803));
        %>
        <%= tempResultexternalAddressID1803 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">stateOrProvince:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typestateOrProvince1805 = tebece1.getStateOrProvince();
        String tempResultstateOrProvince1805 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestateOrProvince1805));
        %>
        <%= tempResultstateOrProvince1805 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">internationalName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeinternationalName1807 = tebece1.getInternationalName();
        String tempResultinternationalName1807 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalName1807));
        %>
        <%= tempResultinternationalName1807 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">cityName:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typecityName1809 = tebece1.getCityName();
        String tempResultcityName1809 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecityName1809));
        %>
        <%= tempResultcityName1809 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typephone1811 = tebece1.getPhone();
        String tempResultphone1811 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone1811));
        %>
        <%= tempResultphone1811 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">postalCode:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typepostalCode1813 = tebece1.getPostalCode();
        String tempResultpostalCode1813 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepostalCode1813));
        %>
        <%= tempResultpostalCode1813 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">street2:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typestreet21815 = tebece1.getStreet2();
        String tempResultstreet21815 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet21815));
        %>
        <%= tempResultstreet21815 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">street1:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typestreet11817 = tebece1.getStreet1();
        String tempResultstreet11817 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet11817));
        %>
        <%= tempResultstreet11817 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">addressID:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeaddressID1819 = tebece1.getAddressID();
        String tempResultaddressID1819 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressID1819));
        %>
        <%= tempResultaddressID1819 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">internationalStateAndCity:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typeinternationalStateAndCity1821 = tebece1.getInternationalStateAndCity();
        String tempResultinternationalStateAndCity1821 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStateAndCity1821));
        %>
        <%= tempResultinternationalStateAndCity1821 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getBillingAgreementCustomerDetails1734mtemp != null){
eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType tebece0=getBillingAgreementCustomerDetails1734mtemp.getGetBillingAgreementCustomerDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.AddressType tebece1=tebece0.getBillingAddress();
if(tebece1 != null){
java.lang.String typename1823 = tebece1.getName();
        String tempResultname1823 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename1823));
        %>
        <%= tempResultname1823 %>
        <%
}}}%>
</TD>
</TABLE>
<%
}
break;
case 1831:
        gotMethod = true;
        String token_447id=  request.getParameter("token1840");
            java.lang.String token_447idTemp = null;
        if(!token_447id.equals("")){
         token_447idTemp  = token_447id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1CreateBillingAgreementRequestType_446id" scope="session" class="PayPalAPI.api.ebay.CreateBillingAgreementRequestType" />
        <%
        PayPalAPI1api1ebay1CreateBillingAgreementRequestType_446id.setToken(token_447idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1CreateBillingAgreementReq_445id" scope="session" class="PayPalAPI.api.ebay.CreateBillingAgreementReq" />
        <%
        PayPalAPI1api1ebay1CreateBillingAgreementReq_445id.setCreateBillingAgreementRequest(PayPalAPI1api1ebay1CreateBillingAgreementRequestType_446id);
        PayPalAPI.api.ebay.CreateBillingAgreementResponseType createBillingAgreement1831mtemp = samplePayPalAPIAAInterfaceProxyid.createBillingAgreement(PayPalAPI1api1ebay1CreateBillingAgreementReq_445id);
if(createBillingAgreement1831mtemp == null){
%>
<%=createBillingAgreement1831mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">billingAgreementID:</TD>
<TD>
<%
if(createBillingAgreement1831mtemp != null){
java.lang.String typebillingAgreementID1834 = createBillingAgreement1831mtemp.getBillingAgreementID();
        String tempResultbillingAgreementID1834 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebillingAgreementID1834));
        %>
        <%= tempResultbillingAgreementID1834 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1842:
        gotMethod = true;
        String custom_452id=  request.getParameter("custom1987");
            java.lang.String custom_452idTemp = null;
        if(!custom_452id.equals("")){
         custom_452idTemp  = custom_452id;
        }
        String softDescriptor_453id=  request.getParameter("softDescriptor1989");
            java.lang.String softDescriptor_453idTemp = null;
        if(!softDescriptor_453id.equals("")){
         softDescriptor_453idTemp  = softDescriptor_453id;
        }
        String profileAddressChangeDate_454id=  request.getParameter("profileAddressChangeDate1991");
            java.util.Calendar profileAddressChangeDate_454idTemp = null;
        if(!profileAddressChangeDate_454id.equals("")){
        java.text.DateFormat dateFormatprofileAddressChangeDate1991 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempprofileAddressChangeDate1991  = dateFormatprofileAddressChangeDate1991.parse(profileAddressChangeDate_454id);
         profileAddressChangeDate_454idTemp = new java.util.GregorianCalendar();
        profileAddressChangeDate_454idTemp.setTime(dateTempprofileAddressChangeDate1991);
        }
        String orderDescription_455id=  request.getParameter("orderDescription1993");
            java.lang.String orderDescription_455idTemp = null;
        if(!orderDescription_455id.equals("")){
         orderDescription_455idTemp  = orderDescription_455id;
        }
        String insuranceOptionOffered_456id=  request.getParameter("insuranceOptionOffered1995");
            java.lang.String insuranceOptionOffered_456idTemp = null;
        if(!insuranceOptionOffered_456id.equals("")){
         insuranceOptionOffered_456idTemp  = insuranceOptionOffered_456id;
        }
        String branchLevel_457id=  request.getParameter("branchLevel1997");
            java.math.BigInteger branchLevel_457idTemp = null;
        if(!branchLevel_457id.equals("")){
         branchLevel_457idTemp  = new java.math.BigInteger(branchLevel_457id);
        }
        String _value_459id=  request.getParameter("_value2001");
            java.lang.String _value_459idTemp = null;
        if(!_value_459id.equals("")){
         _value_459idTemp  = _value_459id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_458id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_458id.set_value(_value_459idTemp);
        String _value_461id=  request.getParameter("_value2005");
            java.lang.String _value_461idTemp = null;
        if(!_value_461id.equals("")){
         _value_461idTemp  = _value_461id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_460id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_460id.set_value(_value_461idTemp);
        String countryName_463id=  request.getParameter("countryName2009");
            java.lang.String countryName_463idTemp = null;
        if(!countryName_463id.equals("")){
         countryName_463idTemp  = countryName_463id;
        }
        String internationalStreet_464id=  request.getParameter("internationalStreet2011");
            java.lang.String internationalStreet_464idTemp = null;
        if(!internationalStreet_464id.equals("")){
         internationalStreet_464idTemp  = internationalStreet_464id;
        }
        String externalAddressID_465id=  request.getParameter("externalAddressID2013");
            java.lang.String externalAddressID_465idTemp = null;
        if(!externalAddressID_465id.equals("")){
         externalAddressID_465idTemp  = externalAddressID_465id;
        }
        String stateOrProvince_466id=  request.getParameter("stateOrProvince2015");
            java.lang.String stateOrProvince_466idTemp = null;
        if(!stateOrProvince_466id.equals("")){
         stateOrProvince_466idTemp  = stateOrProvince_466id;
        }
        String internationalName_467id=  request.getParameter("internationalName2017");
            java.lang.String internationalName_467idTemp = null;
        if(!internationalName_467id.equals("")){
         internationalName_467idTemp  = internationalName_467id;
        }
        String cityName_468id=  request.getParameter("cityName2019");
            java.lang.String cityName_468idTemp = null;
        if(!cityName_468id.equals("")){
         cityName_468idTemp  = cityName_468id;
        }
        String phone_469id=  request.getParameter("phone2021");
            java.lang.String phone_469idTemp = null;
        if(!phone_469id.equals("")){
         phone_469idTemp  = phone_469id;
        }
        String postalCode_470id=  request.getParameter("postalCode2023");
            java.lang.String postalCode_470idTemp = null;
        if(!postalCode_470id.equals("")){
         postalCode_470idTemp  = postalCode_470id;
        }
        String street2_471id=  request.getParameter("street22025");
            java.lang.String street2_471idTemp = null;
        if(!street2_471id.equals("")){
         street2_471idTemp  = street2_471id;
        }
        String street1_472id=  request.getParameter("street12027");
            java.lang.String street1_472idTemp = null;
        if(!street1_472id.equals("")){
         street1_472idTemp  = street1_472id;
        }
        String addressID_473id=  request.getParameter("addressID2029");
            java.lang.String addressID_473idTemp = null;
        if(!addressID_473id.equals("")){
         addressID_473idTemp  = addressID_473id;
        }
        String internationalStateAndCity_474id=  request.getParameter("internationalStateAndCity2031");
            java.lang.String internationalStateAndCity_474idTemp = null;
        if(!internationalStateAndCity_474id.equals("")){
         internationalStateAndCity_474idTemp  = internationalStateAndCity_474id;
        }
        String name_475id=  request.getParameter("name2033");
            java.lang.String name_475idTemp = null;
        if(!name_475id.equals("")){
         name_475idTemp  = name_475id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_462id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_462id.setCountryName(countryName_463idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setInternationalStreet(internationalStreet_464idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setExternalAddressID(externalAddressID_465idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setStateOrProvince(stateOrProvince_466idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setInternationalName(internationalName_467idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setCityName(cityName_468idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setPhone(phone_469idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setPostalCode(postalCode_470idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setStreet2(street2_471idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setStreet1(street1_472idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setAddressID(addressID_473idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setInternationalStateAndCity(internationalStateAndCity_474idTemp);
        eBLBaseComponents1apis1ebay1AddressType_462id.setName(name_475idTemp);
        String _value_477id=  request.getParameter("_value2037");
            java.lang.String _value_477idTemp = null;
        if(!_value_477id.equals("")){
         _value_477idTemp  = _value_477id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_476id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_476id.set_value(_value_477idTemp);
        String buttonSource_478id=  request.getParameter("buttonSource2039");
            java.lang.String buttonSource_478idTemp = null;
        if(!buttonSource_478id.equals("")){
         buttonSource_478idTemp  = buttonSource_478id;
        }
        String paymentRequestID_479id=  request.getParameter("paymentRequestID2041");
            java.lang.String paymentRequestID_479idTemp = null;
        if(!paymentRequestID_479id.equals("")){
         paymentRequestID_479idTemp  = paymentRequestID_479id;
        }
        String _value_481id=  request.getParameter("_value2045");
            java.lang.String _value_481idTemp = null;
        if(!_value_481id.equals("")){
         _value_481idTemp  = _value_481id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_480id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_480id.set_value(_value_481idTemp);
        String _value_483id=  request.getParameter("_value2049");
            java.lang.String _value_483idTemp = null;
        if(!_value_483id.equals("")){
         _value_483idTemp  = _value_483id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_482id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_482id.set_value(_value_483idTemp);
        String sellerUserName_485id=  request.getParameter("sellerUserName2053");
            java.lang.String sellerUserName_485idTemp = null;
        if(!sellerUserName_485id.equals("")){
         sellerUserName_485idTemp  = sellerUserName_485id;
        }
        String secureMerchantAccountID_486id=  request.getParameter("secureMerchantAccountID2055");
            java.lang.String secureMerchantAccountID_486idTemp = null;
        if(!secureMerchantAccountID_486id.equals("")){
         secureMerchantAccountID_486idTemp  = secureMerchantAccountID_486id;
        }
        String payPalAccountID_487id=  request.getParameter("payPalAccountID2057");
            java.lang.String payPalAccountID_487idTemp = null;
        if(!payPalAccountID_487id.equals("")){
         payPalAccountID_487idTemp  = payPalAccountID_487id;
        }
        String sellerId_488id=  request.getParameter("sellerId2059");
            java.lang.String sellerId_488idTemp = null;
        if(!sellerId_488id.equals("")){
         sellerId_488idTemp  = sellerId_488id;
        }
        String sellerRegistrationDate_489id=  request.getParameter("sellerRegistrationDate2061");
            java.util.Calendar sellerRegistrationDate_489idTemp = null;
        if(!sellerRegistrationDate_489id.equals("")){
        java.text.DateFormat dateFormatsellerRegistrationDate2061 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempsellerRegistrationDate2061  = dateFormatsellerRegistrationDate2061.parse(sellerRegistrationDate_489id);
         sellerRegistrationDate_489idTemp = new java.util.GregorianCalendar();
        sellerRegistrationDate_489idTemp.setTime(dateTempsellerRegistrationDate2061);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SellerDetailsType_484id" scope="session" class="eBLBaseComponents.apis.ebay.SellerDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1SellerDetailsType_484id.setSellerUserName(sellerUserName_485idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_484id.setSecureMerchantAccountID(secureMerchantAccountID_486idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_484id.setPayPalAccountID(payPalAccountID_487idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_484id.setSellerId(sellerId_488idTemp);
        eBLBaseComponents1apis1ebay1SellerDetailsType_484id.setSellerRegistrationDate(sellerRegistrationDate_489idTemp);
        String fulfillmentReferenceNumber_490id=  request.getParameter("fulfillmentReferenceNumber2063");
            java.lang.String fulfillmentReferenceNumber_490idTemp = null;
        if(!fulfillmentReferenceNumber_490id.equals("")){
         fulfillmentReferenceNumber_490idTemp  = fulfillmentReferenceNumber_490id;
        }
        String countryName_492id=  request.getParameter("countryName2067");
            java.lang.String countryName_492idTemp = null;
        if(!countryName_492id.equals("")){
         countryName_492idTemp  = countryName_492id;
        }
        String internationalStreet_493id=  request.getParameter("internationalStreet2069");
            java.lang.String internationalStreet_493idTemp = null;
        if(!internationalStreet_493id.equals("")){
         internationalStreet_493idTemp  = internationalStreet_493id;
        }
        String externalAddressID_494id=  request.getParameter("externalAddressID2071");
            java.lang.String externalAddressID_494idTemp = null;
        if(!externalAddressID_494id.equals("")){
         externalAddressID_494idTemp  = externalAddressID_494id;
        }
        String stateOrProvince_495id=  request.getParameter("stateOrProvince2073");
            java.lang.String stateOrProvince_495idTemp = null;
        if(!stateOrProvince_495id.equals("")){
         stateOrProvince_495idTemp  = stateOrProvince_495id;
        }
        String internationalName_496id=  request.getParameter("internationalName2075");
            java.lang.String internationalName_496idTemp = null;
        if(!internationalName_496id.equals("")){
         internationalName_496idTemp  = internationalName_496id;
        }
        String cityName_497id=  request.getParameter("cityName2077");
            java.lang.String cityName_497idTemp = null;
        if(!cityName_497id.equals("")){
         cityName_497idTemp  = cityName_497id;
        }
        String phone_498id=  request.getParameter("phone2079");
            java.lang.String phone_498idTemp = null;
        if(!phone_498id.equals("")){
         phone_498idTemp  = phone_498id;
        }
        String postalCode_499id=  request.getParameter("postalCode2081");
            java.lang.String postalCode_499idTemp = null;
        if(!postalCode_499id.equals("")){
         postalCode_499idTemp  = postalCode_499id;
        }
        String street2_500id=  request.getParameter("street22083");
            java.lang.String street2_500idTemp = null;
        if(!street2_500id.equals("")){
         street2_500idTemp  = street2_500id;
        }
        String street1_501id=  request.getParameter("street12085");
            java.lang.String street1_501idTemp = null;
        if(!street1_501id.equals("")){
         street1_501idTemp  = street1_501id;
        }
        String addressID_502id=  request.getParameter("addressID2087");
            java.lang.String addressID_502idTemp = null;
        if(!addressID_502id.equals("")){
         addressID_502idTemp  = addressID_502id;
        }
        String internationalStateAndCity_503id=  request.getParameter("internationalStateAndCity2089");
            java.lang.String internationalStateAndCity_503idTemp = null;
        if(!internationalStateAndCity_503id.equals("")){
         internationalStateAndCity_503idTemp  = internationalStateAndCity_503id;
        }
        String name_504id=  request.getParameter("name2091");
            java.lang.String name_504idTemp = null;
        if(!name_504id.equals("")){
         name_504idTemp  = name_504id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_491id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_491id.setCountryName(countryName_492idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setInternationalStreet(internationalStreet_493idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setExternalAddressID(externalAddressID_494idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setStateOrProvince(stateOrProvince_495idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setInternationalName(internationalName_496idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setCityName(cityName_497idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setPhone(phone_498idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setPostalCode(postalCode_499idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setStreet2(street2_500idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setStreet1(street1_501idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setAddressID(addressID_502idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setInternationalStateAndCity(internationalStateAndCity_503idTemp);
        eBLBaseComponents1apis1ebay1AddressType_491id.setName(name_504idTemp);
        String noteText_505id=  request.getParameter("noteText2093");
            java.lang.String noteText_505idTemp = null;
        if(!noteText_505id.equals("")){
         noteText_505idTemp  = noteText_505id;
        }
        String _value_507id=  request.getParameter("_value2097");
            java.lang.String _value_507idTemp = null;
        if(!_value_507id.equals("")){
         _value_507idTemp  = _value_507id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_506id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_506id.set_value(_value_507idTemp);
        String invoiceID_508id=  request.getParameter("invoiceID2099");
            java.lang.String invoiceID_508idTemp = null;
        if(!invoiceID_508id.equals("")){
         invoiceID_508idTemp  = invoiceID_508id;
        }
        String _value_510id=  request.getParameter("_value2103");
            java.lang.String _value_510idTemp = null;
        if(!_value_510id.equals("")){
         _value_510idTemp  = _value_510id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_509id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_509id.set_value(_value_510idTemp);
        String offerTrackingID_513id=  request.getParameter("offerTrackingID2109");
            java.lang.String offerTrackingID_513idTemp = null;
        if(!offerTrackingID_513id.equals("")){
         offerTrackingID_513idTemp  = offerTrackingID_513id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BMLOfferInfoType_512id" scope="session" class="eBLBaseComponents.apis.ebay.BMLOfferInfoType" />
        <%
        eBLBaseComponents1apis1ebay1BMLOfferInfoType_512id.setOfferTrackingID(offerTrackingID_513idTemp);
        String offerCode_514id=  request.getParameter("offerCode2111");
            java.lang.String offerCode_514idTemp = null;
        if(!offerCode_514id.equals("")){
         offerCode_514idTemp  = offerCode_514id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1OfferDetailsType_511id" scope="session" class="eBLBaseComponents.apis.ebay.OfferDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1OfferDetailsType_511id.setBMLOfferInfo(eBLBaseComponents1apis1ebay1BMLOfferInfoType_512id);
        eBLBaseComponents1apis1ebay1OfferDetailsType_511id.setOfferCode(offerCode_514idTemp);
        String transactionId_515id=  request.getParameter("transactionId2113");
            java.lang.String transactionId_515idTemp = null;
        if(!transactionId_515id.equals("")){
         transactionId_515idTemp  = transactionId_515id;
        }
        String orderURL_516id=  request.getParameter("orderURL2115");
            java.lang.String orderURL_516idTemp = null;
        if(!orderURL_516id.equals("")){
         orderURL_516idTemp  = orderURL_516id;
        }
        %>
        <jsp:useBean id="EnhancedDataTypes1apis1ebay1EnhancedPaymentDataType_517id" scope="session" class="EnhancedDataTypes.apis.ebay.EnhancedPaymentDataType" />
        <%
        String notifyURL_518id=  request.getParameter("notifyURL2119");
            java.lang.String notifyURL_518idTemp = null;
        if(!notifyURL_518id.equals("")){
         notifyURL_518idTemp  = notifyURL_518id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PaymentDetailsType_451id" scope="session" class="eBLBaseComponents.apis.ebay.PaymentDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setCustom(custom_452idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setSoftDescriptor(softDescriptor_453idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setProfileAddressChangeDate(profileAddressChangeDate_454idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setOrderDescription(orderDescription_455idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setInsuranceOptionOffered(insuranceOptionOffered_456idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setBranchLevel(branchLevel_457idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setHandlingTotal(CoreComponentTypes1apis1ebay1BasicAmountType_458id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setShippingTotal(CoreComponentTypes1apis1ebay1BasicAmountType_460id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setShipToAddress(eBLBaseComponents1apis1ebay1AddressType_462id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setOrderTotal(CoreComponentTypes1apis1ebay1BasicAmountType_476id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setButtonSource(buttonSource_478idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setPaymentRequestID(paymentRequestID_479idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setShippingDiscount(CoreComponentTypes1apis1ebay1BasicAmountType_480id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setItemTotal(CoreComponentTypes1apis1ebay1BasicAmountType_482id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setSellerDetails(eBLBaseComponents1apis1ebay1SellerDetailsType_484id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setFulfillmentReferenceNumber(fulfillmentReferenceNumber_490idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setFulfillmentAddress(eBLBaseComponents1apis1ebay1AddressType_491id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setNoteText(noteText_505idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setTaxTotal(CoreComponentTypes1apis1ebay1BasicAmountType_506id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setInvoiceID(invoiceID_508idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setInsuranceTotal(CoreComponentTypes1apis1ebay1BasicAmountType_509id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setOfferDetails(eBLBaseComponents1apis1ebay1OfferDetailsType_511id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setTransactionId(transactionId_515idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setOrderURL(orderURL_516idTemp);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setEnhancedPaymentData(EnhancedDataTypes1apis1ebay1EnhancedPaymentDataType_517id);
        eBLBaseComponents1apis1ebay1PaymentDetailsType_451id.setNotifyURL(notifyURL_518idTemp);
        String iPAddress_519id=  request.getParameter("iPAddress2121");
            java.lang.String iPAddress_519idTemp = null;
        if(!iPAddress_519id.equals("")){
         iPAddress_519idTemp  = iPAddress_519id;
        }
        String merchantSessionId_520id=  request.getParameter("merchantSessionId2123");
            java.lang.String merchantSessionId_520idTemp = null;
        if(!merchantSessionId_520id.equals("")){
         merchantSessionId_520idTemp  = merchantSessionId_520id;
        }
        String referenceID_521id=  request.getParameter("referenceID2125");
            java.lang.String referenceID_521idTemp = null;
        if(!referenceID_521id.equals("")){
         referenceID_521idTemp  = referenceID_521id;
        }
        String reqConfirmShipping_522id=  request.getParameter("reqConfirmShipping2127");
            java.lang.String reqConfirmShipping_522idTemp = null;
        if(!reqConfirmShipping_522id.equals("")){
         reqConfirmShipping_522idTemp  = reqConfirmShipping_522id;
        }
        String msgSubID_523id=  request.getParameter("msgSubID2129");
            java.lang.String msgSubID_523idTemp = null;
        if(!msgSubID_523id.equals("")){
         msgSubID_523idTemp  = msgSubID_523id;
        }
        String deviceID_526id=  request.getParameter("deviceID2135");
            java.lang.String deviceID_526idTemp = null;
        if(!deviceID_526id.equals("")){
         deviceID_526idTemp  = deviceID_526id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1DeviceDetailsType_525id" scope="session" class="eBLBaseComponents.apis.ebay.DeviceDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1DeviceDetailsType_525id.setDeviceID(deviceID_526idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1SenderDetailsType_524id" scope="session" class="eBLBaseComponents.apis.ebay.SenderDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1SenderDetailsType_524id.setDeviceDetails(eBLBaseComponents1apis1ebay1DeviceDetailsType_525id);
        String countryName_529id=  request.getParameter("countryName2141");
            java.lang.String countryName_529idTemp = null;
        if(!countryName_529id.equals("")){
         countryName_529idTemp  = countryName_529id;
        }
        String internationalStreet_530id=  request.getParameter("internationalStreet2143");
            java.lang.String internationalStreet_530idTemp = null;
        if(!internationalStreet_530id.equals("")){
         internationalStreet_530idTemp  = internationalStreet_530id;
        }
        String externalAddressID_531id=  request.getParameter("externalAddressID2145");
            java.lang.String externalAddressID_531idTemp = null;
        if(!externalAddressID_531id.equals("")){
         externalAddressID_531idTemp  = externalAddressID_531id;
        }
        String stateOrProvince_532id=  request.getParameter("stateOrProvince2147");
            java.lang.String stateOrProvince_532idTemp = null;
        if(!stateOrProvince_532id.equals("")){
         stateOrProvince_532idTemp  = stateOrProvince_532id;
        }
        String internationalName_533id=  request.getParameter("internationalName2149");
            java.lang.String internationalName_533idTemp = null;
        if(!internationalName_533id.equals("")){
         internationalName_533idTemp  = internationalName_533id;
        }
        String cityName_534id=  request.getParameter("cityName2151");
            java.lang.String cityName_534idTemp = null;
        if(!cityName_534id.equals("")){
         cityName_534idTemp  = cityName_534id;
        }
        String phone_535id=  request.getParameter("phone2153");
            java.lang.String phone_535idTemp = null;
        if(!phone_535id.equals("")){
         phone_535idTemp  = phone_535id;
        }
        String postalCode_536id=  request.getParameter("postalCode2155");
            java.lang.String postalCode_536idTemp = null;
        if(!postalCode_536id.equals("")){
         postalCode_536idTemp  = postalCode_536id;
        }
        String street2_537id=  request.getParameter("street22157");
            java.lang.String street2_537idTemp = null;
        if(!street2_537id.equals("")){
         street2_537idTemp  = street2_537id;
        }
        String street1_538id=  request.getParameter("street12159");
            java.lang.String street1_538idTemp = null;
        if(!street1_538id.equals("")){
         street1_538idTemp  = street1_538id;
        }
        String addressID_539id=  request.getParameter("addressID2161");
            java.lang.String addressID_539idTemp = null;
        if(!addressID_539id.equals("")){
         addressID_539idTemp  = addressID_539id;
        }
        String internationalStateAndCity_540id=  request.getParameter("internationalStateAndCity2163");
            java.lang.String internationalStateAndCity_540idTemp = null;
        if(!internationalStateAndCity_540id.equals("")){
         internationalStateAndCity_540idTemp  = internationalStateAndCity_540id;
        }
        String name_541id=  request.getParameter("name2165");
            java.lang.String name_541idTemp = null;
        if(!name_541id.equals("")){
         name_541idTemp  = name_541id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_528id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_528id.setCountryName(countryName_529idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setInternationalStreet(internationalStreet_530idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setExternalAddressID(externalAddressID_531idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setStateOrProvince(stateOrProvince_532idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setInternationalName(internationalName_533idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setCityName(cityName_534idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setPhone(phone_535idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setPostalCode(postalCode_536idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setStreet2(street2_537idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setStreet1(street1_538idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setAddressID(addressID_539idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setInternationalStateAndCity(internationalStateAndCity_540idTemp);
        eBLBaseComponents1apis1ebay1AddressType_528id.setName(name_541idTemp);
        String startYear_542id=  request.getParameter("startYear2167");
            java.lang.Integer startYear_542idTemp = null;
        if(!startYear_542id.equals("")){
         startYear_542idTemp  = java.lang.Integer.valueOf(startYear_542id);
        }
        String issueNumber_543id=  request.getParameter("issueNumber2169");
            java.lang.String issueNumber_543idTemp = null;
        if(!issueNumber_543id.equals("")){
         issueNumber_543idTemp  = issueNumber_543id;
        }
        String cVV2_544id=  request.getParameter("cVV22171");
            java.lang.String cVV2_544idTemp = null;
        if(!cVV2_544id.equals("")){
         cVV2_544idTemp  = cVV2_544id;
        }
        String creditCardNumber_546id=  request.getParameter("creditCardNumber2175");
            java.lang.String creditCardNumber_546idTemp = null;
        if(!creditCardNumber_546id.equals("")){
         creditCardNumber_546idTemp  = creditCardNumber_546id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1CreditCardNumberTypeType_545id" scope="session" class="eBLBaseComponents.apis.ebay.CreditCardNumberTypeType" />
        <%
        eBLBaseComponents1apis1ebay1CreditCardNumberTypeType_545id.setCreditCardNumber(creditCardNumber_546idTemp);
        String expMonth_547id=  request.getParameter("expMonth2177");
            java.lang.Integer expMonth_547idTemp = null;
        if(!expMonth_547id.equals("")){
         expMonth_547idTemp  = java.lang.Integer.valueOf(expMonth_547id);
        }
        String lastName_549id=  request.getParameter("lastName2181");
            java.lang.String lastName_549idTemp = null;
        if(!lastName_549id.equals("")){
         lastName_549idTemp  = lastName_549id;
        }
        String middleName_550id=  request.getParameter("middleName2183");
            java.lang.String middleName_550idTemp = null;
        if(!middleName_550id.equals("")){
         middleName_550idTemp  = middleName_550id;
        }
        String firstName_551id=  request.getParameter("firstName2185");
            java.lang.String firstName_551idTemp = null;
        if(!firstName_551id.equals("")){
         firstName_551idTemp  = firstName_551id;
        }
        String suffix_552id=  request.getParameter("suffix2187");
            java.lang.String suffix_552idTemp = null;
        if(!suffix_552id.equals("")){
         suffix_552idTemp  = suffix_552id;
        }
        String salutation_553id=  request.getParameter("salutation2189");
            java.lang.String salutation_553idTemp = null;
        if(!salutation_553id.equals("")){
         salutation_553idTemp  = salutation_553id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PersonNameType_548id" scope="session" class="eBLBaseComponents.apis.ebay.PersonNameType" />
        <%
        eBLBaseComponents1apis1ebay1PersonNameType_548id.setLastName(lastName_549idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_548id.setMiddleName(middleName_550idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_548id.setFirstName(firstName_551idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_548id.setSuffix(suffix_552idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_548id.setSalutation(salutation_553idTemp);
        String startMonth_554id=  request.getParameter("startMonth2191");
            java.lang.Integer startMonth_554idTemp = null;
        if(!startMonth_554id.equals("")){
         startMonth_554idTemp  = java.lang.Integer.valueOf(startMonth_554id);
        }
        String expYear_555id=  request.getParameter("expYear2193");
            java.lang.Integer expYear_555idTemp = null;
        if(!expYear_555id.equals("")){
         expYear_555idTemp  = java.lang.Integer.valueOf(expYear_555id);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id" scope="session" class="eBLBaseComponents.apis.ebay.ReferenceCreditCardDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setBillingAddress(eBLBaseComponents1apis1ebay1AddressType_528id);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setStartYear(startYear_542idTemp);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setIssueNumber(issueNumber_543idTemp);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setCVV2(cVV2_544idTemp);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setCreditCardNumberType(eBLBaseComponents1apis1ebay1CreditCardNumberTypeType_545id);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setExpMonth(expMonth_547idTemp);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setCardOwnerName(eBLBaseComponents1apis1ebay1PersonNameType_548id);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setStartMonth(startMonth_554idTemp);
        eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id.setExpYear(expYear_555idTemp);
        String softDescriptor_556id=  request.getParameter("softDescriptor2195");
            java.lang.String softDescriptor_556idTemp = null;
        if(!softDescriptor_556id.equals("")){
         softDescriptor_556idTemp  = softDescriptor_556id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id" scope="session" class="eBLBaseComponents.apis.ebay.DoReferenceTransactionRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setPaymentDetails(eBLBaseComponents1apis1ebay1PaymentDetailsType_451id);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setIPAddress(iPAddress_519idTemp);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setMerchantSessionId(merchantSessionId_520idTemp);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setReferenceID(referenceID_521idTemp);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setReqConfirmShipping(reqConfirmShipping_522idTemp);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setMsgSubID(msgSubID_523idTemp);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setSenderDetails(eBLBaseComponents1apis1ebay1SenderDetailsType_524id);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setCreditCard(eBLBaseComponents1apis1ebay1ReferenceCreditCardDetailsType_527id);
        eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id.setSoftDescriptor(softDescriptor_556idTemp);
        String returnFMFDetails_557id=  request.getParameter("returnFMFDetails2197");
            java.lang.Integer returnFMFDetails_557idTemp = null;
        if(!returnFMFDetails_557id.equals("")){
         returnFMFDetails_557idTemp  = java.lang.Integer.valueOf(returnFMFDetails_557id);
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoReferenceTransactionRequestType_449id" scope="session" class="PayPalAPI.api.ebay.DoReferenceTransactionRequestType" />
        <%
        PayPalAPI1api1ebay1DoReferenceTransactionRequestType_449id.setDoReferenceTransactionRequestDetails(eBLBaseComponents1apis1ebay1DoReferenceTransactionRequestDetailsType_450id);
        PayPalAPI1api1ebay1DoReferenceTransactionRequestType_449id.setReturnFMFDetails(returnFMFDetails_557idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoReferenceTransactionReq_448id" scope="session" class="PayPalAPI.api.ebay.DoReferenceTransactionReq" />
        <%
        PayPalAPI1api1ebay1DoReferenceTransactionReq_448id.setDoReferenceTransactionRequest(PayPalAPI1api1ebay1DoReferenceTransactionRequestType_449id);
        PayPalAPI.api.ebay.DoReferenceTransactionResponseType doReferenceTransaction1842mtemp = samplePayPalAPIAAInterfaceProxyid.doReferenceTransaction(PayPalAPI1api1ebay1DoReferenceTransactionReq_448id);
if(doReferenceTransaction1842mtemp == null){
%>
<%=doReferenceTransaction1842mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">doReferenceTransactionResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typetransactionID1847 = tebece0.getTransactionID();
        String tempResulttransactionID1847 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID1847));
        %>
        <%= tempResulttransactionID1847 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">aVSCode:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typeaVSCode1849 = tebece0.getAVSCode();
        String tempResultaVSCode1849 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaVSCode1849));
        %>
        <%= tempResultaVSCode1849 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">paymentInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">enhancedPaymentInfo:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
EnhancedDataTypes.apis.ebay.EnhancedPaymentInfoType typeenhancedPaymentInfo1853 = tebece1.getEnhancedPaymentInfo();
        if(typeenhancedPaymentInfo1853!= null){
        String tempenhancedPaymentInfo1853 = typeenhancedPaymentInfo1853.toString();
        %>
        <%=tempenhancedPaymentInfo1853%>
        <%
        }}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">protectionEligibilityType:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeprotectionEligibilityType1855 = tebece1.getProtectionEligibilityType();
        String tempResultprotectionEligibilityType1855 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibilityType1855));
        %>
        <%= tempResultprotectionEligibilityType1855 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shipHandleAmount:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshipHandleAmount1857 = tebece1.getShipHandleAmount();
        String tempResultshipHandleAmount1857 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshipHandleAmount1857));
        %>
        <%= tempResultshipHandleAmount1857 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">receiptID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typereceiptID1859 = tebece1.getReceiptID();
        String tempResultreceiptID1859 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiptID1859));
        %>
        <%= tempResultreceiptID1859 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">ebayTransactionID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeebayTransactionID1861 = tebece1.getEbayTransactionID();
        String tempResultebayTransactionID1861 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeebayTransactionID1861));
        %>
        <%= tempResultebayTransactionID1861 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">holdDecision:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeholdDecision1863 = tebece1.getHoldDecision();
        String tempResultholdDecision1863 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeholdDecision1863));
        %>
        <%= tempResultholdDecision1863 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">subject:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typesubject1865 = tebece1.getSubject();
        String tempResultsubject1865 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesubject1865));
        %>
        <%= tempResultsubject1865 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">terminalID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeterminalID1867 = tebece1.getTerminalID();
        String tempResultterminalID1867 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeterminalID1867));
        %>
        <%= tempResultterminalID1867 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">paymentDate:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.util.Calendar typepaymentDate1869 = tebece1.getPaymentDate();
        java.text.DateFormat dateFormatpaymentDate1869 = java.text.DateFormat.getDateInstance();
        java.util.Date datepaymentDate1869 = typepaymentDate1869.getTime();
        String tempResultpaymentDate1869 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatpaymentDate1869.format(datepaymentDate1869));
        %>
        <%= tempResultpaymentDate1869 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typetransactionID1871 = tebece1.getTransactionID();
        String tempResulttransactionID1871 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID1871));
        %>
        <%= tempResulttransactionID1871 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">offerDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">bMLOfferInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">offerTrackingID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.OfferDetailsType tebece2=tebece1.getOfferDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.BMLOfferInfoType tebece3=tebece2.getBMLOfferInfo();
if(tebece3 != null){
java.lang.String typeofferTrackingID1877 = tebece3.getOfferTrackingID();
        String tempResultofferTrackingID1877 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeofferTrackingID1877));
        %>
        <%= tempResultofferTrackingID1877 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">offerCode:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.OfferDetailsType tebece2=tebece1.getOfferDetails();
if(tebece2 != null){
java.lang.String typeofferCode1879 = tebece2.getOfferCode();
        String tempResultofferCode1879 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeofferCode1879));
        %>
        <%= tempResultofferCode1879 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">feeAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getFeeAmount();
if(tebece2 != null){
java.lang.String type_value1883 = tebece2.get_value();
        String tempResult_value1883 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1883));
        %>
        <%= tempResult_value1883 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">fMFDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">reportFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typereportFilters1887 = tebece2.getReportFilters();
        String tempreportFilters1887 = null;
        if(typereportFilters1887 != null){
        java.util.List listreportFilters1887= java.util.Arrays.asList(typereportFilters1887);
        tempreportFilters1887 = listreportFilters1887.toString();
        }
        %>
        <%=tempreportFilters1887%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">denyFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typedenyFilters1889 = tebece2.getDenyFilters();
        String tempdenyFilters1889 = null;
        if(typedenyFilters1889 != null){
        java.util.List listdenyFilters1889= java.util.Arrays.asList(typedenyFilters1889);
        tempdenyFilters1889 = listdenyFilters1889.toString();
        }
        %>
        <%=tempdenyFilters1889%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">pendingFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typependingFilters1891 = tebece2.getPendingFilters();
        String temppendingFilters1891 = null;
        if(typependingFilters1891 != null){
        java.util.List listpendingFilters1891= java.util.Arrays.asList(typependingFilters1891);
        temppendingFilters1891 = listpendingFilters1891.toString();
        }
        %>
        <%=temppendingFilters1891%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">acceptFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece2=tebece1.getFMFDetails();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typeacceptFilters1893 = tebece2.getAcceptFilters();
        String tempacceptFilters1893 = null;
        if(typeacceptFilters1893 != null){
        java.util.List listacceptFilters1893= java.util.Arrays.asList(typeacceptFilters1893);
        tempacceptFilters1893 = listacceptFilters1893.toString();
        }
        %>
        <%=tempacceptFilters1893%>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">paymentRequestID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typepaymentRequestID1895 = tebece1.getPaymentRequestID();
        String tempResultpaymentRequestID1895 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepaymentRequestID1895));
        %>
        <%= tempResultpaymentRequestID1895 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shipAmount:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshipAmount1897 = tebece1.getShipAmount();
        String tempResultshipAmount1897 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshipAmount1897));
        %>
        <%= tempResultshipAmount1897 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">sellerDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">sellerUserName:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typesellerUserName1901 = tebece2.getSellerUserName();
        String tempResultsellerUserName1901 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesellerUserName1901));
        %>
        <%= tempResultsellerUserName1901 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">secureMerchantAccountID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typesecureMerchantAccountID1903 = tebece2.getSecureMerchantAccountID();
        String tempResultsecureMerchantAccountID1903 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesecureMerchantAccountID1903));
        %>
        <%= tempResultsecureMerchantAccountID1903 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">payPalAccountID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typepayPalAccountID1905 = tebece2.getPayPalAccountID();
        String tempResultpayPalAccountID1905 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayPalAccountID1905));
        %>
        <%= tempResultpayPalAccountID1905 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">sellerId:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.lang.String typesellerId1907 = tebece2.getSellerId();
        String tempResultsellerId1907 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesellerId1907));
        %>
        <%= tempResultsellerId1907 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">sellerRegistrationDate:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.SellerDetailsType tebece2=tebece1.getSellerDetails();
if(tebece2 != null){
java.util.Calendar typesellerRegistrationDate1909 = tebece2.getSellerRegistrationDate();
        java.text.DateFormat dateFormatsellerRegistrationDate1909 = java.text.DateFormat.getDateInstance();
        java.util.Date datesellerRegistrationDate1909 = typesellerRegistrationDate1909.getTime();
        String tempResultsellerRegistrationDate1909 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatsellerRegistrationDate1909.format(datesellerRegistrationDate1909));
        %>
        <%= tempResultsellerRegistrationDate1909 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">storeID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typestoreID1911 = tebece1.getStoreID();
        String tempResultstoreID1911 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestoreID1911));
        %>
        <%= tempResultstoreID1911 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">insuranceAmount:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeinsuranceAmount1913 = tebece1.getInsuranceAmount();
        String tempResultinsuranceAmount1913 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinsuranceAmount1913));
        %>
        <%= tempResultinsuranceAmount1913 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingMethod:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshippingMethod1915 = tebece1.getShippingMethod();
        String tempResultshippingMethod1915 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshippingMethod1915));
        %>
        <%= tempResultshippingMethod1915 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">exchangeRate:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeexchangeRate1917 = tebece1.getExchangeRate();
        String tempResultexchangeRate1917 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexchangeRate1917));
        %>
        <%= tempResultexchangeRate1917 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">paymentError:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">shortMessage:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ErrorType tebece2=tebece1.getPaymentError();
if(tebece2 != null){
java.lang.String typeshortMessage1921 = tebece2.getShortMessage();
        String tempResultshortMessage1921 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshortMessage1921));
        %>
        <%= tempResultshortMessage1921 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">errorCode:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">longMessage:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ErrorType tebece2=tebece1.getPaymentError();
if(tebece2 != null){
java.lang.String typelongMessage1927 = tebece2.getLongMessage();
        String tempResultlongMessage1927 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelongMessage1927));
        %>
        <%= tempResultlongMessage1927 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">instrumentDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">instrumentCategory:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.InstrumentDetailsType tebece2=tebece1.getInstrumentDetails();
if(tebece2 != null){
java.lang.String typeinstrumentCategory1931 = tebece2.getInstrumentCategory();
        String tempResultinstrumentCategory1931 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinstrumentCategory1931));
        %>
        <%= tempResultinstrumentCategory1931 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shipDiscount:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeshipDiscount1933 = tebece1.getShipDiscount();
        String tempResultshipDiscount1933 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshipDiscount1933));
        %>
        <%= tempResultshipDiscount1933 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">parentTransactionID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeparentTransactionID1935 = tebece1.getParentTransactionID();
        String tempResultparentTransactionID1935 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeparentTransactionID1935));
        %>
        <%= tempResultparentTransactionID1935 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">protectionEligibility:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typeprotectionEligibility1937 = tebece1.getProtectionEligibility();
        String tempResultprotectionEligibility1937 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprotectionEligibility1937));
        %>
        <%= tempResultprotectionEligibility1937 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">receiptReferenceNumber:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typereceiptReferenceNumber1939 = tebece1.getReceiptReferenceNumber();
        String tempResultreceiptReferenceNumber1939 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereceiptReferenceNumber1939));
        %>
        <%= tempResultreceiptReferenceNumber1939 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">grossAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getGrossAmount();
if(tebece2 != null){
java.lang.String type_value1943 = tebece2.get_value();
        String tempResult_value1943 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1943));
        %>
        <%= tempResult_value1943 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">binEligibility:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.lang.String typebinEligibility1945 = tebece1.getBinEligibility();
        String tempResultbinEligibility1945 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebinEligibility1945));
        %>
        <%= tempResultbinEligibility1945 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">settleAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getSettleAmount();
if(tebece2 != null){
java.lang.String type_value1949 = tebece2.get_value();
        String tempResult_value1949 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1949));
        %>
        <%= tempResult_value1949 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">expectedeCheckClearDate:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
java.util.Calendar typeexpectedeCheckClearDate1951 = tebece1.getExpectedeCheckClearDate();
        java.text.DateFormat dateFormatexpectedeCheckClearDate1951 = java.text.DateFormat.getDateInstance();
        java.util.Date dateexpectedeCheckClearDate1951 = typeexpectedeCheckClearDate1951.getTime();
        String tempResultexpectedeCheckClearDate1951 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatexpectedeCheckClearDate1951.format(dateexpectedeCheckClearDate1951));
        %>
        <%= tempResultexpectedeCheckClearDate1951 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">taxAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.PaymentInfoType tebece1=tebece0.getPaymentInfo();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getTaxAmount();
if(tebece2 != null){
java.lang.String type_value1955 = tebece2.get_value();
        String tempResult_value1955 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1955));
        %>
        <%= tempResult_value1955 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">paymentAdviceCode:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typepaymentAdviceCode1957 = tebece0.getPaymentAdviceCode();
        String tempResultpaymentAdviceCode1957 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepaymentAdviceCode1957));
        %>
        <%= tempResultpaymentAdviceCode1957 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">cVV2Code:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typecVV2Code1959 = tebece0.getCVV2Code();
        String tempResultcVV2Code1959 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecVV2Code1959));
        %>
        <%= tempResultcVV2Code1959 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">amount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getAmount();
if(tebece1 != null){
java.lang.String type_value1963 = tebece1.get_value();
        String tempResult_value1963 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value1963));
        %>
        <%= tempResult_value1963 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">billingAgreementID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typebillingAgreementID1965 = tebece0.getBillingAgreementID();
        String tempResultbillingAgreementID1965 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebillingAgreementID1965));
        %>
        <%= tempResultbillingAgreementID1965 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">msgSubID:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType tebece0=doReferenceTransaction1842mtemp.getDoReferenceTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typemsgSubID1967 = tebece0.getMsgSubID();
        String tempResultmsgSubID1967 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemsgSubID1967));
        %>
        <%= tempResultmsgSubID1967 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fMFDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">reportFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doReferenceTransaction1842mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typereportFilters1971 = tebece0.getReportFilters();
        String tempreportFilters1971 = null;
        if(typereportFilters1971 != null){
        java.util.List listreportFilters1971= java.util.Arrays.asList(typereportFilters1971);
        tempreportFilters1971 = listreportFilters1971.toString();
        }
        %>
        <%=tempreportFilters1971%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">denyFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doReferenceTransaction1842mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typedenyFilters1973 = tebece0.getDenyFilters();
        String tempdenyFilters1973 = null;
        if(typedenyFilters1973 != null){
        java.util.List listdenyFilters1973= java.util.Arrays.asList(typedenyFilters1973);
        tempdenyFilters1973 = listdenyFilters1973.toString();
        }
        %>
        <%=tempdenyFilters1973%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">pendingFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doReferenceTransaction1842mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typependingFilters1975 = tebece0.getPendingFilters();
        String temppendingFilters1975 = null;
        if(typependingFilters1975 != null){
        java.util.List listpendingFilters1975= java.util.Arrays.asList(typependingFilters1975);
        temppendingFilters1975 = listpendingFilters1975.toString();
        }
        %>
        <%=temppendingFilters1975%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">acceptFilters:</TD>
<TD>
<%
if(doReferenceTransaction1842mtemp != null){
eBLBaseComponents.apis.ebay.FMFDetailsType tebece0=doReferenceTransaction1842mtemp.getFMFDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] typeacceptFilters1977 = tebece0.getAcceptFilters();
        String tempacceptFilters1977 = null;
        if(typeacceptFilters1977 != null){
        java.util.List listacceptFilters1977= java.util.Arrays.asList(typeacceptFilters1977);
        tempacceptFilters1977 = listacceptFilters1977.toString();
        }
        %>
        <%=tempacceptFilters1977%>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 2199:
        gotMethod = true;
        String receiverEmail_561id=  request.getParameter("receiverEmail2216");
            java.lang.String receiverEmail_561idTemp = null;
        if(!receiverEmail_561id.equals("")){
         receiverEmail_561idTemp  = receiverEmail_561id;
        }
        String authStatus3Ds_564id=  request.getParameter("authStatus3Ds2222");
            java.lang.String authStatus3Ds_564idTemp = null;
        if(!authStatus3Ds_564id.equals("")){
         authStatus3Ds_564idTemp  = authStatus3Ds_564id;
        }
        String xid_565id=  request.getParameter("xid2224");
            java.lang.String xid_565idTemp = null;
        if(!xid_565id.equals("")){
         xid_565idTemp  = xid_565id;
        }
        String cavv_566id=  request.getParameter("cavv2226");
            java.lang.String cavv_566idTemp = null;
        if(!cavv_566id.equals("")){
         cavv_566idTemp  = cavv_566id;
        }
        String eci3Ds_567id=  request.getParameter("eci3Ds2228");
            java.lang.String eci3Ds_567idTemp = null;
        if(!eci3Ds_567id.equals("")){
         eci3Ds_567idTemp  = eci3Ds_567id;
        }
        String mpiVendor3Ds_568id=  request.getParameter("mpiVendor3Ds2230");
            java.lang.String mpiVendor3Ds_568idTemp = null;
        if(!mpiVendor3Ds_568id.equals("")){
         mpiVendor3Ds_568idTemp  = mpiVendor3Ds_568id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_563id" scope="session" class="eBLBaseComponents.apis.ebay.ThreeDSecureRequestType" />
        <%
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_563id.setAuthStatus3Ds(authStatus3Ds_564idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_563id.setXid(xid_565idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_563id.setCavv(cavv_566idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_563id.setEci3Ds(eci3Ds_567idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_563id.setMpiVendor3Ds(mpiVendor3Ds_568idTemp);
        String startYear_569id=  request.getParameter("startYear2232");
            java.lang.Integer startYear_569idTemp = null;
        if(!startYear_569id.equals("")){
         startYear_569idTemp  = java.lang.Integer.valueOf(startYear_569id);
        }
        String payerID_571id=  request.getParameter("payerID2236");
            java.lang.String payerID_571idTemp = null;
        if(!payerID_571id.equals("")){
         payerID_571idTemp  = payerID_571id;
        }
        String taxId_573id=  request.getParameter("taxId2240");
            java.lang.String taxId_573idTemp = null;
        if(!taxId_573id.equals("")){
         taxId_573idTemp  = taxId_573id;
        }
        String taxIdType_574id=  request.getParameter("taxIdType2242");
            java.lang.String taxIdType_574idTemp = null;
        if(!taxIdType_574id.equals("")){
         taxIdType_574idTemp  = taxIdType_574id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1TaxIdDetailsType_572id" scope="session" class="eBLBaseComponents.apis.ebay.TaxIdDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_572id.setTaxId(taxId_573idTemp);
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_572id.setTaxIdType(taxIdType_574idTemp);
        String lastName_576id=  request.getParameter("lastName2246");
            java.lang.String lastName_576idTemp = null;
        if(!lastName_576id.equals("")){
         lastName_576idTemp  = lastName_576id;
        }
        String middleName_577id=  request.getParameter("middleName2248");
            java.lang.String middleName_577idTemp = null;
        if(!middleName_577id.equals("")){
         middleName_577idTemp  = middleName_577id;
        }
        String firstName_578id=  request.getParameter("firstName2250");
            java.lang.String firstName_578idTemp = null;
        if(!firstName_578id.equals("")){
         firstName_578idTemp  = firstName_578id;
        }
        String suffix_579id=  request.getParameter("suffix2252");
            java.lang.String suffix_579idTemp = null;
        if(!suffix_579id.equals("")){
         suffix_579idTemp  = suffix_579id;
        }
        String salutation_580id=  request.getParameter("salutation2254");
            java.lang.String salutation_580idTemp = null;
        if(!salutation_580id.equals("")){
         salutation_580idTemp  = salutation_580id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PersonNameType_575id" scope="session" class="eBLBaseComponents.apis.ebay.PersonNameType" />
        <%
        eBLBaseComponents1apis1ebay1PersonNameType_575id.setLastName(lastName_576idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_575id.setMiddleName(middleName_577idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_575id.setFirstName(firstName_578idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_575id.setSuffix(suffix_579idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_575id.setSalutation(salutation_580idTemp);
        String payer_581id=  request.getParameter("payer2256");
            java.lang.String payer_581idTemp = null;
        if(!payer_581id.equals("")){
         payer_581idTemp  = payer_581id;
        }
        %>
        <jsp:useBean id="EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_582id" scope="session" class="EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType" />
        <%
        String contactPhone_583id=  request.getParameter("contactPhone2260");
            java.lang.String contactPhone_583idTemp = null;
        if(!contactPhone_583id.equals("")){
         contactPhone_583idTemp  = contactPhone_583id;
        }
        String payerBusiness_584id=  request.getParameter("payerBusiness2262");
            java.lang.String payerBusiness_584idTemp = null;
        if(!payerBusiness_584id.equals("")){
         payerBusiness_584idTemp  = payerBusiness_584id;
        }
        String countryName_586id=  request.getParameter("countryName2266");
            java.lang.String countryName_586idTemp = null;
        if(!countryName_586id.equals("")){
         countryName_586idTemp  = countryName_586id;
        }
        String internationalStreet_587id=  request.getParameter("internationalStreet2268");
            java.lang.String internationalStreet_587idTemp = null;
        if(!internationalStreet_587id.equals("")){
         internationalStreet_587idTemp  = internationalStreet_587id;
        }
        String externalAddressID_588id=  request.getParameter("externalAddressID2270");
            java.lang.String externalAddressID_588idTemp = null;
        if(!externalAddressID_588id.equals("")){
         externalAddressID_588idTemp  = externalAddressID_588id;
        }
        String stateOrProvince_589id=  request.getParameter("stateOrProvince2272");
            java.lang.String stateOrProvince_589idTemp = null;
        if(!stateOrProvince_589id.equals("")){
         stateOrProvince_589idTemp  = stateOrProvince_589id;
        }
        String internationalName_590id=  request.getParameter("internationalName2274");
            java.lang.String internationalName_590idTemp = null;
        if(!internationalName_590id.equals("")){
         internationalName_590idTemp  = internationalName_590id;
        }
        String cityName_591id=  request.getParameter("cityName2276");
            java.lang.String cityName_591idTemp = null;
        if(!cityName_591id.equals("")){
         cityName_591idTemp  = cityName_591id;
        }
        String phone_592id=  request.getParameter("phone2278");
            java.lang.String phone_592idTemp = null;
        if(!phone_592id.equals("")){
         phone_592idTemp  = phone_592id;
        }
        String postalCode_593id=  request.getParameter("postalCode2280");
            java.lang.String postalCode_593idTemp = null;
        if(!postalCode_593id.equals("")){
         postalCode_593idTemp  = postalCode_593id;
        }
        String street2_594id=  request.getParameter("street22282");
            java.lang.String street2_594idTemp = null;
        if(!street2_594id.equals("")){
         street2_594idTemp  = street2_594id;
        }
        String street1_595id=  request.getParameter("street12284");
            java.lang.String street1_595idTemp = null;
        if(!street1_595id.equals("")){
         street1_595idTemp  = street1_595id;
        }
        String addressID_596id=  request.getParameter("addressID2286");
            java.lang.String addressID_596idTemp = null;
        if(!addressID_596id.equals("")){
         addressID_596idTemp  = addressID_596id;
        }
        String internationalStateAndCity_597id=  request.getParameter("internationalStateAndCity2288");
            java.lang.String internationalStateAndCity_597idTemp = null;
        if(!internationalStateAndCity_597id.equals("")){
         internationalStateAndCity_597idTemp  = internationalStateAndCity_597id;
        }
        String name_598id=  request.getParameter("name2290");
            java.lang.String name_598idTemp = null;
        if(!name_598id.equals("")){
         name_598idTemp  = name_598id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_585id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_585id.setCountryName(countryName_586idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setInternationalStreet(internationalStreet_587idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setExternalAddressID(externalAddressID_588idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setStateOrProvince(stateOrProvince_589idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setInternationalName(internationalName_590idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setCityName(cityName_591idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setPhone(phone_592idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setPostalCode(postalCode_593idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setStreet2(street2_594idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setStreet1(street1_595idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setAddressID(addressID_596idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setInternationalStateAndCity(internationalStateAndCity_597idTemp);
        eBLBaseComponents1apis1ebay1AddressType_585id.setName(name_598idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PayerInfoType_570id" scope="session" class="eBLBaseComponents.apis.ebay.PayerInfoType" />
        <%
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setPayerID(payerID_571idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setTaxIdDetails(eBLBaseComponents1apis1ebay1TaxIdDetailsType_572id);
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setPayerName(eBLBaseComponents1apis1ebay1PersonNameType_575id);
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setPayer(payer_581idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setEnhancedPayerInfo(EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_582id);
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setContactPhone(contactPhone_583idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setPayerBusiness(payerBusiness_584idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_570id.setAddress(eBLBaseComponents1apis1ebay1AddressType_585id);
        String issueNumber_599id=  request.getParameter("issueNumber2292");
            java.lang.String issueNumber_599idTemp = null;
        if(!issueNumber_599id.equals("")){
         issueNumber_599idTemp  = issueNumber_599id;
        }
        String cVV2_600id=  request.getParameter("cVV22294");
            java.lang.String cVV2_600idTemp = null;
        if(!cVV2_600id.equals("")){
         cVV2_600idTemp  = cVV2_600id;
        }
        String expMonth_601id=  request.getParameter("expMonth2296");
            java.lang.Integer expMonth_601idTemp = null;
        if(!expMonth_601id.equals("")){
         expMonth_601idTemp  = java.lang.Integer.valueOf(expMonth_601id);
        }
        String startMonth_602id=  request.getParameter("startMonth2298");
            java.lang.Integer startMonth_602idTemp = null;
        if(!startMonth_602id.equals("")){
         startMonth_602idTemp  = java.lang.Integer.valueOf(startMonth_602id);
        }
        String creditCardNumber_603id=  request.getParameter("creditCardNumber2300");
            java.lang.String creditCardNumber_603idTemp = null;
        if(!creditCardNumber_603id.equals("")){
         creditCardNumber_603idTemp  = creditCardNumber_603id;
        }
        String expYear_604id=  request.getParameter("expYear2302");
            java.lang.Integer expYear_604idTemp = null;
        if(!expYear_604id.equals("")){
         expYear_604idTemp  = java.lang.Integer.valueOf(expYear_604id);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id" scope="session" class="eBLBaseComponents.apis.ebay.CreditCardDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setThreeDSecureRequest(eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_563id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setStartYear(startYear_569idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setCardOwner(eBLBaseComponents1apis1ebay1PayerInfoType_570id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setIssueNumber(issueNumber_599idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setCVV2(cVV2_600idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setExpMonth(expMonth_601idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setStartMonth(startMonth_602idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setCreditCardNumber(creditCardNumber_603idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id.setExpYear(expYear_604idTemp);
        String _value_606id=  request.getParameter("_value2306");
            java.lang.String _value_606idTemp = null;
        if(!_value_606id.equals("")){
         _value_606idTemp  = _value_606id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_605id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_605id.set_value(_value_606idTemp);
        String _value_608id=  request.getParameter("_value2310");
            java.lang.String _value_608idTemp = null;
        if(!_value_608id.equals("")){
         _value_608idTemp  = _value_608id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_607id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_607id.set_value(_value_608idTemp);
        String _value_610id=  request.getParameter("_value2314");
            java.lang.String _value_610idTemp = null;
        if(!_value_610id.equals("")){
         _value_610idTemp  = _value_610id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_609id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_609id.set_value(_value_610idTemp);
        String _value_612id=  request.getParameter("_value2318");
            java.lang.String _value_612idTemp = null;
        if(!_value_612id.equals("")){
         _value_612idTemp  = _value_612id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_611id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_611id.set_value(_value_612idTemp);
        String comment_613id=  request.getParameter("comment2320");
            java.lang.String comment_613idTemp = null;
        if(!comment_613id.equals("")){
         comment_613idTemp  = comment_613id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id" scope="session" class="eBLBaseComponents.apis.ebay.DoNonReferencedCreditRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id.setReceiverEmail(receiverEmail_561idTemp);
        eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id.setCreditCard(eBLBaseComponents1apis1ebay1CreditCardDetailsType_562id);
        eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_605id);
        eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id.setTaxAmount(CoreComponentTypes1apis1ebay1BasicAmountType_607id);
        eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id.setShippingAmount(CoreComponentTypes1apis1ebay1BasicAmountType_609id);
        eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id.setNetAmount(CoreComponentTypes1apis1ebay1BasicAmountType_611id);
        eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id.setComment(comment_613idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoNonReferencedCreditRequestType_559id" scope="session" class="PayPalAPI.api.ebay.DoNonReferencedCreditRequestType" />
        <%
        PayPalAPI1api1ebay1DoNonReferencedCreditRequestType_559id.setDoNonReferencedCreditRequestDetails(eBLBaseComponents1apis1ebay1DoNonReferencedCreditRequestDetailsType_560id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoNonReferencedCreditReq_558id" scope="session" class="PayPalAPI.api.ebay.DoNonReferencedCreditReq" />
        <%
        PayPalAPI1api1ebay1DoNonReferencedCreditReq_558id.setDoNonReferencedCreditRequest(PayPalAPI1api1ebay1DoNonReferencedCreditRequestType_559id);
        PayPalAPI.api.ebay.DoNonReferencedCreditResponseType doNonReferencedCredit2199mtemp = samplePayPalAPIAAInterfaceProxyid.doNonReferencedCredit(PayPalAPI1api1ebay1DoNonReferencedCreditReq_558id);
if(doNonReferencedCredit2199mtemp == null){
%>
<%=doNonReferencedCredit2199mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">doNonReferencedCreditResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">amount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(doNonReferencedCredit2199mtemp != null){
eBLBaseComponents.apis.ebay.DoNonReferencedCreditResponseDetailsType tebece0=doNonReferencedCredit2199mtemp.getDoNonReferencedCreditResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getAmount();
if(tebece1 != null){
java.lang.String type_value2206 = tebece1.get_value();
        String tempResult_value2206 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2206));
        %>
        <%= tempResult_value2206 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(doNonReferencedCredit2199mtemp != null){
eBLBaseComponents.apis.ebay.DoNonReferencedCreditResponseDetailsType tebece0=doNonReferencedCredit2199mtemp.getDoNonReferencedCreditResponseDetails();
if(tebece0 != null){
java.lang.String typetransactionID2208 = tebece0.getTransactionID();
        String tempResulttransactionID2208 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID2208));
        %>
        <%= tempResulttransactionID2208 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 2322:
        gotMethod = true;
        String msgSubID_616id=  request.getParameter("msgSubID2343");
            java.lang.String msgSubID_616idTemp = null;
        if(!msgSubID_616id.equals("")){
         msgSubID_616idTemp  = msgSubID_616id;
        }
        String _value_618id=  request.getParameter("_value2347");
            java.lang.String _value_618idTemp = null;
        if(!_value_618id.equals("")){
         _value_618idTemp  = _value_618id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_617id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_617id.set_value(_value_618idTemp);
        String expYear_620id=  request.getParameter("expYear2351");
        int expYear_620idTemp  = Integer.parseInt(expYear_620id);
        String uATPNumber_621id=  request.getParameter("uATPNumber2353");
            java.lang.String uATPNumber_621idTemp = null;
        if(!uATPNumber_621id.equals("")){
         uATPNumber_621idTemp  = uATPNumber_621id;
        }
        String expMonth_622id=  request.getParameter("expMonth2355");
        int expMonth_622idTemp  = Integer.parseInt(expMonth_622id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1UATPDetailsType_619id" scope="session" class="eBLBaseComponents.apis.ebay.UATPDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1UATPDetailsType_619id.setExpYear(expYear_620idTemp);
        eBLBaseComponents1apis1ebay1UATPDetailsType_619id.setUATPNumber(uATPNumber_621idTemp);
        eBLBaseComponents1apis1ebay1UATPDetailsType_619id.setExpMonth(expMonth_622idTemp);
        String invoiceID_623id=  request.getParameter("invoiceID2357");
            java.lang.String invoiceID_623idTemp = null;
        if(!invoiceID_623id.equals("")){
         invoiceID_623idTemp  = invoiceID_623id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoUATPAuthorizationRequestType_615id" scope="session" class="PayPalAPI.api.ebay.DoUATPAuthorizationRequestType" />
        <%
        PayPalAPI1api1ebay1DoUATPAuthorizationRequestType_615id.setMsgSubID(msgSubID_616idTemp);
        PayPalAPI1api1ebay1DoUATPAuthorizationRequestType_615id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_617id);
        PayPalAPI1api1ebay1DoUATPAuthorizationRequestType_615id.setUATPDetails(eBLBaseComponents1apis1ebay1UATPDetailsType_619id);
        PayPalAPI1api1ebay1DoUATPAuthorizationRequestType_615id.setInvoiceID(invoiceID_623idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1DoUATPAuthorizationReq_614id" scope="session" class="PayPalAPI.api.ebay.DoUATPAuthorizationReq" />
        <%
        PayPalAPI1api1ebay1DoUATPAuthorizationReq_614id.setDoUATPAuthorizationRequest(PayPalAPI1api1ebay1DoUATPAuthorizationRequestType_615id);
        PayPalAPI.api.ebay.DoUATPAuthorizationResponseType doUATPAuthorization2322mtemp = samplePayPalAPIAAInterfaceProxyid.doUATPAuthorization(PayPalAPI1api1ebay1DoUATPAuthorizationReq_614id);
if(doUATPAuthorization2322mtemp == null){
%>
<%=doUATPAuthorization2322mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">msgSubID:</TD>
<TD>
<%
if(doUATPAuthorization2322mtemp != null){
java.lang.String typemsgSubID2325 = doUATPAuthorization2322mtemp.getMsgSubID();
        String tempResultmsgSubID2325 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemsgSubID2325));
        %>
        <%= tempResultmsgSubID2325 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">authorizationCode:</TD>
<TD>
<%
if(doUATPAuthorization2322mtemp != null){
java.lang.String typeauthorizationCode2327 = doUATPAuthorization2322mtemp.getAuthorizationCode();
        String tempResultauthorizationCode2327 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthorizationCode2327));
        %>
        <%= tempResultauthorizationCode2327 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">uATPDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">expYear:</TD>
<TD>
<%
if(doUATPAuthorization2322mtemp != null){
eBLBaseComponents.apis.ebay.UATPDetailsType tebece0=doUATPAuthorization2322mtemp.getUATPDetails();
if(tebece0 != null){
%>
<%=tebece0.getExpYear()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">uATPNumber:</TD>
<TD>
<%
if(doUATPAuthorization2322mtemp != null){
eBLBaseComponents.apis.ebay.UATPDetailsType tebece0=doUATPAuthorization2322mtemp.getUATPDetails();
if(tebece0 != null){
java.lang.String typeuATPNumber2333 = tebece0.getUATPNumber();
        String tempResultuATPNumber2333 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuATPNumber2333));
        %>
        <%= tempResultuATPNumber2333 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">expMonth:</TD>
<TD>
<%
if(doUATPAuthorization2322mtemp != null){
eBLBaseComponents.apis.ebay.UATPDetailsType tebece0=doUATPAuthorization2322mtemp.getUATPDetails();
if(tebece0 != null){
%>
<%=tebece0.getExpMonth()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">invoiceID:</TD>
<TD>
<%
if(doUATPAuthorization2322mtemp != null){
java.lang.String typeinvoiceID2337 = doUATPAuthorization2322mtemp.getInvoiceID();
        String tempResultinvoiceID2337 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinvoiceID2337));
        %>
        <%= tempResultinvoiceID2337 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 2359:
        gotMethod = true;
        String subscriberName_628id=  request.getParameter("subscriberName2380");
            java.lang.String subscriberName_628idTemp = null;
        if(!subscriberName_628id.equals("")){
         subscriberName_628idTemp  = subscriberName_628id;
        }
        String billingStartDate_629id=  request.getParameter("billingStartDate2382");
            java.util.Calendar billingStartDate_629idTemp = null;
        if(!billingStartDate_629id.equals("")){
        java.text.DateFormat dateFormatbillingStartDate2382 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempbillingStartDate2382  = dateFormatbillingStartDate2382.parse(billingStartDate_629id);
         billingStartDate_629idTemp = new java.util.GregorianCalendar();
        billingStartDate_629idTemp.setTime(dateTempbillingStartDate2382);
        }
        String countryName_631id=  request.getParameter("countryName2386");
            java.lang.String countryName_631idTemp = null;
        if(!countryName_631id.equals("")){
         countryName_631idTemp  = countryName_631id;
        }
        String internationalStreet_632id=  request.getParameter("internationalStreet2388");
            java.lang.String internationalStreet_632idTemp = null;
        if(!internationalStreet_632id.equals("")){
         internationalStreet_632idTemp  = internationalStreet_632id;
        }
        String externalAddressID_633id=  request.getParameter("externalAddressID2390");
            java.lang.String externalAddressID_633idTemp = null;
        if(!externalAddressID_633id.equals("")){
         externalAddressID_633idTemp  = externalAddressID_633id;
        }
        String stateOrProvince_634id=  request.getParameter("stateOrProvince2392");
            java.lang.String stateOrProvince_634idTemp = null;
        if(!stateOrProvince_634id.equals("")){
         stateOrProvince_634idTemp  = stateOrProvince_634id;
        }
        String internationalName_635id=  request.getParameter("internationalName2394");
            java.lang.String internationalName_635idTemp = null;
        if(!internationalName_635id.equals("")){
         internationalName_635idTemp  = internationalName_635id;
        }
        String cityName_636id=  request.getParameter("cityName2396");
            java.lang.String cityName_636idTemp = null;
        if(!cityName_636id.equals("")){
         cityName_636idTemp  = cityName_636id;
        }
        String phone_637id=  request.getParameter("phone2398");
            java.lang.String phone_637idTemp = null;
        if(!phone_637id.equals("")){
         phone_637idTemp  = phone_637id;
        }
        String postalCode_638id=  request.getParameter("postalCode2400");
            java.lang.String postalCode_638idTemp = null;
        if(!postalCode_638id.equals("")){
         postalCode_638idTemp  = postalCode_638id;
        }
        String street2_639id=  request.getParameter("street22402");
            java.lang.String street2_639idTemp = null;
        if(!street2_639id.equals("")){
         street2_639idTemp  = street2_639id;
        }
        String street1_640id=  request.getParameter("street12404");
            java.lang.String street1_640idTemp = null;
        if(!street1_640id.equals("")){
         street1_640idTemp  = street1_640id;
        }
        String addressID_641id=  request.getParameter("addressID2406");
            java.lang.String addressID_641idTemp = null;
        if(!addressID_641id.equals("")){
         addressID_641idTemp  = addressID_641id;
        }
        String internationalStateAndCity_642id=  request.getParameter("internationalStateAndCity2408");
            java.lang.String internationalStateAndCity_642idTemp = null;
        if(!internationalStateAndCity_642id.equals("")){
         internationalStateAndCity_642idTemp  = internationalStateAndCity_642id;
        }
        String name_643id=  request.getParameter("name2410");
            java.lang.String name_643idTemp = null;
        if(!name_643id.equals("")){
         name_643idTemp  = name_643id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_630id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_630id.setCountryName(countryName_631idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setInternationalStreet(internationalStreet_632idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setExternalAddressID(externalAddressID_633idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setStateOrProvince(stateOrProvince_634idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setInternationalName(internationalName_635idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setCityName(cityName_636idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setPhone(phone_637idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setPostalCode(postalCode_638idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setStreet2(street2_639idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setStreet1(street1_640idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setAddressID(addressID_641idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setInternationalStateAndCity(internationalStateAndCity_642idTemp);
        eBLBaseComponents1apis1ebay1AddressType_630id.setName(name_643idTemp);
        String profileReference_644id=  request.getParameter("profileReference2412");
            java.lang.String profileReference_644idTemp = null;
        if(!profileReference_644id.equals("")){
         profileReference_644idTemp  = profileReference_644id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1RecurringPaymentsProfileDetailsType_627id" scope="session" class="eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1RecurringPaymentsProfileDetailsType_627id.setSubscriberName(subscriberName_628idTemp);
        eBLBaseComponents1apis1ebay1RecurringPaymentsProfileDetailsType_627id.setBillingStartDate(billingStartDate_629idTemp);
        eBLBaseComponents1apis1ebay1RecurringPaymentsProfileDetailsType_627id.setSubscriberShippingAddress(eBLBaseComponents1apis1ebay1AddressType_630id);
        eBLBaseComponents1apis1ebay1RecurringPaymentsProfileDetailsType_627id.setProfileReference(profileReference_644idTemp);
        String authStatus3Ds_647id=  request.getParameter("authStatus3Ds2418");
            java.lang.String authStatus3Ds_647idTemp = null;
        if(!authStatus3Ds_647id.equals("")){
         authStatus3Ds_647idTemp  = authStatus3Ds_647id;
        }
        String xid_648id=  request.getParameter("xid2420");
            java.lang.String xid_648idTemp = null;
        if(!xid_648id.equals("")){
         xid_648idTemp  = xid_648id;
        }
        String cavv_649id=  request.getParameter("cavv2422");
            java.lang.String cavv_649idTemp = null;
        if(!cavv_649id.equals("")){
         cavv_649idTemp  = cavv_649id;
        }
        String eci3Ds_650id=  request.getParameter("eci3Ds2424");
            java.lang.String eci3Ds_650idTemp = null;
        if(!eci3Ds_650id.equals("")){
         eci3Ds_650idTemp  = eci3Ds_650id;
        }
        String mpiVendor3Ds_651id=  request.getParameter("mpiVendor3Ds2426");
            java.lang.String mpiVendor3Ds_651idTemp = null;
        if(!mpiVendor3Ds_651id.equals("")){
         mpiVendor3Ds_651idTemp  = mpiVendor3Ds_651id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_646id" scope="session" class="eBLBaseComponents.apis.ebay.ThreeDSecureRequestType" />
        <%
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_646id.setAuthStatus3Ds(authStatus3Ds_647idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_646id.setXid(xid_648idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_646id.setCavv(cavv_649idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_646id.setEci3Ds(eci3Ds_650idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_646id.setMpiVendor3Ds(mpiVendor3Ds_651idTemp);
        String startYear_652id=  request.getParameter("startYear2428");
            java.lang.Integer startYear_652idTemp = null;
        if(!startYear_652id.equals("")){
         startYear_652idTemp  = java.lang.Integer.valueOf(startYear_652id);
        }
        String payerID_654id=  request.getParameter("payerID2432");
            java.lang.String payerID_654idTemp = null;
        if(!payerID_654id.equals("")){
         payerID_654idTemp  = payerID_654id;
        }
        String taxId_656id=  request.getParameter("taxId2436");
            java.lang.String taxId_656idTemp = null;
        if(!taxId_656id.equals("")){
         taxId_656idTemp  = taxId_656id;
        }
        String taxIdType_657id=  request.getParameter("taxIdType2438");
            java.lang.String taxIdType_657idTemp = null;
        if(!taxIdType_657id.equals("")){
         taxIdType_657idTemp  = taxIdType_657id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1TaxIdDetailsType_655id" scope="session" class="eBLBaseComponents.apis.ebay.TaxIdDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_655id.setTaxId(taxId_656idTemp);
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_655id.setTaxIdType(taxIdType_657idTemp);
        String lastName_659id=  request.getParameter("lastName2442");
            java.lang.String lastName_659idTemp = null;
        if(!lastName_659id.equals("")){
         lastName_659idTemp  = lastName_659id;
        }
        String middleName_660id=  request.getParameter("middleName2444");
            java.lang.String middleName_660idTemp = null;
        if(!middleName_660id.equals("")){
         middleName_660idTemp  = middleName_660id;
        }
        String firstName_661id=  request.getParameter("firstName2446");
            java.lang.String firstName_661idTemp = null;
        if(!firstName_661id.equals("")){
         firstName_661idTemp  = firstName_661id;
        }
        String suffix_662id=  request.getParameter("suffix2448");
            java.lang.String suffix_662idTemp = null;
        if(!suffix_662id.equals("")){
         suffix_662idTemp  = suffix_662id;
        }
        String salutation_663id=  request.getParameter("salutation2450");
            java.lang.String salutation_663idTemp = null;
        if(!salutation_663id.equals("")){
         salutation_663idTemp  = salutation_663id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PersonNameType_658id" scope="session" class="eBLBaseComponents.apis.ebay.PersonNameType" />
        <%
        eBLBaseComponents1apis1ebay1PersonNameType_658id.setLastName(lastName_659idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_658id.setMiddleName(middleName_660idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_658id.setFirstName(firstName_661idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_658id.setSuffix(suffix_662idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_658id.setSalutation(salutation_663idTemp);
        String payer_664id=  request.getParameter("payer2452");
            java.lang.String payer_664idTemp = null;
        if(!payer_664id.equals("")){
         payer_664idTemp  = payer_664id;
        }
        %>
        <jsp:useBean id="EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_665id" scope="session" class="EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType" />
        <%
        String contactPhone_666id=  request.getParameter("contactPhone2456");
            java.lang.String contactPhone_666idTemp = null;
        if(!contactPhone_666id.equals("")){
         contactPhone_666idTemp  = contactPhone_666id;
        }
        String payerBusiness_667id=  request.getParameter("payerBusiness2458");
            java.lang.String payerBusiness_667idTemp = null;
        if(!payerBusiness_667id.equals("")){
         payerBusiness_667idTemp  = payerBusiness_667id;
        }
        String countryName_669id=  request.getParameter("countryName2462");
            java.lang.String countryName_669idTemp = null;
        if(!countryName_669id.equals("")){
         countryName_669idTemp  = countryName_669id;
        }
        String internationalStreet_670id=  request.getParameter("internationalStreet2464");
            java.lang.String internationalStreet_670idTemp = null;
        if(!internationalStreet_670id.equals("")){
         internationalStreet_670idTemp  = internationalStreet_670id;
        }
        String externalAddressID_671id=  request.getParameter("externalAddressID2466");
            java.lang.String externalAddressID_671idTemp = null;
        if(!externalAddressID_671id.equals("")){
         externalAddressID_671idTemp  = externalAddressID_671id;
        }
        String stateOrProvince_672id=  request.getParameter("stateOrProvince2468");
            java.lang.String stateOrProvince_672idTemp = null;
        if(!stateOrProvince_672id.equals("")){
         stateOrProvince_672idTemp  = stateOrProvince_672id;
        }
        String internationalName_673id=  request.getParameter("internationalName2470");
            java.lang.String internationalName_673idTemp = null;
        if(!internationalName_673id.equals("")){
         internationalName_673idTemp  = internationalName_673id;
        }
        String cityName_674id=  request.getParameter("cityName2472");
            java.lang.String cityName_674idTemp = null;
        if(!cityName_674id.equals("")){
         cityName_674idTemp  = cityName_674id;
        }
        String phone_675id=  request.getParameter("phone2474");
            java.lang.String phone_675idTemp = null;
        if(!phone_675id.equals("")){
         phone_675idTemp  = phone_675id;
        }
        String postalCode_676id=  request.getParameter("postalCode2476");
            java.lang.String postalCode_676idTemp = null;
        if(!postalCode_676id.equals("")){
         postalCode_676idTemp  = postalCode_676id;
        }
        String street2_677id=  request.getParameter("street22478");
            java.lang.String street2_677idTemp = null;
        if(!street2_677id.equals("")){
         street2_677idTemp  = street2_677id;
        }
        String street1_678id=  request.getParameter("street12480");
            java.lang.String street1_678idTemp = null;
        if(!street1_678id.equals("")){
         street1_678idTemp  = street1_678id;
        }
        String addressID_679id=  request.getParameter("addressID2482");
            java.lang.String addressID_679idTemp = null;
        if(!addressID_679id.equals("")){
         addressID_679idTemp  = addressID_679id;
        }
        String internationalStateAndCity_680id=  request.getParameter("internationalStateAndCity2484");
            java.lang.String internationalStateAndCity_680idTemp = null;
        if(!internationalStateAndCity_680id.equals("")){
         internationalStateAndCity_680idTemp  = internationalStateAndCity_680id;
        }
        String name_681id=  request.getParameter("name2486");
            java.lang.String name_681idTemp = null;
        if(!name_681id.equals("")){
         name_681idTemp  = name_681id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_668id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_668id.setCountryName(countryName_669idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setInternationalStreet(internationalStreet_670idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setExternalAddressID(externalAddressID_671idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setStateOrProvince(stateOrProvince_672idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setInternationalName(internationalName_673idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setCityName(cityName_674idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setPhone(phone_675idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setPostalCode(postalCode_676idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setStreet2(street2_677idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setStreet1(street1_678idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setAddressID(addressID_679idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setInternationalStateAndCity(internationalStateAndCity_680idTemp);
        eBLBaseComponents1apis1ebay1AddressType_668id.setName(name_681idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PayerInfoType_653id" scope="session" class="eBLBaseComponents.apis.ebay.PayerInfoType" />
        <%
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setPayerID(payerID_654idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setTaxIdDetails(eBLBaseComponents1apis1ebay1TaxIdDetailsType_655id);
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setPayerName(eBLBaseComponents1apis1ebay1PersonNameType_658id);
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setPayer(payer_664idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setEnhancedPayerInfo(EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_665id);
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setContactPhone(contactPhone_666idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setPayerBusiness(payerBusiness_667idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_653id.setAddress(eBLBaseComponents1apis1ebay1AddressType_668id);
        String issueNumber_682id=  request.getParameter("issueNumber2488");
            java.lang.String issueNumber_682idTemp = null;
        if(!issueNumber_682id.equals("")){
         issueNumber_682idTemp  = issueNumber_682id;
        }
        String cVV2_683id=  request.getParameter("cVV22490");
            java.lang.String cVV2_683idTemp = null;
        if(!cVV2_683id.equals("")){
         cVV2_683idTemp  = cVV2_683id;
        }
        String expMonth_684id=  request.getParameter("expMonth2492");
            java.lang.Integer expMonth_684idTemp = null;
        if(!expMonth_684id.equals("")){
         expMonth_684idTemp  = java.lang.Integer.valueOf(expMonth_684id);
        }
        String startMonth_685id=  request.getParameter("startMonth2494");
            java.lang.Integer startMonth_685idTemp = null;
        if(!startMonth_685id.equals("")){
         startMonth_685idTemp  = java.lang.Integer.valueOf(startMonth_685id);
        }
        String creditCardNumber_686id=  request.getParameter("creditCardNumber2496");
            java.lang.String creditCardNumber_686idTemp = null;
        if(!creditCardNumber_686id.equals("")){
         creditCardNumber_686idTemp  = creditCardNumber_686id;
        }
        String expYear_687id=  request.getParameter("expYear2498");
            java.lang.Integer expYear_687idTemp = null;
        if(!expYear_687id.equals("")){
         expYear_687idTemp  = java.lang.Integer.valueOf(expYear_687id);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id" scope="session" class="eBLBaseComponents.apis.ebay.CreditCardDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setThreeDSecureRequest(eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_646id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setStartYear(startYear_652idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setCardOwner(eBLBaseComponents1apis1ebay1PayerInfoType_653id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setIssueNumber(issueNumber_682idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setCVV2(cVV2_683idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setExpMonth(expMonth_684idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setStartMonth(startMonth_685idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setCreditCardNumber(creditCardNumber_686idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id.setExpYear(expYear_687idTemp);
        String token_688id=  request.getParameter("token2500");
            java.lang.String token_688idTemp = null;
        if(!token_688id.equals("")){
         token_688idTemp  = token_688id;
        }
        String maxFailedPayments_690id=  request.getParameter("maxFailedPayments2504");
            java.lang.Integer maxFailedPayments_690idTemp = null;
        if(!maxFailedPayments_690id.equals("")){
         maxFailedPayments_690idTemp  = java.lang.Integer.valueOf(maxFailedPayments_690id);
        }
        String _value_693id=  request.getParameter("_value2510");
            java.lang.String _value_693idTemp = null;
        if(!_value_693id.equals("")){
         _value_693idTemp  = _value_693id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_692id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_692id.set_value(_value_693idTemp);
        String _value_695id=  request.getParameter("_value2514");
            java.lang.String _value_695idTemp = null;
        if(!_value_695id.equals("")){
         _value_695idTemp  = _value_695id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_694id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_694id.set_value(_value_695idTemp);
        String _value_697id=  request.getParameter("_value2518");
            java.lang.String _value_697idTemp = null;
        if(!_value_697id.equals("")){
         _value_697idTemp  = _value_697id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_696id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_696id.set_value(_value_697idTemp);
        String totalBillingCycles_698id=  request.getParameter("totalBillingCycles2520");
            java.lang.Integer totalBillingCycles_698idTemp = null;
        if(!totalBillingCycles_698id.equals("")){
         totalBillingCycles_698idTemp  = java.lang.Integer.valueOf(totalBillingCycles_698id);
        }
        String billingFrequency_699id=  request.getParameter("billingFrequency2522");
        int billingFrequency_699idTemp  = Integer.parseInt(billingFrequency_699id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_691id" scope="session" class="eBLBaseComponents.apis.ebay.BillingPeriodDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_691id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_692id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_691id.setTaxAmount(CoreComponentTypes1apis1ebay1BasicAmountType_694id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_691id.setShippingAmount(CoreComponentTypes1apis1ebay1BasicAmountType_696id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_691id.setTotalBillingCycles(totalBillingCycles_698idTemp);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_691id.setBillingFrequency(billingFrequency_699idTemp);
        String description_700id=  request.getParameter("description2524");
            java.lang.String description_700idTemp = null;
        if(!description_700id.equals("")){
         description_700idTemp  = description_700id;
        }
        String _value_703id=  request.getParameter("_value2530");
            java.lang.String _value_703idTemp = null;
        if(!_value_703id.equals("")){
         _value_703idTemp  = _value_703id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_702id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_702id.set_value(_value_703idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ActivationDetailsType_701id" scope="session" class="eBLBaseComponents.apis.ebay.ActivationDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ActivationDetailsType_701id.setInitialAmount(CoreComponentTypes1apis1ebay1BasicAmountType_702id);
        String _value_706id=  request.getParameter("_value2536");
            java.lang.String _value_706idTemp = null;
        if(!_value_706id.equals("")){
         _value_706idTemp  = _value_706id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_705id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_705id.set_value(_value_706idTemp);
        String _value_708id=  request.getParameter("_value2540");
            java.lang.String _value_708idTemp = null;
        if(!_value_708id.equals("")){
         _value_708idTemp  = _value_708id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_707id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_707id.set_value(_value_708idTemp);
        String _value_710id=  request.getParameter("_value2544");
            java.lang.String _value_710idTemp = null;
        if(!_value_710id.equals("")){
         _value_710idTemp  = _value_710id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_709id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_709id.set_value(_value_710idTemp);
        String totalBillingCycles_711id=  request.getParameter("totalBillingCycles2546");
            java.lang.Integer totalBillingCycles_711idTemp = null;
        if(!totalBillingCycles_711id.equals("")){
         totalBillingCycles_711idTemp  = java.lang.Integer.valueOf(totalBillingCycles_711id);
        }
        String billingFrequency_712id=  request.getParameter("billingFrequency2548");
        int billingFrequency_712idTemp  = Integer.parseInt(billingFrequency_712id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_704id" scope="session" class="eBLBaseComponents.apis.ebay.BillingPeriodDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_704id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_705id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_704id.setTaxAmount(CoreComponentTypes1apis1ebay1BasicAmountType_707id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_704id.setShippingAmount(CoreComponentTypes1apis1ebay1BasicAmountType_709id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_704id.setTotalBillingCycles(totalBillingCycles_711idTemp);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_704id.setBillingFrequency(billingFrequency_712idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ScheduleDetailsType_689id" scope="session" class="eBLBaseComponents.apis.ebay.ScheduleDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ScheduleDetailsType_689id.setMaxFailedPayments(maxFailedPayments_690idTemp);
        eBLBaseComponents1apis1ebay1ScheduleDetailsType_689id.setTrialPeriod(eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_691id);
        eBLBaseComponents1apis1ebay1ScheduleDetailsType_689id.setDescription(description_700idTemp);
        eBLBaseComponents1apis1ebay1ScheduleDetailsType_689id.setActivationDetails(eBLBaseComponents1apis1ebay1ActivationDetailsType_701id);
        eBLBaseComponents1apis1ebay1ScheduleDetailsType_689id.setPaymentPeriod(eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_704id);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1CreateRecurringPaymentsProfileRequestDetailsType_626id" scope="session" class="eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1CreateRecurringPaymentsProfileRequestDetailsType_626id.setRecurringPaymentsProfileDetails(eBLBaseComponents1apis1ebay1RecurringPaymentsProfileDetailsType_627id);
        eBLBaseComponents1apis1ebay1CreateRecurringPaymentsProfileRequestDetailsType_626id.setCreditCard(eBLBaseComponents1apis1ebay1CreditCardDetailsType_645id);
        eBLBaseComponents1apis1ebay1CreateRecurringPaymentsProfileRequestDetailsType_626id.setToken(token_688idTemp);
        eBLBaseComponents1apis1ebay1CreateRecurringPaymentsProfileRequestDetailsType_626id.setScheduleDetails(eBLBaseComponents1apis1ebay1ScheduleDetailsType_689id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1CreateRecurringPaymentsProfileRequestType_625id" scope="session" class="PayPalAPI.api.ebay.CreateRecurringPaymentsProfileRequestType" />
        <%
        PayPalAPI1api1ebay1CreateRecurringPaymentsProfileRequestType_625id.setCreateRecurringPaymentsProfileRequestDetails(eBLBaseComponents1apis1ebay1CreateRecurringPaymentsProfileRequestDetailsType_626id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1CreateRecurringPaymentsProfileReq_624id" scope="session" class="PayPalAPI.api.ebay.CreateRecurringPaymentsProfileReq" />
        <%
        PayPalAPI1api1ebay1CreateRecurringPaymentsProfileReq_624id.setCreateRecurringPaymentsProfileRequest(PayPalAPI1api1ebay1CreateRecurringPaymentsProfileRequestType_625id);
        PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile2359mtemp = samplePayPalAPIAAInterfaceProxyid.createRecurringPaymentsProfile(PayPalAPI1api1ebay1CreateRecurringPaymentsProfileReq_624id);
if(createRecurringPaymentsProfile2359mtemp == null){
%>
<%=createRecurringPaymentsProfile2359mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">createRecurringPaymentsProfileResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">dCCReturnCode:</TD>
<TD>
<%
if(createRecurringPaymentsProfile2359mtemp != null){
eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileResponseDetailsType tebece0=createRecurringPaymentsProfile2359mtemp.getCreateRecurringPaymentsProfileResponseDetails();
if(tebece0 != null){
java.lang.String typedCCReturnCode2364 = tebece0.getDCCReturnCode();
        String tempResultdCCReturnCode2364 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedCCReturnCode2364));
        %>
        <%= tempResultdCCReturnCode2364 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">profileID:</TD>
<TD>
<%
if(createRecurringPaymentsProfile2359mtemp != null){
eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileResponseDetailsType tebece0=createRecurringPaymentsProfile2359mtemp.getCreateRecurringPaymentsProfileResponseDetails();
if(tebece0 != null){
java.lang.String typeprofileID2366 = tebece0.getProfileID();
        String tempResultprofileID2366 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprofileID2366));
        %>
        <%= tempResultprofileID2366 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">dCCProcessorResponse:</TD>
<TD>
<%
if(createRecurringPaymentsProfile2359mtemp != null){
eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileResponseDetailsType tebece0=createRecurringPaymentsProfile2359mtemp.getCreateRecurringPaymentsProfileResponseDetails();
if(tebece0 != null){
java.lang.String typedCCProcessorResponse2368 = tebece0.getDCCProcessorResponse();
        String tempResultdCCProcessorResponse2368 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedCCProcessorResponse2368));
        %>
        <%= tempResultdCCProcessorResponse2368 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">transactionID:</TD>
<TD>
<%
if(createRecurringPaymentsProfile2359mtemp != null){
eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileResponseDetailsType tebece0=createRecurringPaymentsProfile2359mtemp.getCreateRecurringPaymentsProfileResponseDetails();
if(tebece0 != null){
java.lang.String typetransactionID2370 = tebece0.getTransactionID();
        String tempResulttransactionID2370 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetransactionID2370));
        %>
        <%= tempResulttransactionID2370 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 2550:
        gotMethod = true;
        String profileID_715id=  request.getParameter("profileID2779");
            java.lang.String profileID_715idTemp = null;
        if(!profileID_715id.equals("")){
         profileID_715idTemp  = profileID_715id;
        }
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetRecurringPaymentsProfileDetailsRequestType_714id" scope="session" class="PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsRequestType" />
        <%
        PayPalAPI1api1ebay1GetRecurringPaymentsProfileDetailsRequestType_714id.setProfileID(profileID_715idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1GetRecurringPaymentsProfileDetailsReq_713id" scope="session" class="PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsReq" />
        <%
        PayPalAPI1api1ebay1GetRecurringPaymentsProfileDetailsReq_713id.setGetRecurringPaymentsProfileDetailsRequest(PayPalAPI1api1ebay1GetRecurringPaymentsProfileDetailsRequestType_714id);
        PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails2550mtemp = samplePayPalAPIAAInterfaceProxyid.getRecurringPaymentsProfileDetails(PayPalAPI1api1ebay1GetRecurringPaymentsProfileDetailsReq_713id);
if(getRecurringPaymentsProfileDetails2550mtemp == null){
%>
<%=getRecurringPaymentsProfileDetails2550mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">getRecurringPaymentsProfileDetailsResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">regularAmountPaid:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getRegularAmountPaid();
if(tebece1 != null){
java.lang.String type_value2557 = tebece1.get_value();
        String tempResult_value2557 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2557));
        %>
        <%= tempResult_value2557 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">recurringPaymentsSummary:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">failedPaymentCount:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType tebece1=tebece0.getRecurringPaymentsSummary();
if(tebece1 != null){
%>
<%=tebece1.getFailedPaymentCount()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">numberCyclesRemaining:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType tebece1=tebece0.getRecurringPaymentsSummary();
if(tebece1 != null){
%>
<%=tebece1.getNumberCyclesRemaining()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">numberCyclesCompleted:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType tebece1=tebece0.getRecurringPaymentsSummary();
if(tebece1 != null){
%>
<%=tebece1.getNumberCyclesCompleted()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">nextBillingDate:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType tebece1=tebece0.getRecurringPaymentsSummary();
if(tebece1 != null){
java.util.Calendar typenextBillingDate2567 = tebece1.getNextBillingDate();
        java.text.DateFormat dateFormatnextBillingDate2567 = java.text.DateFormat.getDateInstance();
        java.util.Date datenextBillingDate2567 = typenextBillingDate2567.getTime();
        String tempResultnextBillingDate2567 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatnextBillingDate2567.format(datenextBillingDate2567));
        %>
        <%= tempResultnextBillingDate2567 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">lastPaymentAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType tebece1=tebece0.getRecurringPaymentsSummary();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getLastPaymentAmount();
if(tebece2 != null){
java.lang.String type_value2571 = tebece2.get_value();
        String tempResult_value2571 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2571));
        %>
        <%= tempResult_value2571 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">outstandingBalance:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType tebece1=tebece0.getRecurringPaymentsSummary();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getOutstandingBalance();
if(tebece2 != null){
java.lang.String type_value2575 = tebece2.get_value();
        String tempResult_value2575 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2575));
        %>
        <%= tempResult_value2575 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">lastPaymentDate:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType tebece1=tebece0.getRecurringPaymentsSummary();
if(tebece1 != null){
java.util.Calendar typelastPaymentDate2577 = tebece1.getLastPaymentDate();
        java.text.DateFormat dateFormatlastPaymentDate2577 = java.text.DateFormat.getDateInstance();
        java.util.Date datelastPaymentDate2577 = typelastPaymentDate2577.getTime();
        String tempResultlastPaymentDate2577 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatlastPaymentDate2577.format(datelastPaymentDate2577));
        %>
        <%= tempResultlastPaymentDate2577 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">aggregateOptionalAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getAggregateOptionalAmount();
if(tebece1 != null){
java.lang.String type_value2581 = tebece1.get_value();
        String tempResult_value2581 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2581));
        %>
        <%= tempResult_value2581 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">currentRecurringPaymentsPeriod:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">amount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getCurrentRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getAmount();
if(tebece2 != null){
java.lang.String type_value2587 = tebece2.get_value();
        String tempResult_value2587 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2587));
        %>
        <%= tempResult_value2587 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">taxAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getCurrentRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getTaxAmount();
if(tebece2 != null){
java.lang.String type_value2591 = tebece2.get_value();
        String tempResult_value2591 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2591));
        %>
        <%= tempResult_value2591 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getCurrentRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getShippingAmount();
if(tebece2 != null){
java.lang.String type_value2595 = tebece2.get_value();
        String tempResult_value2595 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2595));
        %>
        <%= tempResult_value2595 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">totalBillingCycles:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getCurrentRecurringPaymentsPeriod();
if(tebece1 != null){
java.lang.Integer typetotalBillingCycles2597 = tebece1.getTotalBillingCycles();
        String tempResulttotalBillingCycles2597 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalBillingCycles2597));
        %>
        <%= tempResulttotalBillingCycles2597 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">billingFrequency:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getCurrentRecurringPaymentsPeriod();
if(tebece1 != null){
%>
<%=tebece1.getBillingFrequency()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">trialRecurringPaymentsPeriod:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">amount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getTrialRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getAmount();
if(tebece2 != null){
java.lang.String type_value2605 = tebece2.get_value();
        String tempResult_value2605 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2605));
        %>
        <%= tempResult_value2605 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">taxAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getTrialRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getTaxAmount();
if(tebece2 != null){
java.lang.String type_value2609 = tebece2.get_value();
        String tempResult_value2609 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2609));
        %>
        <%= tempResult_value2609 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getTrialRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getShippingAmount();
if(tebece2 != null){
java.lang.String type_value2613 = tebece2.get_value();
        String tempResult_value2613 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2613));
        %>
        <%= tempResult_value2613 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">totalBillingCycles:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getTrialRecurringPaymentsPeriod();
if(tebece1 != null){
java.lang.Integer typetotalBillingCycles2615 = tebece1.getTotalBillingCycles();
        String tempResulttotalBillingCycles2615 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalBillingCycles2615));
        %>
        <%= tempResulttotalBillingCycles2615 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">billingFrequency:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getTrialRecurringPaymentsPeriod();
if(tebece1 != null){
%>
<%=tebece1.getBillingFrequency()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">maxFailedPayments:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
%>
<%=tebece0.getMaxFailedPayments()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">aggregateAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getAggregateAmount();
if(tebece1 != null){
java.lang.String type_value2623 = tebece1.get_value();
        String tempResult_value2623 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2623));
        %>
        <%= tempResult_value2623 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">creditCard:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">threeDSecureRequest:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">authStatus3Ds:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ThreeDSecureRequestType tebece2=tebece1.getThreeDSecureRequest();
if(tebece2 != null){
java.lang.String typeauthStatus3Ds2629 = tebece2.getAuthStatus3Ds();
        String tempResultauthStatus3Ds2629 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthStatus3Ds2629));
        %>
        <%= tempResultauthStatus3Ds2629 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">xid:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ThreeDSecureRequestType tebece2=tebece1.getThreeDSecureRequest();
if(tebece2 != null){
java.lang.String typexid2631 = tebece2.getXid();
        String tempResultxid2631 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typexid2631));
        %>
        <%= tempResultxid2631 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">cavv:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ThreeDSecureRequestType tebece2=tebece1.getThreeDSecureRequest();
if(tebece2 != null){
java.lang.String typecavv2633 = tebece2.getCavv();
        String tempResultcavv2633 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecavv2633));
        %>
        <%= tempResultcavv2633 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">eci3Ds:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ThreeDSecureRequestType tebece2=tebece1.getThreeDSecureRequest();
if(tebece2 != null){
java.lang.String typeeci3Ds2635 = tebece2.getEci3Ds();
        String tempResulteci3Ds2635 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeeci3Ds2635));
        %>
        <%= tempResulteci3Ds2635 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">mpiVendor3Ds:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.ThreeDSecureRequestType tebece2=tebece1.getThreeDSecureRequest();
if(tebece2 != null){
java.lang.String typempiVendor3Ds2637 = tebece2.getMpiVendor3Ds();
        String tempResultmpiVendor3Ds2637 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typempiVendor3Ds2637));
        %>
        <%= tempResultmpiVendor3Ds2637 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">startYear:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
java.lang.Integer typestartYear2639 = tebece1.getStartYear();
        String tempResultstartYear2639 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestartYear2639));
        %>
        <%= tempResultstartYear2639 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">cardOwner:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">payerID:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
java.lang.String typepayerID2643 = tebece2.getPayerID();
        String tempResultpayerID2643 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerID2643));
        %>
        <%= tempResultpayerID2643 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">taxIdDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">taxId:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.TaxIdDetailsType tebece3=tebece2.getTaxIdDetails();
if(tebece3 != null){
java.lang.String typetaxId2647 = tebece3.getTaxId();
        String tempResulttaxId2647 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetaxId2647));
        %>
        <%= tempResulttaxId2647 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">taxIdType:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.TaxIdDetailsType tebece3=tebece2.getTaxIdDetails();
if(tebece3 != null){
java.lang.String typetaxIdType2649 = tebece3.getTaxIdType();
        String tempResulttaxIdType2649 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetaxIdType2649));
        %>
        <%= tempResulttaxIdType2649 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">payerName:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece3=tebece2.getPayerName();
if(tebece3 != null){
java.lang.String typelastName2653 = tebece3.getLastName();
        String tempResultlastName2653 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName2653));
        %>
        <%= tempResultlastName2653 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">middleName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece3=tebece2.getPayerName();
if(tebece3 != null){
java.lang.String typemiddleName2655 = tebece3.getMiddleName();
        String tempResultmiddleName2655 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemiddleName2655));
        %>
        <%= tempResultmiddleName2655 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece3=tebece2.getPayerName();
if(tebece3 != null){
java.lang.String typefirstName2657 = tebece3.getFirstName();
        String tempResultfirstName2657 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName2657));
        %>
        <%= tempResultfirstName2657 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">suffix:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece3=tebece2.getPayerName();
if(tebece3 != null){
java.lang.String typesuffix2659 = tebece3.getSuffix();
        String tempResultsuffix2659 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesuffix2659));
        %>
        <%= tempResultsuffix2659 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">salutation:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.PersonNameType tebece3=tebece2.getPayerName();
if(tebece3 != null){
java.lang.String typesalutation2661 = tebece3.getSalutation();
        String tempResultsalutation2661 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesalutation2661));
        %>
        <%= tempResultsalutation2661 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">payer:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
java.lang.String typepayer2663 = tebece2.getPayer();
        String tempResultpayer2663 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayer2663));
        %>
        <%= tempResultpayer2663 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">enhancedPayerInfo:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType typeenhancedPayerInfo2665 = tebece2.getEnhancedPayerInfo();
        if(typeenhancedPayerInfo2665!= null){
        String tempenhancedPayerInfo2665 = typeenhancedPayerInfo2665.toString();
        %>
        <%=tempenhancedPayerInfo2665%>
        <%
        }}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">contactPhone:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
java.lang.String typecontactPhone2667 = tebece2.getContactPhone();
        String tempResultcontactPhone2667 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecontactPhone2667));
        %>
        <%= tempResultcontactPhone2667 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">payerBusiness:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
java.lang.String typepayerBusiness2669 = tebece2.getPayerBusiness();
        String tempResultpayerBusiness2669 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepayerBusiness2669));
        %>
        <%= tempResultpayerBusiness2669 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">address:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">countryName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typecountryName2673 = tebece3.getCountryName();
        String tempResultcountryName2673 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountryName2673));
        %>
        <%= tempResultcountryName2673 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">internationalStreet:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typeinternationalStreet2675 = tebece3.getInternationalStreet();
        String tempResultinternationalStreet2675 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStreet2675));
        %>
        <%= tempResultinternationalStreet2675 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">externalAddressID:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typeexternalAddressID2677 = tebece3.getExternalAddressID();
        String tempResultexternalAddressID2677 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalAddressID2677));
        %>
        <%= tempResultexternalAddressID2677 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">stateOrProvince:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typestateOrProvince2679 = tebece3.getStateOrProvince();
        String tempResultstateOrProvince2679 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestateOrProvince2679));
        %>
        <%= tempResultstateOrProvince2679 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">internationalName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typeinternationalName2681 = tebece3.getInternationalName();
        String tempResultinternationalName2681 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalName2681));
        %>
        <%= tempResultinternationalName2681 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">cityName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typecityName2683 = tebece3.getCityName();
        String tempResultcityName2683 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecityName2683));
        %>
        <%= tempResultcityName2683 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typephone2685 = tebece3.getPhone();
        String tempResultphone2685 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone2685));
        %>
        <%= tempResultphone2685 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">postalCode:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typepostalCode2687 = tebece3.getPostalCode();
        String tempResultpostalCode2687 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepostalCode2687));
        %>
        <%= tempResultpostalCode2687 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">street2:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typestreet22689 = tebece3.getStreet2();
        String tempResultstreet22689 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet22689));
        %>
        <%= tempResultstreet22689 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">street1:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typestreet12691 = tebece3.getStreet1();
        String tempResultstreet12691 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet12691));
        %>
        <%= tempResultstreet12691 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">addressID:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typeaddressID2693 = tebece3.getAddressID();
        String tempResultaddressID2693 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressID2693));
        %>
        <%= tempResultaddressID2693 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">internationalStateAndCity:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typeinternationalStateAndCity2695 = tebece3.getInternationalStateAndCity();
        String tempResultinternationalStateAndCity2695 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStateAndCity2695));
        %>
        <%= tempResultinternationalStateAndCity2695 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.PayerInfoType tebece2=tebece1.getCardOwner();
if(tebece2 != null){
eBLBaseComponents.apis.ebay.AddressType tebece3=tebece2.getAddress();
if(tebece3 != null){
java.lang.String typename2697 = tebece3.getName();
        String tempResultname2697 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename2697));
        %>
        <%= tempResultname2697 %>
        <%
}}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">issueNumber:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
java.lang.String typeissueNumber2699 = tebece1.getIssueNumber();
        String tempResultissueNumber2699 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeissueNumber2699));
        %>
        <%= tempResultissueNumber2699 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">cVV2:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
java.lang.String typecVV22701 = tebece1.getCVV2();
        String tempResultcVV22701 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecVV22701));
        %>
        <%= tempResultcVV22701 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">expMonth:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
java.lang.Integer typeexpMonth2703 = tebece1.getExpMonth();
        String tempResultexpMonth2703 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexpMonth2703));
        %>
        <%= tempResultexpMonth2703 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">startMonth:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
java.lang.Integer typestartMonth2705 = tebece1.getStartMonth();
        String tempResultstartMonth2705 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestartMonth2705));
        %>
        <%= tempResultstartMonth2705 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">creditCardNumber:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
java.lang.String typecreditCardNumber2707 = tebece1.getCreditCardNumber();
        String tempResultcreditCardNumber2707 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecreditCardNumber2707));
        %>
        <%= tempResultcreditCardNumber2707 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">expYear:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.CreditCardDetailsType tebece1=tebece0.getCreditCard();
if(tebece1 != null){
java.lang.Integer typeexpYear2709 = tebece1.getExpYear();
        String tempResultexpYear2709 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexpYear2709));
        %>
        <%= tempResultexpYear2709 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">profileID:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typeprofileID2711 = tebece0.getProfileID();
        String tempResultprofileID2711 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprofileID2711));
        %>
        <%= tempResultprofileID2711 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">finalPaymentDueDate:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
java.util.Calendar typefinalPaymentDueDate2713 = tebece0.getFinalPaymentDueDate();
        java.text.DateFormat dateFormatfinalPaymentDueDate2713 = java.text.DateFormat.getDateInstance();
        java.util.Date datefinalPaymentDueDate2713 = typefinalPaymentDueDate2713.getTime();
        String tempResultfinalPaymentDueDate2713 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfinalPaymentDueDate2713.format(datefinalPaymentDueDate2713));
        %>
        <%= tempResultfinalPaymentDueDate2713 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
java.lang.String typedescription2715 = tebece0.getDescription();
        String tempResultdescription2715 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription2715));
        %>
        <%= tempResultdescription2715 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">regularRecurringPaymentsPeriod:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">amount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getRegularRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getAmount();
if(tebece2 != null){
java.lang.String type_value2721 = tebece2.get_value();
        String tempResult_value2721 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2721));
        %>
        <%= tempResult_value2721 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">taxAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getRegularRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getTaxAmount();
if(tebece2 != null){
java.lang.String type_value2725 = tebece2.get_value();
        String tempResult_value2725 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2725));
        %>
        <%= tempResult_value2725 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">shippingAmount:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getRegularRecurringPaymentsPeriod();
if(tebece1 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece2=tebece1.getShippingAmount();
if(tebece2 != null){
java.lang.String type_value2729 = tebece2.get_value();
        String tempResult_value2729 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2729));
        %>
        <%= tempResult_value2729 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">totalBillingCycles:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getRegularRecurringPaymentsPeriod();
if(tebece1 != null){
java.lang.Integer typetotalBillingCycles2731 = tebece1.getTotalBillingCycles();
        String tempResulttotalBillingCycles2731 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalBillingCycles2731));
        %>
        <%= tempResulttotalBillingCycles2731 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">billingFrequency:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.BillingPeriodDetailsType tebece1=tebece0.getRegularRecurringPaymentsPeriod();
if(tebece1 != null){
%>
<%=tebece1.getBillingFrequency()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">trialAmountPaid:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">_value:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
CoreComponentTypes.apis.ebay.BasicAmountType tebece1=tebece0.getTrialAmountPaid();
if(tebece1 != null){
java.lang.String type_value2737 = tebece1.get_value();
        String tempResult_value2737 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_value2737));
        %>
        <%= tempResult_value2737 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">recurringPaymentsProfileDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">subscriberName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
java.lang.String typesubscriberName2741 = tebece1.getSubscriberName();
        String tempResultsubscriberName2741 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesubscriberName2741));
        %>
        <%= tempResultsubscriberName2741 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">billingStartDate:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
java.util.Calendar typebillingStartDate2743 = tebece1.getBillingStartDate();
        java.text.DateFormat dateFormatbillingStartDate2743 = java.text.DateFormat.getDateInstance();
        java.util.Date datebillingStartDate2743 = typebillingStartDate2743.getTime();
        String tempResultbillingStartDate2743 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatbillingStartDate2743.format(datebillingStartDate2743));
        %>
        <%= tempResultbillingStartDate2743 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">subscriberShippingAddress:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">countryName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typecountryName2747 = tebece2.getCountryName();
        String tempResultcountryName2747 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountryName2747));
        %>
        <%= tempResultcountryName2747 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalStreet:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typeinternationalStreet2749 = tebece2.getInternationalStreet();
        String tempResultinternationalStreet2749 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStreet2749));
        %>
        <%= tempResultinternationalStreet2749 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">externalAddressID:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typeexternalAddressID2751 = tebece2.getExternalAddressID();
        String tempResultexternalAddressID2751 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalAddressID2751));
        %>
        <%= tempResultexternalAddressID2751 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">stateOrProvince:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typestateOrProvince2753 = tebece2.getStateOrProvince();
        String tempResultstateOrProvince2753 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestateOrProvince2753));
        %>
        <%= tempResultstateOrProvince2753 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typeinternationalName2755 = tebece2.getInternationalName();
        String tempResultinternationalName2755 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalName2755));
        %>
        <%= tempResultinternationalName2755 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">cityName:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typecityName2757 = tebece2.getCityName();
        String tempResultcityName2757 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecityName2757));
        %>
        <%= tempResultcityName2757 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typephone2759 = tebece2.getPhone();
        String tempResultphone2759 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone2759));
        %>
        <%= tempResultphone2759 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">postalCode:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typepostalCode2761 = tebece2.getPostalCode();
        String tempResultpostalCode2761 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepostalCode2761));
        %>
        <%= tempResultpostalCode2761 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">street2:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typestreet22763 = tebece2.getStreet2();
        String tempResultstreet22763 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet22763));
        %>
        <%= tempResultstreet22763 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">street1:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typestreet12765 = tebece2.getStreet1();
        String tempResultstreet12765 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestreet12765));
        %>
        <%= tempResultstreet12765 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">addressID:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typeaddressID2767 = tebece2.getAddressID();
        String tempResultaddressID2767 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressID2767));
        %>
        <%= tempResultaddressID2767 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">internationalStateAndCity:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typeinternationalStateAndCity2769 = tebece2.getInternationalStateAndCity();
        String tempResultinternationalStateAndCity2769 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternationalStateAndCity2769));
        %>
        <%= tempResultinternationalStateAndCity2769 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="-1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
eBLBaseComponents.apis.ebay.AddressType tebece2=tebece1.getSubscriberShippingAddress();
if(tebece2 != null){
java.lang.String typename2771 = tebece2.getName();
        String tempResultname2771 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename2771));
        %>
        <%= tempResultname2771 %>
        <%
}}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">profileReference:</TD>
<TD>
<%
if(getRecurringPaymentsProfileDetails2550mtemp != null){
eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType tebece0=getRecurringPaymentsProfileDetails2550mtemp.getGetRecurringPaymentsProfileDetailsResponseDetails();
if(tebece0 != null){
eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType tebece1=tebece0.getRecurringPaymentsProfileDetails();
if(tebece1 != null){
java.lang.String typeprofileReference2773 = tebece1.getProfileReference();
        String tempResultprofileReference2773 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprofileReference2773));
        %>
        <%= tempResultprofileReference2773 %>
        <%
}}}%>
</TD>
</TABLE>
<%
}
break;
case 2781:
        gotMethod = true;
        String note_719id=  request.getParameter("note2794");
            java.lang.String note_719idTemp = null;
        if(!note_719id.equals("")){
         note_719idTemp  = note_719id;
        }
        String profileID_720id=  request.getParameter("profileID2796");
            java.lang.String profileID_720idTemp = null;
        if(!profileID_720id.equals("")){
         profileID_720idTemp  = profileID_720id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ManageRecurringPaymentsProfileStatusRequestDetailsType_718id" scope="session" class="eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ManageRecurringPaymentsProfileStatusRequestDetailsType_718id.setNote(note_719idTemp);
        eBLBaseComponents1apis1ebay1ManageRecurringPaymentsProfileStatusRequestDetailsType_718id.setProfileID(profileID_720idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ManageRecurringPaymentsProfileStatusRequestType_717id" scope="session" class="PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusRequestType" />
        <%
        PayPalAPI1api1ebay1ManageRecurringPaymentsProfileStatusRequestType_717id.setManageRecurringPaymentsProfileStatusRequestDetails(eBLBaseComponents1apis1ebay1ManageRecurringPaymentsProfileStatusRequestDetailsType_718id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ManageRecurringPaymentsProfileStatusReq_716id" scope="session" class="PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusReq" />
        <%
        PayPalAPI1api1ebay1ManageRecurringPaymentsProfileStatusReq_716id.setManageRecurringPaymentsProfileStatusRequest(PayPalAPI1api1ebay1ManageRecurringPaymentsProfileStatusRequestType_717id);
        PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus2781mtemp = samplePayPalAPIAAInterfaceProxyid.manageRecurringPaymentsProfileStatus(PayPalAPI1api1ebay1ManageRecurringPaymentsProfileStatusReq_716id);
if(manageRecurringPaymentsProfileStatus2781mtemp == null){
%>
<%=manageRecurringPaymentsProfileStatus2781mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">manageRecurringPaymentsProfileStatusResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">profileID:</TD>
<TD>
<%
if(manageRecurringPaymentsProfileStatus2781mtemp != null){
eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusResponseDetailsType tebece0=manageRecurringPaymentsProfileStatus2781mtemp.getManageRecurringPaymentsProfileStatusResponseDetails();
if(tebece0 != null){
java.lang.String typeprofileID2786 = tebece0.getProfileID();
        String tempResultprofileID2786 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprofileID2786));
        %>
        <%= tempResultprofileID2786 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 2798:
        gotMethod = true;
        String _value_725id=  request.getParameter("_value2813");
            java.lang.String _value_725idTemp = null;
        if(!_value_725id.equals("")){
         _value_725idTemp  = _value_725id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_724id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_724id.set_value(_value_725idTemp);
        String note_726id=  request.getParameter("note2815");
            java.lang.String note_726idTemp = null;
        if(!note_726id.equals("")){
         note_726idTemp  = note_726id;
        }
        String profileID_727id=  request.getParameter("profileID2817");
            java.lang.String profileID_727idTemp = null;
        if(!profileID_727id.equals("")){
         profileID_727idTemp  = profileID_727id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BillOutstandingAmountRequestDetailsType_723id" scope="session" class="eBLBaseComponents.apis.ebay.BillOutstandingAmountRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1BillOutstandingAmountRequestDetailsType_723id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_724id);
        eBLBaseComponents1apis1ebay1BillOutstandingAmountRequestDetailsType_723id.setNote(note_726idTemp);
        eBLBaseComponents1apis1ebay1BillOutstandingAmountRequestDetailsType_723id.setProfileID(profileID_727idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1BillOutstandingAmountRequestType_722id" scope="session" class="PayPalAPI.api.ebay.BillOutstandingAmountRequestType" />
        <%
        PayPalAPI1api1ebay1BillOutstandingAmountRequestType_722id.setBillOutstandingAmountRequestDetails(eBLBaseComponents1apis1ebay1BillOutstandingAmountRequestDetailsType_723id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1BillOutstandingAmountReq_721id" scope="session" class="PayPalAPI.api.ebay.BillOutstandingAmountReq" />
        <%
        PayPalAPI1api1ebay1BillOutstandingAmountReq_721id.setBillOutstandingAmountRequest(PayPalAPI1api1ebay1BillOutstandingAmountRequestType_722id);
        PayPalAPI.api.ebay.BillOutstandingAmountResponseType billOutstandingAmount2798mtemp = samplePayPalAPIAAInterfaceProxyid.billOutstandingAmount(PayPalAPI1api1ebay1BillOutstandingAmountReq_721id);
if(billOutstandingAmount2798mtemp == null){
%>
<%=billOutstandingAmount2798mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">billOutstandingAmountResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">profileID:</TD>
<TD>
<%
if(billOutstandingAmount2798mtemp != null){
eBLBaseComponents.apis.ebay.BillOutstandingAmountResponseDetailsType tebece0=billOutstandingAmount2798mtemp.getBillOutstandingAmountResponseDetails();
if(tebece0 != null){
java.lang.String typeprofileID2803 = tebece0.getProfileID();
        String tempResultprofileID2803 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprofileID2803));
        %>
        <%= tempResultprofileID2803 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 2819:
        gotMethod = true;
        String _value_733id=  request.getParameter("_value2836");
            java.lang.String _value_733idTemp = null;
        if(!_value_733id.equals("")){
         _value_733idTemp  = _value_733id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_732id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_732id.set_value(_value_733idTemp);
        String _value_735id=  request.getParameter("_value2840");
            java.lang.String _value_735idTemp = null;
        if(!_value_735id.equals("")){
         _value_735idTemp  = _value_735id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_734id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_734id.set_value(_value_735idTemp);
        String _value_737id=  request.getParameter("_value2844");
            java.lang.String _value_737idTemp = null;
        if(!_value_737id.equals("")){
         _value_737idTemp  = _value_737id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_736id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_736id.set_value(_value_737idTemp);
        String totalBillingCycles_738id=  request.getParameter("totalBillingCycles2846");
            java.lang.Integer totalBillingCycles_738idTemp = null;
        if(!totalBillingCycles_738id.equals("")){
         totalBillingCycles_738idTemp  = java.lang.Integer.valueOf(totalBillingCycles_738id);
        }
        String billingFrequency_739id=  request.getParameter("billingFrequency2848");
            java.lang.Integer billingFrequency_739idTemp = null;
        if(!billingFrequency_739id.equals("")){
         billingFrequency_739idTemp  = java.lang.Integer.valueOf(billingFrequency_739id);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_731id" scope="session" class="eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update" />
        <%
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_731id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_732id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_731id.setTaxAmount(CoreComponentTypes1apis1ebay1BasicAmountType_734id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_731id.setShippingAmount(CoreComponentTypes1apis1ebay1BasicAmountType_736id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_731id.setTotalBillingCycles(totalBillingCycles_738idTemp);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_731id.setBillingFrequency(billingFrequency_739idTemp);
        String _value_742id=  request.getParameter("_value2854");
            java.lang.String _value_742idTemp = null;
        if(!_value_742id.equals("")){
         _value_742idTemp  = _value_742id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_741id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_741id.set_value(_value_742idTemp);
        String _value_744id=  request.getParameter("_value2858");
            java.lang.String _value_744idTemp = null;
        if(!_value_744id.equals("")){
         _value_744idTemp  = _value_744id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_743id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_743id.set_value(_value_744idTemp);
        String _value_746id=  request.getParameter("_value2862");
            java.lang.String _value_746idTemp = null;
        if(!_value_746id.equals("")){
         _value_746idTemp  = _value_746id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_745id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_745id.set_value(_value_746idTemp);
        String totalBillingCycles_747id=  request.getParameter("totalBillingCycles2864");
            java.lang.Integer totalBillingCycles_747idTemp = null;
        if(!totalBillingCycles_747id.equals("")){
         totalBillingCycles_747idTemp  = java.lang.Integer.valueOf(totalBillingCycles_747id);
        }
        String billingFrequency_748id=  request.getParameter("billingFrequency2866");
            java.lang.Integer billingFrequency_748idTemp = null;
        if(!billingFrequency_748id.equals("")){
         billingFrequency_748idTemp  = java.lang.Integer.valueOf(billingFrequency_748id);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_740id" scope="session" class="eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update" />
        <%
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_740id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_741id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_740id.setTaxAmount(CoreComponentTypes1apis1ebay1BasicAmountType_743id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_740id.setShippingAmount(CoreComponentTypes1apis1ebay1BasicAmountType_745id);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_740id.setTotalBillingCycles(totalBillingCycles_747idTemp);
        eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_740id.setBillingFrequency(billingFrequency_748idTemp);
        String note_749id=  request.getParameter("note2868");
            java.lang.String note_749idTemp = null;
        if(!note_749id.equals("")){
         note_749idTemp  = note_749id;
        }
        String maxFailedPayments_750id=  request.getParameter("maxFailedPayments2870");
            java.lang.Integer maxFailedPayments_750idTemp = null;
        if(!maxFailedPayments_750id.equals("")){
         maxFailedPayments_750idTemp  = java.lang.Integer.valueOf(maxFailedPayments_750id);
        }
        String profileID_751id=  request.getParameter("profileID2872");
            java.lang.String profileID_751idTemp = null;
        if(!profileID_751id.equals("")){
         profileID_751idTemp  = profileID_751id;
        }
        String _value_753id=  request.getParameter("_value2876");
            java.lang.String _value_753idTemp = null;
        if(!_value_753id.equals("")){
         _value_753idTemp  = _value_753id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_752id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_752id.set_value(_value_753idTemp);
        String profileReference_754id=  request.getParameter("profileReference2878");
            java.lang.String profileReference_754idTemp = null;
        if(!profileReference_754id.equals("")){
         profileReference_754idTemp  = profileReference_754id;
        }
        String _value_756id=  request.getParameter("_value2882");
            java.lang.String _value_756idTemp = null;
        if(!_value_756id.equals("")){
         _value_756idTemp  = _value_756id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_755id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_755id.set_value(_value_756idTemp);
        String _value_758id=  request.getParameter("_value2886");
            java.lang.String _value_758idTemp = null;
        if(!_value_758id.equals("")){
         _value_758idTemp  = _value_758id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_757id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_757id.set_value(_value_758idTemp);
        String authStatus3Ds_761id=  request.getParameter("authStatus3Ds2892");
            java.lang.String authStatus3Ds_761idTemp = null;
        if(!authStatus3Ds_761id.equals("")){
         authStatus3Ds_761idTemp  = authStatus3Ds_761id;
        }
        String xid_762id=  request.getParameter("xid2894");
            java.lang.String xid_762idTemp = null;
        if(!xid_762id.equals("")){
         xid_762idTemp  = xid_762id;
        }
        String cavv_763id=  request.getParameter("cavv2896");
            java.lang.String cavv_763idTemp = null;
        if(!cavv_763id.equals("")){
         cavv_763idTemp  = cavv_763id;
        }
        String eci3Ds_764id=  request.getParameter("eci3Ds2898");
            java.lang.String eci3Ds_764idTemp = null;
        if(!eci3Ds_764id.equals("")){
         eci3Ds_764idTemp  = eci3Ds_764id;
        }
        String mpiVendor3Ds_765id=  request.getParameter("mpiVendor3Ds2900");
            java.lang.String mpiVendor3Ds_765idTemp = null;
        if(!mpiVendor3Ds_765id.equals("")){
         mpiVendor3Ds_765idTemp  = mpiVendor3Ds_765id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_760id" scope="session" class="eBLBaseComponents.apis.ebay.ThreeDSecureRequestType" />
        <%
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_760id.setAuthStatus3Ds(authStatus3Ds_761idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_760id.setXid(xid_762idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_760id.setCavv(cavv_763idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_760id.setEci3Ds(eci3Ds_764idTemp);
        eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_760id.setMpiVendor3Ds(mpiVendor3Ds_765idTemp);
        String startYear_766id=  request.getParameter("startYear2902");
            java.lang.Integer startYear_766idTemp = null;
        if(!startYear_766id.equals("")){
         startYear_766idTemp  = java.lang.Integer.valueOf(startYear_766id);
        }
        String payerID_768id=  request.getParameter("payerID2906");
            java.lang.String payerID_768idTemp = null;
        if(!payerID_768id.equals("")){
         payerID_768idTemp  = payerID_768id;
        }
        String taxId_770id=  request.getParameter("taxId2910");
            java.lang.String taxId_770idTemp = null;
        if(!taxId_770id.equals("")){
         taxId_770idTemp  = taxId_770id;
        }
        String taxIdType_771id=  request.getParameter("taxIdType2912");
            java.lang.String taxIdType_771idTemp = null;
        if(!taxIdType_771id.equals("")){
         taxIdType_771idTemp  = taxIdType_771id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1TaxIdDetailsType_769id" scope="session" class="eBLBaseComponents.apis.ebay.TaxIdDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_769id.setTaxId(taxId_770idTemp);
        eBLBaseComponents1apis1ebay1TaxIdDetailsType_769id.setTaxIdType(taxIdType_771idTemp);
        String lastName_773id=  request.getParameter("lastName2916");
            java.lang.String lastName_773idTemp = null;
        if(!lastName_773id.equals("")){
         lastName_773idTemp  = lastName_773id;
        }
        String middleName_774id=  request.getParameter("middleName2918");
            java.lang.String middleName_774idTemp = null;
        if(!middleName_774id.equals("")){
         middleName_774idTemp  = middleName_774id;
        }
        String firstName_775id=  request.getParameter("firstName2920");
            java.lang.String firstName_775idTemp = null;
        if(!firstName_775id.equals("")){
         firstName_775idTemp  = firstName_775id;
        }
        String suffix_776id=  request.getParameter("suffix2922");
            java.lang.String suffix_776idTemp = null;
        if(!suffix_776id.equals("")){
         suffix_776idTemp  = suffix_776id;
        }
        String salutation_777id=  request.getParameter("salutation2924");
            java.lang.String salutation_777idTemp = null;
        if(!salutation_777id.equals("")){
         salutation_777idTemp  = salutation_777id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PersonNameType_772id" scope="session" class="eBLBaseComponents.apis.ebay.PersonNameType" />
        <%
        eBLBaseComponents1apis1ebay1PersonNameType_772id.setLastName(lastName_773idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_772id.setMiddleName(middleName_774idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_772id.setFirstName(firstName_775idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_772id.setSuffix(suffix_776idTemp);
        eBLBaseComponents1apis1ebay1PersonNameType_772id.setSalutation(salutation_777idTemp);
        String payer_778id=  request.getParameter("payer2926");
            java.lang.String payer_778idTemp = null;
        if(!payer_778id.equals("")){
         payer_778idTemp  = payer_778id;
        }
        %>
        <jsp:useBean id="EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_779id" scope="session" class="EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType" />
        <%
        String contactPhone_780id=  request.getParameter("contactPhone2930");
            java.lang.String contactPhone_780idTemp = null;
        if(!contactPhone_780id.equals("")){
         contactPhone_780idTemp  = contactPhone_780id;
        }
        String payerBusiness_781id=  request.getParameter("payerBusiness2932");
            java.lang.String payerBusiness_781idTemp = null;
        if(!payerBusiness_781id.equals("")){
         payerBusiness_781idTemp  = payerBusiness_781id;
        }
        String countryName_783id=  request.getParameter("countryName2936");
            java.lang.String countryName_783idTemp = null;
        if(!countryName_783id.equals("")){
         countryName_783idTemp  = countryName_783id;
        }
        String internationalStreet_784id=  request.getParameter("internationalStreet2938");
            java.lang.String internationalStreet_784idTemp = null;
        if(!internationalStreet_784id.equals("")){
         internationalStreet_784idTemp  = internationalStreet_784id;
        }
        String externalAddressID_785id=  request.getParameter("externalAddressID2940");
            java.lang.String externalAddressID_785idTemp = null;
        if(!externalAddressID_785id.equals("")){
         externalAddressID_785idTemp  = externalAddressID_785id;
        }
        String stateOrProvince_786id=  request.getParameter("stateOrProvince2942");
            java.lang.String stateOrProvince_786idTemp = null;
        if(!stateOrProvince_786id.equals("")){
         stateOrProvince_786idTemp  = stateOrProvince_786id;
        }
        String internationalName_787id=  request.getParameter("internationalName2944");
            java.lang.String internationalName_787idTemp = null;
        if(!internationalName_787id.equals("")){
         internationalName_787idTemp  = internationalName_787id;
        }
        String cityName_788id=  request.getParameter("cityName2946");
            java.lang.String cityName_788idTemp = null;
        if(!cityName_788id.equals("")){
         cityName_788idTemp  = cityName_788id;
        }
        String phone_789id=  request.getParameter("phone2948");
            java.lang.String phone_789idTemp = null;
        if(!phone_789id.equals("")){
         phone_789idTemp  = phone_789id;
        }
        String postalCode_790id=  request.getParameter("postalCode2950");
            java.lang.String postalCode_790idTemp = null;
        if(!postalCode_790id.equals("")){
         postalCode_790idTemp  = postalCode_790id;
        }
        String street2_791id=  request.getParameter("street22952");
            java.lang.String street2_791idTemp = null;
        if(!street2_791id.equals("")){
         street2_791idTemp  = street2_791id;
        }
        String street1_792id=  request.getParameter("street12954");
            java.lang.String street1_792idTemp = null;
        if(!street1_792id.equals("")){
         street1_792idTemp  = street1_792id;
        }
        String addressID_793id=  request.getParameter("addressID2956");
            java.lang.String addressID_793idTemp = null;
        if(!addressID_793id.equals("")){
         addressID_793idTemp  = addressID_793id;
        }
        String internationalStateAndCity_794id=  request.getParameter("internationalStateAndCity2958");
            java.lang.String internationalStateAndCity_794idTemp = null;
        if(!internationalStateAndCity_794id.equals("")){
         internationalStateAndCity_794idTemp  = internationalStateAndCity_794id;
        }
        String name_795id=  request.getParameter("name2960");
            java.lang.String name_795idTemp = null;
        if(!name_795id.equals("")){
         name_795idTemp  = name_795id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_782id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_782id.setCountryName(countryName_783idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setInternationalStreet(internationalStreet_784idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setExternalAddressID(externalAddressID_785idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setStateOrProvince(stateOrProvince_786idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setInternationalName(internationalName_787idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setCityName(cityName_788idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setPhone(phone_789idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setPostalCode(postalCode_790idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setStreet2(street2_791idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setStreet1(street1_792idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setAddressID(addressID_793idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setInternationalStateAndCity(internationalStateAndCity_794idTemp);
        eBLBaseComponents1apis1ebay1AddressType_782id.setName(name_795idTemp);
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1PayerInfoType_767id" scope="session" class="eBLBaseComponents.apis.ebay.PayerInfoType" />
        <%
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setPayerID(payerID_768idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setTaxIdDetails(eBLBaseComponents1apis1ebay1TaxIdDetailsType_769id);
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setPayerName(eBLBaseComponents1apis1ebay1PersonNameType_772id);
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setPayer(payer_778idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setEnhancedPayerInfo(EnhancedDataTypes1apis1ebay1EnhancedPayerInfoType_779id);
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setContactPhone(contactPhone_780idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setPayerBusiness(payerBusiness_781idTemp);
        eBLBaseComponents1apis1ebay1PayerInfoType_767id.setAddress(eBLBaseComponents1apis1ebay1AddressType_782id);
        String issueNumber_796id=  request.getParameter("issueNumber2962");
            java.lang.String issueNumber_796idTemp = null;
        if(!issueNumber_796id.equals("")){
         issueNumber_796idTemp  = issueNumber_796id;
        }
        String cVV2_797id=  request.getParameter("cVV22964");
            java.lang.String cVV2_797idTemp = null;
        if(!cVV2_797id.equals("")){
         cVV2_797idTemp  = cVV2_797id;
        }
        String expMonth_798id=  request.getParameter("expMonth2966");
            java.lang.Integer expMonth_798idTemp = null;
        if(!expMonth_798id.equals("")){
         expMonth_798idTemp  = java.lang.Integer.valueOf(expMonth_798id);
        }
        String startMonth_799id=  request.getParameter("startMonth2968");
            java.lang.Integer startMonth_799idTemp = null;
        if(!startMonth_799id.equals("")){
         startMonth_799idTemp  = java.lang.Integer.valueOf(startMonth_799id);
        }
        String creditCardNumber_800id=  request.getParameter("creditCardNumber2970");
            java.lang.String creditCardNumber_800idTemp = null;
        if(!creditCardNumber_800id.equals("")){
         creditCardNumber_800idTemp  = creditCardNumber_800id;
        }
        String expYear_801id=  request.getParameter("expYear2972");
            java.lang.Integer expYear_801idTemp = null;
        if(!expYear_801id.equals("")){
         expYear_801idTemp  = java.lang.Integer.valueOf(expYear_801id);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id" scope="session" class="eBLBaseComponents.apis.ebay.CreditCardDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setThreeDSecureRequest(eBLBaseComponents1apis1ebay1ThreeDSecureRequestType_760id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setStartYear(startYear_766idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setCardOwner(eBLBaseComponents1apis1ebay1PayerInfoType_767id);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setIssueNumber(issueNumber_796idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setCVV2(cVV2_797idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setExpMonth(expMonth_798idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setStartMonth(startMonth_799idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setCreditCardNumber(creditCardNumber_800idTemp);
        eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id.setExpYear(expYear_801idTemp);
        String countryName_803id=  request.getParameter("countryName2976");
            java.lang.String countryName_803idTemp = null;
        if(!countryName_803id.equals("")){
         countryName_803idTemp  = countryName_803id;
        }
        String internationalStreet_804id=  request.getParameter("internationalStreet2978");
            java.lang.String internationalStreet_804idTemp = null;
        if(!internationalStreet_804id.equals("")){
         internationalStreet_804idTemp  = internationalStreet_804id;
        }
        String externalAddressID_805id=  request.getParameter("externalAddressID2980");
            java.lang.String externalAddressID_805idTemp = null;
        if(!externalAddressID_805id.equals("")){
         externalAddressID_805idTemp  = externalAddressID_805id;
        }
        String stateOrProvince_806id=  request.getParameter("stateOrProvince2982");
            java.lang.String stateOrProvince_806idTemp = null;
        if(!stateOrProvince_806id.equals("")){
         stateOrProvince_806idTemp  = stateOrProvince_806id;
        }
        String internationalName_807id=  request.getParameter("internationalName2984");
            java.lang.String internationalName_807idTemp = null;
        if(!internationalName_807id.equals("")){
         internationalName_807idTemp  = internationalName_807id;
        }
        String cityName_808id=  request.getParameter("cityName2986");
            java.lang.String cityName_808idTemp = null;
        if(!cityName_808id.equals("")){
         cityName_808idTemp  = cityName_808id;
        }
        String phone_809id=  request.getParameter("phone2988");
            java.lang.String phone_809idTemp = null;
        if(!phone_809id.equals("")){
         phone_809idTemp  = phone_809id;
        }
        String postalCode_810id=  request.getParameter("postalCode2990");
            java.lang.String postalCode_810idTemp = null;
        if(!postalCode_810id.equals("")){
         postalCode_810idTemp  = postalCode_810id;
        }
        String street2_811id=  request.getParameter("street22992");
            java.lang.String street2_811idTemp = null;
        if(!street2_811id.equals("")){
         street2_811idTemp  = street2_811id;
        }
        String street1_812id=  request.getParameter("street12994");
            java.lang.String street1_812idTemp = null;
        if(!street1_812id.equals("")){
         street1_812idTemp  = street1_812id;
        }
        String addressID_813id=  request.getParameter("addressID2996");
            java.lang.String addressID_813idTemp = null;
        if(!addressID_813id.equals("")){
         addressID_813idTemp  = addressID_813id;
        }
        String internationalStateAndCity_814id=  request.getParameter("internationalStateAndCity2998");
            java.lang.String internationalStateAndCity_814idTemp = null;
        if(!internationalStateAndCity_814id.equals("")){
         internationalStateAndCity_814idTemp  = internationalStateAndCity_814id;
        }
        String name_815id=  request.getParameter("name3000");
            java.lang.String name_815idTemp = null;
        if(!name_815id.equals("")){
         name_815idTemp  = name_815id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1AddressType_802id" scope="session" class="eBLBaseComponents.apis.ebay.AddressType" />
        <%
        eBLBaseComponents1apis1ebay1AddressType_802id.setCountryName(countryName_803idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setInternationalStreet(internationalStreet_804idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setExternalAddressID(externalAddressID_805idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setStateOrProvince(stateOrProvince_806idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setInternationalName(internationalName_807idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setCityName(cityName_808idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setPhone(phone_809idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setPostalCode(postalCode_810idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setStreet2(street2_811idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setStreet1(street1_812idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setAddressID(addressID_813idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setInternationalStateAndCity(internationalStateAndCity_814idTemp);
        eBLBaseComponents1apis1ebay1AddressType_802id.setName(name_815idTemp);
        String _value_817id=  request.getParameter("_value3004");
            java.lang.String _value_817idTemp = null;
        if(!_value_817id.equals("")){
         _value_817idTemp  = _value_817id;
        }
        %>
        <jsp:useBean id="CoreComponentTypes1apis1ebay1BasicAmountType_816id" scope="session" class="CoreComponentTypes.apis.ebay.BasicAmountType" />
        <%
        CoreComponentTypes1apis1ebay1BasicAmountType_816id.set_value(_value_817idTemp);
        String description_818id=  request.getParameter("description3006");
            java.lang.String description_818idTemp = null;
        if(!description_818id.equals("")){
         description_818idTemp  = description_818id;
        }
        String subscriberName_819id=  request.getParameter("subscriberName3008");
            java.lang.String subscriberName_819idTemp = null;
        if(!subscriberName_819id.equals("")){
         subscriberName_819idTemp  = subscriberName_819id;
        }
        String additionalBillingCycles_820id=  request.getParameter("additionalBillingCycles3010");
            java.lang.Integer additionalBillingCycles_820idTemp = null;
        if(!additionalBillingCycles_820id.equals("")){
         additionalBillingCycles_820idTemp  = java.lang.Integer.valueOf(additionalBillingCycles_820id);
        }
        String billingStartDate_821id=  request.getParameter("billingStartDate3012");
            java.util.Calendar billingStartDate_821idTemp = null;
        if(!billingStartDate_821id.equals("")){
        java.text.DateFormat dateFormatbillingStartDate3012 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempbillingStartDate3012  = dateFormatbillingStartDate3012.parse(billingStartDate_821id);
         billingStartDate_821idTemp = new java.util.GregorianCalendar();
        billingStartDate_821idTemp.setTime(dateTempbillingStartDate3012);
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id" scope="session" class="eBLBaseComponents.apis.ebay.UpdateRecurringPaymentsProfileRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setTrialPeriod(eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_731id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setPaymentPeriod(eBLBaseComponents1apis1ebay1BillingPeriodDetailsType_Update_740id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setNote(note_749idTemp);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setMaxFailedPayments(maxFailedPayments_750idTemp);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setProfileID(profileID_751idTemp);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setTaxAmount(CoreComponentTypes1apis1ebay1BasicAmountType_752id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setProfileReference(profileReference_754idTemp);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setAmount(CoreComponentTypes1apis1ebay1BasicAmountType_755id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setShippingAmount(CoreComponentTypes1apis1ebay1BasicAmountType_757id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setCreditCard(eBLBaseComponents1apis1ebay1CreditCardDetailsType_759id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setSubscriberShippingAddress(eBLBaseComponents1apis1ebay1AddressType_802id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setOutstandingBalance(CoreComponentTypes1apis1ebay1BasicAmountType_816id);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setDescription(description_818idTemp);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setSubscriberName(subscriberName_819idTemp);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setAdditionalBillingCycles(additionalBillingCycles_820idTemp);
        eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id.setBillingStartDate(billingStartDate_821idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1UpdateRecurringPaymentsProfileRequestType_729id" scope="session" class="PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileRequestType" />
        <%
        PayPalAPI1api1ebay1UpdateRecurringPaymentsProfileRequestType_729id.setUpdateRecurringPaymentsProfileRequestDetails(eBLBaseComponents1apis1ebay1UpdateRecurringPaymentsProfileRequestDetailsType_730id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1UpdateRecurringPaymentsProfileReq_728id" scope="session" class="PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileReq" />
        <%
        PayPalAPI1api1ebay1UpdateRecurringPaymentsProfileReq_728id.setUpdateRecurringPaymentsProfileRequest(PayPalAPI1api1ebay1UpdateRecurringPaymentsProfileRequestType_729id);
        PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile2819mtemp = samplePayPalAPIAAInterfaceProxyid.updateRecurringPaymentsProfile(PayPalAPI1api1ebay1UpdateRecurringPaymentsProfileReq_728id);
if(updateRecurringPaymentsProfile2819mtemp == null){
%>
<%=updateRecurringPaymentsProfile2819mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">updateRecurringPaymentsProfileResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">profileID:</TD>
<TD>
<%
if(updateRecurringPaymentsProfile2819mtemp != null){
eBLBaseComponents.apis.ebay.UpdateRecurringPaymentsProfileResponseDetailsType tebece0=updateRecurringPaymentsProfile2819mtemp.getUpdateRecurringPaymentsProfileResponseDetails();
if(tebece0 != null){
java.lang.String typeprofileID2824 = tebece0.getProfileID();
        String tempResultprofileID2824 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprofileID2824));
        %>
        <%= tempResultprofileID2824 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 3014:
        gotMethod = true;
        String transactionID_825id=  request.getParameter("transactionID3029");
            java.lang.String transactionID_825idTemp = null;
        if(!transactionID_825id.equals("")){
         transactionID_825idTemp  = transactionID_825id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ReverseTransactionRequestDetailsType_824id" scope="session" class="eBLBaseComponents.apis.ebay.ReverseTransactionRequestDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ReverseTransactionRequestDetailsType_824id.setTransactionID(transactionID_825idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ReverseTransactionRequestType_823id" scope="session" class="PayPalAPI.api.ebay.ReverseTransactionRequestType" />
        <%
        PayPalAPI1api1ebay1ReverseTransactionRequestType_823id.setReverseTransactionRequestDetails(eBLBaseComponents1apis1ebay1ReverseTransactionRequestDetailsType_824id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ReverseTransactionReq_822id" scope="session" class="PayPalAPI.api.ebay.ReverseTransactionReq" />
        <%
        PayPalAPI1api1ebay1ReverseTransactionReq_822id.setReverseTransactionRequest(PayPalAPI1api1ebay1ReverseTransactionRequestType_823id);
        PayPalAPI.api.ebay.ReverseTransactionResponseType reverseTransaction3014mtemp = samplePayPalAPIAAInterfaceProxyid.reverseTransaction(PayPalAPI1api1ebay1ReverseTransactionReq_822id);
if(reverseTransaction3014mtemp == null){
%>
<%=reverseTransaction3014mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reverseTransactionResponseDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">reverseTransactionID:</TD>
<TD>
<%
if(reverseTransaction3014mtemp != null){
eBLBaseComponents.apis.ebay.ReverseTransactionResponseDetailsType tebece0=reverseTransaction3014mtemp.getReverseTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typereverseTransactionID3019 = tebece0.getReverseTransactionID();
        String tempResultreverseTransactionID3019 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereverseTransactionID3019));
        %>
        <%= tempResultreverseTransactionID3019 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">status:</TD>
<TD>
<%
if(reverseTransaction3014mtemp != null){
eBLBaseComponents.apis.ebay.ReverseTransactionResponseDetailsType tebece0=reverseTransaction3014mtemp.getReverseTransactionResponseDetails();
if(tebece0 != null){
java.lang.String typestatus3021 = tebece0.getStatus();
        String tempResultstatus3021 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus3021));
        %>
        <%= tempResultstatus3021 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 3031:
        gotMethod = true;
        String externalRememberMeID_828id=  request.getParameter("externalRememberMeID3038");
            java.lang.String externalRememberMeID_828idTemp = null;
        if(!externalRememberMeID_828id.equals("")){
         externalRememberMeID_828idTemp  = externalRememberMeID_828id;
        }
        String externalRememberMeOwnerID_830id=  request.getParameter("externalRememberMeOwnerID3042");
            java.lang.String externalRememberMeOwnerID_830idTemp = null;
        if(!externalRememberMeOwnerID_830id.equals("")){
         externalRememberMeOwnerID_830idTemp  = externalRememberMeOwnerID_830id;
        }
        String externalRememberMeOwnerIDType_831id=  request.getParameter("externalRememberMeOwnerIDType3044");
            java.lang.String externalRememberMeOwnerIDType_831idTemp = null;
        if(!externalRememberMeOwnerIDType_831id.equals("")){
         externalRememberMeOwnerIDType_831idTemp  = externalRememberMeOwnerIDType_831id;
        }
        %>
        <jsp:useBean id="eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_829id" scope="session" class="eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType" />
        <%
        eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_829id.setExternalRememberMeOwnerID(externalRememberMeOwnerID_830idTemp);
        eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_829id.setExternalRememberMeOwnerIDType(externalRememberMeOwnerIDType_831idTemp);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ExternalRememberMeOptOutRequestType_827id" scope="session" class="PayPalAPI.api.ebay.ExternalRememberMeOptOutRequestType" />
        <%
        PayPalAPI1api1ebay1ExternalRememberMeOptOutRequestType_827id.setExternalRememberMeID(externalRememberMeID_828idTemp);
        PayPalAPI1api1ebay1ExternalRememberMeOptOutRequestType_827id.setExternalRememberMeOwnerDetails(eBLBaseComponents1apis1ebay1ExternalRememberMeOwnerDetailsType_829id);
        %>
        <jsp:useBean id="PayPalAPI1api1ebay1ExternalRememberMeOptOutReq_826id" scope="session" class="PayPalAPI.api.ebay.ExternalRememberMeOptOutReq" />
        <%
        PayPalAPI1api1ebay1ExternalRememberMeOptOutReq_826id.setExternalRememberMeOptOutRequest(PayPalAPI1api1ebay1ExternalRememberMeOptOutRequestType_827id);
        PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType externalRememberMeOptOut3031mtemp = samplePayPalAPIAAInterfaceProxyid.externalRememberMeOptOut(PayPalAPI1api1ebay1ExternalRememberMeOptOutReq_826id);
if(externalRememberMeOptOut3031mtemp == null){
%>
<%=externalRememberMeOptOut3031mtemp %>
<%
}else{
        if(externalRememberMeOptOut3031mtemp!= null){
        String tempreturnp3032 = externalRememberMeOptOut3031mtemp.toString();
        %>
        <%=tempreturnp3032%>
        <%
        }}
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