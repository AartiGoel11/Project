package com.project.hotel;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	private HotelRepository hotelRepository;

	public HotelController(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}
	
	@GetMapping("/all")
	public List<Hotel> getAll()
	{
		return this.hotelRepository.findAll();
		
	}
	
	@PostMapping("/add")
	public void insert(@RequestBody Hotel hotel)
	{
		this.hotelRepository.insert(hotel);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Hotel hotel)
	{
		this.hotelRepository.save(hotel);
	}
	
	@DeleteMapping("/delete/{id}")
	public void update(@PathVariable("id") String id)
	{
		this.hotelRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Hotel> findID(@PathVariable("id") String id)
	{
	
	return this.hotelRepository.findById(id);
	}
	
}
