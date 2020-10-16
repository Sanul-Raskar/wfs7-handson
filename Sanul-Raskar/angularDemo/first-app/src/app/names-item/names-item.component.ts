import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-names-item',
  templateUrl: './names-item.component.html',
  styleUrls: ['./names-item.component.css']
})
export class NamesItemComponent  {

  @Input()
  username = "Zaheer";
}
