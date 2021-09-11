import java.applet.*;
import java.awt.*;
import java.awt.Graphics;  
public class faceapplet extends Applet
{
	public void paint(Graphics g){  


g.setColor(Color.yellow);
g.fillOval(0,0,300,300);
g.setColor(Color.RED);
g.fillOval(80,75,30,30);//happy face
g.fillOval(190,75,30,30);
g.setColor(Color.black);
g.fillArc (75,100,150,150,0,-180);

g.setColor(Color.GREEN);
g.fillOval(0,0,300,300);
g.setColor(Color.black );
g.fillOval(80,75,30,30);//sad face
g.fillOval(190,75,30,30);
g.setColor(Color.black);
g.drawArc(75,150,150,150,0,180);

		
		}  
	

}
 /* 
<applet code="faceapplet.class" width="500" height="700" border="2"> 
</applet> 
*/  