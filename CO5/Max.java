import java.awt.*;
import java.applet.*;
import java.io.*;

/*
<applet code="AppletMax3" width=500 height=500>
<param name="a" value="10">
<param name="b" value="20">
</applet>
*/

public class AppletMax3 extends Applet
{
	int a;
	int b;
	int c;
	String str;

	public void start()
	{
		String s1;

		s1 = getParameter("a");
		a = Integer.parseInt(s1);

		s1 = getParameter("b");
		b = Integer.parseInt(s1);
	}

	public void paint(Graphics g)
	{
		if (a > b)
			c = a;
		else
			c = b;


		g.drawString("a is   " + a, 10, 50);
		g.drawString("b is   " + b, 10, 100);
		g.drawString("max of two num is " + c, 10, 150);
	}
}
