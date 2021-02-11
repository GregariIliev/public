function solve(arrayOfCards) {
    let cards = [];
    arrayOfCards.forEach(e => {
        let tokens = e.split('');
        let suit = tokens.pop();
        let face = tokens.join('');
        cards.push([face, suit]);
    });
    function createdCard(face, suit) {
        let validFaces = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A'];
        let validSuit = {
            S: '\u2660',
            H: '\u2665',
            D: '\u2666',
            C: '\u2663',
        };
        if (validFaces.includes(face) && Object.keys(validSuit).includes(suit)) {
            return {
                face,
                suit,
                toString() {
                    return `${face}${validSuit[suit]}`;
                }
            }
        } else {
            return 'Invalid card:';
        }
    }

    let output = cards.reduce((acc, el) => {
       let card = createdCard(el[0], el[1]);
        if (card.toString() === 'Invalid card:'){
            acc = [card, el.join('')];
            return acc
        }else {
            acc.push(card.toString());
        }
        return acc;
    },[]);

   console.log(output.join(' '));
}
solve(['5S', '3D', 'QD', '1C']);
solve(['AS', '10D', 'KH', '2C']);
