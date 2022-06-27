
package programmethods;


public class Programmethods {


    public static void main(String[] args) 
    {
        System.out.println("Hello,This is structure method.");     
        Display();
        
        StaticClass.staticdisplay();
        
        NormalClass nc =  new NormalClass();
        nc.NormalMathid();
    }
    static void Display()
    {
        System.out.println("This is Static method.");
    }
    
}
