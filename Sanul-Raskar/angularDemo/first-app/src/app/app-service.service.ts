import { Injectable } from '@angular/core';
import { USR_ARRAY } from './mock'

@Injectable({
  providedIn: 'root'
})
export default class AppServiceService {

  constructor() { }

  login(username: string, password: string) {
    if (username === 'Alex') {
      console.log("login success");
    } else {
      console.log("login failed");
    }

  }

  fetchUsers() {
    return USR_ARRAY;
  }
}
