package uebungen.uebungsblatt6;
public class Professor9 extends Hochschulperson9 
{
    private String fakultaet="";
    // Konstrutur
    public Professor9(String hochschule,String str, String num, int plz, Ort ort, String a_voll_name, String a_tel_No,String a_fakultaet) throws Exception
    {
        
        // inherit from Superclasse Hochschuleperson5
        super(hochschule, str, num, plz, ort, a_voll_name, a_tel_No);
        fakultaet = a_fakultaet;   
    }
    public String getFaculty()
    {
        return fakultaet;
    }
    // Override the method getAssignment() from Superclass Hochschuleperson5
    public String getAssignment() {
        if(fakultaet.isEmpty())
            return "Hinweis: Kein Fakultaet is zugeordnet";
        return "Name of Professor: " + super.get_voll_name()  + "\n"
              + "gehoert zu dem Fakultaet: " + fakultaet;
    }
    //Override isSame() from Superclass Hochschulperson6.
    public boolean isSame(Professor9 prof)
    {
        if (prof == null)
             return false;
        if (this.getClass() != prof.getClass())
             return false;
        System.out.println("HI, you call the isSame() from Class Professor6."); 
       return this.fakultaet.equals(prof.getFaculty()) && super.isSame(prof);
    }
    // implement and override clone() method 
    public Professor9 clone() throws CloneNotSupportedException
    {
        // clone the primitive type of field elements 
        return (Professor9)super.clone();
    }
}
