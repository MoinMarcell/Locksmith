package com.github.moinmarcell.backend.controller;

import com.github.moinmarcell.backend.model.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.moinmarcell.backend.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping("api/companies")
public class CompanyController {

    CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAllCompanies(){
        return this.companyService.getAllCompanies();
    }

}
