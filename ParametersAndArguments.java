public class ParametersAndArguments {  
    // Method to calculate the area of a rectangle  
    public static int calculateArea(int width, int height) {  
        return width * height;  
    }  

    // Main method where execution starts  
    public static void main(String[] args) {  
        int roomWidth = 10;  
        int roomHeight = 15;  
        
        int area = calculateArea(roomWidth, roomHeight); // Calling the method  
        
        System.out.println("The calculated area is: " + area);  
    }  
}
