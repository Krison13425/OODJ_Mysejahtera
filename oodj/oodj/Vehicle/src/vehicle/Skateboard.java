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
public class Skateboard extends vehicle{
    private double myBoardLenght;
    public Skateboard()
    {
        myBoardLenght = 0;
    }
    public Skateboard(double boardLength)
    {
        setBoardLength(boardLength);
    }
    public double getBoardLength()
    {
        return myBoardLenght;
    }
    
    public void setBoardLength(double boardLength)
    {
        myBoardLenght =  boardLength;
    }
}
