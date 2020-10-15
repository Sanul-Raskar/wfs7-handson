import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProfileDisplayComponent } from './profile-display/profile-display.component';
import { EmpDisplayComponent } from './emp-display/emp-display.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfileDisplayComponent,
    EmpDisplayComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
