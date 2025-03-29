package com.examplefourthjuly.movieapp.Activity;


import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.examplefourthjuly.movieapp.Adapter.FilmListAdapter;
import com.examplefourthjuly.movieapp.Domain.ListFilm;
import com.examplefourthjuly.movieapp.R;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterNewMovies, adapterUpComing;
    private RecyclerView recyclerViewNewMovies,recyclerViewUpComing;
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest,mStringRequest2;
    private ProgressBar loading1,loading2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRequestQueue= Volley.newRequestQueue(this);
        initView();
        sendRequst1();
        sendRequst2();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void sendRequst1() {
        mRequestQueue= Volley.newRequestQueue(this);
        loading1.setVisibility(View.VISIBLE);
        mStringRequest= new StringRequest(Request.Method.GET,"https://moviesapi.ir/api/v1/movies?page=1",new Response.Listener<String>(){

            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                loading1.setVisibility(View.GONE);
                ListFilm items=gson.fromJson(response,ListFilm.class);
                adapterNewMovies=new FilmListAdapter(items);
                recyclerViewNewMovies.setAdapter(adapterNewMovies);
            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                loading1.setVisibility(View.GONE);
                Log.e("uilover","sendRequest1:"+error.toString());
            }
        });
        mRequestQueue.add(mStringRequest);
    }

    private void sendRequst2() {
        loading2.setVisibility(View.VISIBLE);
        mStringRequest2= new StringRequest(Request.Method.GET,"https://moviesapi.ir/api/v1/movies?page=3",new Response.Listener<String>(){

            @Override
            public void onResponse(String response) {
                try {
                    Gson gson = new Gson();
                    ListFilm items = gson.fromJson(response, ListFilm.class);
                    if (items != null && items.getData() != null) {
                        adapterUpComing = new FilmListAdapter(items);
                        recyclerViewNewMovies.setAdapter(adapterNewMovies);
                    } else {
                        Log.e("MainActivity", "Empty or invalid response");
                        Toast.makeText(MainActivity.this, "No data available", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e) {
                    Log.e("MainActivity", "Error parsing response: " + e.getMessage());
                    Toast.makeText(MainActivity.this, "Error loading data", Toast.LENGTH_SHORT).show();
                }
                finally{
                    loading2.setVisibility(View.GONE);
                }
            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                loading2.setVisibility(View.GONE);
            }
        });
        mRequestQueue.add(mStringRequest2);
    }

    private void initView(){
        recyclerViewNewMovies=findViewById(R.id.view1);
        recyclerViewNewMovies.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerViewUpComing=findViewById(R.id.view2);
        recyclerViewUpComing.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        loading1=findViewById(R.id.loading1);
        loading2=findViewById(R.id.loading2);
    }
}