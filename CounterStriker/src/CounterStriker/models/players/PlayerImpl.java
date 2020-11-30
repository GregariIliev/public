package CounterStriker.models.players;

import CounterStriker.common.ExceptionMessages;
import CounterStriker.models.guns.Gun;

public abstract class PlayerImpl implements Player {
    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;


    protected PlayerImpl(String username, int health, int armor, Gun gun){
        setUsername(username);
        setHealth(health);
        setArmor(armor);
        setGun(gun);
        setAlive(health);
    }

    private void setAlive(int health) {
        if (health > 0){
            this.isAlive = true;
        }else {
            this.isAlive = false;
        }
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
    public boolean isAlive() {
        return isAlive;
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
            this.isAlive = false;
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

    private void setGun(Gun gun) {
        if (gun == null){
            throw new NullPointerException(ExceptionMessages.INVALID_GUN);
        }
        this.gun = gun;
    }

    @Override
    public void takeDamage(int points) {
        if (this.armor - points > 0){
            this.armor -= points;
        }else {
            int pointsToReduce = Math.abs(this.armor - points);
            this.armor = 0;
            if (this.health - pointsToReduce > 0){
                this.health -= pointsToReduce;
            }else {
                this.health = 0;
                this.isAlive = false;
            }
        }
    }

//    @Override
//    public String toString() {
//        return String.format(": %s%n--Health: %d%n--Armor: %d%n--Gun: %s%n"
//                , this.username, this.health, this.armor, this.gun.getName());
//    }
}
