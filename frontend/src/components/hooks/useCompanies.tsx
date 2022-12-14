import {useEffect, useState} from "react";
import {getAllCompanies} from "../api/api-service";
import {Company} from "../model/Company";

export default function useCompanies(){
    const [companies, setCompanies] = useState<Company[]>([])

    useEffect(() => {
        getCompanies()
    }, [])

    function getCompanies(){
        getAllCompanies
            .then(setCompanies)
            .catch(e => console.error(e))
    }

    return {companies}
}