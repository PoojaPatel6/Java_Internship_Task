class student {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    data() {

        console.log("Name: " + this.name + " " + "Age: " + this.age)
    }
}
class school extends student {
    constructor(name, age, rollno) {
        super(name, age);
        this.rollno = rollno;
    }
    info() {
        console.log("Name: " + this.name + " " + "Age: " + this.age + "rollno: " + this.rollno)
    }
}


// let obj = new student("Pooja", 24, 10);
let obj = new school("Pooja", 24, 20);
// obj.data();
obj.info();