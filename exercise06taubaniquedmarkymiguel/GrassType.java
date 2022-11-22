package exercise06taubaniquedmarkymiguel;

public class GrassType extends Monster {
   
    public GrassType (String n, double m, double base) {
        super(n, "grass", "water", "fire", m, base);
    }

    @Override
    public void special(){
        hp += maxHP*0.2;
    }
    
    public void rest(){
        hp += maxHP*0.5;
    }
}
