import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../funcionario'
import { FuncionarioService } from '../funcionario.service'

@Component({
  selector: 'app-funcionario-list',
  templateUrl: './funcionario-list.component.html',
  styleUrls: ['./funcionario-list.component.css']
})
export class FuncionarioListComponent implements OnInit {

  funcionarios:Funcionario[];

  constructor(private funcionarioService: FuncionarioService) { }

  ngOnInit(): void {


  }
  }


