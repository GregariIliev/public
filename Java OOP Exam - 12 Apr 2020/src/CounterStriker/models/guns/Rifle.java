package CounterStriker.models.guns;

public class Rifle extends GunImpl {
    protected Rifle(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (this.bulletsCount >= 10){
            return this.bulletsCount - 10;
        }
        return 0;
    }
}
