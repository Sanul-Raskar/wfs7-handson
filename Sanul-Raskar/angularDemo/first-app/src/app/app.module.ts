import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { ProfileDisplayComponent } from './profile-display/profile-display.component';
import { EmpDisplayComponent } from './emp-display/emp-display.component';
import { UserInputComponent } from './user-input/user-input.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { NamesItemComponent } from './names-item/names-item.component';
import { UserRegisterComponent } from './user-register/user-register.component';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UpdateComponent } from './update/update.component';
import { SuccessComponent } from './success/success.component';
import { DeleteComponent } from './delete/delete.component';

const routes: Routes = [
  { path: "", component: LoginComponent },
  { path: "register", component: UserRegisterComponent },
  { path: "profileDisplay", component: ProfileDisplayComponent },
  { path: "login", component: LoginComponent },
  { path: "parentChild", component: ParentComponent },
  {
    path: "success/:username", component: SuccessComponent, children: [
      { path: "", component: DashboardComponent },
      { path: "dashboard", component: DashboardComponent },
      { path: "update", component: UpdateComponent },
      { path: "delete", component: DeleteComponent }
    ]
  }
];

@NgModule({
  declarations: [
    AppComponent,
    ProfileDisplayComponent,
    EmpDisplayComponent,
    UserInputComponent,
    ParentComponent,
    ChildComponent,
    NamesItemComponent,
    UserRegisterComponent,
    LoginComponent,
    DashboardComponent,
    UpdateComponent,
    SuccessComponent,
    DeleteComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule, RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
