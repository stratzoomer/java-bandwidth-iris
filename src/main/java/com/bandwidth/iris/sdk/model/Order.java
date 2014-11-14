package com.bandwidth.iris.sdk.model;

import com.bandwidth.iris.sdk.IrisClient;
import com.bandwidth.iris.sdk.IrisClientException;
import com.bandwidth.iris.sdk.IrisConstants;
import com.bandwidth.iris.sdk.IrisResponse;
import com.bandwidth.iris.sdk.utils.XmlUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.log4j.Logger;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order extends BaseModel {

    private static final Logger LOG = Logger.getLogger(Order.class);

    public static Order create(IrisClient client, Order order) throws IrisClientException {
        Order result = null;
        try {
            IrisResponse response = client.post(client.buildModelUri(new String[]{IrisConstants.ORDERS_URI_PATH}), order);
            if(response.isOK()){
                OrderResponse orderResponse  = (OrderResponse) XmlUtils.fromXml(response.getResponseBody(),
                        OrderResponse.class);
                result = orderResponse.getOrder();
            }
        }catch(Exception e){
            LOG.error("Error creating order: " + e.getMessage());
            throw new IrisClientException(e);
        }
        return result;
    }


    @XmlElement(name="id")
    private String id;

    @XmlElement(name="BackOrderRequested")
    private boolean backOrderRequested;

    @XmlElement(name="OrderCreateDate")
    private Date orderCreateDate;

    @XmlElement(name="Name")
    private String name;

    @XmlElement(name="SiteId")
    private String siteId;

    @XmlElement(name="CustomerOrderId")
    private String customerOrderId;

    @XmlElement(name="PartialAllowed")
    private boolean partialAllowed = false;

    @XmlElement(name="ExistingTelephoneNumberOrderType")
    private ExistingTelephoneNumberOrderType existingTelephoneNumberOrderType;

    @XmlElement(name="AreaCodeSearchAndOrderType")
    private AreaCodeSearchAndOrderType areaCodeSearchAndOrderType;

    @XmlElement(name="CitySearchAndOrderType")
    private CitySearchAndOrderType citySearchAndOrderType;

    @XmlElement(name="LATASearchAndOrderType")
    private LATASearchAndOrderType lataSearchAndOrderType;

    @XmlElement(name="NPANXXSearchAndOrderType")
    private NPANXXSearchAndOrderType npanxxSearchAndOrderType;

    @XmlElement(name="RateCenterSearchAndOrderType")
    private RateCenterSearchAndOrderType rateCenterSearchAndOrderType;

    @XmlElement(name="StateSearchAndOrderType")
    private StateSearchAndOrderType stateSearchAndOrderType;

    @XmlElement(name="TollFreeVanitySearchAndOrderType")
    private TollFreeVanitySearchAndOrderType tollFreeVanitySearchAndOrderType;

    @XmlElement(name="TollFreeWildCharSearchAndOrderType")
    private TollFreeWildCharSearchAndOrderType tollFreeWildCharSearchAndOrderType;

    @XmlElement(name="ZIPSearchAndOrderType")
    private ZIPSearchAndOrderType zipSearchAndOrderType;

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public boolean isBackOrderRequested() {
        return backOrderRequested;
    }

    public void setBackOrderRequested(boolean backOrderRequested) {
        this.backOrderRequested = backOrderRequested;
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public boolean isPartialAllowed() {
        return partialAllowed;
    }

    public void setPartialAllowed(boolean partialAllowed) {
        this.partialAllowed = partialAllowed;
    }

    public ExistingTelephoneNumberOrderType getExistingTelephoneNumberOrderType() {
        return existingTelephoneNumberOrderType;
    }

    public void setExistingTelephoneNumberOrderType(ExistingTelephoneNumberOrderType existingTelephoneNumberOrderType) {
        this.existingTelephoneNumberOrderType = existingTelephoneNumberOrderType;
    }

    public AreaCodeSearchAndOrderType getAreaCodeSearchAndOrderType() {
        return areaCodeSearchAndOrderType;
    }

    public void setAreaCodeSearchAndOrderType(AreaCodeSearchAndOrderType areaCodeSearchAndOrderType) {
        this.areaCodeSearchAndOrderType = areaCodeSearchAndOrderType;
    }

    public CitySearchAndOrderType getCitySearchAndOrderType() {
        return citySearchAndOrderType;
    }

    public void setCitySearchAndOrderType(CitySearchAndOrderType citySearchAndOrderType) {
        this.citySearchAndOrderType = citySearchAndOrderType;
    }

    public LATASearchAndOrderType getLataSearchAndOrderType() {
        return lataSearchAndOrderType;
    }

    public void setLataSearchAndOrderType(LATASearchAndOrderType lataSearchAndOrderType) {
        this.lataSearchAndOrderType = lataSearchAndOrderType;
    }

    public NPANXXSearchAndOrderType getNpanxxSearchAndOrderType() {
        return npanxxSearchAndOrderType;
    }

    public void setNpanxxSearchAndOrderType(NPANXXSearchAndOrderType npanxxSearchAndOrderType) {
        this.npanxxSearchAndOrderType = npanxxSearchAndOrderType;
    }

    public RateCenterSearchAndOrderType getRateCenterSearchAndOrderType() {
        return rateCenterSearchAndOrderType;
    }

    public void setRateCenterSearchAndOrderType(RateCenterSearchAndOrderType rateCenterSearchAndOrderType) {
        this.rateCenterSearchAndOrderType = rateCenterSearchAndOrderType;
    }

    public StateSearchAndOrderType getStateSearchAndOrderType() {
        return stateSearchAndOrderType;
    }

    public void setStateSearchAndOrderType(StateSearchAndOrderType stateSearchAndOrderType) {
        this.stateSearchAndOrderType = stateSearchAndOrderType;
    }

    public TollFreeVanitySearchAndOrderType getTollFreeVanitySearchAndOrderType() {
        return tollFreeVanitySearchAndOrderType;
    }

    public void setTollFreeVanitySearchAndOrderType(TollFreeVanitySearchAndOrderType tollFreeVanitySearchAndOrderType) {
        this.tollFreeVanitySearchAndOrderType = tollFreeVanitySearchAndOrderType;
    }

    public TollFreeWildCharSearchAndOrderType getTollFreeWildCharSearchAndOrderType() {
        return tollFreeWildCharSearchAndOrderType;
    }

    public void setTollFreeWildCharSearchAndOrderType(TollFreeWildCharSearchAndOrderType tollFreeWildCharSearchAndOrderType) {
        this.tollFreeWildCharSearchAndOrderType = tollFreeWildCharSearchAndOrderType;
    }

    public ZIPSearchAndOrderType getZipSearchAndOrderType() {
        return zipSearchAndOrderType;
    }

    public void setZipSearchAndOrderType(ZIPSearchAndOrderType zipSearchAndOrderType) {
        this.zipSearchAndOrderType = zipSearchAndOrderType;
    }
}
