class Animal {
    makeSound() {
        console.log('Animal makes a sound');
    }
}

class Dog extends Animal {
    makeSound() {
        console.log('The dog barks');
    }
}

class Cat extends Animal {
    makeSound() {
        console.log('The cat meows');
    }
}


function playSound(animal) {
    animal.makeSound();
}

const dog = new Dog();
const cat = new Cat();

// Using polymorphism
playSound(dog); // The dog barks
playSound(cat); // The cat meows