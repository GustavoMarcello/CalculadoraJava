package com.fatecpoojava.prjrCalculadoraBasica.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCalculadora {
    private JPanel painelCalculadora;
    private JTextField textValor1;
    private JTextField textValor2;
    private JLabel Valor1;
    private JLabel Valor2;
    private JButton cmdSomar;
    private JButton cmdSubtrair;
    private JButton cmdMultiplicar;
    private JButton cmdDividir;
    private JTextField textResultado;

    public JTextField getTextValor1() {
        return textValor1;
    }

    public JTextField getTextValor2() {
        return textValor2;
    }

    public JLabel getValor1() {
        return Valor1;
    }

    public JLabel getValor2() {
        return Valor2;
    }

    public JTextField getTextResultado() {
        return textResultado;
    }

    public JPanel getPainelCalculadora() {
        return painelCalculadora;
    }

    public TelaCalculadora() {
        cmdSomar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Double numero1 = Double.parseDouble(textValor1.getText());
                    Double numero2 = Double.parseDouble(textValor2.getText());
                    Double resultado = numero1 + numero2;
                    textResultado.setText(resultado.toString());
                } catch (NumberFormatException ex) {
                    textResultado.setText("Formato de número inválido");
                }catch (Exception ex){
                    textResultado.setText("Erro " + ex.getMessage());
                }
            }
        });
        cmdSubtrair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Double numero1 = Double.parseDouble(textValor1.getText());
                    Double numero2 = Double.parseDouble(textValor2.getText());
                    Double resultado = numero1 - numero2;
                    textResultado.setText(resultado.toString());
                } catch (NumberFormatException ex) {
                    textResultado.setText("Formato de número inválido");
                }catch (Exception ex){
                    textResultado.setText("Erro " + ex.getMessage());
                }
            }
        });
        cmdMultiplicar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Double numero1 = Double.parseDouble(textValor1.getText());
                    Double numero2 = Double.parseDouble(textValor2.getText());
                    Double resultado = numero1 * numero2;
                    textResultado.setText(resultado.toString());
                }catch (NumberFormatException ex){
                    textResultado.setText("Formato de número inválido");
                }catch (Exception ex){
                    textResultado.setText("Erro " + ex.getMessage());
                }
            }
        });
        cmdDividir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Double numero1 = Double.parseDouble(textValor1.getText());
                    Double numero2 = Double.parseDouble(textValor2.getText());
                    Double resultado = numero1 / numero2;
                    textResultado.setText(resultado.toString());
                } catch (NumberFormatException ex){
                    textResultado.setText("Formato de número inválido");
                } catch (Exception ex){
                    textResultado.setText("Erro " + ex.getMessage());
                }
            }
        });
    }
}
