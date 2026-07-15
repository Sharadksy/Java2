package Projects.Project1;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("SS209","Walking",Priority.HIGH,Status.TODO);
        Task task2 = new Task("SA201","Reading Book",Priority.MEDIUM, Status.DONE);
        Task task3 = new Task("SS202", "Exercise",Priority.CRITICAL,Status.IN_PROGRESS);
        Task task4 = new Task("SS203","Listening Songs", Priority.LOW, Status.REVIEW);
        Task task5 = new Task("SS209","Walking",Priority.HIGH,Status.TODO);

        TaskBoard taskBoard = new TaskBoard();
        taskBoard.addTask(task1);
        taskBoard.addTask(task2);
        taskBoard.addTask(task3);
        taskBoard.addTask(task4);
        taskBoard.addTask(task5);
        taskBoard.generateBoardSummary();
    }
}
