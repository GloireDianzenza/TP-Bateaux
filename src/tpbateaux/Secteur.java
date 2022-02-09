/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpbateaux;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Secteur 
{
    private int id;
    private String nom;
    private ArrayList<Liaison> lesLiaisons;
    
    public Secteur(int I, String name)
    {
        id = I;
        nom = name;
        lesLiaisons = new ArrayList<>();
    }
    
    public void AjouterLiaison(Liaison l)
    {
        lesLiaisons.add(l);
    }
    
    public ArrayList<Liaison> LiaisonsPortDepart(Port PortDepart)
    {
        ArrayList<Liaison> lpd = new ArrayList<>();
        
        for(Liaison l:lesLiaisons)
        {
            if(l.getPortDepart().getNom() == PortDepart.getNom())
            {
                lpd.add(l);
            }
        }
        
        return lpd;
    }
    
    public ArrayList<Liaison> LiaisonsPortDepartDate(Port PortDepart,String dte)
    {
        ArrayList<Liaison> lpdh = new ArrayList<>();
        
        for(Liaison l:lesLiaisons)
        {
            if(l.getPortDepart().getNom() == PortDepart.getNom() && l.getDate() == dte)
            {
                lpdh.add(l);
            }
        }
        
        return lpdh;
    }
    
    public String HeureLiaison(Liaison L)
    {
        String h = "";
        
        for(Liaison l:lesLiaisons)
        {
            if(l.getNom() == L.getNom())
            {
                h = l.getHeure();
            }
        }
        
        return h;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the lesLiaisons
     */
    public ArrayList<Liaison> getLesLiaisons() {
        return lesLiaisons;
    }
}
