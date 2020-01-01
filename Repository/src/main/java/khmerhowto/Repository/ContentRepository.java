package khmerhowto.Repository;

import khmerhowto.Repository.Model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContentRepository extends JpaRepository<Content,Integer> {
}
