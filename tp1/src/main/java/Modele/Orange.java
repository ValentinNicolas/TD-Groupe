package Modele;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vn934281
 */
public class Orange extends FruitSimple
{
    private double prix;
    private String origine;
    private boolean seed;
    
    public Orange(double p, String o)
    {
        if (p >= 0)
            prix = p;
        else
        {
            System.out.println("prix incorrect");
            System.exit(1);
        }
        origine = o;
        
        seed = true;
    }
}
