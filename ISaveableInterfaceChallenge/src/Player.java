import java.util.List;

/**
 2.  Player (class)
 -  It has four fields. Two Strings called name and weapon. Two ints called hitPoints and strength.
 -  A constructor that accepts a String (name) and two ints (hitPoints and strength).
    It initialises name, hitPoints and strength with the newly passed in values.
    It initialises weapon with the default weapon "Sword".
 -  And eleven methods:
 -  Getters and setters for all four fields.
 -  write(), same as interface. Return a List of the fields in the order they appear in toString().
 -  read(), same as interface. Store the values in the List, in the order they appear in toString().
    Make sure the List is not null and the size() is greater than 0 before storing the values.
 -  toString(), Players overriding toString() method. It takes no arguments and returns a String in the following format:

 Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
 **/
public class Player implements iSaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
        this.weapon = "sword";
    }
    //Getters
    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }
    //Setters
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void read(List<String> list) {
        if(list == null || list.isEmpty()){
            return;
        }

        setName(list.get(0));
        setStrength(Integer.parseInt(list.get(2)));
        setWeapon(list.get(3));
        setHitPoints(Integer.parseInt(list.get(1)));
    }

    @Override
    public List<String> write() {
        return List.of(
                getName(),
                "%s".formatted(getHitPoints()),
                "%s".formatted(getStrength()),
                "%s".formatted(getWeapon()));
    }

    @Override
    public String toString() {
        return "Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}".formatted(
                        getName(),
                        getHitPoints(),
                        getStrength(),
                        getWeapon()
        );
    }
}
