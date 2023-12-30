package com.anudip.maid.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.maid.entity.Category;
import com.anudip.maid.entity.Maid;
import com.anudip.maid.repository.MaidRepository;
import com.anudip.maid.service.MaidService;

@Service
public class MaidServiceImpl implements MaidService {
	
	MaidRepository maidRepository;
	@Autowired
	public MaidServiceImpl(MaidRepository maidRepository) {
		
		this.maidRepository = maidRepository;
	}	
	
	@Override
	public List<Maid> getAllMaids() {
		// TODO Auto-generated method stub
		return maidRepository.findAll();
	}

	
	


	@Override
	public Maid getMaidById(Long id) {
		// TODO Auto-generated method stub
		return maidRepository.findById(id).orElse(null);
	}

	@Override
	public Maid saveMaid(Maid maid) {
		// TODO Auto-generated method stub
		return maidRepository.save(maid);
	}

	@Override
	public void deleteMaid(Long id) {
		// TODO Auto-generated method stub
		maidRepository.deleteById(id);
		
	}

	@Override
	public List<Maid> getMaidsByCategory(Category category) {
		// TODO Auto-generated method stub
		return maidRepository.findByCategory(category);
	}


	
}
