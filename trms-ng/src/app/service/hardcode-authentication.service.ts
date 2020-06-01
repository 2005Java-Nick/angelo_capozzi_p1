import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodeAuthenticationService {

  constructor() { }

  authenticate(username, password){
    if (username === 'Angelo' && password === 'Jello') {
      return true;
    }

    return false;
  }
}
