package com.bandwidth.iris.sdk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by sbarstow on 11/13/14.
 */
@XmlRootElement(name = "SipPeerTelephoneNumber")
@XmlAccessorType(XmlAccessType.FIELD)
public class SipPeerTelephoneNumber extends BaseModel {
    @XmlElement(name="FullNumber")
    private String fullNumber;

    @XmlElement(name="CallForward")
    private String callForward;

    @XmlElement(name="NumberFormat")
    private String numberFormat;

    @XmlElement(name="RewriteUser")
    private String rewriteUser;

    @XmlElement(name="RPIDFormat")
    private String rPIDFormat;

    public String getFullNumber() {
        return fullNumber;
    }

    public void setFullNumber(String fullNumber) {
        this.fullNumber = fullNumber;
    }

    public String getCallForward() {
        return callForward;
    }

    public void setCallForward(String callForward) {
        this.callForward = callForward;
    }

    public String getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    public String getRewriteUser() {
        return rewriteUser;
    }

    public void setRewriteUser(String rewriteUser) {
        this.rewriteUser = rewriteUser;
    }

    public String getrPIDFormat() {
        return rPIDFormat;
    }

    public void setrPIDFormat(String rPIDFormat) {
        this.rPIDFormat = rPIDFormat;
    }
}
