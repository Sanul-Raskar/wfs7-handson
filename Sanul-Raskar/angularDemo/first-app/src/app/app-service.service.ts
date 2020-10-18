import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export default class AppServiceService {
  // webservice base url
  baseUrl: string = "http://localhost:9090"
  constructor(private http: HttpClient) { }

  login(username: string, password: string): void {

  }
  fetchUsers(): Observable<any> {
    let fetchUsersUrl = `${this.baseUrl}/users`;
    return this.http.get(fetchUsersUrl);
  }

  storeUser(user : any) : Observable<any> {
    let storeUrl = `${this.baseUrl}/store`
    return this.http.post(storeUrl, user);
  }
}