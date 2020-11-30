package CounterStriker.models.field;

import CounterStriker.common.OutputMessages;
import CounterStriker.models.players.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static CounterStriker.common.OutputMessages.COUNTER_TERRORIST_WINS;
import static CounterStriker.common.OutputMessages.TERRORIST_WINS;

public class FieldImpl implements Field {
    List<Player> terroristList;
    List<Player> counterTerroristList;

    public FieldImpl() {
        this.terroristList = new ArrayList<>();
        this.counterTerroristList = new ArrayList<>();
    }

    public List<Player> getTerroristList() {
        return terroristList;
    }

    public List<Player> getCounterTerroristList() {
        return counterTerroristList;
    }

    @Override
    public String start(Collection<Player> players) {
        boolean counterTerroristTeamIsAlive = false;
        boolean terroristTeamIsAlive = false;

        reparteePlayerToTeams(players);

        while (true) {

            terroristsAttacks();
            for (Player player : counterTerroristList) {
                if (player.isAlive()){
                    counterTerroristTeamIsAlive = true;
                    break;
                }
                counterTerroristTeamIsAlive = false;
            }

            policeAttacks();
            for (Player player : terroristList) {
                if (player.isAlive()){
                    terroristTeamIsAlive = true;
                    break;
                }
                terroristTeamIsAlive = false;
            }



            if (!counterTerroristTeamIsAlive) {
                return TERRORIST_WINS;
            } else if (!terroristTeamIsAlive) {
                return COUNTER_TERRORIST_WINS;
            }
        }
    }

    private void reparteePlayerToTeams(Collection<Player> players) {
        for (Player player : players) {
            if (player.getClass().getSimpleName().equals("Terrorist") && player.isAlive()) {
                this.terroristList.add(player);
            } else if (player.getClass().getSimpleName().equals("CounterTerrorist") && player.isAlive()) {
                this.counterTerroristList.add(player);
            }
        }
    }

    private void policeAttacks() {
        for (Player police : counterTerroristList) {
            if (police.isAlive()) {
                for (Player terrorist : terroristList) {
                    if (terrorist.isAlive()) {
                        int damageBullets = police.getGun().fire();
                        terrorist.takeDamage(damageBullets);
                    }
                }
            }
        }
    }

    private void terroristsAttacks() {
        for (Player terrorist : terroristList) {
            if (terrorist.isAlive()) {
                for (Player police : counterTerroristList) {
                    if (police.isAlive()) {
                        int damageBullets = terrorist.getGun().fire();
                        police.takeDamage(damageBullets);
                    }
                }
            }
        }
    }
}
