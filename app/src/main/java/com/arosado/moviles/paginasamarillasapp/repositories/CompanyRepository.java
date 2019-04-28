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
                "Supermercados",
                "Tottus Pachacutec",
                "Av Pachacutec 65, Distrito de Lima 15816",
                "5133355",
                "contacto@tottus.com.pe",
                "https://www.tottus.com.pe/tottus/home",
                "ic_tottus",
                "Es la cadena de supermercados chilenos perteneciente al grupo Falabella, con presencia en Chile con 60 locales y Perú con 70 locales."
        ));
        companies.add(new Company(
                700,
                "Educación",
                "Británico Surco",
                "Av. Caminos del Inca 3581, Santiago de Surco 15039",
                "6153434",
                "informes@britanico.edu.pe",
                "https://www.britanico.edu.pe/",
                "ic_britanico",
                "Conocida también como el \"BRITÁNICO\", es una asociación cultural binacional con fines de lucro que brinda la enseñanza del idioma inglés británico y que busca la promoción y el intercambio cultural entre el Reino Unido y el Perú."
        ));
        companies.add(new Company(
                800,
                "Retail",
                "Saga Falabella",
                "Av. Paseo de la República 3220 - San Isidro - Lima",
                "6161000",
                "contactenos@sagafalabella.com.pe",
                "https://www.falabella.com.pe/falabella-pe/",
                "ic_saga_falabella",
                "Es una tienda por departamentos chilena fundada en 1889 por una familia italiana radicada en Chile. Falabella cuenta con operaciones en Chile, Argentina, Perú, Colombia y Brasil."
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
            if(company.getCategory().equalsIgnoreCase(category)) {
                companies_category.add(company);
            }
        }
        return companies_category;
    }

}
