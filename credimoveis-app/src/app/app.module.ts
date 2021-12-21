import { MontagensService } from './montagens.service';
import { MontagensModule } from './montagens/montagens.module';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemplateModule } from './template/template.module';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    TemplateModule,
    MontagensModule
  ],
  providers: [
    MontagensService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
