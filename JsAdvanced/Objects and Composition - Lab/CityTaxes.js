function cityTaxes(town, people, rich){
    let obj = {};

    obj.name = town;
    obj.population  = people;
    obj.treasury  = rich;
    obj.taxRate = 10;
    obj.collectTaxes = function(){
        obj.treasury += Math.floor(this.population * this.taxRate);
    }
    obj.applyGrowth = function applyGrowth(percentage){
        obj.population += Math.floor(this.population * (percentage / 100));
    }
    obj.applyRecession = function(percentage){
        obj.treasury  -= Math.floor(this.treasury * (percentage / 100));
        console.log();
    }
    return obj;
}

const city =
    cityTaxes('Tortuga',
        7000,
        15000);
city.collectTaxes();
console.log(city.treasury);
city.applyGrowth(5);
console.log(city.population);
city.applyRecession(5);
console.log(city.treasury);
