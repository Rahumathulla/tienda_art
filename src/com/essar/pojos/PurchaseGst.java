/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essar.pojos;

/**
 *
 * @author rahumathulla
 */
public class PurchaseGst {
    String gstin;
    String supplierName;
    String invoiceNumber;
    String invoiceDate;
    double invoiceValue;
    String placeOfSupply;
    String reverseCharge;
    String invoiceType;
    String eComm;
    double rate;
    double taxableValue;
    double cessAmount;

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getInvoiceValue() {
        return invoiceValue;
    }

    public void setInvoiceValue(double invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public String getPlaceOfSupply() {
        return placeOfSupply;
    }

    public void setPlaceOfSupply(String placeOfSupply) {
        this.placeOfSupply = placeOfSupply;
    }

    public String getReverseCharge() {
        return reverseCharge;
    }

    public void setReverseCharge(String reverseCharge) {
        this.reverseCharge = reverseCharge;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String geteComm() {
        return eComm;
    }

    public void seteComm(String eComm) {
        this.eComm = eComm;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTaxableValue() {
        return taxableValue;
    }

    public void setTaxableValue(double taxableValue) {
        this.taxableValue = taxableValue;
    }

    public double getCessAmount() {
        return cessAmount;
    }

    public void setCessAmount(double cessAmount) {
        this.cessAmount = cessAmount;
    }
    
    
}
