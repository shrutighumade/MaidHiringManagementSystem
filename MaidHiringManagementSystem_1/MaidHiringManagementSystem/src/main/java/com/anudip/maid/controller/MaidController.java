package com.anudip.maid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.maid.entity.Maid;
import com.anudip.maid.service.MaidService;

@RestController
@RequestMapping("/api/maids")
public class MaidController {
	MaidService maidService;

	@Autowired
	public MaidController(MaidService maidService) {
		
		this.maidService = maidService;
	}
    @GetMapping
    public List<Maid> getAllMaids() {
        return maidService.getAllMaids();
    }

    @GetMapping("/{id}")
    public Maid getMaidById(@PathVariable Long id) {
        return maidService.getMaidById(id);
    }

    @PostMapping
    public Maid createMaid(@RequestBody Maid maid) {
        return maidService.saveMaid(maid);
    }

    @PutMapping("/{id}")
    public Maid updateMaid(@PathVariable Long id, @RequestBody Maid maid) {
        if (!id.equals(maid.getId())) {
            throw new IllegalArgumentException("ID in path must match ID in request body");
        }
        return maidService.saveMaid(maid);
    }

    @DeleteMapping("/{id}")
    public void deleteMaid(@PathVariable Long id) {
        maidService.deleteMaid(id);
    }
	
	
	

}
