package com.example.networkexample.api;

import com.google.gson.JsonElement;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface EmployeeApi {

    @GET("/employee")
    Observable<JsonElement> getEmployees();
}
