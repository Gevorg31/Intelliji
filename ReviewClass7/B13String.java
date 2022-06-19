package ReviewClass7;

public class B13String {
    // Best practice is to make all of your instance variables to do private
   private String str;
    public B13String(String str) {
        this.str = str;
    }

    // write a method that can tell me how many times as character is being repeated in a string

    public int countChars(char c) {
        int counter = 0;
        // char [] arr = {'a','d','a','s','s','s,'d','a','s','d'};
        // for (char cha:str){
        //} same as below
        for (char cha:str.toCharArray()){
            if(cha == c) {
                counter++; // increment it
            }
        }
       return counter;
    }

    public void printChars(char c) {
        int counter = 0;
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                counter++;
            }
        }
        System.out.println(c+" has appeared "+counter+" inside this string");
    }

}
