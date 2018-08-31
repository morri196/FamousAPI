package co.grandcircus.famouslab.model;

import java.util.List;

public class Tiny {
	
	private List<Tiny> tiny;
	private String name;
	private String invented;
	private String year;
	
	public Tiny(List<Tiny> tiny, String name, String invented, String year) {
		super();
		this.tiny = tiny;
		this.name = name;
		this.invented = invented;
		this.year = year;
	}

	public Tiny() {
		super();
	}

	public List<Tiny> getTiny() {
		return tiny;
	}

	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvented() {
		return invented;
	}

	public void setInvented(String invented) {
		this.invented = invented;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return tiny + "," + name + "," + invented + "," + year;
	}
	
}
	