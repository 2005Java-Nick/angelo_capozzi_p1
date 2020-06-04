import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EventTypes } from '../../models/event-types.model';
import { GradeFormats } from '../../models/grade-formats.models';
@Component({
  selector: 'app-event-form',
  templateUrl: './event-form.component.html',
  styleUrls: ['./event-form.component.css']
})
export class EventFormComponent implements OnInit {

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

  saveEventType(eventForm: NgForm): void {
    console.log(eventForm.value);
  }

  saveGradeFormat(gradeFormat: NgForm): void {
    console.log(gradeFormat.value)
  }

}
