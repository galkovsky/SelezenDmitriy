
import java.util.Arrays;

public class Doctor extends Human {
    private int skill;
    private String[] diagnosis;
    private int cost;
    private int patientCount;
    private Patient[] patients = new Patient[3];
    private String name;

    public Doctor(int skill, String[] diagnosis, int cost, String name) {
        this.skill = skill;
        this.diagnosis = diagnosis;
        this.cost = cost;
        this.name = name;
    }

    public void heal(){
        for (int i = 0; i < patientCount; i++) {
            int min = Math.min(skill, patients[i].getMoney());
            patients[i].increase(min);
            System.out.println("Пациент стал здоровее на " + min + " ХП");
            patients[i].setMoney(patients[i].getMoney() - min);
            System.out.println("У пациента осталось: " + patients[i].getMoney() + " денег");
        }
    }

    public boolean ifCanHeal(Patient patient){
        if (patientCount == patients.length) {
            System.out.println(name + ": " + "Я не могу лечить больше пациентов");
            return false;
        }
        for(int i = 0; i < diagnosis.length; i++){
            if (diagnosis[i].equalsIgnoreCase(patient.getDiagnosis())){
                System.out.println(name + ": " + "Я могу лечить этого пациента");
                return true;
            }
        }
        System.out.println(name + ": " + "Я не могу лечить этого пациента");
        return false;
    }
    public void addPatient(Patient patient){
        patients[patientCount] = patient;
        patientCount++;
        System.out.println("Пациент добавлен к доктору " + name);
    }

    public String getName() {
        return name;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

}
