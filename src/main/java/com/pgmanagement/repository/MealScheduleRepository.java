package com.pgmanagement.repository;

import com.pgmanagement.entity.MealSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealScheduleRepository
        extends JpaRepository<MealSchedule, Long> {
}