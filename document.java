package com.demo.collection;

public class Document {
	String Name;
	int Science;
	int Maths;
	int English;
	int History;
	
	public Document(String Name,int Science,int Maths ,int English,int History) {
		super();
		this.Name= Name;
		this.Science=Science;
		this.Maths=Maths;
		this.English=English;
	    this.History=History;
	}


	

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getScience() {
		return Science;
	}


	public void setScience(int science) {
		Science = science;
	}


	public int getMaths() {
		return Maths;
	}


	public void setMaths(int maths) {
		Maths = maths;
	}


	public int getEnglish() {
		return English;
	}


	public void setEnglish(int english) {
		English = english;
	}


	public int getHistory() {
		return History;
	}


	public void setHistory(int history) {
		History = history;
	}


	@Override
	public String toString() {
		return "Document [Name=" + Name + ", Science=" + Science + ", Maths=" + Maths + ", English=" + English
				+ ", History=" + History + "]";
	}

}
