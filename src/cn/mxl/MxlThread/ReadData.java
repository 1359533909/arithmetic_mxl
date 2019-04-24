package cn.mxl.MxlThread;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
	public void readData(PipedInputStream pis) {
		try {
			System.out.println("read:");
			byte[] b=new byte[1024];
			if(pis.read(b)!=-1) {
				String data=new String(b);
				System.out.print(data);
			}
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
