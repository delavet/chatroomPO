package chatRoomPO;

import java.net.*;   
import java.io.*;   
import com.alibaba.fastjson.JSON;
public class Server   
{   
private ServerSocket ss;   
private Socket socket;   
private BufferedReader in;   
private PrintWriter out;   
  
public Server()   
{   
	try{   
	ss = new ServerSocket(1000);   
  
	while (true){   
		socket = ss.accept();  
		System.out.println("aaaaaa"); 
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));   
		out = new PrintWriter(socket.getOutputStream(),true);   
  
		String line = in.readLine();   
		System.out.println(line);
		out.println("you input is :" + line);   
		out.close();   
		in.close();   
		socket.close();   
	}   
}   
catch (IOException e)   
	{System.out.println("bbb"); }   
}   
  
	public static void main(String[] args){   
		new Server();   
	}   
}   