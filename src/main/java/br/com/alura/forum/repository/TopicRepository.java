package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.forum.modelo.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

	List<Topic> findByCourse_Name(String courseName);

	//Another example using JPQL query.
//	@Query(“SELECT t FROM TOPIC t WHERE t.course.name = :courseName”)
//	List<Topics> loadByNameOfCourse(@Param(“courseName”) String courseName)


}
