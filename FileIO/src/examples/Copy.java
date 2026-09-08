package examples;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings("unused")
public class Copy {
	public static void main(String[] args) {
		FileInputStream inFile=null;
		FileOutputStream outFile=null;
		try {
			inFile=new FileInputStream("D://software/Python.bin/");
			outFile=new FileOutputStream("D:/software/Python - Copy.bin");
			System.out.println("Copying File....");
			int ch=0;
			long ms1=System.currentTimeMillis();
			while(true) {
				ch=inFile.read();
				if(ch== -1) break;
				outFile.write(ch);
			}
			long ms2=System.currentTimeMillis();
			System.out.println("File Copied Successfully in" + (ms2-ms1)+ "ms");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
