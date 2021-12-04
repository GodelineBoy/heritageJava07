

public class Hangar {

 public static void main(String[] args) {
        
    
    
    // clio reçoit une référence à une nouvelle instance de la classe vehicle
    Car clio = new Car(null, 0);
    Boat queen = new Boat(null, 0);

    //utilisation getters
    System.out.println("I'm" + " " + clio.doStuff() + " " + "and I go zoom zoom zoom!");
    System.out.println("I'm" + " " + queen.doStuff() + " " + "and I go glug glug!");

   

}
}
