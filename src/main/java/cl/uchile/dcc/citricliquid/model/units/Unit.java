package cl.uchile.dcc.citricliquid.model.units;

import java.util.Objects;

public class Unit {
    private final String name;
    private final int maxHp;
    private final int atk;
    private final int def;
    private final int evd;
    private int stars;
    private int currentHp;


    public Unit(String Name, int hp, int atk, int def, int evd) {
        name = Name;
        this.maxHp = hp;
        this.atk = atk;
        this.def = def;
        this.evd = evd;
        this.stars = 0;
        this.currentHp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return maxHp == unit.maxHp && atk == unit.atk && def == unit.def && evd == unit.evd && stars == unit.stars && currentHp == unit.currentHp && name.equals(unit.name);
    }

    public int getMaxHp() {return maxHp;}

    public int getCurrentHp() {return currentHp;}

    public void setCurrentHp(final int newHp) {
        this.currentHp = Math.max(Math.min(newHp, maxHp), 0);
    }

    public int getAtk() {return atk;}

    public int getDef() {return def;}

    public int getEvd() {return evd;}

    public int getStars() {return stars;}

    public void increaseStarsBy(final int amount) {
        stars += amount;
    }

    public void reduceStarsBy(final int amount) {
        stars = Math.max(0, stars - amount);
    }


}
