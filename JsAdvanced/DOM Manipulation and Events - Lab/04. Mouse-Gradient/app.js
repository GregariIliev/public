function attachGradientEvents() {
  document.querySelector('#gradient').addEventListener('mousemove', over);

  function over(event){
    let range = event.offsetX
    let percent = Math.floor(range / 300 * 100)
    document.querySelector('#result').textContent = `${percent}%`;
  }
}