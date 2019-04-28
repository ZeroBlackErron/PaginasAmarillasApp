package com.arosado.moviles.paginasamarillasapp.repositories;

import com.arosado.moviles.paginasamarillasapp.models.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyRepository {
    private static List<Company> companies = new ArrayList<>();
    private static List<Company> companies_category;

    static {
        companies.add(new Company(
                100,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                200,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                300,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                400,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                500,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                600,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                700,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                800,
                "Restaurantes",
                "La Casa del Tacu Tacu",
                "Jr. Pelotillehue 53-48 Int 84",
                "012242625",
                "informes@lacasadeltacutacu.com",
                "www.lacasadeltacutacu.com",
                "ic_company1",
                "Déjese cautivar por el mejor sabor criollo…"
        ));
        companies.add(new Company(
                900,
                "Petroleros",
                "Petroperú",
                "Av. Enrique Canaval Moreyra 150, Lima 27 - Perú",
                "6145000",
                "webmaster@petroperu.com.pe",
                "https://www.petroperu.com.pe/",
                "ic_petroperu",
                "Es una empresa estatal peruana dedicada al transporte, refinación, distribución y comercialización de combustibles y otros productos derivados del petróleo, que es perteneciente al Estado peruano, desde 1969."
        ));
        companies.add(new Company(
                1000,
                "Supermercados",
                "Plaza Vea Guardia Civil",
                "Av. Guardia Civi. No. 927 Urb. La Campiña",
                "6125163",
                "plazaveaonline@spsa.com.pe",
                "https://www.plazavea.com.pe/",
                "ic_plaza_vea",
                "Es una cadena de supermercados que forma parte del conglomerado peruano Intercorp, el cual también integra a los supermercados Vivanda. "
        ));
    }

    public static List<Company> getCompanies() {
        return companies;
    }

    public static Company getCompanyById(Integer id) {
        for (Company company: companies) {
            if(company.getId() == id) {
                return company;
            }
        }
        return  null;
    }

    public static List<Company> filterCompaniesByCategory(String category) {
        companies_category = new ArrayList<>();
        for (Company company : companies) {
            if(company.getCategory().equals(category)) {
                companies_category.add(company);
            }
        }
        return companies_category;
    }

}
