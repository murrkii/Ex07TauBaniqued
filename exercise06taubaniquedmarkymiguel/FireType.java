package exercise06taubaniquedmarkymiguel;

public class FireType extends Monster {
    
    public FireType (String n, double m, double base) {
        super(n, "fire", "grass", "water", m, base);
        atk = base*1.3;
        def = base*0.7;
    }
    
    @Override
    public void special(){
        atk += 2;
        hp -= maxHP*0.1;
    }
}
