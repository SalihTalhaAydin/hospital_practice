import java.util.ArrayList;
import java.util.List;

public class Hospital {

    public static void main(String[] args) {
        // get the patient and according to their problems assign it to doctor's and when the next patient
        // emergency
        System.out.println(QuestionsAndMessages.welcomeMessage);

        List<Doctor> todayDoctors = Doctor.createDoctors(3);

        List<Patient> patients = new ArrayList<>();

        // get all of them
        for (int i = 0; i < 5; i++) {
            Patient currentPatient = Patient.createPatience();
            if (currentPatient.problem.equals("emergency")) patients.add(0, currentPatient);
            else patients.add(currentPatient);
        }


        for (Patient patient : patients) {
                patient.assignedDoctor = Doctor.getAvailableDoctor(todayDoctors,patient.problem);
        }


        for (Patient patient : patients) {
            System.out.println(patient);

            System.out.println(patient.assignedDoctor);
            System.out.println();
        }
    }
}
