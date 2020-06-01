import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit {
    postId;
    errorMessage;
    title = 'trms-ng';
    constructor(private http: HttpClient) { }

    ngOnInit() {
      const headers = { 'Authorization': 'Bearer my-token', 'My-Custom-Header': 'foobar' };
      this.http.post<Article>('https://reqres.in/api/users', { name: 'Jason'}, { headers }).subscribe({
        next: data => this.postId = data.name,
        error: error => console.error('An error occured!', error)
      });
    }
}

interface Article {
  id: number;
  name: string;
}
