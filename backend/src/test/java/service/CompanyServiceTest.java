package service;

import model.Company;
import org.junit.jupiter.api.Test;
import repository.CompanyRepository;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CompanyServiceTest {

    CompanyRepository companyRepository = mock(CompanyRepository.class);

    CompanyService companyService = new CompanyService(companyRepository);

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