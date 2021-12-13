import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
//import { MontagensComponent } from './montagens/montagens.component'

import { MontagensModule } from './montagens/montagens.module'

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent
   // MontagensComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MontagensModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
