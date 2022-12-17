package com.sisalmoxarife.backend.resources;

import com.sisalmoxarife.backend.dto.user.InputUserDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import com.sisalmoxarife.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserResource {

	private final UserService userService;

	@PostMapping
	public ResponseEntity<ResponseUserDto> saveUser(@RequestBody final InputUserDto inputUser){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(inputUser));
	}

	@GetMapping("/{userId}")
	public ResponseEntity<ResponseUserDto> findUserById(@PathVariable(name = "userId") final Integer userId){
		return ResponseEntity.status(HttpStatus.OK).body(userService.findUserById(userId));
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable final Integer userId){
		userService.deleteUser(userId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
