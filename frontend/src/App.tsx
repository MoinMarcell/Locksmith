import CompanyGallery from "./components/CompanyGallery";
import useCompanies from "./components/hooks/useCompanies";

function App() {

  const {companies} = useCompanies()

  return (
    <CompanyGallery companies={companies} />
  );
}

export default App;
