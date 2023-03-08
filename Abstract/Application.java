package homeWork.Abstract;

public class Application {

    static Student donatello = new Student();
    static Employee splinter = new Employee();
    static Person michealangello = new Student();
    static Person april = new Employee();

    public static void main(String[] args) {

        double stuPhoneBill = donatello.calculateTelePhoneBill(120.5);
        System.out.println(stuPhoneBill);
        double empPhoneBill = splinter.calculateTelePhoneBill(120.5);
        System.out.println(empPhoneBill);

        double micPhoneBill = michealangello.calculateTelePhoneBill(stuPhoneBill);
        double aprilPhoneBill = april.calculateTelePhoneBill(empPhoneBill);
        System.out.println(micPhoneBill);
        System.out.println(aprilPhoneBill);

        donatello.setFullName("Donatello");
        System.out.println(donatello.getFullName());
        
        School theSewerAcademy = new School();
        // theSewerAcademy.getStudents().add(michealangello); got to put object in the <> in the arraylist in school to make this work
        theSewerAcademy.getStudents().add(donatello);
        theSewerAcademy.getEmployees().add(splinter);

    }




    
}
