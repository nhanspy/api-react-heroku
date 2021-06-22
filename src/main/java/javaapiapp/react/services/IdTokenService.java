package javaapiapp.react.services;

import javaapiapp.react.entities.IdToken;
import javaapiapp.react.repositories.IdTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdTokenService {
    @Autowired
    IdTokenRepository repository;

    public IdToken save(IdToken idToken) {
        return repository.save(idToken);
    }

    public IdToken get(int id) {
        return repository.findById(id).get();
    }

    public int delete(int id) {
        repository.deleteById(id);
        return 1;
    }

    public List<IdToken> getAll() {
        return repository.findAll();
    }
}
