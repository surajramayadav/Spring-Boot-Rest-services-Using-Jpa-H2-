package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Subject;
import com.example.demo.Repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubject()
	{
		List<Subject> subjects=new ArrayList<>();
		
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	public void AddSubject(Subject subject) {
		subjectRepo.save(subject);
	}
	
	public void UpdateSubject(String id,Subject subject) {
		subjectRepo.save(subject);
	}
	
	public void DeleteSubject(String id) {
		subjectRepo.deleteById(id);
	}
	
	
}
