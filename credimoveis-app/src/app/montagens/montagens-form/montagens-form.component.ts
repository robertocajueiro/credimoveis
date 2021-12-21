import { Component, OnInit } from '@angular/core';

import { Esprodut } from '../esprodut';

@Component({
  selector: 'app-montagens-form',
  templateUrl: './montagens-form.component.html',
  styleUrls: ['./montagens-form.component.css']
})
export class MontagensFormComponent implements OnInit {

  esprodut: Esprodut;
  nome: string = 'Roberto'

  constructor() {
    this.esprodut = new Esprodut();
    this.esprodut.descr = 'Moveis';
  }

  ngOnInit(): void {
  }

  clicar(){
    window.alert('Cliquei Galera!!!')
  }

}
