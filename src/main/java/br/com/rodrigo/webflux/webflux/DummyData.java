package br.com.rodrigo.webflux.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.rodrigo.webflux.documents.Playlist;
import br.com.rodrigo.webflux.repositories.PlaylistRepository;
import reactor.core.publisher.Flux;

//@Component
//public class DummyData  implements CommandLineRunner{
//	
//	private PlaylistRepository playlistRepository;
//	
//  /*
//   * deleta tudo e atraves de um flux de stream ele insere alguns nomes descritos
//   * */
//  @Override
//  public void run(String... args) throws Exception {
//
//  	playlistRepository.deleteAll()
//              .thenMany(
//                      Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
//                              "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
//                              .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                              .flatMap(playlistRepository::save))
//              .subscribe(System.out::println);
//  }
//
//
//}
