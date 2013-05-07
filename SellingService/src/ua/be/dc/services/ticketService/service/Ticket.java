/**
 * Ticket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.be.dc.services.ticketService.service;

public class Ticket  implements java.io.Serializable {
    private java.lang.Boolean available;

    private ua.be.dc.services.ticketService.service.Channel channel;

    private ua.be.dc.services.ticketService.service.Event event;

    private java.lang.Integer id;

    private java.lang.Float price;

    private java.lang.Integer seatId;

    private java.lang.Boolean sold;

    public Ticket() {
    }

    public Ticket(
           java.lang.Boolean available,
           ua.be.dc.services.ticketService.service.Channel channel,
           ua.be.dc.services.ticketService.service.Event event,
           java.lang.Integer id,
           java.lang.Float price,
           java.lang.Integer seatId,
           java.lang.Boolean sold) {
           this.available = available;
           this.channel = channel;
           this.event = event;
           this.id = id;
           this.price = price;
           this.seatId = seatId;
           this.sold = sold;
    }


    /**
     * Gets the available value for this Ticket.
     * 
     * @return available
     */
    public java.lang.Boolean getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this Ticket.
     * 
     * @param available
     */
    public void setAvailable(java.lang.Boolean available) {
        this.available = available;
    }


    /**
     * Gets the channel value for this Ticket.
     * 
     * @return channel
     */
    public ua.be.dc.services.ticketService.service.Channel getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Ticket.
     * 
     * @param channel
     */
    public void setChannel(ua.be.dc.services.ticketService.service.Channel channel) {
        this.channel = channel;
    }


    /**
     * Gets the event value for this Ticket.
     * 
     * @return event
     */
    public ua.be.dc.services.ticketService.service.Event getEvent() {
        return event;
    }


    /**
     * Sets the event value for this Ticket.
     * 
     * @param event
     */
    public void setEvent(ua.be.dc.services.ticketService.service.Event event) {
        this.event = event;
    }


    /**
     * Gets the id value for this Ticket.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Ticket.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the price value for this Ticket.
     * 
     * @return price
     */
    public java.lang.Float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Ticket.
     * 
     * @param price
     */
    public void setPrice(java.lang.Float price) {
        this.price = price;
    }


    /**
     * Gets the seatId value for this Ticket.
     * 
     * @return seatId
     */
    public java.lang.Integer getSeatId() {
        return seatId;
    }


    /**
     * Sets the seatId value for this Ticket.
     * 
     * @param seatId
     */
    public void setSeatId(java.lang.Integer seatId) {
        this.seatId = seatId;
    }


    /**
     * Gets the sold value for this Ticket.
     * 
     * @return sold
     */
    public java.lang.Boolean getSold() {
        return sold;
    }


    /**
     * Sets the sold value for this Ticket.
     * 
     * @param sold
     */
    public void setSold(java.lang.Boolean sold) {
        this.sold = sold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ticket)) return false;
        Ticket other = (Ticket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.available==null && other.getAvailable()==null) || 
             (this.available!=null &&
              this.available.equals(other.getAvailable()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              this.event.equals(other.getEvent()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.seatId==null && other.getSeatId()==null) || 
             (this.seatId!=null &&
              this.seatId.equals(other.getSeatId()))) &&
            ((this.sold==null && other.getSold()==null) || 
             (this.sold!=null &&
              this.sold.equals(other.getSold())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAvailable() != null) {
            _hashCode += getAvailable().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getEvent() != null) {
            _hashCode += getEvent().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getSeatId() != null) {
            _hashCode += getSeatId().hashCode();
        }
        if (getSold() != null) {
            _hashCode += getSold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ticket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.ticketService.services.dc.be.ua/", "ticket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.ticketService.services.dc.be.ua/", "channel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.ticketService.services.dc.be.ua/", "event"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
