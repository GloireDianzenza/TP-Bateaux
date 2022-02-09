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
public class Liaison 
{
    private int id;
    private String nom;
    private String date;
    private String heure;
    private Port portDepart;
    private Port portDestination;
    
    public Liaison(int ID, String name, String dte, String h, Port pd, Port pdt)
    {
        id = ID;
        nom = name;
        date = dte;
        heure = h;
        portDepart = pd;
        portDestination = pdt;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * @return the portDepart
     */
    public Port getPortDepart() {
        return portDepart;
    }

    /**
     * @return the portDestination
     */
    public Port getPortDestination() {
        return portDestination;
    }
}
