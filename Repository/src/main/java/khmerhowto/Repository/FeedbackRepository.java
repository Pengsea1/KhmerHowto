package khmerhowto.Repository;

import khmerhowto.Repository.Model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {
}
