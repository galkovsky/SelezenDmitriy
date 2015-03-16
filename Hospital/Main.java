
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Doctor doctor = new Doctor(45, new String[]{"Болит горло", "Болят глаза"}, 15, "Хаус");
        Doctor doctor2 = new Doctor(15, new String[]{"Болит", "Болит все", "1"}, 15, "Лобанов");
        hospital.receiveDoctor(doctor);
        hospital.receiveDoctor(doctor2);

        int menu = -1;
        while (menu != 0){
            System.out.println("Для добавления пициента нажмите 1");
            System.out.println("Для вылечить всех нажмите 2");
            System.out.println("Для выписать всех нажмите 3");
            System.out.println("Вхзод нажмите 0: ");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    Patient patient3 = addNewPatient();
                    //Patient patient3 = new Patient(60, 25, false, "Болят глаза");
                    hospital.receivePatient(patient3);
                    break;
                case 2:
                    hospital.heal();
                    break;
                case 3:
                    hospital.discharged();
                    break;
                case 0:
                    System.out.println("Больничка закрылась");
                    break;
            }
        }
    }

    public static Patient addNewPatient(){
        int health;
        int money;
        boolean insurance;
        String diagnosis;

        Scanner sc = new Scanner(System.in);
        System.out.println("Добавление нового пациента");
        System.out.println("Введите количество здоровья: ");
        health = sc.nextInt();
        System.out.println("Введите количество денег: ");
        money = sc.nextInt();
        System.out.println("Введите наличие страховки: ");
        insurance = sc.nextBoolean();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите диагноз: ");
        diagnosis = sc2.nextLine();

        return new Patient(health, money, insurance, diagnosis);
    }
}
