package service;

import com.github.moinmarcell.backend.service.IdService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class IdServiceTest {

    IdService idService = new IdService();

    @Test
    void when_id_is_generated_than_should_not_return_empty_string() {
        // When
        String actual = idService.generateUuid();
        // Then
        assertNotNull(actual);
    }
}
