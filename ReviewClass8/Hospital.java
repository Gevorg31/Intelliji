package ReviewClass8;

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Jane", "Smith");
        System.out.println(doctor.firstName);
        System.out.println(doctor.lastName);
        Doctor.hospital = "UCSF";

        doctor.printInfo();
        doctor.work();
        // creating another doctor
        Doctor doctor1 = new Doctor("Gevorg", "Agadzhanyan", "cardiologist",10);
        doctor1.printInfo();
        doctor1.work();
        // changing value of static variable
        Doctor.hospital = "George Washington";
        doctor.work();
        doctor1.printInfo();

        doctor.lastName = "Obama";
        doctor.printInfo();
        doctor1.printInfo();
        Doctor.hospital = "Mayo Clinic";

        doctor.work();
        doctor1.work();

        }
    }

