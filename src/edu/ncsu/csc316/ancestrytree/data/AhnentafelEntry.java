package edu.ncsu.csc316.ancestrytree.data;

public class AhnentafelEntry {
	private int number;
	private String first;
	private String last;
	
	public AhnentafelEntry (int number, String first, String last){
		this.number = number;
		this.first = first;
		this.last = last;
	}
	public int getNumber(){
		return number;
	}
	public String getName(){
		return first + " " +  last;
	}
	public String levelOrderName(){
		return last + ", " + first;
	}
}
