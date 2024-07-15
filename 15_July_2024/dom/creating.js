// creating element


const ul = document.querySelector('ul');
const li = document.createElement('li');

// adding element
ul.append(li)
li.innerHTML = "Instagram";
li.style.color = "blue";

// Modifying the text through 3 method
//1. innerHTML
//2. innertext
//3. textContent


const firstListItem = document.querySelector('.list-items');
console.log(firstListItem.innerText);
console.log(firstListItem.textContent);
console.log(firstListItem.innerHTML);


// li.innerText = "<h1>Wipro</h1>"
li.innerText = "Wipro";


// Modifying Attribute and Class

// 1. SetAttribute
li.setAttribute('class', 'list-items');

// 2.removing attribute
li.removeAttribute('id',);

// 3. get attribute

const title = document.querySelector('#main');
console.log(title.getAttribute('id'));
console.log(title.getAttribute('class'));


li.classList.add('list-items');
li.classList.remove('list-items');
console.log(li.classList.contains('list-items'));