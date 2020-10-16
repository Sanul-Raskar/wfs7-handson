import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

  parentName = "Alexandar";
  names = ["Alex", "Bruce", "Chandler", "David"];
  childCounter: number = undefined;
  likes: number = undefined;
  dislikes: number = undefined;
}
