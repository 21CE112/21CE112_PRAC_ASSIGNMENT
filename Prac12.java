//This program is created Aryaan Rabara 21CE112
// GITHUB LINK: https://github.com/21CE112/21CE112_JAVA_PRAC_5.git
//Aim:-Create an Association class that encapsulates two objects of different types. Similar 
// to Exercise above, create a Transition class that does the same of Association class 
// with three objects.

class Association<T1, T2> {
  //A generic class whose object can hold values of two other types.
    T1 object1;
    T2 object2;
  
    public Association(T1 object1, T2 object2) {
      this.object1 = object1;
      this.object2 = object2;
    }
  }
  
  class Transition<T1, T2, T3> {
  //A generic class whose object can hold values of three other types which is also known as tripplets.
    T1 object1;
    T2 object2;
    T3 object3;
  
    public Transition(T1 object1, T2 object2, T3 object3) {
      this.object1 = object1;
      this.object2 = object2;
      this.object3 = object3;
    }
  }
  
  public class Prac12 {
    public static void main(String[] args) {
      //creating Objects of Association which can hold data of Integer and String type.
      //here we can also pass user defined types to it.
      Association<String, Integer> asso1 = new Association<String, Integer>("One", 1);
      Association<String, Integer> asso2 = new Association<String, Integer>("Two", 2);
      Association<String, Integer> asso3 = new Association<String, Integer>("Three", 3);
  
      //asso1.object1 refers to the first type of object stored inside asso1 that is String we have passed.
      System.out.println(asso1.object1 + " " + asso1.object2);
      System.out.println(asso2.object1 + " " + asso2.object2);
      System.out.println(asso3.object1 + " " + asso3.object2);
  
      //same logic for the tripplets
      Transition<String, String, Integer> tran1 = new Transition<String, String, Integer>("Aryaan","Rabara", 112);
      Transition<String, String, Integer> tran2 = new Transition<String, String, Integer>("Yuvraj", "Bodana", 004);
      Transition<String, String, Integer> tran3 = new Transition<String, String, Integer>("Nish", "patel", 102);
  
      
      System.out.println(tran1.object1 + " " + tran1.object2 + " " + tran1.object3);
      System.out.println(tran2.object1 + " " + tran2.object2 + " " + tran2.object3);
      System.out.println(tran3.object1 + " " + tran3.object2 + " " + tran3.object3);
      System.out.println("This Program is Created By Aryaan Rabara 21CE112");
    }
  }