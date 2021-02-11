function solve(car) {
    function getEngine(hPower) {
        let engine =
            [
                {power: 90, volume: 1800},
                {power: 120, volume: 2400},
                {power: 200, volume: 3500}
            ];

        for (const engineElement of engine) {
            if (engineElement.power >= hPower) {
                return engineElement;
            }
        }
    }

    function getCarriage(car) {
        let carriage = [
            {type: 'hatchback', color: 'required'},
            {type: 'coupe', color: 'required'}
        ]
        for (const typeElement of carriage) {
            if (typeElement.type == car.carriage){
                typeElement['color'] = car.color;
                return typeElement;
            }

        }
    }
    function getWheel(wheel){
        let wheels = [0, 0, 0, 0];
        wheel = wheel % 2 == 0 ? wheel - 1 : wheel;
        wheels.fill(wheel, 0);
        return wheels;
    }

    let obj = {
        model: car.model,
        engine: getEngine(car.power),
        carriage: getCarriage(car),
        wheels: getWheel(car.wheelsize)
    };
    return obj;
}


console.log(solve({
        model: 'VW Golf II',
        power: 90,
        color: 'blue',
        carriage: 'hatchback',
        wheelsize: 14
    }
));

console.log(solve({ model: 'Opel Vectra',
    power: 110,
    color: 'grey',
    carriage: 'coupe',
    wheelsize: 17 }
));