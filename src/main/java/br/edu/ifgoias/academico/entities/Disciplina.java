package br.edu.ifgoias.academico.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddisciplina;

    @Column(name = "nomedisciplina", nullable = false)
    private String nomedisciplina;

    @Column(name = "cargahoraria", nullable = false)
    private Integer cargahoraria;

    public Disciplina() {
    }

    public Disciplina(Integer iddisciplina, String nomedisciplina, Integer cargahoraria) {
        this.iddisciplina = iddisciplina;
        this.nomedisciplina = nomedisciplina;
        this.cargahoraria = cargahoraria;
    }

    public Integer getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(Integer iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    public String getNomedisciplina() {
        return nomedisciplina;
    }

    public void setNomedisciplina(String nomedisciplina) {
        this.nomedisciplina = nomedisciplina;
    }

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(iddisciplina, that.iddisciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iddisciplina);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "iddisciplina=" + iddisciplina +
                ", nomedisciplina='" + nomedisciplina + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
