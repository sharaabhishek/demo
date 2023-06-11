package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;

import com.example.RegisterLogin.response.LoginResponse;

public interface EmployeeServices {
 String addEmployee(EmployeeDTO employeeDTO);

 LoginResponse loginEmployee(LoginDTO loginDTO);
}
