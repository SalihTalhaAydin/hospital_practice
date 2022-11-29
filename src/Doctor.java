import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doctor {

    public Doctor(String speciality, String firstName, String lastName) {
        this.speciality = speciality;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static final List<String> specialities = new ArrayList<>(Arrays.asList("General", "Heart", "Ear, Throat and Nose"));

    public static final List<String> firstNames = new ArrayList<>(Arrays.asList(
            "Jonathan", "Akin", "Salih", "Suayip", "Abraham"));

    public static final List<String> lastNames = new ArrayList<>(Arrays.asList(
            "Ochoa", "Kaya", "Aydin", "Tekin", "Kim"));

    public String speciality;
    public String firstName;
    public String lastName;
    public boolean isAvailable = true;

    public static List<Doctor> createDoctors(int amount){
        List<Doctor> doctors = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            for (String speciality : specialities) {

                int randomFirstNameIndex = RandomNumberGenerator.getRandomNumber(0, firstNames.size() - 1);//0, size - 1
                int randomLastNameIndex = RandomNumberGenerator.getRandomNumber(0, lastNames.size() - 1);//0, size - 1
                doctors.add(new Doctor(speciality, firstNames.get(randomFirstNameIndex), lastNames.get(randomLastNameIndex)));

            }
        }

        return doctors;
    }

    public static Doctor getAvailableDoctor(List<Doctor> doctors, String speciality){

        for (Doctor currentDoctor : doctors) {
            if (currentDoctor.speciality.toLowerCase().contains(speciality) && currentDoctor.isAvailable) {
                currentDoctor.isAvailable = false;
                return currentDoctor;
            }
        }


        return null;
    }



    @Override
    public String toString() {
        return "Doctor{" +
                "speciality='" + speciality + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public static void main(String[] args) {
        List<Doctor> doctors = createDoctors(2);
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        System.out.println("\n\n");
        System.out.println(getAvailableDoctor(doctors,"general"));
        System.out.println(getAvailableDoctor(doctors,"general"));
        System.out.println(getAvailableDoctor(doctors,"general"));

    }
}
