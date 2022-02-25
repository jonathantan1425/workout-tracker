package com.jonathantann.workouttracker.respository;

import com.jonathantann.workouttracker.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout,Integer> {
}
