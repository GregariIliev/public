function createTicket(parameters, sortArgument){
    class Ticket{
        constructor(destination, price, status) {
            this.destination = destination;
            this.price = price;
            this.status = status;
        }
    }
    let arrayTickets = [];
    parameters.forEach(a => {
        let tokens = a.split('|');
        arrayTickets.push(new Ticket(tokens[0], Number(tokens[1]), tokens[2]));
    });
    arrayTickets.sort((p1, p2) => {
        if (sortArgument === 'destination'){
            return p1.destination.localeCompare(p2.destination);
        }
        if (sortArgument === 'price'){
            return p1.price - p2.price;
        }
        if (sortArgument === 'status'){
            return p1.status.localeCompare(p2.status);
        }
    })
   return arrayTickets;
}

createTicket(['Philadelphia|94.20|available',
        'New York City|95.99|available',
        'New York City|95.99|sold',
        'Boston|126.20|departed'],
    'status'

);