/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Filmy extends Wspolny {
    public int minutyTrwania;
    public Filmy(int nId,String aut, String wyd, double wyceniana, int minuty){
        super(nId,aut, wyd,  wyceniana);
        minutyTrwania=minuty;
    }
}
