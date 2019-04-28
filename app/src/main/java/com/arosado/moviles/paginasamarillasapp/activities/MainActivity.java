package com.arosado.moviles.paginasamarillasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.arosado.moviles.paginasamarillasapp.adapters.CompaniesAdapter;
import com.arosado.moviles.paginasamarillasapp.adapters.ListViewAdapter;
import com.arosado.moviles.paginasamarillasapp.NombresAnimales;
import com.arosado.moviles.paginasamarillasapp.R;
import com.arosado.moviles.paginasamarillasapp.models.Company;
import com.arosado.moviles.paginasamarillasapp.repositories.CompanyRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText categoryEditText;
    private Button searchButton;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryEditText = findViewById(R.id.category_input);
        searchButton = findViewById(R.id.search_button);
        recyclerView = findViewById(R.id.publicationList);

        /*recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Company> companies = CompanyRepository.getCompanies();

        CompaniesAdapter adapter = new CompaniesAdapter(this);
        adapter.setCompanies(companies);

        recyclerView.setAdapter(adapter);*/
    }

    public void search(View view) {
        String category = categoryEditText.getText().toString().trim();

        if(!category.isEmpty()) {
            Intent intent = new Intent(this, SearchResultActivity.class);

            intent.putExtra("category", category);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Ingrese una categoría", Toast.LENGTH_SHORT).show();
        }

    }

}
