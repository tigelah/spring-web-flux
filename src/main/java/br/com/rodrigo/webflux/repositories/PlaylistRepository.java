package br.com.rodrigo.webflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rodrigo.webflux.documents.Playlist;

@Repository
public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
