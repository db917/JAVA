package ch1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Ex06 {

	public static void main(String[] args) throws IOException
	{
	char ch1='A'; char ch2='B';
	Writer out=new FileWriter("hyper.txt");
	out.write(ch1); //스트림을 통해 2Byte 전송
	out.write('\n'); //스트림을 통해 2Byte 전송
	out.write(ch2); //스트림을 통해 2Byte 전송
	out.close();
	
	char[] cbuf=new char[10];
	int readCnt;
	Reader in=new FileReader("hyper.txt");
	readCnt=in.read(cbuf, 0, cbuf.length); //최대 10개 문자를 읽어들인다.
	for(int i=0; i<readCnt; i++)
	System.out.print(cbuf[i]);
	in.close();

	
	
	}
	
	
}
