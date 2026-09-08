package examples;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryReadDemo {
	public static void main(String[] args) {
		String path="src/hello.txt";
		
		FileInputStream isstream=null;
		try {
			isstream = new FileInputStream(path);
			byte[] content=new byte[isstream.available()];
			isstream.read(content);
			System.out.println(new String(content));
		} catch(IOException e) {
		e.printStackTrace();
	}
	}
}


