import { Esprodut } from './montagens/esprodut';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MontagensService {

  constructor( private http: HttpClient) {

  }

  salvar( esprodut: Esprodut) : Observable<Esprodut> {
    return this.http.post<Esprodut>('http://localhost:8080/api/esprodut' , esprodut);

  }

  getEsprodut() : Esprodut {
    let esprodut: Esprodut = new Esprodut();
    esprodut.codigo = 123456;
    esprodut.vlr_montagem = 80;
    return esprodut;
  }
}
