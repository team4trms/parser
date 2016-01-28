package com.xml.files.price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/*PriceUpdateDate
ItemCode
ItemType
ItemName
ManufacturerName
ManufactureCountry
ManufacturerItemDescription
UnitQty
Quantity
bIsWeighted0
UnitOfMeasure
QtyInPackage
ItemPrice
UnitOfMeasurePrice
AllowDiscount
ItemStatus*/
@XmlRootElement(name="Item")
@XmlAccessorType(XmlAccessType.NONE)
public class Item {
	@XmlElement(name="PriceUpdateDate")
	private String priceUpdateDate;
	@XmlElement(name="ItemCode")
	private String itemCode;
	@XmlElement(name="ItemType")
	private String itemType;
	@XmlElement(name="ItemName")
	private String itemName;
	@XmlElement(name="ManufacturerName")
	private String manufacturerName;
	@XmlElement(name="ManufactureCountry")
	private String ManufactureCountry;
	@XmlElement(name="ManufacturerItemDescription")
	private String ManufacturerItemDescription;
	@XmlElement(name="UnitQty")
	private String UnitQty;
	@XmlElement(name="Quantity")
	private String Quantity;
	@XmlElement(name="bIsWeighted")
	private String bIsWeighted;
	@XmlElement(name="UnitOfMeasure")
	private String UnitOfMeasure;
	@XmlElement(name="QtyInPackage")
	private String QtyInPackage;
	@XmlElement(name="ItemPrice")
	private String ItemPrice;
	@XmlElement(name="UnitOfMeasurePrice")
	private String UnitOfMeasurePrice;
	@XmlElement(name="AllowDiscount")
	private String AllowDiscount;
	@XmlElement(name="ItemStatus")
	private String ItemStatus;
	
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getManufactureCountry() {
		return ManufactureCountry;
	}
	public void setManufactureCountry(String manufactureCountry) {
		ManufactureCountry = manufactureCountry;
	}
	public String getManufacturerItemDescription() {
		return ManufacturerItemDescription;
	}
	public void setManufacturerItemDescription(String manufacturerItemDescription) {
		ManufacturerItemDescription = manufacturerItemDescription;
	}
	public String getUnitQty() {
		return UnitQty;
	}
	public void setUnitQty(String unitQty) {
		UnitQty = unitQty;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getbIsWeighted() {
		return bIsWeighted;
	}
	public void setbIsWeighted(String bIsWeighted) {
		this.bIsWeighted = bIsWeighted;
	}
	public String getUnitOfMeasure() {
		return UnitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		UnitOfMeasure = unitOfMeasure;
	}
	public String getQtyInPackage() {
		return QtyInPackage;
	}
	public void setQtyInPackage(String qtyInPackage) {
		QtyInPackage = qtyInPackage;
	}
	public String getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}
	public String getUnitOfMeasurePrice() {
		return UnitOfMeasurePrice;
	}
	public void setUnitOfMeasurePrice(String unitOfMeasurePrice) {
		UnitOfMeasurePrice = unitOfMeasurePrice;
	}
	public String getAllowDiscount() {
		return AllowDiscount;
	}
	public void setAllowDiscount(String allowDiscount) {
		AllowDiscount = allowDiscount;
	}
	public String getItemStatus() {
		return ItemStatus;
	}
	public void setItemStatus(String itemStatus) {
		ItemStatus = itemStatus;
	}
	public String getPriceUpdateDate() {
		return priceUpdateDate;
	}
	public void setPriceUpdateDate(String priceUpdateDate) {
		this.priceUpdateDate = priceUpdateDate;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
}