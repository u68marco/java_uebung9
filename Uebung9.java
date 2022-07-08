package uebungen.uebungsblatt6;

import java.util.ArrayList;
import java.util.Arrays;

public class Uebung9 
{
   static Person[] person;
   final static int index = 6;
   public static void add_person(Person pers) throws ArrayIndexOutOfBoundsException
   {
       for(int i=0; i < person.length; i++)
            {
                if(person[i] == null)
                {
                    person[i] = pers;
                    return;
                }
                
            }
    throw new ArrayIndexOutOfBoundsException("Zuordnung aufground der ArrayKapazität nicht moeglich\n");  
   }
 public static void main(String[] args) throws Exception
 {
  try {
    person = new Person[index];
    Hochschulperson9 hsp1  =  new Hochschulperson9("Uni Wuppertal","Sonnen Str.", "29", 81737, Ort.Wuppertal,"XinLang Jiao", "38749876");
    Hochschulperson9 hsp2  =  new Hochschulperson9("HM","Sonnen Str.", "29", 81737, Ort.München,"XinLangLang Jiao", "92749876");
    Student9         std1  =  new Student9("Uni Wuppertal","Sonnen Str.", "29", 81737, Ort.Wuppertal, "Marco Chen", "38749876", Studiengruppe.IB2A); 
    Student9         std2  =  new Student9("HS Muenchen","Sonnen Str.", "29", 81737, Ort.München, "Marco Junior Chen", "387499976", Studiengruppe.IB2B);
   
    add_person(hsp1);
    add_person(hsp2);
    add_person(std1);
    add_person(std2);
    add_person(null);
    add_person(null);
    
    // Wertzuweisung über Tiefe kopie an das Array personcopy
    //Aufgabe a
    // Tiefer Kopie von Array 
    //getAssignment() Aufruf 
    Person[] personcopy = new Person[index];
    
    System.out.println("Eine Tiefe Kopie vom Array personcopy:\n ");
    for(int i = 0; i<person.length; i++){
       if(person[i] != null)
         personcopy[i] = ((Hochschulperson9)person[i]).clone();
     //  System.out.println("i am " + i);
    // foreach schleife aufrufen , um getAssignment() auszuführen.
    }
    for(Person p: personcopy)
    {
        if(p != null)
            System.out.println("Person: " + p.getAssignment());
    }
    System.out.println("#################################");
    // b)
    //vergleichen die beide Arrays über Arrays.equals()
    // the method equals() wurde in der klasse Hochschulperson9 und Student9 redifinierte,
    // damit die Vergleichen führt zum Ergebniss true.
    
    System.out.println("ist Array person äquivalent zur personcopy? " + Arrays.equals(person, personcopy));
    System.out.println("#################################");
    // c) übertragen personcopy zur Arraylist<Person> 
    ArrayList<Person> perslist = new ArrayList<Person>();
    for(Person p : personcopy)
    {
        perslist.add(p);    
        if (p instanceof Hochschulperson9)
            System.out.println("call the Method getDetails(): \n" + ((Hochschulperson9)p).getDetails());  
        if (p instanceof Student9)
            System.out.println("call the Method getStudygroup()  \n: " + ((Student9)p).getStudygroup()); 
    }
    System.out.println("#################################");
     //d)
     // übertragen den ArrayList zur eine neue Person Array
   
    Person[] personcopy_2 = new Person[perslist.size()];
    personcopy_2 = perslist.toArray(personcopy_2);
    for(Person p: personcopy_2)
    {
        if(p != null)
          System.out.println("Person aus Array personcopy_2: " + p.getAssignment());
    }
       
    }catch(AdressException ex) {
        //TODO: handle exception
        System.out.println("Adressfehler: " + ex.getMessage());
    }
    catch(NullPointerException ex) {
        //TODO: handle exception
        System.out.println("NullPointerException: " + ex.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException ex) {
        //TODO: handle exception
        System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
    }catch(Exception ex)
    {
        System.out.println("Exception: " + ex.getMessage());   
    }
    finally{
        System.out.println("Last Exit");
    }
 }
}
