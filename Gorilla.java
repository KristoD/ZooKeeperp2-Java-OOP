public class Gorilla extends Mammal {

    public String throwRock() {
        this.energyLevel -= 5;
        return "The Gorilla throws a rock! You are stunned for 200 hours! He loses 5 energy";
    }

    public String eatBananas() {
        this.energyLevel += 10;
        return "The Gorilla eats a banana. He has restored 10 energy. You are still stunned.";
    }

    public String climb() {
        this.energyLevel -= 10;
        return "The Gorilla climbs up a hill to flank and snipe you down. He loses 10 energy.";
    }
}