import java.io.*;  
import java.net.*;  
public class TcpClient {  
public static void main(String[] args) 
{  
	try {   

		//Step1: Open Socket   
		Socket socket=new Socket("localhost",6666); 

		//Step2 : Open an input stream or output stream to the socket 
		DataOutputStream dout=new DataOutputStream(socket.getOutputStream());  

		//Step3 : Read from or write to teh stream 
		// Writes the message in UTF Format.
		dout.writeUTF("Hello Server");  
		dout.flush();

		//Step4 : close the stream  
		dout.close();  

		//Step5 : close the socket
		socket.close();  
	}
	catch(Exception e) {
		System.out.println(e);
	}  
}  
}  