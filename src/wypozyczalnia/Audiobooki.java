/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Audiobooki extends Wspolny {
    public String format;
    public Audiobooki(int nId,String aut, String wyd, double wyceniana, String form){
        super(nId,aut, wyd,  wyceniana);
        format=form;
    }
}
