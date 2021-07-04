package twelveDaysOfChristmas;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
public class TwelveDaysOfChristmasType1{

    public static void main(String[] args) throws FileNotFoundException {
        
      FileInputStream myFileStream = new FileInputStream("TwelveDaysOfChristmas.txt");
      Scanner FileScanner = new Scanner(myFileStream);
      
      ArrayList<String> LyricLines = new ArrayList <String>();
      
      String ScanLine1 = FileScanner.nextLine();
      
      String[] Days1to12 = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelth"};
      
      while (FileScanner.hasNextLine()) {
          LyricLines.add(FileScanner.nextLine());
      }
      
  /*    for (int i = 1; i < LyricLines.size(); i++) {
          System.out.println(LyricLines.get(i));
      }
      */
      int j = 0;
      int num = 12; 
      for (int i = 0; i <= LyricLines.size(); i++) {
          System.out.println("On the " + Days1to12[i] + " day of Christmas my true love gave to me");
          if (i == 0)
              System.out.println("A Partridge in a Pear Tree");
          if (i > 0) {
          j += (i - 1);
          while (j >= 0) {
          System.out.println(LyricLines.get(j));
          --j;
          }
          j = 0;
          System.out.println("And a Partridge in a Pear Tree");
          }
      }

    }

}
