package com.xml.files.price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/*ChainId
SubChainId
StoreId
BikoretNo
DllVerNo
Items*/
@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.NONE)
public class StorePrices {
	@XmlElement(name="ChainId")
	private String chainId;
	@XmlElement(name="SubChainId")
	private String sunChainId;
	@XmlElement(name="StoreId")
	private String storeId;
	@XmlElement(name="BikoretNo")
	private String bikoretNo;
	@XmlElement(name="DllVerNo")
	private String dllVerNo;
	@XmlElement(name="Items")
	private Items items;
	
	public String getChainId() {
		return chainId;
	}
	public void setChainId(String chainId) {
		this.chainId = chainId;
	}
	public String getSunChainId() {
		return sunChainId;
	}
	public void setSunChainId(String sunChainId) {
		this.sunChainId = sunChainId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getBikoretNo() {
		return bikoretNo;
	}
	public void setBikoretNo(String bikoretNo) {
		this.bikoretNo = bikoretNo;
	}
	public String getDllVerNo() {
		return dllVerNo;
	}
	public void setDllVerNo(String dllVerNo) {
		this.dllVerNo = dllVerNo;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	
}
