function extract(content) {
    let text = document.getElementById(content).textContent;

    const regex = new RegExp(/\(.+?\)/, 'gm');
    let result = text.match(regex);

    return result.join('; ');
}