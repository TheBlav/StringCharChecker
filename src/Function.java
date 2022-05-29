import java.util.Arrays;
import java.util.Scanner;

public class Function implements Printer{
   Scanner sc =  new Scanner(System.in);
   public void Function(){
      String text1, text2;

         print("Podaj pierwszy ciąg znaków: ");
         text1 = getString();
         char[] array1 = newCharArray(text1);

         print("Podaj drugi ciąg znaków: ");
         text2 = getString();
         char[] array2 = newCharArray(text2);

         print("Wyrazy skłądają się z następujących liter: ");
         print("Słowo 1: " + Arrays.toString(array1));
         print("Słowo 2: " + Arrays.toString(array2));
         areLettersEqual(array1, array2);




   }

   private void areLettersEqual(char[] array1, char[] array2) {
      if (array1 != null && array2 != null) {
         int compare = Arrays.compare(array1, array2);
         if (compare == 0) {
            print("wyrazy posiadają takie same litery");
         } else
            print("Wyrazy składają się z różnych liter");
      }
      if (array1 == null && array2 == null){
         print("wyrazy posiadają takie same litery");
      }
      if ((array1 == null && array2 != null) || (array1 != null && array2 == null) ){
         print("wyrazy posiadają takie same litery");
      }
   }

   private char[] newCharArray(String text1) {
      if (text1 != null) {
         char[] array1 = text1.toLowerCase().toCharArray();
         Arrays.sort(array1);
         return array1;
      }
      else
         return new char[1];
   }

   private String getString(){
      return sc.nextLine();
   }

}
