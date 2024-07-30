class Bank {#
    balance = 0;

    constructor(owner) {
        this.owner = owner;
    }

    deposit(amount) {
        this.#balance += amount;
    }

    getBalance() {
        return this.#balance;
    }
}

const acc = new Bank('Pooja');
acc.deposit(5000);
console.log(acc.getBalance());


// console.log(acc.#balance);