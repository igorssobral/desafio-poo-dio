package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Mentoria extends Conteudo{

    private String nomeProfessor;
    private LocalDate data;
    private String horario;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, String nomeProfessor, LocalDate data, String horario) {
        super(titulo, descricao);
        this.nomeProfessor = nomeProfessor;
        this.data = data;
        this.horario = horario;
    }
}
