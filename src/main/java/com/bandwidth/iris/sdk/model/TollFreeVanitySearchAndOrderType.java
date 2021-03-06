package com.bandwidth.iris.sdk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TollFreeVanitySearchAndOrderType")
public class TollFreeVanitySearchAndOrderType extends BaseOrderType {
    @XmlElement(name = "TollFreeVanity")
    private String tollFreeVanity;

    public String getTollFreeVanity() {
        return tollFreeVanity;
    }

    public void setTollFreeVanity(String tollFreeVanity) {
        this.tollFreeVanity = tollFreeVanity;
    }
}
