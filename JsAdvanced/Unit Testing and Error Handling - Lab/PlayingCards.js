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
                return `${face}${validSuit[suit]}`
            }
        }
    } else {
        throw new Error('Error');
    }
}