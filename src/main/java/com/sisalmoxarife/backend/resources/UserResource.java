package com.sisalmoxarife.backend.resources;

import com.sisalmoxarife.backend.services.UserService;
import com.sisalmoxarife.backend.dto.user.InputUserDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserResource {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<ResponseUserDto> saveUser(@RequestBody final InputUserDto inputUser){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(inputUser));
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable final Integer userId){
		userService.deleteUser(userId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
