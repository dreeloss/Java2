import java.awt.*;
	import java.applet.*;

	public class bonjour extends Applet {
	 String msg;
 
	 public void init() {
	  msg="Bonjour de java !";
	 }
 
	 public void paint(Graphics g) {
	  g.drawString(msg, 20, 20);
	 }
 
	}
