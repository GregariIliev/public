function solve() {
    document.querySelector('#btnSend').addEventListener('click', onClick);

    function onClick() {
        let inputText = document.querySelector('textarea').value;
        let text = JSON.parse(inputText);

        let restaurants = {};

        for (let i = 0; i < text.length; i++) {
            let map = {};
            let tokens = text[i].split(' - ');
            let restName = tokens[0];
            let workToSplit = tokens[1].split(', ');
            let workers = []
            let allSalary = [];
            let totalSalary = 0;
            for (let j = 0; j < workToSplit.length; j++) {
                let [work, salary] = workToSplit[j].split(' ');
                workers.push({name: work, salary})
                allSalary.push(Number(salary));
                totalSalary += Number(salary);
            }
            let averageSalary = totalSalary / workers.length;

            if (!restaurants[restName]) {
                map[restName] = restName;
                map['workers'] = {workers};
                map['totalSalary'] = totalSalary;
                map['bestSalary'] = Math.max(...allSalary);
                map['averageSalary'] = averageSalary;
                restaurants[restName] = map;
            } else {
                workers.forEach(e => restaurants[restName].workers.workers.push(e))
                restaurants[restName].totalSalary += totalSalary;
                restaurants[restName].bestSalary = restaurants[restName].bestSalary < Math.max(...allSalary)
                    ? Math.max(...allSalary)
                    : restaurants[restName].bestSalary;
                restaurants[restName].averageSalary = restaurants[restName].totalSalary / restaurants[restName].workers.workers.length;
            }

        }
        let bestAverageSalary = 0;
        let bestRestaurant = '';
        let workersOutput = '';
        let allRestaurants = Object.values(restaurants);
        for (const restaurant of allRestaurants) {
            if (restaurant.averageSalary > bestAverageSalary) {
                bestAverageSalary = restaurant.averageSalary;
                let keys = Object.keys(restaurant)
                bestRestaurant = keys[0];
            }
        }

        restaurants[bestRestaurant].workers.workers.sort((w1,w2) => w2.salary - w1.salary);
        for (const worker of restaurants[bestRestaurant].workers.workers) {
            workersOutput += `Name: ${worker.name} With Salary: ${worker.salary} `;
        }
        let bestRestaurantOutput = `Name: ${bestRestaurant} Average Salary: ${bestAverageSalary.toFixed(2)} Best Salary: ${restaurants[bestRestaurant].bestSalary.toFixed(2)}`;
        console.log(restaurants)
        document.querySelector('#bestRestaurant>p').textContent = bestRestaurantOutput;
        document.querySelector('#workers>p').textContent = workersOutput;
    }
}