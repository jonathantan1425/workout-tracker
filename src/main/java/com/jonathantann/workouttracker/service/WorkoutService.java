package com.jonathantann.workouttracker.service;

import com.jonathantann.workouttracker.model.Workout;

import java.util.List;

public interface WorkoutService {
    public Workout saveWorkout(Workout workout);
    public List<Workout> getAllWorkouts();
}
