import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MontagensComponent } from './montagens.component';

describe('MontagensComponent', () => {
  let component: MontagensComponent;
  let fixture: ComponentFixture<MontagensComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MontagensComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MontagensComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
