import {Company} from "./Company";

export type User = {
    firstname: string,
    lastname: string,
    username: string,
    password: string,
    email: string,
    companies: Company[]
}