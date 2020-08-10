import java.net.*;
public class URLExample
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url = new URL("https://gces.edu.np:8080/course/java.html#intro");
		System.out.println("Protocol = " + url.getProtocol());
		System.out.println("Host Name = " + url.getHost());
		System.out.println("Port Number = " + url.getPort());
		System.out.println("File Name = " + url.getFile());
		System.out.println("Reference = " + url.getRef());
	}
}