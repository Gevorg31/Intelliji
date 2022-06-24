package ReviewClass8;

public class Doctor {

    String firstName, lastName;
    String speciality;
    int experience;
   private  double salary;
   public static String hospital;

   public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Doctor (String firstName, String lastName, String speciality, int experience) {
        this(firstName,lastName);
        this.speciality = speciality;
        this.experience = experience;
    }

    public void printInfo() {
        System.out.println("Doctor name is "+firstName+" "+lastName+" "+" speciality is "+speciality);
    }

    protected void work() {
        System.out.println("Doctor "+lastName+" works at "+hospital);
    }

    void treat(String patientName) {
        printInfo();
        System.out.println("Treats patient "+patientName);
    }

    private void getPaid() {
        System.out.println("Doctor "+lastName+" gets paid ");
    }

  public static void study(String university) {
        System.out.println("Doctor studied at "+university+" and now works at "+hospital); // static method  should be used only with static variables
    }


}
