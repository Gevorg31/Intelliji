package Repls;
import java.util.Scanner;
public class ScannerSwitchStatement40 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of the instructor");
            String name = scanner.next();
            String out;
            switch (name) {
                case "Asghar":
                    out="Will take care of Java Assignment";
                    break;
                case "Moazzam":
                    out="Will take care of SDLC Assignment";
                    break;
                case "Weqas":
                    out="Will take care of Selenium Assignment";
                    break;
                case "Asel":
                    out="Will take care of every Assignment";
                    break;
                default:
                    out="Invalid instructor selected";
            }
            System.out.println(out);
        }
}
