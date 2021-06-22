package javaapiapp.react.repositories;

import javaapiapp.react.entities.IdToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdTokenRepository extends JpaRepository<IdToken, Integer> {
    
}
