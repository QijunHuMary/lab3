import static org.junit.Assert.*;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class FileTest {
	@Test 
	public void testFile() throws IOException {
    
    List<File> list = new ArrayList<>();
    //list.add(new File("FileTest"));
    list.add(new File("FileTest/test1.txt"));
    list.add(new File("FileTest/test2.txt"));
    list.add(new File("FileTest/test3"));
    
    //FileExample file = new FileExample("/Users/qijunhu/Documents/GitHub/lab3/FileTest");
    //File file = new File("/Users/qijunhu/Documents/GitHub/lab3/FileTest");
    File file = new File("FileTest/");
    List<File> result = FileExample.getFiles(file);
    //FileExample.getFiles(file);
    assertEquals(list, result);
	}
}
