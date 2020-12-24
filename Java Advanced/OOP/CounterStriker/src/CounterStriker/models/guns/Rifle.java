package CounterStriker.models.guns;

public class Rifle extends GunImpl {
    public Rifle(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (super.getBulletsCount() <= 0){
            return 0;
        }else if (super.getBulletsCount() <= 10){
            int bulletsCount = super.getBulletsCount();
            super.setBulletsCount(0);
            return bulletsCount;
        }
        int bullets = super.getBulletsCount() - 10;
        super.setBulletsCount(bullets);
        return 10;
    }
}
