import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MontagensFormComponent } from './montagens-form/montagens-form.component'

const routes: Routes = [
  { path: 'montagens-form', component: MontagensFormComponent }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MontagensRoutingModule { }
