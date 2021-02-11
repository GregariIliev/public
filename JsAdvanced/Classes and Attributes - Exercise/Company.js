class Company{
    constructor() {
        this.departments = [];
    }

    addEmployee(username, salary, position, department){
        if (!username || salary < 0 || !position || !department){
            throw new Error('Invalid input!');
        }
        this.departments.push({[department]: [username, salary, position, department]});
    }
    bestDepartment(){
        let obj = {};

        for (const dep of this.departments) {
            let key = Object.keys(dep);
            if (!obj[key]){
                obj[key] = [dep[key]];
            }else {
                obj[key].push(dep[key]);
            }
        }
        console.log(this.departments)
    }
}


let c = new Company();
c.addEmployee("Stanimir", 2000, "engineer", "Construction");
c.addEmployee("Pesho", 1500, "electrical engineer", "Construction");
c.addEmployee("Slavi", 500, "dyer", "Construction");
c.addEmployee("Stan", 2000, "architect", "Construction");
c.addEmployee("Stanimir", 1200, "digital marketing manager", "Marketing");
c.addEmployee("Pesho", 1000, "graphical designer", "Marketing");
c.addEmployee("Gosho", 1350, "HR", "Human resources");
console.log(c.bestDepartment());
