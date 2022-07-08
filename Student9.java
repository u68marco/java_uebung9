package uebungen.uebungsblatt6;

public class Student9 extends Hochschulperson9 
{
   //Datenelement
    private Studiengruppe stdgrp=null;

    // Konstrutur
    // inherit from Superclass Hochschuleperson5
    public Student9(String hochschule,String str, String num, int plz, Ort ort, String a_voll_name, String a_tel_No,Studiengruppe a_stdgrp) throws Exception
    {
       super(hochschule, str, num, plz, ort, a_voll_name, a_tel_No);
       stdgrp = a_stdgrp;
    }
    public Studiengruppe getStudygroup()
    {
        return stdgrp;
    }
     //Override isSame() from Superclass Hochschulperson6.
     public boolean isSame(Student9 std)
     {
        if (std == null)
            return false;
        if (this.getClass() != std.getClass())
            return false;
        System.out.println("HI, you call the isSame() from Class Student7."); 
        return this.stdgrp == std.getStudygroup() && super.isSame(std);
     }
     public boolean equals(Object obj)
     {
        Student9 std = (Student9)obj;
        return this.stdgrp == std.getStudygroup() && super.equals(std);
     }
    
   // Override the method getAssignment() from Superclas Hochschulperson5
    public String getAssignment() {
        if(stdgrp == null)
            return "Hinweis: der Studiengruppe ist nicht zugeordnet!!!";
        return "Der Name des Student: " + super.get_voll_name() + "\n"
              + "mit der Studiengruppe: " + stdgrp;
    }
  // implement and override clone() method 
  public Student9 clone() throws CloneNotSupportedException
  {
      // clone the primitive type of field elements 
      return (Student9)super.clone();
  }
}
