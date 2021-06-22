package javaapiapp.react.controllers;

import javaapiapp.react.entities.IdToken;
import javaapiapp.react.services.IdTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class IdTokenController {
    @Autowired
    IdTokenService service;

    @GetMapping("/idtoken")
    public List<IdToken> tatCa(){
        return service.getAll();
    }

    @GetMapping("/idtoken/{id}")
    public IdToken layTheoId(@PathVariable(name = "id") int id){
        return service.get(id);
    }

    @PostMapping("/idtoken")
    public IdToken luu(@RequestBody IdToken token){
        return service.save(token);
    }

    @DeleteMapping("/idtoken/{id}")
    public int xoaTheoId(@PathVariable(name = "id")int id){
        return service.delete(id);
    }
}
