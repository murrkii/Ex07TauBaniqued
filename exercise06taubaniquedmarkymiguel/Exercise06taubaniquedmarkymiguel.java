package exercise06taubaniquedmarkymiguel;

public class Exercise06taubaniquedmarkymiguel {

    public static void main(String[] args) {
        FireType f = new FireType("Ti", 75, 25);
        System.out.println("Fire type Pokemon: " + f.getName() + " has been added to the Pokedex.");
        
        GrassType g = new GrassType("La", 75, 25);
        System.out.println("Grass type Pokemon: " + g.getName() + " has been added to the Pokedex.");
        
        WaterType w = new WaterType("Pia", 75, 25);
        System.out.println("Water type Pokemon: " + w.getName() + " has been added to the Pokedex.");
        
        Location l = new Location("Fish Market", "Fresh Tilapia");
        
        Trainer t = new Trainer("Kumachie", l);
        
        NPC n = new NPC("Lajanza", l);
    }
}
