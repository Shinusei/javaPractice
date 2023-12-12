package Practice22.task2;

public class ChairTest {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractChairFactory factory = new ChairFactory();
        VictorianChair victorianChair = factory.createVictorianChair();
        client.setChair(victorianChair);
        client.sit();
        MagicChair magicChair = factory.createMagicChair();
        magicChair.doMagic();
        client.setChair(magicChair);
        client.sit();
        FunctionalChair functionalChair = factory.createFunctionalChair();
        System.out.println(functionalChair.sum(2,3));
        client.setChair(functionalChair);
        client.sit();
    }
}
