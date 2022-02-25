package com.jonathantann.workouttracker.controller;

import com.jonathantann.workouttracker.model.Workout;
import com.jonathantann.workouttracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
    @Autowired
    private WorkoutService workoutService;

    @PostMapping("/add")
    public String add(@RequestBody Workout workout){
        workoutService.saveWorkout(workout);
        return "New workout is added";
    }

    @GetMapping("/getall")
    public List<Workout> getAllWorkouts(){
        return workoutService.getAllWorkouts();
    }
}
