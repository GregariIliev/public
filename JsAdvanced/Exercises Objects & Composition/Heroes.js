function solve() {


    return {
        mage: (heroName) => {
            let hero = {};
            hero['name'] = heroName;
            hero['health'] = 100;
            hero['mana'] = 100;
            hero['cast'] = function (skill) {
                hero.mana--;
                console.log(`${heroName} cast ${skill}`);
            }
            return hero;
        },
        fighter: (heroName) => {
            let hero = {};
            hero['name'] = heroName;
            hero['health'] = 100;
            hero['stamina'] = 100;
            hero['fight'] = function (skill) {
                hero.stamina--;
                console.log(`${heroName} slashes at the foe!`);
            }
            return hero;
        }
    }
}


let create = solve();
const scorcher = create.mage("Scorcher");
scorcher.cast("fireball")
scorcher.cast("thunder")
scorcher.cast("light")

const scorcher2 = create.fighter("Scorcher 2");
scorcher2.fight()

console.log(scorcher2.stamina);
console.log(scorcher.mana);
