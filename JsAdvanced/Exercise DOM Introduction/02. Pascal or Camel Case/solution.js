function solve() {
  //TODO...

    let text = document.querySelector('#text').value.toLowerCase();
    let style = document.querySelector('#naming-convention').value;
    let result =  document.getElementById('result');


    if (style == 'Camel Case'){
      result.textContent = camelize(text);
    }else if (style == 'Pascal Case'){
        result.textContent = pascal(text);
    }else {
        result.textContent = 'Error!'
    }

    function camelize(str) {
        return str.replace(/(?:^\w|[A-Z]|\b\w)/g, function(word, index) {
            return index === 0 ? word.toLowerCase() : word.toUpperCase();
        }).replace(/\s+/g, '');
    }
    function pascal(str) {
        return str.replace(/(?:^\w|[A-Z]|\b\w)/g, function(word, index) {
            return index === 0 ? word.toUpperCase() : word.toUpperCase();
        }).replace(/\s+/g, '');
    }
}