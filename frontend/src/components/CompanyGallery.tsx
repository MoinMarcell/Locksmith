import {Company} from "./model/Company";
import CompanyCard from "./CompanyCard";

type CompanyGalleryProps = {
    companies: Company[]
}

export default function CompanyGallery(props: CompanyGalleryProps){
    const companyCard = props.companies.map(company => {
        return(
            <CompanyCard company={company} />
        )
    })

    return(
        <section>
            {companyCard}
        </section>
    )
}