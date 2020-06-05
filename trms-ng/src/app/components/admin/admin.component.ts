import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
//import { FormsModule } from '@angular/core';
import { EventTypes } from '../../models/event-types.model';
import { GradeFormats } from '../../models/grade-formats.models';
@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  events: EventTypes[] = [
    { id: 1, name: 'Certification'},
    { id: 2, name: 'Certification Prep Classes'},
    { id: 3, name: 'College Classes'},
    { id: 4, name: 'Technical Training'}
  ];

  grades: GradeFormats[] = [
    { id: 1, format: '80% to Pass'},
    { id: 2, format: '70% to Pass'},
    { id: 3, format: '60% to Pass'},
    { id: 4, format: '50% to Pass'}
  ];
  constructor() { }

  ngOnInit(): void {
  }

  approve(){
    console.log('Approved!');
    //change for status to Approved
  }

  reject(){
    console.log('Application Rejected, please file for resubmition');
    //change for status to rejected
  }

}
