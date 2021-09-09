import java.awt.*;
import java.applet.*;
import java.io.*;

/*
<applet code="AppletMax3" width=500 height=500>
<param name="a" value="10">
<param name="b" value="20">
<param name="c" value="30">
</applet>
*/

public class AppletMax3 extends Applet
{
	int a;
	int b;
	int c;
        int d;
	String str;

	public void start()
	{
		String s1;

		s1 = getParameter("a");
		a = Integer.parseInt(s1);

		s1 = getParameter("b");
		b = Integer.parseInt(s1);
                
                s1 = getParameter("c");
		c = Integer.parseInt(s1);
	}

	public void paint(Graphics g)
	{
		if( a >= b && a >= c)
			d = a;
		else if (b >= a && b >= c)
                        d=b;
                else
                       d=c;

                g.setColor(Color.blue);
                Font myFont = new Font("Courier", Font.BOLD,20); 
                g.setFont(myFont);
		g.drawString("First Num is   " + a, 100, 100);
		g.drawString("Second Num is   " + b, 100, 200);
                g.drawString("Third Num is   " + c, 100, 300);
		g.drawString("Max of Three Numbers is  " + d, 100, 400);
	}
}
