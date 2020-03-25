/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class PlytyMuzyczne extends Wspolny {
    public String nosnik;
    public PlytyMuzyczne(int nId,String aut, String wyd, double wyceniana, String nos){
        super(nId,aut, wyd,  wyceniana);
        nosnik=nos;
    }
}
