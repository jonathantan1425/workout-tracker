package com.jonathantann.workouttracker.service;

import com.jonathantann.workouttracker.model.Workout;
import com.jonathantann.workouttracker.respository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Override
    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    @Override
    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }
}
