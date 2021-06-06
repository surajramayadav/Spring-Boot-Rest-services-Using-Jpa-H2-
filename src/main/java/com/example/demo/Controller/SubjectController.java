package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Subject;
import com.example.demo.Service.SubjectService;

@RestController
public class SubjectController {

		@Autowired
		private SubjectService subjectService;
	
		@GetMapping("/subjects")
		public List<Subject> getAllSubject()
		{
		return subjectService.getAllSubject();
		}
		
		
		
		
		@PostMapping("/subjects")
		public void AddSubject(@RequestBody Subject subject) {
			 subjectService.AddSubject(subject);
		}
		
		@PutMapping("/subjects/{id}")
		public void UpdateSubject(@PathVariable String id,@RequestBody Subject subject) {
			 subjectService.UpdateSubject(id,subject);
		}
		
		
		@DeleteMapping("/subjects/{id}")
		public void DeleteSubject(@PathVariable String id) {
			 subjectService.DeleteSubject(id);
		}
		
}
