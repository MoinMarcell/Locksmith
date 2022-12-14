package service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IdService {
    public String generateUuid(){
        return UUID.randomUUID().toString();
    }
}
