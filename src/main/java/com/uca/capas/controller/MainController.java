package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/Login")
	public String enviarForm(Usuario usuario) {
		return "Login";
	}
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		if(usuario.getNombre().equals("admin") && usuario.getPassword().equals("password")) {
			return "MostrarMensajeV";
		}
		return "MostrarMensajeF";
	}

}
