import java.net.*;
import java.io.*;
public class URLConnectionDemo
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL(args[0]);
		URLConnection con = url.openConnection();

		BufferedReader br = new BufferedReader(new InputStreamReader (con.getInputStream()));
		String line;
		while ((line = br.readLine()) != null)
		{
			System.out.println(line);

		}
		br.close();
	}

}