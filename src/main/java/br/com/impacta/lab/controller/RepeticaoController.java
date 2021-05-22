package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class RepeticaoController {

	@GetMapping("/repeticao")
	public ResponseEntity<String> simularValores(@RequestParam(name="numero") int numero) {

		String retorno = new String("");
		Integer count = 1;

		while(count <= numero) {
			retorno += count;
			count++;
		}

		/* COM FOR

		String retorno = "";

		for (int i = 1; i <= numero; i++) {

		retorno = retorno + i;

		} */

		return ResponseEntity.ok(retorno);
	}
	
}
