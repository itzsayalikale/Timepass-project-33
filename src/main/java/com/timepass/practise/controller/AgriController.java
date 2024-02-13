package com.timepass.practise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timepass.practise.model.AgriAccount;
import com.timepass.practise.service.AgriService;

@RestController
@RequestMapping("/agri/api")
public class AgriController {

	@Autowired
	private AgriService agriservice;
	
	@PostMapping("/addData")
	public ResponseEntity<String> addData(@RequestBody AgriAccount agriaccount){
	String agristr	=agriservice.addData(agriaccount);
		return new ResponseEntity<String>(agristr,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllData")
	public ResponseEntity<List<AgriAccount>> getAllData(){
	List<AgriAccount> list	=agriservice.getAllData();
		return new ResponseEntity<List<AgriAccount>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getSingleData/{id}")
	public ResponseEntity<AgriAccount> getSingleData(@PathVariable int id){
		AgriAccount agri=agriservice.getSingleData(id);
		return new ResponseEntity<AgriAccount>(agri,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		String str=agriservice.deleteData(id);
		return str;
	}
	
	@PutMapping("/updateData/{id}")
	public ResponseEntity<String> updateData(@PathVariable int id,@RequestBody AgriAccount agriaccount){
		String strup=agriservice.updateData(id,agriaccount);
		return new ResponseEntity<String>(strup,HttpStatus.OK);
	}
}
