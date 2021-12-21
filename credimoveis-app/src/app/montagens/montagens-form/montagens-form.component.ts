import { Component, OnInit } from '@angular/core';

import { Esprodut } from '../esprodut';
import { MontagensService } from '../../montagens.service'

@Component({
  selector: 'app-montagens-form',
  templateUrl: './montagens-form.component.html',
  styleUrls: ['./montagens-form.component.css']
})
export class MontagensFormComponent implements OnInit {

  esprodut!: Esprodut;

  constructor( private service: MontagensService) {
    this.esprodut = new Esprodut();
  }

  ngOnInit(): void {
  }

onSubmit(){
  this.service
    .salvar(this.esprodut)
    .subscribe( response => {
      console.log(response)
    })
}

}
