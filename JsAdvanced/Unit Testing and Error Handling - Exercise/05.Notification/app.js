function notify(message) {
  let divNotification = document.getElementById('notification');
  divNotification.textContent = message;
  divNotification.style.display = 'block';
  divNotification.addEventListener('click', () => {
    divNotification.style.display = 'none';
  });
}