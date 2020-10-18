import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { HttpClientModule} from '@angular/common/http'

import { AppComponent } from './app.component';
import { ProfileDisplayComponent } from './profile-display/profile-display.component';
import { EmpDisplayComponent } from './emp-display/emp-display.component';
import { UserInputComponent } from './user-input/user-input.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { NamesItemComponent } from './names-item/names-item.component';
import { UserRegisterComponent } from './user-register/user-register.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfileDisplayComponent,
    EmpDisplayComponent,
    UserInputComponent,
    ParentComponent,
    ChildComponent,
    NamesItemComponent,
    UserRegisterComponent
  ],
  imports: [
    BrowserModule,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
