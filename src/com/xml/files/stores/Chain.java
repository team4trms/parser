package com.xml.files.stores;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "values")

public class Chain{
	/*CHAINID
	 STORES
	 LASTUPDATEDATE */
	@XmlElement(name="CHAINID")
	private String chainId;
	@XmlElement(name = "STORES")
	private Stores stores;
	@XmlElement(name = "LASTUPDATEDATE")
	private String lastUpdate;
	
}
