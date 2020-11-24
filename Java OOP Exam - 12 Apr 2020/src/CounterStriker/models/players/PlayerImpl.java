package CounterStriker.models.players;

import CounterStriker.common.ExceptionMessages;
import CounterStriker.models.guns.Gun;

public abstract class PlayerImpl implements Player{
    protected String username;
    protected int health;
    protected int armor;
    protected boolean isAlive;
    protected Gun gun;

    protected PlayerImpl(String username, int health, int armor, Gun gun){
        setUsername(username);
        setHealth(health);
        setArmor(armor);
        setGun(gun);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public Gun getGun() {
        return gun;
    }

    private void setUsername(String username) {
        if (username == null || username.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.INVALID_PLAYER_NAME);
        }
        this.username = username;
    }

    private void setHealth(int health) {
        if (health < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PLAYER_HEALTH);
        }
        this.health = health;
    }

    private void setArmor(int armor) {
        if (armor < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PLAYER_ARMOR);
        }
        this.armor = armor;
    }

    public void setGun(Gun gun) {
        if (gun == null){
            throw new NullPointerException(ExceptionMessages.INVALID_GUN);
        }
        this.gun = gun;
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0){
            return true;
        }
        return false;
    }

    @Override
    public void takeDamage(int points) {
        int armorLeft = this.armor - points;
        if (armorLeft < 0){
            int damageToTake = Math.abs(armorLeft);
            int healthLeft = this.health - damageToTake;
            if (healthLeft <= 0){
                this.isAlive = false;
            }
        }
    }
}
