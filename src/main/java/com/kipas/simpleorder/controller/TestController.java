package com.kipas.simpleorder.controller;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kipas.simpleorder.model.TestModel;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("satu/{var1}")
	public ResponseEntity<String> getSatu(@PathVariable String var1, @PathParam("param1") String param1) {
		return new ResponseEntity<String>(String.format("%s %s", var1, param1), HttpStatus.OK);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping("dua/{var1}")
	public String getDua(@PathVariable String var1, @PathParam("param1") String param1) {
		return String.format("%s %s", var1, param1);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping(value = "tiga", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Map<String, Object> getTiga(@RequestParam MultiValueMap<String, String> body1) {
		Map<String, Object> response = new HashMap<>();
		response.put("status", "00");
		response.put("message", "success");
		response.put("data", body1);
		return response;
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping("empat")
	public Map<String, Object> getEmpat(@RequestBody TestModel dateBirth) {
		Map<String, Object> response = new HashMap<>();
		response.put("status", "00");
		response.put("message", "success");
		response.put("data", dateBirth);
		return response;
	}
}
