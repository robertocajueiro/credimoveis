import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {  MontagensComponent} from './montagens.component'


@NgModule({
  declarations: [
    MontagensComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    MontagensComponent
  ]
})
export class MontagensModule { }
