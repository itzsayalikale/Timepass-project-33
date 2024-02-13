package com.timepass.practise.service;

import java.util.List;

import com.timepass.practise.model.AgriAccount;

public interface AgriService {

	public String addData(AgriAccount agriaccount);

	public List<AgriAccount> getAllData();

	public AgriAccount getSingleData(int id);

	public String deleteData(int id);

	public String updateData(int id, AgriAccount agriaccount);

}
