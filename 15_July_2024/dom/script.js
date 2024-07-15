 // DOM Manipulation

 //Selecting/accessing dom element
 // we can select dom element in 5 ways

 //Step 1. Get ElementByID()

 var a = document.getElementById('main');
 console.log(a);

 // Step 2.  get element by className()

 var b = document.getElementsByClassName('list-items');
 console.log(b);

 // Step 3. getelementByTagName()
 var c = document.getElementsByTagName('h2');
 console.log(c);

 //Step 4. querySlector()
  var d = document.querySelector('div');
  console.log(d);


  //Step 5. qyerySelectorAll()

  var e = document.querySelectorAll('div');
  console.log(e);