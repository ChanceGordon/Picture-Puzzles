import java.awt.Color;
//Chance Gordon COSC 121-L03
//300248015

public class PuzzleTwoFilter extends Filter {

	public PuzzleTwoFilter(String name) {
    
        super(name); }

    public void apply(OFImage image) {
    
    	for (int i = 0; i < image.getHeight(); i++) {
    		for (int j = 0; j < image.getWidth(); j++) {
    			
    			Color pixel = image.getPixel(j, i); 
    			
    			int red = pixel.getRed();
    	    	int blue = pixel.getBlue();
    	    	int green = pixel.getGreen();
    	    	
    	    	red = 30;
    	    	blue *= 1.75;
    	    	green = 30;
    	    	
    	    	image.setPixel(j, i, new Color(red, blue, green)); }}}}
