import {Company} from "./model/Company";
import CompanyCard from "./CompanyCard";
const short = require('short-uuid');

type CompanyGalleryProps = {
    companies: Company[]
}

export default function CompanyGallery(props: CompanyGalleryProps){
    const companyCard = props.companies.map(company => {
        return(
            <CompanyCard company={company} key={short.generate()} />
        )
    })

    return(
        <section>
            {companyCard}
        </section>
    )
}