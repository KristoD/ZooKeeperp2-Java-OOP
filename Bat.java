public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }
    
    public void fly() {
        System.out.println("SCREEEEEEEEEEEEEEEEECHH");
        this.energyLevel -= 50;
        System.out.println(this.energyLevel);
    }

    public void eatHumans() {
        System.out.println("SLUURPPPP. SCREEEEEEEEEEEEEECH");
        this.energyLevel += 25;
        System.out.println(this.energyLevel);
    }

    public void attackTown() {
        System.out.println("WHAT THE-");
        System.out.println("IS THAT A GIANT BAT IN THE AIR??? AHHHHHHH!");
        System.out.println("* the bat somehow shoots fire out of its mouth and destroys the town in one blow *");
        System.out.println("SCREEEE-");
        System.out.println("* the bat had a stroke *");
        this.energyLevel -= 100;
        System.out.println(this.energyLevel);
    }
}