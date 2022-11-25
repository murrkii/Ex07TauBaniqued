package exercise06taubaniquedmarkymiguel;
import java.util.ArrayList;

public abstract class Monster implements Interactive {
    //changed all private access modifiers to protected
    protected final String name, type, strongAgainst, weakAgainst;
    protected double maxHP, hp, atk, def, xp, lvl;  //changed numerical int values to double
    protected static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, double m, double base) {
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName(){
        return name;
    }
    public double getMaxHP(){  //changed all numerical int get methods to double
        return maxHP;
    }
    public double getHP(){
        return hp;
    }
    public double getAtk(){
        return atk;
    }
    public double getDef(){
        return def;
    }
    public static ArrayList<Monster> getMonsterList(){
        return monsterList;
    }

    public void attack(Monster m){
        double damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!\n");
        if(weak) System.out.println("It wasn't very effective...\n");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public abstract void special();

    public void restoreHealth(){
        hp = maxHP;
    }
    
    @Override
    public void interact(){
        System.out.println("Name: " + name + "\nType: " + type);
    }
}
