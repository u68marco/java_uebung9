package uebungen.uebungsblatt6;

public class Hochschulperson9 implements Person,Cloneable{
    private String voll_name;
    private String tel_No ;
    private Adresse9 adresse7 = null;
    private String hochschule;
    
    public Hochschulperson9(String hochschule,String str, String num, int plz, Ort ort, String a_voll_name, String a_tel_No) throws Exception
    {
        if(a_voll_name == null)
            throw new NullPointerException("Es wurde kein Name angegeben!");
        voll_name = a_voll_name;
        tel_No = a_tel_No;
        if(ort == null)
            throw new AdressException("Es wurde kein Ort angegeben!");
        adresse7 = new Adresse9(str, num, plz, ort.toString());  
        this.hochschule = hochschule;
    }
    protected void setHochschule(String hochschule) {
        this.hochschule = hochschule;
    }
    public String getHochschule() {
        return hochschule;
    }

    public String get_voll_name()
    {
        return this.voll_name;
    }
    protected void setVoll_name(String voll_name) {
        this.voll_name = voll_name;
    }

    public String getTel_No() {
        return tel_No;
    }

    protected void setTel_No(String tel_No) {
        this.tel_No = tel_No;
    }
    public Adresse9 getAdresse() {
       return adresse7;
   }
    public String getAssignment() {
       
        return this.get_voll_name() + " besucht Hochschule: "+ this.getHochschule();
    }
    // Pruefung auf Gleichheit(also nicht auf Identitaet)
    public boolean isSame(Hochschulperson9 hp)
    {    
        if (hp == null)
            return false;
        if (this.getClass() != hp.getClass())
            return false;
        System.out.println("HI, you call the isSame() from Class Hochschulperson7."); 
        return this.get_voll_name().equals(hp.get_voll_name())&&
               this.getHochschule().equals(hp.getHochschule())&&
               this.getTel_No().equals(hp.getTel_No())&&
               this.getAdresse().equals(hp.getAdresse());
    }
    // override the equals() (also nicht auf Identitaet)
    public boolean equals(Object obj)
    {    
        Hochschulperson9 hp = (Hochschulperson9) obj;
        return this.get_voll_name().equals(hp.get_voll_name())&&
               this.getHochschule().equals(hp.getHochschule())&&
               this.getTel_No().equals(hp.getTel_No())&&
               this.getAdresse().equals(hp.getAdresse());
    }  


    public String getDetails()
    {  
        String l_add = "have to check if address object exists";
        // to check if a address object exists
        if(this.getAdresse()==null)
        {
            l_add = "\n";
        }else
        {
            l_add = "Addresse: "+ this.getAdresse().toString();    
        }
        
        return "Name:\n" + this.get_voll_name() +"\n"
               +"Telefonnummer"+": "+ this.getTel_No() +"\n"
               +l_add;
    }
    //implement and override clone() method 
    public Hochschulperson9 clone() throws CloneNotSupportedException
    {
         //clone both primitive and reference type of data elements 
         // both generall object.clone and a deep copy using subordinate clone() call.
        Hochschulperson9 copyHsp7 = (Hochschulperson9)super.clone();
        copyHsp7.adresse7 = adresse7.clone();
        return copyHsp7;
    }
}
