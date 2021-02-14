package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.dto.TopicDto;
import br.com.alura.forum.modelo.Topic;
import br.com.alura.forum.repository.TopicRepository;

//@RestController
public class old_TopicsController {

	@Autowired
	private TopicRepository topicRepository;
	
//	@RequestMapping("/topics")
	public List<TopicDto> listTopics(String courseName) {
		if(courseName == null) {
			List<Topic> topicsFromDatabase = topicRepository.findAll();
			return TopicDto.convertToDto(topicsFromDatabase);	
		}else {
			List<Topic> topicsFromDatabase = topicRepository.findByCourse_Name(courseName);
			return TopicDto.convertToDto(topicsFromDatabase);	
		}
		
		
	}
}
