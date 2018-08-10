public class BatTest {
    
    public static void main(String[] args) {
        Bat zubat = new Bat();
        zubat.fly();
        zubat.fly();
        zubat.eatHumans();
        zubat.eatHumans();
        zubat.attackTown();
        zubat.attackTown();
        zubat.attackTown();
        System.out.println(zubat.displayEnergy());
    }
}