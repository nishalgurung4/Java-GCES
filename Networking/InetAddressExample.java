import java.net.*;
class InetAddressExample
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress host = InetAddress.getByName(args[0]);
		System.out.println(host.getHostAddress());
	}

}