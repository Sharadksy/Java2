package Projects.Project1;

import java.util.Objects;

public class Task {
    private final String id;
    private final String title;
    private final Priority priority;
    private final Status status;

    public Task(String id, String title, Priority priority, Status status){
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }
    public String getId(){ return id; }
    public String getTitle(){ return title; }
    public Priority getPriority(){ return priority; }
    public Status getStatus(){ return status; }

    @Override
    public String toString(){
        return "[" + id + "] " + title + " | Priority: " + priority + " | Status: " + status;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Checking if the two objects are same in the memory.
        if (this==obj){
            return true;
        }
        // 2. Checking is the other object is null and if the two objects are Task or not
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        // 3. To make sure it is a Task we will use cast
        Task otherTask = (Task) obj;

        return Objects.equals(this.id,otherTask.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }



}
