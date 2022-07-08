package uebungen.uebungsblatt6;
public class Adresse9 implements Cloneable{
    private String strasse;
    private String hausnummer;
    private int postleitzahl;
    private String ort;

    //default Constructor
    protected Adresse9(){};
    protected Adresse9(String a_str, String a_hsn, int a_plz, String a_ort) throws AdressException
    {
        if(a_ort == null)
            throw new AdressException("Es wurde kein Ort angegeben!");
        strasse = a_str;
        hausnummer = a_hsn;
        postleitzahl = a_plz;
        ort = a_ort;
    }
    public String toString()
    {
        return strasse + " " + hausnummer +" "+ postleitzahl + " "+ ort; 
    }

    protected String getStrasse()
    {
        return strasse;
    }
    protected String getHausnummer()
    {
        return hausnummer;
    }
    protected int getPostleitzahl()
    {
        return postleitzahl;
    }
    protected String getOrt()
    {
        return ort;
    }
    public boolean equals(Object x)
    {
       if(x == null)
            return false;
       if(getClass() != x.getClass())
            return false;
       Adresse9 adr7 = (Adresse9)x;
       return this.getHausnummer().equals(adr7.getHausnummer())&&
               this.getStrasse().equals(adr7.getStrasse())&&
               this.getOrt().equals(adr7.getOrt())&&
               this.getPostleitzahl() == adr7.getPostleitzahl();
    }
    // implement and override clone() method 
    public Adresse9 clone() throws CloneNotSupportedException
    {
        // clone the primitive type of field elements 
        return (Adresse9)super.clone();
    }
}