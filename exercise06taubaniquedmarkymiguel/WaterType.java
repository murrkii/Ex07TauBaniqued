package exercise06taubaniquedmarkymiguel;

public class WaterType extends Monster {

    public WaterType (String n, double m, double base) {
        super(n, "water", "fire", "grass", m, base);
        atk = base*0.7;
        def = base*1.3;    
    }
    
    @Override
    public void special(){
        def += 2;
        hp -= maxHP*0.1;
    }
}
