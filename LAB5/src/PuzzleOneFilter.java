import java.awt.Color;
//Chance Gordon COSC 121-L03
//300248015

public class PuzzleOneFilter extends Filter {
 
    public PuzzleOneFilter(String name) {
    
        super(name); }

    public void apply(OFImage image) {
    	
    	for (int i = 0; i < image.getHeight(); i++) {
    		for (int j = 0; j < image.getWidth(); j++) {
    			
    			Color pixel = image.getPixel(j, i); 
    			
    			int red = pixel.getRed();
    	    	int blue = pixel.getBlue();
    	    	int green = pixel.getGreen();
    	    	
    	    	System.out.println("Red: " + red);
    	    	System.out.println("Blue: " + blue);
    	    	System.out.println("Green: " + green);
    	    	
    	    	red *= 1.75;
    	    	blue = 0;
    	    	green = 0;
    	    	
    	    	image.setPixel(j, i, new Color(red, blue, green)); }}}}
    	
