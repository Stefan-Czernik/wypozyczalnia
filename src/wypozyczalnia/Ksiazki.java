/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Ksiazki extends Wspolny {
    public int iloscStron;
    public Ksiazki(int nId,String aut, String wyd, double wyceniana, int strony){
        super(nId,aut, wyd,  wyceniana);
        iloscStron=strony;
    }
    
    
}
