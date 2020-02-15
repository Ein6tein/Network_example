package com.example.networkexample.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.networkexample.network.EmployeeRepository;

public class MyViewModel extends ViewModel {

    private EmployeeRepository mRepository;

    public MyViewModel(EmployeeRepository repository) {
        mRepository = repository;
    }
}
