import java.awt.Color;
//Chance Gordon COSC 121-L03
//300248015

public class GrayScaleFilter extends Filter {

    public GrayScaleFilter(String name) {
    
        super(name); }

    public void apply(OFImage image) {
   
    	for (int i = 0; i < image.getHeight(); i++) {
    		for (int j = 0; j < image.getWidth(); j++) {
    			
    			Color pixel = image.getPixel(j, i); 
    			
    			int red = pixel.getRed();
    	    	int blue = pixel.getBlue();
    	    	int green = pixel.getGreen();
    	    	
    	    	double grey = red*0.21 + green*0.72 + blue*0.07;
    	    	int g = (int)(grey);
    	    	
    	    	image.setPixel(j, i, new Color(g, g, g)); }}}}
    	    	
 
