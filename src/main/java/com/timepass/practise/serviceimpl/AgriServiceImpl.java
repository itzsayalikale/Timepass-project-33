package com.timepass.practise.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timepass.practise.model.AgriAccount;
import com.timepass.practise.repository.AgriRepository;
import com.timepass.practise.service.AgriService;

@Service
public class AgriServiceImpl implements AgriService{

	@Autowired
	private AgriRepository agrirepository;

	@Override
	public String addData(AgriAccount agriaccount) {
		agrirepository.save(agriaccount);
		return "data added";
	}

	@Override
	public List<AgriAccount> getAllData() {
		List<AgriAccount> list=agrirepository.findAll();
		return list;
	}

	@Override
	public AgriAccount getSingleData(int id) {
		AgriAccount agri=agrirepository.findById(id);
		return agri;
	}

	@Override
	public String deleteData(int id) {
		agrirepository.deleteById(id);
		return "data deleted";
	}

	@Override
	public String updateData(int id, AgriAccount agriaccount) {
		if(agrirepository.existsById(id)) {
			agrirepository.save(agriaccount);
			return "data updated";
		}
		else {
			return"data not found";
		}	
	}
	 
}
