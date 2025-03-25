package MariusSivert;

public class Process {
    String id;
    int arrivalTime, burstTime, remainingTime, priority;
    int waitingTime = 0, turnaroundTime = 0, startTime = -1, completionTime = 0;

    public Process(String id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}