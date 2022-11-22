package exercise06taubaniquedmarkymiguel;

public class Exercise06taubaniquedmarkymiguel {

    public static void main(String[] args) {
        FireType f = new FireType("Ti", 75, 25);
        System.out.println("Fire type Pokemon: " + f.getName() + " has been added to the Pokedex.");
        
        GrassType g = new GrassType("La", 75, 25);
        System.out.println("Grass type Pokemon: " + g.getName() + " has been added to the Pokedex.");
        
        WaterType w = new WaterType("Pia", 75, 25);
        System.out.println("Water type Pokemon: " + w.getName() + " has been added to the Pokedex.");
        
        System.out.println("\n\nFirst up, " + g.getName() + " (Grass) VS. " + f.getName() + " (Fire)!\n");
        do {
            g.attack(f);
            if (f.getHP() == 0){
                System.out.println(g.getName() + " is the winner of this battle!");
                break;
            }
            
            f.attack(g);
            if (g.getHP() == 0){
                System.out.println(f.getName() + " is the winner of this battle!");
                break;
            }
        }
        while (true);
        g.hp = g.getMaxHP();
        f.hp = f.getMaxHP();
        
        System.out.println("\n\nNext, " + f.getName() + " (Fire) VS. " + w.getName() + " (Water)!\n");
        do {
            f.attack(w);
            if (w.getHP() == 0){
                System.out.println(f.getName() + " is the winner of this battle!");
                break;
            }
            
            w.attack(f);
            if (f.getHP() == 0){
                System.out.println(w.getName() + " is the winner of this battle!");
                break;
            }
        }
        while (true);
        f.hp = f.getMaxHP();
        w.hp = w.getMaxHP();
        
        System.out.println("\n\nLast but not the least, " + w.getName() + " (Water) VS. " + g.getName() + " (Grass)!\n");
        do {
            w.attack(g);
            if (g.getHP() == 0){
                System.out.println(w.getName() + " is the winner of this battle!");
                break;
            }
            
            g.attack(w);
            if (w.getHP() == 0){
                System.out.println(g.getName() + " is the winner of this battle!");
                break;
            }
        }
        while (true);
        w.hp = w.getMaxHP();
        g.hp = g.getMaxHP();
    }
    
}
