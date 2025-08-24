public class Test { 
 public static void main(String[] args) { 
  CivilEngineer s1 = new CivilEngineer(); 
  System.out.println("Enter the details of Civil Engineer"); 
  s1.setData(); 
  s1.showData(); 
  s1.survey(); 
   
  MechanicalEngineer s2 = new MechanicalEngineer(); 
  System.out.println("Enter the details of Mechanical Engineer"); 
   
  s2.setData(); 
  s2.showData(); 
  s2.motorDesign(); 
 } 
}