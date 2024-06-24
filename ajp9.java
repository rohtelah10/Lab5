
abstract class Vaccine{
    int age;
    String nationality = new String();
    boolean firstDoseTaken ;

    public Vaccine(int age, String nationality){
        this.age = age;
        this.nationality = nationality;
        this.firstDoseTaken = false;
    }
    void firstDose(){
        if ("Indian".equalsIgnoreCase(nationality) && age >= 18) {
            System.out.println("First dose taken. Please pay 250rs.");
            firstDoseTaken = true;
        } else {
            System.out.println("User is not eligible for the first dose.");
        }
    }
    void secondDose(){
        if (firstDoseTaken) {
            System.out.println("Second dose taken.");
        } else {
            System.out.println("User is not eligible for the second dose. First dose must be taken first.");
        }
    }

    public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        if (firstDoseTaken) {
            System.out.println("Booster dose taken.");
        } else {
            System.out.println("User is not eligible for the booster dose. First dose must be taken first.");
        }
    }
}

public class ajp9 {
    public static void main(String[] args) {
    
        VaccinationSuccessful user1 = new VaccinationSuccessful(20, "Indian");
        

        System.out.println("Attempting first dose:");
        user1.firstDose(); 
        
    
        System.out.println("\nAttempting second dose:");
        user1.secondDose(); 
        
        System.out.println("\nAttempting booster dose:");
        user1.boosterDose(); 


        VaccinationSuccessful user2 = new VaccinationSuccessful(16, "Indian");
        
   
        System.out.println("\nAttempting first dose for ineligible user:");
        user2.firstDose(); 
        
    
        System.out.println("\nAttempting second dose for ineligible user:");
        user2.secondDose();
        
 
        System.out.println("\nAttempting booster dose for ineligible user:");
        user2.boosterDose(); 
    }
}