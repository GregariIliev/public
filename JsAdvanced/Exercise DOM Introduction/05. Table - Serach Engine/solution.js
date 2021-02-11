function solve() {
   document.querySelector('#searchBtn').addEventListener('click', onClick);
   let rows = document.querySelectorAll('tbody>tr');

   function onClick() {
      let searchedText = document.querySelector('#searchField').value.toLowerCase();

      for (const row of rows) {
         if (row.textContent.toLowerCase().includes(searchedText)){
            row.setAttribute('class', 'select')
         }else {
            row.removeAttribute('class');
         }
      }
   }
}