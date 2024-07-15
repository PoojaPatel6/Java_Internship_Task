// Styling Element and Modifying Text
//Step 1.

const title = document.querySelector('#main');

// Styling Step 2.

title.innerHTML = "Companies to apply in"  // modifying text
title.style.color = 'red'                 // modifying style(inline Styling)
a.style = "color : pink; backgraound-color: black;" //(external styling)

// Step 3.
console.log(title);

// Step 4.
const listItems = document.querySelectorAll('list-items');

// Step 5.
listItems.style.fontSize = '2rem'    // only work on sigle element here doesn't work

// use loop for apply 


// step 6.
for(i=0; i> listItems.length; i++){
    listItems[i].style.fontSize = '5rem';
}

// step 7.
console.log(listItems);