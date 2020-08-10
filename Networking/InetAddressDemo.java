import java.net.*;
import java.io.*;
public class InetAddressDemo
{
	public static void main(String[] arg) throws IOException
	{
		String host = arg[0];
		try
		{
			InetAddress ipaddress = InetAddress.getByName(host);
			System.out.println("IP Address: "+ ipaddress.getHostAddress());
			System.out.println("Host Name: "+ ipaddress.getHostName());


		}
		catch (UnknownHostException e)
		{
			System.out.println("IP Address not found for the given host");
		}
	}
}