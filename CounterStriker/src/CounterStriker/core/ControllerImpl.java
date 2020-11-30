package CounterStriker.core;

import CounterStriker.common.ExceptionMessages;
import CounterStriker.common.OutputMessages;
import CounterStriker.models.field.Field;
import CounterStriker.models.field.FieldImpl;
import CounterStriker.models.guns.Gun;
import CounterStriker.models.guns.Pistol;
import CounterStriker.models.guns.Rifle;
import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;
import CounterStriker.repositories.GunRepository;
import CounterStriker.repositories.PlayerRepository;

import java.util.List;
import java.util.stream.Collectors;

import static CounterStriker.common.OutputMessages.SUCCESSFULLY_ADDED_GUN;

public class ControllerImpl implements Controller {
    private GunRepository guns;
    private PlayerRepository players;
    private FieldImpl field;

    public ControllerImpl() {
        this.guns = new GunRepository();
        this.players = new PlayerRepository();
        this.field = new FieldImpl();
    }

    @Override
    public String addGun(String type, String name, int bulletsCount) {
        if (type.equals("Pistol")) {
            this.guns.add(new Pistol(name, bulletsCount));
            return String.format(SUCCESSFULLY_ADDED_GUN, name);
        } else if (type.equals("Rifle")) {
            this.guns.add(new Rifle(name, bulletsCount));
            return String.format(SUCCESSFULLY_ADDED_GUN, name);
        }
        throw new IllegalArgumentException(ExceptionMessages.INVALID_GUN_TYPE);
    }

    @Override
    public String addPlayer(String type, String username, int health, int armor, String gunName) {
        if (this.guns.findByName(gunName) == null) {
            throw new NullPointerException(ExceptionMessages.GUN_CANNOT_BE_FOUND);
        }
        Gun gun = this.guns.findByName(gunName);
        if (type.equals("Terrorist")) {
            this.players.add(new Terrorist(username, health, armor, gun));
            return String.format(OutputMessages.SUCCESSFULLY_ADDED_PLAYER, username);
        } else if (type.equals("CounterTerrorist")) {
            this.players.add(new CounterTerrorist(username, health, armor, gun));
            return String.format(OutputMessages.SUCCESSFULLY_ADDED_PLAYER, username);
        }
        throw new IllegalArgumentException(ExceptionMessages.INVALID_PLAYER_TYPE);
    }

    @Override
    public String startGame() {
        return this.field.start(this.players.getModels());
    }

    @Override
    public String report() {
        List<Player> counterTerroristList = this.field.getCounterTerroristList();
        List<Player> terroristList = this.field.getTerroristList();

        StringBuilder stringBuilder = new StringBuilder();

        List<Player> polices = counterTerroristList
                .stream()
                .sorted((l, r) -> {
                    int result = Integer.compare(r.getHealth(), l.getHealth());
                    if (result == 0) {
                        result = l.getUsername().compareTo(r.getUsername());
                    }
                    return result;
                }).collect(Collectors.toList());

        for (Player player : polices) {
            stringBuilder.append(String.format("CounterTerrorist: %s%n--Health: %d%n--Armor: %d%n--Gun: %s%n"
                    , player.getUsername(), player.getHealth(), player.getArmor(), player.getGun().getName()));
        }

        List<Player> terrorists = terroristList
                .stream()
                .sorted((l, r) -> {
                    int result = Integer.compare(r.getHealth(), l.getHealth());
                    if (result == 0) {
                        result = l.getUsername().compareTo(r.getUsername());
                    }
                    return result;
                }).collect(Collectors.toList());

        for (Player terrorist : terrorists) {
            stringBuilder.append(String.format("Terrorist: %s%n--Health: %d%n--Armor: %d%n--Gun: %s%n"
                    ,terrorist.getUsername(), terrorist.getHealth(), terrorist.getArmor(), terrorist.getGun().getName()));
        }

        return stringBuilder.toString().trim();
    }
}
