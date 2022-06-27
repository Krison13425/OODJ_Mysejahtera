/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kriso
 */
public class Employee {
    
    private String name;
    private int height, age;
    
    public Employee(String Frame, int hg, int Age)
    {
        name = Frame;
        height = hg;
        age = Age;
    }
    
    
    public void Print_Employee_Age()
    {
        System.out.println(age);
    }
}

