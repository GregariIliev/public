package CounterStriker.models.guns;

public class Pistol extends GunImpl{
    protected Pistol(String name, int bulletsCount) {
        super(name, bulletsCount);
    }


    @Override
    public int fire() {
        int bullets = this.bulletsCount - 1;
        if (bullets == 0){
            return 0;
        }
        return bullets;
    }
}
