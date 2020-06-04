import { Injectable } from '@angular/core';
import { Employee } from '../types/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  selectedEmployee: Employee;

  setEmployee(employee: Employee): void {
    this.selectedEmployee = employee;
  }

  getEmployee(): Employee {
    return this.selectedEmployee;
  }
  constructor() { }
}
