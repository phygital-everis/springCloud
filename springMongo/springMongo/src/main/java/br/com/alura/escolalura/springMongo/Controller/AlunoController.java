package br.com.alura.escolalura.springMongo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.alura.escolalura.springMongo.models.Aluno;

@Controller
public class AlunoController {

	@GetMapping("/aluno/cadastrar")
	public String cadastrar(Model model) {
		model.addAttribute("aluno",new Aluno());
		return "aluno/cadastrar";
	}
	
     @PostMapping("/aluno/salvar")
	public String salvar(@ModelAttribute Aluno aluno) {
    	 System.out.println("dados salvos"+aluno.toString());
		return"redirect/";
	}
     
}
