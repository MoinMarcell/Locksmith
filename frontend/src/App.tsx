import React, {useEffect, useState} from 'react';
import './App.css';
import CompanyGallery from "./components/CompanyGallery";
import {Company} from "./components/model/Company";
import {getAllCompanies} from "./components/api/api-service";

function App() {

  const [companies, setCompanies] = useState<Company[]>([])

  useEffect(() => {
    getCompanies()
  }, [])

  function getCompanies(){
    getAllCompanies
        .then(setCompanies)
        .catch(e => console.error(e))
  }

  return (
    <CompanyGallery companies={companies} />
  );
}

export default App;
