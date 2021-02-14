package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.forum.modelo.Course;
import br.com.alura.forum.modelo.Topic;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	Course findByName(String courseName);
}
