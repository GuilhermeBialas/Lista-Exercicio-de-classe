package Filme;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme Bialas
 */
public class Exercicio01Lista08 {

    private String titulo, tituloOriginal, diretor, idioma, classificacao, genero;
    private short anoLancamento;
    private int espectradores;
    private double valorFaturamento, valorOrcamento, mediaPreco;
    private LocalDate datLancamentoBrasil;

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }
    public void setAnoLancamento(short anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public short getAnoLancamento() {
        return anoLancamento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public LocalDate getDatLancamentoBrasil() {
        return datLancamentoBrasil;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getEspectradores() {
        return espectradores;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public double getMediaPreco() {
        return mediaPreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public double getValorFaturamento() {
        return valorFaturamento;
    }

    public double getValorOrcamento() {
        return valorOrcamento;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setDatLancamentoBrasil(LocalDate datLancamentoBrasil) {
        this.datLancamentoBrasil = datLancamentoBrasil;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setEspectradores(int espectradores) {
        this.espectradores = espectradores;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setMediaPreco(double mediaPreco) {
        this.mediaPreco = mediaPreco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setValorFaturamento(double valorFaturamento) {
        this.valorFaturamento = valorFaturamento;
    }

    public void setValorOrcamento(double valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    
    
    
}
