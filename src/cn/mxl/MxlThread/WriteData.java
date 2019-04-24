package cn.mxl.MxlThread;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
	public void writeMethod(PipedOutputStream pos) {
		try {
			System.out.println("write:");
			for(int i=0;i<10;i++) {
				System.out.print(i+",");
				String data=i+",";
				pos.write(data.getBytes());
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				pos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
