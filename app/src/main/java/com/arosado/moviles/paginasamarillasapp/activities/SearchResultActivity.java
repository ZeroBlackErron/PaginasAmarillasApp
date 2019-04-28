package com.arosado.moviles.paginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.arosado.moviles.paginasamarillasapp.R;
import com.arosado.moviles.paginasamarillasapp.adapters.CompaniesAdapter;
import com.arosado.moviles.paginasamarillasapp.models.Company;
import com.arosado.moviles.paginasamarillasapp.repositories.CompanyRepository;

import java.util.List;

public class SearchResultActivity extends AppCompatActivity {

    private String category;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        recyclerView = findViewById(R.id.publicationList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        this.category = getIntent().getExtras().getString("category");
        List<Company> companies = CompanyRepository.filterCompaniesByCategory(category);

        //List<Company> companies = CompanyRepository.getCompanies();

        CompaniesAdapter adapter = new CompaniesAdapter(this);
        adapter.setCompanies(companies);

        recyclerView.setAdapter(adapter);
    }
}
