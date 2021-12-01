/**
 * 
 */
package org.generation.italy.christmas;

import java.util.List;

/**
 * @author lucai
 *
 */
public class LetteraBabboNatale {
	// Attributes
	private String name;
	private String address;
	private List<String> list;

	public LetteraBabboNatale(String name, String address, List<String> list) {
		super();
		this.name = name;
		this.address = address;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getList() {
		return list;
	}

	public String invia() throws IllegalArgumentException {
		if (list.size() > 5)
			throw new IllegalArgumentException("too much items");
		return "Data to send [name=" + name + ", address=" + address + ", list=" + list + "]";
	}
}
