package com.cg.sbwd.controller;

 

import java.util.ArrayList;
import java.util.List;

 

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 

@Controller
@Scope("session")
public class TaskController {
    
    private List<String> tasksList;
    
    public TaskController() {
        this.tasksList = new ArrayList<>();
    }
    
    @GetMapping(path="/tasks")
    public ModelAndView showTasksAction() {
        return new ModelAndView("tasks-list", "tasks", tasksList);
    }
    
    @GetMapping(path="/addTask")
    public ModelAndView addTaskAction(@RequestParam("task") String currentTask) {
        this.tasksList.add(currentTask);
        return new ModelAndView("tasks-list", "tasks", tasksList);
    }
    
    @GetMapping(path="/delTask")
    public ModelAndView delTaskAction(@RequestParam("task") String taskToDelete) {
        this.tasksList.remove(taskToDelete);
        return new ModelAndView("tasks-list", "tasks", tasksList);
    }
    
    @GetMapping(path="/clear")
    public ModelAndView  clearAllAction() {
        this.tasksList.clear();
        return new ModelAndView("tasks-list", "tasks", tasksList);
    }
    
    
}