import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input()
  childName = undefined;
  counter: number = 0;
  likeCounter: number = 0;
  dislikeCounter: number = 0;

  @Output()
  counterEvent: EventEmitter<number> = new EventEmitter<number>();

  @Output()
  likeCounterEvent: EventEmitter<number> = new EventEmitter<number>();

  @Output()
  dislikeCounterEvent: EventEmitter<number> = new EventEmitter<number>();

  incrementCounter() {
    this.counter++;
    this.counterEvent.emit(this.counter);
  }

  likeButton() {
    this.likeCounter++;
    this.likeCounterEvent.emit(this.likeCounter);
  }

  dislikebutton() {
    this.dislikeCounter++;
    this.dislikeCounterEvent.emit(this.dislikeCounter);
  }
}
