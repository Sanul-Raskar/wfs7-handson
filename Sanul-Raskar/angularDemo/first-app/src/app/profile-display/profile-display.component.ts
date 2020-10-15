import { Component, OnInit } from '@angular/core';
import { USR_ARRAY } from '../mock'


@Component({
  selector: 'app-profile-display',
  templateUrl: './profile-display.component.html',
  styleUrls: ['./profile-display.component.css']
})
export class ProfileDisplayComponent {
  userProfile: any = null;
  salary: number = null;
  constructor() {
    this.userProfile = USR_ARRAY;
    this.salary = 2500;
  }

}
