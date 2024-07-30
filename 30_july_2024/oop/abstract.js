class Vehicle {
    constructor(make, model) {
        if (new.target === Vehicle) {
            throw new Error("Cannot instantiate abstract class Vehicle directly");
        }
        this.make = make;
        this.model = model;
    }

    start() {
        throw new Error('Method "start" not implemented');
    }

    getDetails() {
        return `This vehicle is a ${this.make}, ${this.model}`;
    }
}

class Car extends Vehicle {
    constructor(make, model) {
        super(make, model);
    }

    start() {
        console.log(`Starting the Car: ${this.make}, ${this.model}`);
    }
}

const myCar = new Car('Toyota', 'Corolla');
myCar.start(); // Starting the Car: Toyota, Corolla
console.log(myCar.getDetails()); // This vehicle is a Toyota, Corolla

try {
    const veh = new Vehicle('Yamaha', 'Mt-07');
    veh.start();
    console.log(veh.getDetails());
} catch (error) {
    console.error(error.message); // Cannot instantiate abstract class Vehicle directly
}