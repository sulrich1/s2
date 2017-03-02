package edu.ncsu.csc316.ancestrytree.io;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import edu.ncsu.csc316.ancestrytree.data.AhnentafelEntry;
import edu.ncsu.csc316.ancestrytree.list.MultiPurposeList;


public class AhnentafelFileReaderTest {
	public static final String path = "/Users/ulrich/Desktop/Copy (2) of AncestryManager/input/";
	@Test
	public void test() {
		try {
		AhnentafelFileReader reader = new AhnentafelFileReader("missing.txt");
		
		
		} catch (IllegalArgumentException e){
			//File does not exist
		}
//		Path currentRelativePath = Paths.get("");
//		String s = currentRelativePath.toAbsolutePath().toString();
//		System.out.println("Current relative path is: " + s);
		try {
		AhnentafelFileReader reader = new AhnentafelFileReader(path + "small-postorder.txt");
		} catch (IllegalArgumentException e){
			//Invalid line/entry
		}
		
		AhnentafelFileReader reader = new AhnentafelFileReader(path + "small-ahnentafel.txt");
		assertNotNull(reader);
		
		MultiPurposeList<AhnentafelEntry> list = reader.getList();
		assertNotNull(list);
		//assertEquals(11, list.size());
			
		for(int i = 0; i < list.max() + 1; i++)
			if(list.get(i) != null) System.out.println(list.get(i).getNumber() + " " + list.get(i).getName() );
		assertEquals("Billy Smith", list.get(0).getName());
		assertEquals("Joanne Harper", list.get(8).getName());
		
		
	}
}