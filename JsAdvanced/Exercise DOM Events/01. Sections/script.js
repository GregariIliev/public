function create(words) {
   let id = document.querySelector('#content');
   for (const word of words) {
      let div = document.createElement('div');
      div.addEventListener('click', onClick);
      let p = document.createElement('p');
      p.textContent = word;
      p.style.display = 'none'
      div.appendChild(p);
      id.appendChild(div);
   }


   function onClick(ev){
      if (ev.target.tagName === 'DIV' || ev.target.tagName === 'P'){
         ev.target.children[0].style.display = ''
         console.log(ev.target.children[0])
      }
   }
}