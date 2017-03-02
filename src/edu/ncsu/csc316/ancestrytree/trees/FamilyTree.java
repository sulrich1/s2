package edu.ncsu.csc316.ancestrytree.trees;

public interface FamilyTree {
	public String relationship(String nameA, String NameB);
	
	public String relationship(String name);
	
	public String levelOrder();
}
