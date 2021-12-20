import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MontagensRoutingModule } from './montagens-routing.module';
import { MontagensFormComponent } from './montagens-form/montagens-form.component';


@NgModule({
  declarations: [
    MontagensFormComponent
  ],
  imports: [
    CommonModule,
    MontagensRoutingModule
  ], exports: [
    MontagensFormComponent
  ]
})
export class MontagensModule { }
