import { Component, OnInit } from '@angular/core';

import { Esprodut } from '../esprodut';

@Component({
  selector: 'app-montagens-form',
  templateUrl: './montagens-form.component.html',
  styleUrls: ['./montagens-form.component.css']
})
export class MontagensFormComponent implements OnInit {

  esprodut: Esprodut;

  constructor() {
    this.esprodut = new Esprodut();
  }

  ngOnInit(): void {
  }

  clicar(){
    console.log(this.esprodut)
  }

}
