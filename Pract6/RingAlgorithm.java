import java.util.Scanner;

public class RingAlgorithm {
private int numProcesses;
private int[] processIDs;

public static void main(String[] args) {
System.out.println("Anuja Jadhav (4226)");
RingAlgorithm ra = new RingAlgorithm();
ra.readInputs();
ra.startElection();
}

private void readInputs() {
Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of processes: ");
numProcesses = sc.nextInt();

processIDs = new int[numProcesses];

for (int i = 0; i < numProcesses; i++) {
System.out.print("Enter the process ID for process " + (i+1) + ": ");
processIDs[i] = sc.nextInt();
}

sc.close();
}

private void startElection() {

int coordinator = 0;

for (int i = 0; i < numProcesses; i++) {
if (processIDs[i] > processIDs[coordinator]) {
coordinator = i;
}
}

System.out.println("Process " + processIDs[coordinator] + " is the coordinator.");

int nextProcess = (coordinator + 1) % numProcesses;
while (nextProcess != coordinator) {
System.out.println("Process " + processIDs[coordinator] + " sends message to Process " + processIDs[nextProcess]);
if (processIDs[nextProcess] > processIDs[coordinator]) {
coordinator = nextProcess;
System.out.println("Process " + processIDs[nextProcess] + " is the new coordinator.");
}
nextProcess = (nextProcess + 1) % numProcesses;
}
}
}
