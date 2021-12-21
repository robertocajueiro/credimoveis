import { Esprodut } from './montagens/esprodut';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MontagensService {

  constructor() { }

  getEsprodut() : Esprodut {
    let esprodut: Esprodut = new Esprodut();
    esprodut.codigo = 123456;
    esprodut.vlr_montagem = 80;
    return esprodut;
  }
}
