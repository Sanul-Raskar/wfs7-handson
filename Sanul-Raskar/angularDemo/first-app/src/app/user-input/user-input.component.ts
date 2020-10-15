import { Component } from '@angular/core';

@Component({
  selector: 'app-user-input',
  templateUrl: './user-input.component.html',
  styleUrls: ['./user-input.component.css']
})
export class UserInputComponent{

  username  = undefined;
  password = undefined;

  handleButton(u, p) {
    this.username = u;
    this.password = p;
    console.log('handleButton() called');
  }

}
