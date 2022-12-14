import {Company} from "./model/Company";
const short = require('short-uuid');

type CompanyCardProps = {
    company: Company
}

export default function CompanyCard(props: CompanyCardProps){
    return(
        <div>
            <h1>{props.company.name}</h1>
            <ul>
                {props.company.employees.map(employee => {
                    return(
                        <li key={short.generate()}>{employee.firstname}</li>
                    )
                })}
            </ul>
            <p>{props.company.email}</p>
            <p>{props.company.phoneNumber}</p>
            <ul>
                {props.company.customers.map(customer => {
                    return(
                        <li key={short.generate()}>{customer.firstname}</li>
                    )
                })}
            </ul>
            <ul>
                {props.company.products.map(product => {
                    return(
                        <li key={short.generate()}>{product.name}</li>
                    )
                })}
            </ul>
            <p>{props.company.address.street}</p>
            <p>{props.company.address.zipcode}</p>
            <p>{props.company.address.residence}</p>
        </div>
    )
}