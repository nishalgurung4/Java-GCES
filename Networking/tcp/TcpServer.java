import java.io.*;  
import java.net.*;  
public class TcpServer {  
public static void main(String[] args){  
	try
	{  
		// Step 1: Create a ServerSocket
		//  First, server should instatiate ServerSocket object.
		ServerSocket serverSocket = new ServerSocket(6666); 


		// Step 2 : Call accept() to get a socket connection
		// Then, Server object envokes accept() method of ServerSocket class.
        // This waits for client until client creates Socket object. 
		Socket socket=serverSocket.accept();//establishes connection  

		// Step 3 : Open input stream or output stream to that socket
		 // This gets the message sent by the client. 
		DataInputStream dis=new DataInputStream(socket.getInputStream());  

		// Step 4 : Read/Write from/to the stream
		// Typehinting the UTF message into string.
		String  str=(String)dis.readUTF();  
		System.out.println("message= "+str);  

		//close the socket
		serverSocket.close();  
	}
	catch(Exception e)
	{
		System.out.println(e);}  
	}  
}  