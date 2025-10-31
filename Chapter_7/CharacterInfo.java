public class CharacterInfo{
   public static void main (String args[]){
      char myChar;
      String charCase = "";
      myChar = 'C';
      System.out.println("The character is "+myChar);
      
      if(Character.isLowerCase(myChar)==true){
         System.out.println(myChar+" is lowercase");
         charCase = "uppercase";
      }else{
         System.out.println(myChar+" is uppercase");
         charCase = "lowercase";
      }
      
      System.out.println(myChar+" is not "+charCase);
      System.out.println("After toLowerCase(), myChar is "+Character.toLowerCase(myChar));
      System.out.println("After toUpperCase(), myChar is "+Character.toUpperCase(myChar));
      
      if(Character.isLetterOrDigit(myChar)==true){
         System.out.println(myChar+" is a letter or digit");
      }else{
         System.out.println(myChar+"not a letter or digit");
      }
      
      if(Character.isWhitespace(myChar)==true){
         System.out.println(myChar+" is a whitespace");
      }else{
         System.out.println(myChar+" is not a whitespace");
      }
   }
}
