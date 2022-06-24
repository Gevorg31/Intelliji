package ReviewClass8;

public class AnotherHospital {
    public static void main(String[] args) {
    Doctor doc = new Doctor("Sherlock", "Holmes", "Magic",10);
    // access method to test visibility

        doc.printInfo(); // public
        doc.treat("Samanta"); // default
        doc.work(); // protected

        Doctor.study("GW"); // public
    }
}
