function square(a){
    if(!a){
        let b  = '';
        for (let i = 0; i < 5; i++) {
            for (let j = 0; j < 5; j++) {
               b += '* ';
            }
           console.log(b);
           b = '';
      }
    }else {
    let b  = '';
    for (let i = 0; i < a; i++) {
        for (let j = 0; j < a; j++) {
           b += '* ';
        }
       console.log(b);
       b = '';
  }
}
}

square(3);