package NexDew.example.Authentication.repository;

import NexDew.example.Authentication.entity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticatedRepository extends JpaRepository<Authentication,Long>{
}