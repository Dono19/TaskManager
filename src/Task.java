import java.util.*;

public class Task {
	
	private int TID;
	private Project project;
	private Date deadline;
	private State currentState;
	private String description;
	private String context;
	private User currentResponsible;
	private List<User> currentExecutors;
	
	/* Constructores */
	/* Para mayor flexibilidad se establece varios tipos de constructores */
	public Task(String task_description, String task_context, Project tasks_project, Date task_deadline) {
		
	}
	
	public Task(String task_description, String task_context, Project tasks_project) {
		
	}
	
	public Task(String task_description, String task_context,Date Task_deadline) {
		
	}
	
	public Task(String task_description, String task_context) {
		
	}
	
	/* Public methods */
	public void setProject(Project tasks_project) {
		
	}
	
	public Project getProject() {
		return project;
	}
	
	public void setDeadline(Date new_deadline) {
		
	}
	
	public Date getDeadline() {
		return deadline;
	}
	
	public void setState(State new_state) {
		
	}
	
	public State getState() {
		return currentState;
	}
	
	public void setDescription(String new_description) {
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setContext(String new_context) {
		
	}
	
	public String getContext() {
		return context;
	}
	
	public void setResponsible(User new_responsible) {
		
	}
	
	public User getResponsible() {
		return currentResponsible;
	}
	
	public void AddExecutor(User new_executor) {
		
	}
	
	public void RemoveExecutor(User executor_to_remove) {
		
	}
	
	

}
