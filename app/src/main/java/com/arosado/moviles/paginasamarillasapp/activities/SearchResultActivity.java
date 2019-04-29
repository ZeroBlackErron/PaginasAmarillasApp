package com.arosado.moviles.paginasamarillasapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        CompaniesAdapter adapter = new CompaniesAdapter(this);
        adapter.setCompanies(companies);

        recyclerView.setAdapter(adapter);
    }
}
