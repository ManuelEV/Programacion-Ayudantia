package vista;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelCasillas extends JPanel implements ActionListener {

    private final int cantidadCasillas;
    private ArrayList<JButton> botonesCasillas;
    private boolean bombas[];

    public PanelCasillas(int cantidadCasillas){
        this.cantidadCasillas = cantidadCasillas;
        this.inicializar();
    }

    private void inicializar(){
        this.botonesCasillas = new ArrayList<>();
        this.setBorder(BorderFactory.createTitledBorder("Casillas"));

        this.setLayout(new GridLayout(10, 25));

        this.bombas = new boolean[this.cantidadCasillas];

        this.inicializarBombas();

        for (int i=0; i<this.cantidadCasillas; i++){
            JButton botonCasilla = new JButton("-");
            botonCasilla.setForeground(Color.BLACK);
            botonCasilla.setBackground(Color.WHITE);
            this.botonesCasillas.add(botonCasilla);
            this.botonesCasillas.get(i).addActionListener(this);
            this.add(this.botonesCasillas.get(i));

        }


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        for (JButton botonCasilla: this.botonesCasillas){
            if(botonCasilla == ae.getSource()){
                int indice = this.botonesCasillas.indexOf(botonCasilla);
                if(bombas[indice]){
                    botonCasilla.setBackground(Color.RED);
                }else{
                    botonCasilla.setBackground(Color.GREEN);
                }
            }
        }
    }

    public void resetCasillas(){
        for (JButton botonCasilla: this.botonesCasillas){
            botonCasilla.setBackground(Color.WHITE);
        }
        this.inicializarBombas();
    }


    private void inicializarBombas(){
        for(int i=0; i<this.cantidadCasillas; i++){
            int random = (int)(Math.random() * (2));
            this.bombas[i] = (random == 1);
        }
    }

}
