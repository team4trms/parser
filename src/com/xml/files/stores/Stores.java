package com.xml.files.stores;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "STORES")
public class Stores {
	@XmlElement(name="STORE")
	private List<Store> storesList;
}
