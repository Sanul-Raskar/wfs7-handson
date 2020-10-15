import { Component } from '@angular/core';
import { USER } from './mock'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  user = USER;
}
