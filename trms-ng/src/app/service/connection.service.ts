import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ConnectionService {

  url = environment.serviceUrl + environment.endpoint;
  private readonly username =  'Angelo';

   public createNewGame() {
    this.http.post(this.url,
      { user: this.username },
      {headers : {'Content-Type' : 'application/x-www-form-urlencoded; charset=UTF-8'}
    });
  }
  constructor(private http: HttpClient) { }
}
