import { Component, } from '@angular/core';
import AppServiceService from '../app-service.service'

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent {

  constructor(private service: AppServiceService) { }

  message = undefined;
  userId = undefined;
  name = undefined;
  dob = undefined;

  handleStore(formValue: any) { // a formValue would be a ngForm with 3 inputs
    this.service.storeUser(formValue).subscribe((response: any) => {
      this.message = "Stored Successfully " + response.name + " detail"
    });
  }

}
