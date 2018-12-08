package Kaica;

import Interfaces.Describable;
import Interfaces.Lootable;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "monster", schema = "kaicadungeon")
public class MonsterEntity implements Describable, Lootable {
    private int monsterId;
    private int armor;
    private int currHealth;
    private int damage;
    private String description;
    private int maxHealth;
    private String name;
    private String type;

    @Id
    @Column(name = "monsterID")
    public int getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(int monsterId) {
        this.monsterId = monsterId;
    }

    @Basic
    @Column(name = "armor")
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Basic
    @Column(name = "currHealth")
    public int getCurrHealth() {
        return currHealth;
    }

    public void setCurrHealth(int currHealth) {
        this.currHealth = currHealth;
    }

    @Basic
    @Column(name = "damage")
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    @Basic
    @Column(name = "description")
    public String getDescription() {
        if(this.getCurrHealth() <= 0) {
            return description + " It's dead.";
        } else { return description; }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "maxHealth")
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonsterEntity that = (MonsterEntity) o;
        return monsterId == that.monsterId &&
                armor == that.armor &&
                currHealth == that.currHealth &&
                damage == that.damage &&
                maxHealth == that.maxHealth &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monsterId, armor, currHealth, damage, description, maxHealth, name, type);
    }

    @Override
    public void lootItem() {
        //Needs to be rethought, should be a one->many DB relation.
    }
}
