package com.anudip.maid.service;

import java.util.List;

import com.anudip.maid.entity.Category;
import com.anudip.maid.entity.Maid;

public interface MaidService {
    List<Maid> getAllMaids();
    Maid getMaidById(Long id);
   // List<MaidDto> getMaidsByCategory(Category category);
    Maid saveMaid(Maid maid);
    void deleteMaid(Long id);
	List<Maid> getMaidsByCategory(Category category);
}
