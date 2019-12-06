package com.example.devdemo.bean;

import java.math.BigDecimal;
import java.util.Date;

public class MessageBean01 {

    private String marketId;
    private String contractId;//合同ID
    private String contractName; //合同名称
    private String contractType; //合同类型标准编码
    private String typeName;   //合同类型名称
    private String purchaser;   //
    private String seller;   //
    private String contractQty;   //
    private Date contractstartDate;  //合同开始时间
    private Date contractendDate;   //合同结束时间
    private String transactionId;   //
    private String transactionType;  //
    private String purchaserPerson;  //
    private String sellerPerson;   //
    private BigDecimal contractPrice;   //合同电价
    private BigDecimal contractEnergy;   //合同电力
    private String purchaserEnergy;   //
    private String replacecontractId; //
    private String sellerNergy;  //
    private String unitId;  //
    private String monthQty;  //
    private String monthPrice;  //
    private String unitIds;    //
    private String month;   //
    private String firstDate;   //
    private String lastDate;   //

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getContractQty() {
        return contractQty;
    }

    public void setContractQty(String contractQty) {
        this.contractQty = contractQty;
    }

    public Date getContractstartDate() {
        return contractstartDate;
    }

    public void setContractstartDate(Date contractstartDate) {
        this.contractstartDate = contractstartDate;
    }

    public Date getContractendDate() {
        return contractendDate;
    }

    public void setContractendDate(Date contractendDate) {
        this.contractendDate = contractendDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPurchaserPerson() {
        return purchaserPerson;
    }

    public void setPurchaserPerson(String purchaserPerson) {
        this.purchaserPerson = purchaserPerson;
    }

    public String getSellerPerson() {
        return sellerPerson;
    }

    public void setSellerPerson(String sellerPerson) {
        this.sellerPerson = sellerPerson;
    }



    public String getPurchaserEnergy() {
        return purchaserEnergy;
    }

    public void setPurchaserEnergy(String purchaserEnergy) {
        this.purchaserEnergy = purchaserEnergy;
    }

    public String getReplacecontractId() {
        return replacecontractId;
    }

    public void setReplacecontractId(String replacecontractId) {
        this.replacecontractId = replacecontractId;
    }

    public String getSellerNergy() {
        return sellerNergy;
    }

    public void setSellerNergy(String sellerNergy) {
        this.sellerNergy = sellerNergy;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getMonthQty() {
        return monthQty;
    }

    public void setMonthQty(String monthQty) {
        this.monthQty = monthQty;
    }

    public String getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(String monthPrice) {
        this.monthPrice = monthPrice;
    }

    public String getUnitIds() {
        return unitIds;
    }

    public void setUnitIds(String unitIds) {
        this.unitIds = unitIds;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public BigDecimal getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(BigDecimal contractPrice) {
        this.contractPrice = contractPrice;
    }

    public BigDecimal getContractEnergy() {
        return contractEnergy;
    }

    public void setContractEnergy(BigDecimal contractEnergy) {
        this.contractEnergy = contractEnergy;
    }

    public MessageBean01() {
    }

    public MessageBean01(String marketId, String contractId, String contractName, String contractType, String typeName, String purchaser, String seller, String contractQty, Date contractstartDate, Date contractendDate, String transactionId, String transactionType, String purchaserPerson, String sellerPerson, BigDecimal contractPrice, BigDecimal contractEnergy, String purchaserEnergy, String replacecontractId, String sellerNergy, String unitId, String monthQty, String monthPrice, String unitIds, String month, String firstDate, String lastDate) {
        this.marketId = marketId;
        this.contractId = contractId;
        this.contractName = contractName;
        this.contractType = contractType;
        this.typeName = typeName;
        this.purchaser = purchaser;
        this.seller = seller;
        this.contractQty = contractQty;
        this.contractstartDate = contractstartDate;
        this.contractendDate = contractendDate;
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.purchaserPerson = purchaserPerson;
        this.sellerPerson = sellerPerson;
        this.contractPrice = contractPrice;
        this.contractEnergy = contractEnergy;
        this.purchaserEnergy = purchaserEnergy;
        this.replacecontractId = replacecontractId;
        this.sellerNergy = sellerNergy;
        this.unitId = unitId;
        this.monthQty = monthQty;
        this.monthPrice = monthPrice;
        this.unitIds = unitIds;
        this.month = month;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
    }
}
