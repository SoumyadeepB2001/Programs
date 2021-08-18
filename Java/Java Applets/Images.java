import java.applet.*;
import java.awt.*;

public class Images extends Applet {
	Image pic1,pic2;  

 public void init() {  
  pic1 = getImage(getDocumentBase(),"image1.jpg");  
  pic2 = getImage(getDocumentBase(),"image2.jpg");  
 }  

 public void paint(Graphics gr) {  
  gr.drawImage(pic1,0,0,this);
  gr.drawImage(pic2,300,0,this);
}
}