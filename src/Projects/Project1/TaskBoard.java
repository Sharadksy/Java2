package Projects.Project1;

import java.util.HashSet;
import java.util.Set;

public class TaskBoard {
    // 1. Storage
    // We are making it private but the inner class can still access it
    private final Set<Task> tasks = new HashSet<>();

    // 2. Inner Nested class
    // We have not static members here
    class BoardLogger{
        public void logTaskAdded(Task newTask){
            System.out.println("[LOG] Task Added: "+ newTask.getTitle());
            System.out.println("[LOG] Total tasks on board right now: "+ tasks.size());
            System.out.println("--------------------------------------");
        }
    }

    // 3. A method to add task to the board
    public void addTask(Task task){
        // add() method returns true if the task is added and false if it's not added
        boolean wasAdded = tasks.add(task);

        if (wasAdded){
            BoardLogger boardLogger = new BoardLogger();
            boardLogger.logTaskAdded(task);
        } else {
            System.out.println("[ERROR] Could not add duplicate task: Task ID: " + task.getId() + " Task Title: " + task.getTitle());
        }
    }

    public void generateBoardSummary(){
        class ReportGenerate{
            int todo = 0;
            int inProgress = 0;
            int review = 0;
            int done = 0;

            public void calculteAndPrint(){
                for (Task task : tasks){
                    if (task.getStatus() == Status.TODO){
                        todo++;
                    } else if (task.getStatus() == Status.IN_PROGRESS) {
                        inProgress++;
                    } else if (task.getStatus() == Status.REVIEW) {
                        review++;
                    } else if (task.getStatus() == Status.DONE){
                        done++;
                    }
                }
                System.out.println("-----Board Summary-----");
                System.out.println("Total Tasks: " + tasks.size());
                System.out.println("To Do:       " + todo);
                System.out.println("In Progress: " + inProgress);
                System.out.println("Review:      " + review);
                System.out.println("Done:        " + done);
                System.out.println("=====================\n");
            }
        }
        ReportGenerate report = new ReportGenerate();
        report.calculteAndPrint();
    }

}
