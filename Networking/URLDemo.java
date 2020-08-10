import java.net.*;
public class URLDemo
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url = new URL("https://gces.edu.np:80/students/second.html#photo");
		System.out.println("Protocol: "+ url.getProtocol());
		System.out.println("Host: "+ url.getHost());
		System.out.println("FileName: "+ url.getFile());
		System.out.println("Port: " + url.getPort());
		System.out.println("References: " + url.getRef());
	}
}