/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filme;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme Bialas
 */
public class Exercicio02Lista08 {

    private String nome, marca, descricao, modelo;
    private double preco;
    private short codigo;
    private int codigoDeBarras;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }
}
