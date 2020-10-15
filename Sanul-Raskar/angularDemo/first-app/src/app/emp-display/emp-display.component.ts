import { Component } from '@angular/core';
import { EMP_ARRAY } from '../mock'

@Component({
  selector: 'app-emp-display',
  templateUrl: './emp-display.component.html',
  styleUrls: ['./emp-display.component.css']
})
export class EmpDisplayComponent {

  empData: any = null;

  constructor() {
    this.empData = EMP_ARRAY;
  }
}
