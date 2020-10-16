import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NamesItemComponent } from './names-item.component';

describe('NamesItemComponent', () => {
  let component: NamesItemComponent;
  let fixture: ComponentFixture<NamesItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NamesItemComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NamesItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
