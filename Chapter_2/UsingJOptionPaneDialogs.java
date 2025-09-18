import javax.swing.*;

public class UsingJOptionPaneDialogs{
public static void main(String[]args){
   int confirm;
    String IName;
do{
   do {
       String NAME = JOptionPane.showInputDialog("Please Input Your Name: ");
       IName = NAME;
       if (IName == null) {
           System.out.println("Variable is null. Terminating Program.");
           System.exit(1);
       }
   } while (IName.trim().isEmpty());

   confirm = JOptionPane.showConfirmDialog(
   null,
   "Would You Like To Display your Name?",
   "CONFIRMATION",
   JOptionPane.YES_NO_CANCEL_OPTION
   );
}while (confirm != JOptionPane.YES_OPTION);

JOptionPane.showMessageDialog(
null, 
"Your Name Is: " + IName);
}
}
