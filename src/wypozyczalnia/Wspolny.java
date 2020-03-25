/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.util.Date;


public class Wspolny {
    protected int numerID;
    protected String autor;
    protected String wydawnictwo;
    protected double wycenianaWartosc;
    public Wspolny(){
        numerID=0;
        autor="";
        wydawnictwo="";
        wycenianaWartosc=0;
    }
    public Wspolny(int nId,String aut, String wyd, double wyceniana){
        numerID=nId;
        autor=aut;
        wydawnictwo = wyd;
        wycenianaWartosc=wyceniana;
    }
    
    public static double kara (boolean wypozyczenie, Date dataRozpoczecia){
      double  kara =0;
    if (wypozyczenie==true){
        //Obecna date trzeba wpisac recznie!
       Date dataObecna = new Date (2020,03,20);
        int ilosc=(int)roznica(dataRozpoczecia,dataObecna);
        if (ilosc>30){
            //30 - tyle dni mozna wypozyczyc - zawsze mozna zmienic, dla wszystkich powyzej, liczy kare np. 30gr za dzien:
            int dniPonad=ilosc-30;
            kara=dniPonad*0.30;
        } 
        else{
           kara = 0;
                    }
    }
    else { kara = 0; }
    return kara;
    }
     public static long roznica(Date data1, Date data2) 
    {
        long roznica = Math.abs(data1.getTime() - data2.getTime());
        return roznica / ((long) (1000 * 60 * 60 * 24));
    }
}
