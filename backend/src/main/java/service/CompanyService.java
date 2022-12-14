package service;

import model.Company;
import org.springframework.stereotype.Service;
import repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyService {

    CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
}
