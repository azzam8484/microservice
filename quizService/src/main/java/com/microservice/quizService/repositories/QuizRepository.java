package com.microservice.quizService.repositories;

import com.microservice.quizService.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
}