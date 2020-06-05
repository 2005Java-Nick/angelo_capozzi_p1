import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../../service/authentication.service';
import { EmployeeService } from '../../service/employee.service';
import { EmployeeComponent } from '../employee/employee.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password: string;

  constructor(private authentication: AuthenticationService, private employeeService: EmployeeService) { }

  ngOnInit(): void {
  }

  login(){
    console.log('Login complete!')
  }
}
