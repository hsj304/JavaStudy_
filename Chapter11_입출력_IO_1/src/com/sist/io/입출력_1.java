package com.sist.io;
/*
 * 
 */

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 입출력_1 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos = null;

		try {
			long start = System.currentTimeMillis();
			fis = new FileInputStream("c:\\util\\eclipse-jee-2023-03-R-win32-x86_64.zip");
			fos = new FileOutputStream("c:\\java_datas\\eclipse.zip");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i=0;
			byte[] buffer = new byte[1024];
			while((i=fis.read(buffer,0,1024)) != -1 ) {
				bos.write(buffer, 0, i);
			}
			long end=System.currentTimeMillis();
			System.out.println("파일 복사 시간:" + (end-start));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
