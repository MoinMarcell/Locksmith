import {Address} from "./Address";
import {Product} from "./Product";
import {User} from "./User";

export type Company = {
    name: string,
    employees: User[],
    email: string,
    phoneNumber: string,
    customers: User[],
    products: Product[],
    address: Address
}
