package com.example.RestCrudQualifier.RestCrudQualifier;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("First")
public class TopicServiceImp1 implements Topicservice{
	
	List<Topic> topics=Arrays.asList(                          //we are ipmlementing a interface in two class which having same name, at
			                                                   //this time the autowire annotation will confused and can not get the object 
			                                                   //which provide by the @service which extends @component.So We resolve this issue
			                                                   //with the help of @Qualifier.
			new Topic("Java1", "dhasu Lang", "Adv"),
			new Topic("Kotlin1", "swag wali", "Adv"),
			new Topic("Php1", "Acchi Lang", "Adv")
			);

	@Override
	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return topics;
	}
	
	
}