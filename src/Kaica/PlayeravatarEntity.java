package Kaica;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "playeravatar", schema = "kaicadungeon")
public class PlayeravatarEntity {
    private int avatarId;
    private String avatarName;
    private int currHealth;
    private int maxHealth;
    private int baseArmor;
    private int baseDamage;
    private String description;

    @Id
    @Column(name = "avatarID")
    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    @Basic
    @Column(name = "avatarName")
    public String getAvatarName() {
        return avatarName;
    }

    public void setAvatarName(String avatarName) {
        this.avatarName = avatarName;
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
    @Column(name = "maxHealth")
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    @Basic
    @Column(name = "baseArmor")
    public int getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(int baseArmor) {
        this.baseArmor = baseArmor;
    }

    @Basic
    @Column(name = "baseDamage")
    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayeravatarEntity that = (PlayeravatarEntity) o;
        return avatarId == that.avatarId &&
                currHealth == that.currHealth &&
                maxHealth == that.maxHealth &&
                baseArmor == that.baseArmor &&
                baseDamage == that.baseDamage &&
                Objects.equals(avatarName, that.avatarName) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avatarId, avatarName, currHealth, maxHealth, baseArmor, baseDamage, description);
    }
}
