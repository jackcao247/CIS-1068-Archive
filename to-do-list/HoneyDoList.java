package cis_assignment;

import java.time.LocalDateTime;
import java.util.Arrays;

public class HoneyDoList {
	
	private Task[] tasks;
	private int numTask;
	private final int INITIAL_CAPACITY = 3;
	
	public HoneyDoList() {
		this.tasks = new Task[this.INITIAL_CAPACITY];
		this.numTask = 0;
	}
	
	public String toString() {
		String t =  "";
		
		for(int i = 0; i < this.numTask; i++) {
			t += "===== Task : " + i + "=====\n" + this.tasks[i].toString();
		}
		return t;
	}
	
	public int find(String name) {
		for (int i = 0; i < this.numTask; i++) {
			String n = this.tasks[i].getName();
			if (n.equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addTask(Task newTask) {
		if (this.numTask == this.tasks.length) {
			this.tasks = Arrays.copyOf(this.tasks, this.tasks.length * 2);
		}
		this.tasks[this.numTask++] = newTask;
	}
	
	public int totalTime() {
		int totalTime = 0;
		for (int i = 0; i < this.numTask; i++) {
			totalTime += this.tasks[i].getEstMinsToComplete();
		}
		return totalTime;
	}
	
	public int shortestTime() {
		int index = -1;
		int shortTime = 999999;
		
		for (int i = 0; i < this.numTask; i++) {
			if(this.tasks[i].getEstMinsToComplete() < shortTime) {
				index = i;
				shortTime = this.tasks[i].getEstMinsToComplete();
			}
		}
		return index;
	}
	
	public Task getTask(int index) {
		Task specific = null;
		if (index >= 0 && index < this.numTask) {
			specific = this.tasks[index];
			return specific;
		}
		return specific;
	}
	
	public Task completeTask(int index) {
		Task target = null;
		
		if (index >= 0 && index < this.numTask) {
			target = this.tasks[index];
			
			for (int i = index; i < this.numTask - 1; i++) {
				this.tasks[i] = this.tasks[i+1];
			}
			
			this.tasks[this.numTask - 1] = null;
			this.numTask --;
		}
		return target;
	}
	
	public HoneyDoList overdueTasks() {
		HoneyDoList overdueArray = new HoneyDoList();
		
		for (int i = 0; i < this.numTask; i++) {
			if(this.tasks[i].dueTime()) {
				overdueArray.addTask(this.tasks[i]);
			}
		}
		return overdueArray;
	}

	public static void main(String[] args) {
		   HoneyDoList honeydo = new HoneyDoList();

		   System.out.println(honeydo);		
		   honeydo.addTask(new Task("Homework", 1, 120, LocalDateTime.of(2024, 11, 16, 12, 30)));
		   System.out.println(honeydo);
		   System.out.println(honeydo.getTask(honeydo.shortestTime()));
	}
}
