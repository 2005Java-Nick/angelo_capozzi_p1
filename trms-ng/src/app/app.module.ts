import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { LoginComponent } from './components/login/login.component';
import { FooterComponent } from './components/footer/footer.component';
import { EventFormComponent } from './components/event-form/event-form.component';
import { AdminComponent } from './components/admin/admin.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './components/home/home.component';
import { ContactComponent } from './components/contact/contact.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { AboutComponent } from './components/about/about.component';
import { EmailComponent } from './components/email/email.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { AuthInterceptor } from './AuthInterceptor';


@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginComponent,
    FooterComponent,
    EventFormComponent,
    AdminComponent,
    HomeComponent,
    ContactComponent,
    RegistrationComponent,
    AboutComponent,
    EmailComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [AuthInterceptor],
  bootstrap: [AppComponent]
})
export class AppModule { }
