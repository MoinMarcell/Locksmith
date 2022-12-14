package service;

import com.github.moinmarcell.backend.model.Company;
import com.github.moinmarcell.backend.service.CompanyService;
import com.github.moinmarcell.backend.service.IdService;
import org.junit.jupiter.api.Test;
import com.github.moinmarcell.backend.repository.CompanyRepository;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CompanyServiceTest {

    CompanyRepository companyRepository = mock(CompanyRepository.class);
    IdService idServiceTest = mock(IdService.class);

    CompanyService companyService = new CompanyService(companyRepository, idServiceTest);

    @Test
    void getAllCompanies() {
        //GIVEN
        List<Company> expected = Collections.emptyList();
        //WHEN
        when(companyRepository.findAll()).thenReturn(expected);
        List<Company> actual = companyService.getAllCompanies();
        //THEN
        assertEquals(expected, actual);
        verify(companyRepository).findAll();
    }
}