/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Kriso
 */
public class VehicleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle ok =  new Bicycle();
        ok.setGearCount(27);
        System.out.println(ok.GetGearCount());
        ok.setBrand("Treak");
        ok.setModel("\n7.4FX");
        System.out.println(ok.toString());
        
        
        Skateboard board = new Skateboard();
        board.setBoardLength(31.5);
        System.out.println(board.getBoardLength());
        board.setBrand("Ally");
        board.setModel("Rocket");
        System.out.println(board.toString());
    }
    
}
