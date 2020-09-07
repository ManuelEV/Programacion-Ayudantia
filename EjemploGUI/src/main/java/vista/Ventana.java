package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    private final int cantidadCasillas;
    private JButton botonReset;

    private PanelCasillas panelCasillas;

    public Ventana(int cantidadCasillas){
        this.cantidadCasillas = cantidadCasillas;
        this.inizializar();
    }

    private void inizializar(){
        this.panelCasillas = new PanelCasillas(this.cantidadCasillas);

        this.setTitle("Buscaminas Lowcost");
        this.setSize(750, 550);


        this.add(this.panelCasillas, BorderLayout.NORTH);

        this.botonReset = new JButton("Resetear el tablero");
        this.botonReset.setBackground(Color.ORANGE);
        this.botonReset.addActionListener(this);
        this.add(botonReset);

        this.setVisible(true);
        this.setLocation(420, 100);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.botonReset == ae.getSource()){
            this.panelCasillas.resetCasillas();
        }
    }
}
