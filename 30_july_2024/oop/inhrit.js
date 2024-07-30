class Person {


    constructor(name) {
        this.name = name;

    }
    toString() {

        return (`Name = ${this.name}`);
    }
}

class student extends Person {

    constructor(name, id) {
        super(name);
        this.id = id;

    }
    getName() {


        retrun(`${super.tostring()}and studentid=${this.id}`)
    }
}