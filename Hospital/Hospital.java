
public class Hospital {
    private int patientCount;
    private int doctorCount;
    private Patient[] patients = new Patient[6];
    private Doctor[] doctors = new Doctor[2];

    public  boolean receivePatient(Patient newPatient){
        if (newPatient.getMoney() <= 0 && !newPatient.isInsurance()){
            System.out.println("Недостаточно денег!");
            return false;
        }
        if (patientCount == patients.length){
            System.out.println("Больница переполнена!");
            return false;
        }
        if (newPatient.getHealth() >= 100 ) {
            System.out.println("Пациент здоров!");
            return false;
        }
        int foundDoctorIndex = -1;
        for(int i = 0; i < doctorCount; i++){
            if (doctors[i].ifCanHeal(newPatient)){
                foundDoctorIndex = i;
            }
        }
        if (foundDoctorIndex == -1){
            return false;
        }
        doctors[foundDoctorIndex].addPatient(newPatient);
        System.out.println("Пациент лег в больницу");
        patients[patientCount++] = newPatient;
        return true;
    }
    public boolean receiveDoctor(Doctor doctor){
        if(doctorCount == doctors.length){
            System.out.println("Больница не вмещает больше докторов");
            return false;
        }
        doctors[doctorCount] = doctor;
        doctorCount++;
        System.out.println("Доктор " + doctor.getName() + " пришел в больницу");
        return true;
    }
    public void heal(){
        for (int i = 0; i <doctorCount ; i++) {
            doctors[i].heal();
        }
    }

    /**
     * Выписка
     */
    public void discharged(){
        Patient[] tmp = new Patient[6];
        for (int i = 0; i <patients.length; i++) {
            patients[i] = tmp[i];
        }
        patientCount = 0;

        for (int i = 0; i <doctorCount ; i++) {
            Patient[] docTmp = new Patient[doctors[i].getPatients().length];

            for (int j = 0; j < doctors[i].getPatients().length; j++) {
                doctors[i].getPatients()[j] = docTmp[j];
            }
            doctors[i].setPatientCount(0);
        }
        System.out.println("Все пациенты выписаны!");
    }

}
