import axios from "axios";

const path = "/api/companies"

export const getAllCompanies = axios.get(path).then(response => response.data)