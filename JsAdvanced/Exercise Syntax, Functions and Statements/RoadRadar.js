function solve(speed, area){
    let speedLinitInCity = 50;
    let speedLimitInResidencial = 20;
    let speedLimitInInterstate = 90;
    let speedLimitInMotorway = 130;

    let speedingStatus = 'speeding';
    let excessiveSpeedingStatus = 'excessive speeding';
    let recklessDrivingStatus = 'reckless driving';

    if(area == 'city'){
        if(speed <= speedLinitInCity && speed >= 0){
            console.log(`Driving ${speed} km/h in a ${speedLinitInCity} zone`);
        }else {
            let difference = speed  - speedLinitInCity;
            console.log(diff(difference, speedLinitInCity));
        }

    }else if(area == 'residential'){
        if(speed >= 0 && speed <= speedLimitInResidencial){
            console.log(`Driving ${speed} km/h in a ${speedLimitInResidencial} zone`)
        }else {
            let difference = speed  - speedLimitInResidencial;
            console.log(diff(difference, speedLimitInResidencial));
        }

    }else if(area == 'interstate'){
        if(speed >= 0 && speed <= speedLimitInInterstate){
            console.log(`Driving ${speed} km/h in a ${speedLimitInInterstate} zone`)
        }else {
            let difference = speed  - speedLimitInInterstate;
            console.log(diff(difference, speedLimitInInterstate));
        }

    }else if(area == 'motorway'){
        if(speed >= 0 && speed <= speedLimitInMotorway){
            console.log(`Driving ${speed} km/h in a ${speedLimitInMotorway} zone`)
        }else {
            let difference = speed  - speedLimitInMotorway;
            console.log(diff(difference, speedLimitInMotorway));
        }
    }

    function diff(difference, speedLimitArea){
        if(difference <= 20){
            return `The speed is ${difference} km/h faster than the allowed speed of ${speedLimitArea} - ${speedingStatus}`;
        }else if (difference <= 40){
            return`The speed is ${difference} km/h faster than the allowed speed of ${speedLimitArea} - ${excessiveSpeedingStatus}`;
        }else if (difference > 40){
            return`The speed is ${difference} km/h faster than the allowed speed of ${speedLimitArea} - ${recklessDrivingStatus}`;
        }
    }
}

solve(40, 'city');
solve(21, 'residential');
solve(120, 'interstate');
solve(200, 'motorway');
