package tabladenumeros;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TablaDeNumeros {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame =new JFrame("Mi Aplicación");
        //frame.setSize(1000, 3000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.setLayout(new FlowLayout());
        JPanel panel = new JPanel(new GridLayout(3, 3));
        //frame.add(panel);
        
        //Botones
        JButton boton0=new JButton("0");
        panel.add(boton0);
        JButton boton1=new JButton("1");
        panel.add(boton1);
        JButton boton2=new JButton("2");
        panel.add(boton2);
        JButton boton3=new JButton("3");
        panel.add(boton3);
        JButton boton4=new JButton("4");
        panel.add(boton4);
        JButton boton5=new JButton("5");
        panel.add(boton5);
        JButton boton6=new JButton("6");
        panel.add(boton6);
        JButton boton7=new JButton("7");
        panel.add(boton7);
        JButton boton8=new JButton("8");
        panel.add(boton8);
        
        JPanel panelInferior = new JPanel(new GridLayout(1, 3));
        //frame.add(panelInferior);
        
        JLabel label1=new JLabel("HOla");
        panelInferior.add(label1);
        JLabel label2=new JLabel("Hola2");
        panelInferior.add(label2);
        JLabel label3=new JLabel("Hola3");
        panelInferior.add(label3);
        
        /*boton0.addActionListener(new ActionListener(){
            //@Override
            int b0=0;
            @Override
            public void actionPerformed(ActionEvent e){
                b0++;
                System.out.println("agregado2");
                label1.setText("Boton 0: "+b0+" Clicks ");
                System.out.println("agregado");
            }
        });*/
        
        
        
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        frame.getContentPane().add(panelInferior,BorderLayout.SOUTH);
        
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
    }
}
