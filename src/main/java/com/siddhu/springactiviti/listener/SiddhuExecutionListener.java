package com.siddhu.springactiviti.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

import com.siddhu.springactiviti.model.Employee;

public class SiddhuExecutionListener implements ExecutionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean condition;
	
	/*
	 * public void setTaskService(TaskService taskService) { this.taskService =
	 * taskService; }
	 */
	@Override
	public void notify(DelegateExecution execution) {
		// Your code here

		Employee objEmployee = (Employee)execution.getVariable("employee");
		/*
		 * TaskService taskService = execution.getEngineServices().getTaskService(); //
		 * Get the RuntimeService RuntimeService runtimeService =
		 * execution.getEngineServices().getRuntimeService();
		 * 
		 * System.out.println("Variable Value: " + objEmployee.toString()); String
		 * taskId = "";
		 * 
		 * // Retrieve the current task org.activiti.engine.task.Task currentTask =
		 * taskService.createTaskQuery() .executionId(execution.getId())
		 * .singleResult();
		 */

        // Complete the current task
        //taskService.complete(currentTask.getId());

		String taskId = "";
		
		if(objEmployee.getTaskType().equalsIgnoreCase("simple"))
		{

			taskId = "simpletask";
			condition = true;
			execution.setVariable("gatewayCondition", condition);
			//Task newTask = taskService.createTaskQuery().taskId(taskId).singleResult();
			//Task newTask = taskService.newTask(taskId);
			//taskService.complete("exclusivegateway1");
			//taskService.saveTask(newTask);
			//runtimeService.signalEventReceived("taskId", taskId);


		}

		else
		{
			taskId = "complextask";
			condition = false;
			execution.setVariable("gatewayCondition", condition);
			//taskService.createTaskQuery().taskId("complextask").singleResult();   
			//Task newTask = taskService.newTask(taskId);
			//taskService.complete("exclusivegateway1");
			//taskService.saveTask(newTask);
			//runtimeService.signalEventReceived("taskId", taskId);
		}


	}


}