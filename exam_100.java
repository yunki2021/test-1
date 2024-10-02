package test;

import java.io.*;

public class exam_100 {

	public static void main(String[] args) 
	{
		// 파일 복사 프로그램
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream  bos = null;
		
		try 
		{
			fis = new FileInputStream("c:\\prac.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("result.txt");
			bos = new BufferedOutputStream(fos);
			
			int data;
			while((data =fis.read() )!=-1) 
			{
				bos.write(data);
			}
			bos.close(); // 사용한 스트림은 닫아주기
			bis.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
