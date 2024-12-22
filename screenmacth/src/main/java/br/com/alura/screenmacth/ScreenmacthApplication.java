package br.com.alura.screenmacth;

import br.com.alura.screenmacth.model.DadosSerie;
import br.com.alura.screenmacth.service.ConsumoAPI;
import br.com.alura.screenmacth.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class ScreenmacthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmacthApplication.class,args);

	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=4bed2ea7");
		/*System.out.println(json);
		json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");*/
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);





	}
}




