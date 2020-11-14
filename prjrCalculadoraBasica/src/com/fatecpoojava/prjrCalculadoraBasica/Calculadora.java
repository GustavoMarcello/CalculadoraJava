package com.fatecpoojava.prjrCalculadoraBasica;

import com.fatecpoojava.prjrCalculadoraBasica.view.TelaCalculadora;

import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {
	// chamando a janela da calculadora
        JFrame tela = new JFrame();
        tela.setContentPane(new TelaCalculadora().getPainelCalculadora());
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
