class Task {
    constructor(title) {
        this.title = title;
        this.completed = false;
    }

    completeTask() {
        this.completed = true;
    }

    show() {
        console.log(`Task: ${this.title} : ${this.completed ? 'Completed' : 'Not Completed'}`);
    }
}

class TaskList {
    constructor() {
        this.tasks = [];
    }

    addTask(task) {
        this.tasks.push(task);
    }

    showTasks() { // Corrected method name
        this.tasks.forEach(task => task.show());
    }
}

// Example usage
const taskList = new TaskList();
taskList.addTask(new Task('Learning OOPs in JavaScript'));
taskList.addTask(new Task('Complete project documentation'));

// first task as complete
taskList.tasks[0].completeTask();

// Display all tasks
taskList.showTasks();