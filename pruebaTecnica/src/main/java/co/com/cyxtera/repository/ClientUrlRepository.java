package co.com.cyxtera.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.com.cyxtera.documents.ClientUrl;

public interface ClientUrlRepository extends MongoRepository<ClientUrl, String>{

}
