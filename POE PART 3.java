package com.mycompany.taskmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    String developer;
    String taskName;
    int taskID;
    int taskDuration;
    String taskStatus;
    Task(String developer,String taskName,int taskID, int taskDuration, String taskStatus){
        this.developer=developer;
        this.taskName=taskName;
        this.taskID=taskID;
        this.taskDuration=taskDuration;
        this.taskStatus=taskStatus;
    }
}
public class TaskManager {
    private static List<Task> tasks= new ArrayList<>();
    public static void main(String[] args ){
        // Populating the arrays
        String[] developers={"Mike Smith","Edward Harrison", "Samantha Paulson","Glenda Oberholzer"};
        String[] taskNames={"Create Login","Create Add Features", "Create Reports","Add Arrays"};
        int[]taskIDs={1,2,3,4};
        int[]taskDuration={5,8,2,11};
        String[] taskStatuses={"to do", "doing","done","to do"};
        for(int i=0;i< developers.length; i++){
            Task task = new Task(developers[i],taskNames[i],taskIDs[i],taskDuration[i],taskStatuses[i]);
            tasks.add(task);
        }
        Scanner scanner= new Scanner(System.in);
        while(true){
            System.out.println("Select an option:");
            System.out.println("1.Display tasks with status 'done");
            System.out.println("2.Display developer and duration of the task with the longest duration");
            System.out.println("3. Search for a task by name");
            System.out.println("4.Search for tasks assigned to a developer");
            System.out.println("5. Delete a task by name");
            System.out.println("6.Display a report of all tasks");
            System.out.println("0. Exit");
            int option= scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch(option){
                case 1:
                    displayTaskWithStatusDone();
                    break;
                case 2:
                displayDeveloperDurationLongestTask();

                break;
                case 3:
                    System.out.println("Enter the task name:");
                    String taskName= scanner.nextLine();
                    searchTaskByName(taskName);
                    break;
                case 4:
                    System.out.println("Enter the developer name:");
                    String developerName= scanner.nextLine();
                    searchTaskByDeveloper(developerName);
                    break;
                case 5:
                    System.out.println("Enter the task name to delete :");
                    String taskToDelete=scanner.nextLine();
                    deleteTaskByName(taskToDelete);
                    break;
                case 6:
                    displayTaskReport();
                    break;
                case 0:
                    System.out.println("Invalid option, Please try again.");
            }
        }
    }
    //Display tasks with status "done"
    private static void displayTaskWithStatusDone(){
        System.out.println("Tasks with status 'done:");
        for (Task task: tasks){
            if (task.taskStatus.equals("done")){
                System.out.println("Developer:"+ task.taskName);
                System.out.println("Task Duration:" + task.taskDuration);
                System.out.println();
            }
        }
    }
    //Display developer and duration of the task with the longest duration
    private static void displayDeveloperDurationLongestTask(){
        Task longestTask=tasks.get(0);
        for(Task task: tasks){
            if(task.taskDuration>longestTask.taskDuration){
                longestTask=task;

            }
        }
        System.out.println("Task with longest duration:");
        System.out.println("Developer:"+ longestTask.developer);
        System.out.println("Task Duration:"+ longestTask.taskDuration);
        System.out.println();
    }
    // Search for a task by name and display the task
    private static void searchTaskByName(String taskName){
        System.out.println("Searching for task with name"+ taskName+ ":");
        for (Task task : tasks){
            if
            (task.taskName.equals(taskName)){
                System.out.println("Task Name:"+ task.taskName);
                break;

            }
        }
        System.out.println();
    }
    // Search for tasks assigned to a developer and display the tasks
    private static void
    searchTaskByDeveloper(String developerName){
        System.out.println("Tasks assigned to developer"+ developerName+":");
        for (Task task: tasks){
            if
            (task.developer.equals(developerName)){
                System.out.println("Task Name:"+ task.taskName);
                System.out.println("Task Status:"+ task.taskStatus);
                System.out.println();
            }
        }
    }
    //Delete a task by name
    private static void deleteTaskByName(String taskName){
        System.out.println("Deleting task with name"+ taskName+":");
        for (Task task: tasks){
            if
            (task.taskName.equals(taskName)){
                tasks.remove(task);
                System.out.println("Task successfully deleted.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
    //Display a report of all tasks
    private static void displayTaskReport(){
        System.out.println("Task Report:");
        for(Task task: tasks){
            System.out.println("Developer:"+ task.developer);
            System.out.println("Task Name:"+ task.taskName);
            System.out.println("TaskID"+ task.taskID);
            System.out.println("Task Duration:"+task.taskDuration);
            System.out.println("Task Status:"+ task.taskStatus);
            System.out.println();
        }
    }
}



            
        
                
            
                    
           
        
        
                            
                            
                            
                            
                            
                     
			
	
		
		
	
