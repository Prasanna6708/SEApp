
import java.io.FileInputStream;
import java.io.RandomAccessFile;

import javazoom.jl.player.Player;



public class FireNotification {

			   public static void main(String args[]) throws Exception {
			      RandomAccessFile in = new RandomAccessFile("H:\\PrasannaTest.txt", "r");
			      String line;
			      while(true) {
			         if((line = in.readLine()) != null) {
			            //System.out.println(line);
			            if(line.equals("Exception"))
			            {
			            	FileInputStream inStream = new FileInputStream("H:\\Exception_Codes\\ExceptionOccuredInExecution.mp3");
			            	Player player = new Player(inStream);
			            	player.play();
			            	continue;
			            } 
			            else {
			            	Thread.sleep(1000); // poll the file every 1 seconds
			         }
			      }
			   }
			   
			}
	}
