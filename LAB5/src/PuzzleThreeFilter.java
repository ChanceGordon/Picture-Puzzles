import java.awt.Color;
//Chance Gordon COSC 121-L03
//300248015

public class PuzzleThreeFilter extends Filter {

    public PuzzleThreeFilter(String name) {
    
        super(name); }
 
    public void apply(OFImage image) {
    	
    	for (int i = 0; i < image.getHeight(); i++) {
    		for (int j = 0; j < image.getWidth(); j++) {
    			
    			Color pixel = image.getPixel(j, i); 
    			
    			int red = pixel.getRed();
    	    	int blue = pixel.getBlue();
    	    	int green = pixel.getGreen();
    	    	
    	    	if (blue == 255 && red == 0) {
    	    		blue = green;
    	    		red = green; }
    	    	if (blue == 255 && green == 0) {
    	    		blue = red;
    	    		green = red; }
    	    	if (blue == 0 && red == 255) {
    	    		blue = green;
    	    		red = green; }
    	    	if (blue == 0 && green == 255) {
    	    		blue = red;
    	    		green = red; }
    	    	if (green == 255 && red == 0) {
    	    		green = blue;
    	    		red = blue; }
    	    	if (green == 0 && red == 255) {
    	    		green = blue;
    	    		red = blue; }
    	    	
    	    	image.setPixel(j, i, new Color(red, blue, green)); }}}}
       
