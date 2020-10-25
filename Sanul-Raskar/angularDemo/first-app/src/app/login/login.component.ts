import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username = undefined;
  password = undefined;
  constructor(private _router : Router) {
    console.log("login component loaded")
  }
  
  handleSubmit(formValues : any) {
    let user = formValues.user;
    let pass = formValues.pass;
    if(pass == '1234') {
      this._router.navigate(["/success", user]);
    } else {
      this.username = undefined;
      this.password = undefined;
      this._router.navigate(["/login"]);
    }
  }

}
