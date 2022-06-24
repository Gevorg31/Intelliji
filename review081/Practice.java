package review081;

import ReviewClass8.Doctor;

public class Practice  extends Doctor {
    public Practice(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public static void main(String[] args) {

        Doctor doctor = new Doctor("John", "Smith");
            doctor.printInfo();
    }
}
