package systeconline.dietaweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import systeconline.dietaweb.models.Dieta;
import systeconline.dietaweb.services.DietaService;

@RestController
@RequestMapping("/dietas")
public class DietaController {
	
	@Autowired
	private DietaService dietaService;
	
	/*@PostMapping()
	public ResponseEntity<Dieta> criarDieta(@RequestBody Dieta dieta) {
		Dieta novaDieta = dietaService.adicionaDieta(dieta);
		return ResponseEntity.ok(novaDieta);
	}*/

	@PostMapping()
	public ResponseEntity<Dieta> criarDieta(@RequestBody Dieta dieta) {
		Dieta novaDieta = dietaService.adicionaDieta(dieta);
		return ResponseEntity.ok(novaDieta);
	}

	@GetMapping()
	public ResponseEntity<List<Dieta>> listarDietas() {
		List<Dieta> dietas = dietaService.listaDietas();
		return ResponseEntity.ok(dietas);
	}

	@GetMapping("/dia")
	public ResponseEntity<List<Dieta>> listarDietasPorDia(@RequestParam @DateTimeFormat(iso = DateTimeFormat.iso.Date) ) {
		List<Dieta> dietas = dietaService.listarDietasPorDia(dia);
		return ResponseEntity.ok(dietas);
	}
	
}
