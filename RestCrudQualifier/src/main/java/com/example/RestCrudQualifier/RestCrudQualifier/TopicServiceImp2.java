package com.example.RestCrudQualifier.RestCrudQualifier;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Secound")
public class TopicServiceImp2 implements Topicservice {

	List<Topic> topics=Arrays.asList(
			new Topic("Java2", "dhasu Lang", "Adv"),
			new Topic("Kotlin2", "swag wali", "Adv"),
			new Topic("Php2", "Acchi Lang", "Adv")
			);

	@Override
	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return topics;
	}
}
