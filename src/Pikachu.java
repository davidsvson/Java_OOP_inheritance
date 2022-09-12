public class Pikachu extends Pokemon {// Pikachu ärver av pokemon ( pikauchu ÄR en Pokemon)

    public Pikachu(String name) {
        super(name, "electric");
    }

    @Override
    public void attack() {
        System.out.println("Piika!! " + this.name + " Attack!!!");
    }

}
