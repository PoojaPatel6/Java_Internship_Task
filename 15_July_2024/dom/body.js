// var div1 = document.getElementById('div1')
// var unicycle = document.getElementsByClassName('unicycle');

// var paragraph = document.getElementsByTagName('p');
// // var queryUnicycle = document.querySelector('.unicycle');
// var queryUnicycle = document.querySelector('#div2');
// var queryAll = document.querySelectorAll('.unicycle, #div2');
// var text = "<h1>Hello World </h1>";

// div1.innerHTML= text;

var a = document.createElement('h1');  // creating element
//a.innerHTML ="Pooja";  // adding text

var b = document.createTextNode("Accenture");
a.appendChild(b);
a.style = "color : pink; backgraound-color:black;"  // add style
a.className = 'name';
a.id ='names';
a.setAttribute('title','myname');
document.body.append(a);    // adding element
// console.log(a); 

//let ul =document.querySelector('ul);

URL.appendChild(a);
console.log(ul);
console.log(a);


// replacing Element
a1 = documentcreateElement('h3');
a1.id = 'a2';
a1.className = 'a2';
n1 = document.createTextNode('PWC');
a1.appendChild(n1);
a.replaceChild(a1);


let myul = document.querySelector('ul');
myul.replaceChild(a1,document.getElementById('fui'));

//removing element
myul.removeChild(document.getElementById("lui"));


let pr = a1.getAttribute('class');
let pr1 = a1.hasAttribute('class')
//a1.removeAttribute('class);
console.log(a1, pr, pr1);
