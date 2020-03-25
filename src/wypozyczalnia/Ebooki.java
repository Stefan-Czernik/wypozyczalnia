/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Ebooki extends Wspolny {
    public String rozszerzenie;
    public Ebooki(int nId,String aut, String wyd, double wyceniana, String rozszerz){
        super(nId,aut, wyd,  wyceniana);
        rozszerzenie=rozszerz;
}}
