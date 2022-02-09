/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpbateaux;

/**
 *
 * @author HP
 */
public class Port 
{
    private int id;
    private String nom;
    
    public Port(int ID,String name)
    {
        id = ID;
        nom = name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getNom()
    {
        return nom;
    }
}
