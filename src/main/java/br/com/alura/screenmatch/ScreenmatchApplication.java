package br.com.alura.screenmatch;

import br.com.alura.screenmatch.MODEL.converteDados;
import br.com.alura.screenmatch.MODEL.dadosSerie;
import br.com.alura.screenmatch.service.consumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		consumoAPI consumoAPI = new consumoAPI();
		var json = consumoAPI.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=5bd5e5ba");
		System.out.println(json);
		converteDados conversor = new converteDados();
		dadosSerie dados = conversor.obterDados(json, dadosSerie.class);
		System.out.println(dados);
	}
}
