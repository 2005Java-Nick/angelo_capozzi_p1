import { Component, OnInit } from '@angular/core';
import { Employee } from '../../types/employee';
import { EmployeeService } from '../../service/employee.service';


@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employee: Employee;

  constructor(private employeeService: EmployeeService) {
    setInterval(() => {
      this.employee = this.employeeService.getEmployee();
    }, 500);
   }

  ngOnInit(): void {
  }

}
