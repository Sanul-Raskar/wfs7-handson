import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';


@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  name: string = undefined;
  constructor(private _activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this._activatedRoute.parent.params.subscribe((p: Params) => {
      this.name = p.username;
    });
  }

}
