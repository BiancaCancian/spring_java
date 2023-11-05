package com.unip.universidade.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class AlunoService {
    private List<aluno> listaDeAlunos;

    public AlunoService() {
        listaDeAlunos = new ArrayList<>();
        // Vamos popular a lista com alguns exemplos de alunos
        listaDeAlunos.add(new aluno(1, "João", new Date()));
        listaDeAlunos.add(new aluno(2, "Maria", new Date()));
        listaDeAlunos.add(new aluno(3, "Pedro", new Date()));
    }

    public List<aluno> listarAlunos() {
        return listaDeAlunos;
    }
}

