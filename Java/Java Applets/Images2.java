import java.awt.*;  
import java.applet.*;  
public class Images2 extends Applet  
{  
    Image pic;  
    public void init()  
    {  
        pic = getImage(getDocumentBase(), "Image3.jpg");  
    }  
    public void paint(Graphics g)  
    {  
        for (int i = 50; i < 600; i++)  
        {  
            g.drawImage(pic, i, 30, this);  
            try  
            {  
                Thread.sleep(200);  
            } 
	catch (Exception e)
	{
		System.out.println("Exception");
	}  
        } 
    }  
}  

