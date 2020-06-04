import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { EventFormComponent } from './components/event-form/event-form.component';
import { ContactComponent } from './components/contact/contact.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { AboutComponent } from './components/about/about.component';
import { EmailComponent } from './components/email/email.component';

export const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'eventform', component: EventFormComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'register', component: RegistrationComponent},
  { path: 'about', component: AboutComponent},
  { path: 'email', component: EmailComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full'}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
