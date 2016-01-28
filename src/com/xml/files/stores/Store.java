package com.xml.files.stores;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/*SUBCHAINID
STOREID
BIKORETNO
STORETYPE
CHAINNAME
SUBCHAINNAME
STORENAME
ADDRESS
CITY
ZIPCODE*/
@XmlRootElement(name = "STORE")
public class Store{
	@XmlElement(name = "SUBCHAINID")
	private String subChainId;
	@XmlElement(name = "STOREID")
	private String storeId;
	@XmlElement(name = "BIKORETNO")
	private String bikorento;
	@XmlElement(name = "STORETYPE")
	private String storeType;
	@XmlElement(name = "CHAINNAME")
	private String chainName;
	@XmlElement(name = "SUBCHAINNAME")
	private String subChainName;
	@XmlElement(name = "STORENAME")
	private String storeName;
	@XmlElement(name = "ADDRESS")
	private String adress;
	@XmlElement(name = "CITY")
	private String city;
	@XmlElement(name = "ZIPCODE")
	private String zipcode;
}
