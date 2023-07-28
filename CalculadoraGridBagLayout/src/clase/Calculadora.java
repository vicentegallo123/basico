//Fernando Carrillo Carvajal
package clase;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.sqrt;
import static java.lang.System.exit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Calculadora extends JFrame implements ActionListener {

    private JTextField texto;
    private JButton btnBack, btnCE, btnC, btnMasMenos, btnRaiz,salir,
            btn7, btn8, bt9, btnDivision, btnPorciento, btIgual,bt6,bt5,bt4,bt3,bt2,bt1,bt0,suma,resta,punto,btnMul,btCuadrado,cadena;
    

    private double op1, op2,res;
    private char op;
    private boolean sob;

    public Calculadora() {
        super("Calculadora");

        // create a label to display text
        
        //creacion de objetos
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setSize(700,400);
      setLocationRelativeTo(null);
       Font font=new Font("Arial",Font.BOLD,18);
      
        // Defines padding top, left, bottom, right
        //espacio de los botones
       gbc.insets = new Insets(0, 0, 0, 0);
       

        gbc.fill = GridBagConstraints.BOTH; //incremento tamaño hasta ocupar
        //toda el área cliente
        gbc.gridx = 0;       //coordenada de las columnas
        gbc.gridy = 0;       //Coordenada de las filas

        setLayout(gbl);

        texto = new JTextField("");
        //alinear el texto a la derecha.
        texto.setBackground(Color.LIGHT_GRAY);
        texto.setSize( 2,  2);
        texto.setHorizontalAlignment(SwingConstants.RIGHT);

        gbc.gridwidth = 6;   //El TextField ocupa 5 columnas de ancho
        gbc.gridheight = 1;  //El TextField ocupa 1 fila de alto        

        add(texto, gbc);

        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        btnBack = new JButton("1/x");
        gbc.gridx = 0;
        gbc.gridy = 1;
        btnBack.addActionListener(this);
        btnBack.setFont(font);
        add(btnBack, gbc);

        btnCE = new JButton("CE");
        gbc.gridx = 1;
        gbc.gridy = 1;
        btnCE.addActionListener(this);
         btnCE.setFont(font);
        add(btnCE, gbc);

        btnC = new JButton("C");
        gbc.gridx = 2;
        gbc.gridy = 1;
        btnC.addActionListener(this);
        btnC.setFont(font);
        add(btnC, gbc);

        btnMasMenos = new JButton("+/-");
        gbc.gridx = 3;
        gbc.gridy = 1;
        btnMasMenos.addActionListener(this);
        btnMasMenos.setFont(font);
        add(btnMasMenos, gbc);
        
        suma = new JButton("+");
        gbc.gridx = 3;//fila
        gbc.gridy = 5;//columna
      
        suma.addActionListener(this);
        suma.setFont(font);
        add(suma, gbc);
        
          resta = new JButton("-");
        gbc.gridx = 3;//fila
        gbc.gridy = 4;//columna
        resta.setFont(font);
        resta.addActionListener(this);
        add(resta, gbc);
        
          btCuadrado = new JButton("x^2");
        gbc.gridx = 4;//fila
        gbc.gridy = 4;//columna
        btCuadrado.setFont(font);
        btCuadrado.addActionListener(this);
        add(btCuadrado, gbc);
        

        btnRaiz = new JButton("√ ");
        gbc.gridx = 4;//fila
        gbc.gridy = 1;//columna
        btnRaiz.addActionListener(this);
        btnRaiz.setFont(font);
        add(btnRaiz, gbc);
        
         bt9 = new JButton("9");
        gbc.gridx = 2;
        gbc.gridy = 2;
        bt9.addActionListener(this);
        bt9.setFont(font);
        add(bt9, gbc);

        //Elementos fila 2
        btn7 = new JButton("7");
        gbc.gridx = 0;
        gbc.gridy = 2;
        btn7.addActionListener(this);
        btn7.setFont(font);
        add(btn7, gbc);

        btn8 = new JButton("8");
        gbc.gridx = 1;
        gbc.gridy = 2;
        btn8.addActionListener(this);
        btn8.setFont(font);
        add(btn8, gbc);


        btnDivision = new JButton("/");
        gbc.gridx = 3;
        gbc.gridy = 2;
        btnDivision.addActionListener(this);
        btnDivision.setFont(font);
        add(btnDivision, gbc);

        btnPorciento = new JButton("%");
        gbc.gridx = 4;
        gbc.gridy = 2;
        btnPorciento.addActionListener(this);
        btnPorciento.setFont(font);
        add(btnPorciento, gbc);
        
         //Elementos fila 3
           bt4 = new JButton("4");
        gbc.gridx =0;
        gbc.gridy = 4;
        bt4.addActionListener(this);
        bt4.setFont(font);
        add(bt4, gbc);
        
           bt5 = new JButton("5");
        gbc.gridx = 1;
        gbc.gridy = 4;
        bt5.addActionListener(this);
        bt5.setFont(font);
        add(bt5, gbc);
        
           bt6 = new JButton("6");
        gbc.gridx = 2;
        gbc.gridy = 4;
        bt6.addActionListener(this);
        bt6.setFont(font);
        add(bt6, gbc);
        
        bt1 = new JButton("1");
        gbc.gridx = 0;//fila
        gbc.gridy = 5;//columna
        bt1.addActionListener(this);
        bt1.setFont(font);
        add(bt1, gbc);
        
        bt2 = new JButton("2");
        gbc.gridx = 1;//fila
        gbc.gridy = 5;//columna
        bt2.addActionListener(this);
        bt2.setFont(font);
        add(bt2, gbc);
        
          bt3 = new JButton("3");
        gbc.gridx = 2;//fila
        gbc.gridy = 5;//columna
        bt3.addActionListener(this);
        bt3.setFont(font);
        add(bt3, gbc);
       
        
         //Elementos fila 5
           bt0 = new JButton("0");
        gbc.gridx =0;
        gbc.gridy = 6;
        bt0.addActionListener(this);
        bt0.setFont(font);
        add(bt0, gbc);
        
        //Elementos fila 5
           btIgual = new JButton("=");
        gbc.gridx =2;
        gbc.gridy = 6;
        btIgual.addActionListener(this);
        btIgual.setFont(font);
        add(btIgual, gbc);
        
           punto = new JButton(".");
        gbc.gridx =1;
        gbc.gridy = 6;
        punto.addActionListener(this);
        punto.setFont(font);
        add(punto, gbc);
        
             btnMul = new JButton("*");
        gbc.gridx =4;
        gbc.gridy = 5;
        btnMul.addActionListener(this);
        btnMul.setFont(font);
        add(btnMul, gbc);
       
          salir = new JButton("salir");
       gbc.gridx =3;
     gbc.gridy = 6;
       gbc.gridwidth=2;
        salir.addActionListener(this);
        salir.setFont(font);
        add(salir, gbc);
   
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();

    }
//iniciar variables en zero
    public void inicializaValores() {
        op1 = 0;
        op2 = 0;
       sob = true;
        
   
    }
        

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //operadores
         //Boton salir
        if (e.getSource().equals(salir)) {
            //salir
            exit(0);
           //Se vuelve a activar el modo sobreescribir
        }
          //Boton 1/x
        if (e.getSource().equals(btnBack)) {
            //Guardamos la operación de mult
            op = 'x';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
            
        }
        
         //Boton mul
        if (e.getSource().equals(btnMul)) {
            //Guardamos la operación de mult
            op = '*';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
        }
            //Boton cuadrado
        if (e.getSource().equals(btCuadrado)) {
            //Guardamos la operación de mult
            op = '*';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
        }
         //Boton raiz
        if (e.getSource().equals(btnRaiz)) {
            //Guardamos la operación de raiz
            op = '√';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
        }
        
        //Boton /
        if (e.getSource().equals(btnDivision)) {
            //Guardamos la operación de división
            op = '/';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
        }
         //Boton %
        if (e.getSource().equals(btnPorciento)) {
            //Guardamos la operación porcentaje
            op = '%';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
        }
        //Boton -
        if (e.getSource().equals(resta)) {
            //Guardamos la operación de resta
            op = '-';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
        }
              //Boton -
        if (e.getSource().equals(btnMasMenos)) {
            //Guardamos la operación de resta
            op = 'm';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
        }
 //Boton +
        if (e.getSource().equals(suma)) {
            //Guardamos la operación de dsuma
            op = '+';
            op1 = Double.parseDouble(texto.getText());
            sob = true;  //Se vuelve a activar el modo sobreescribir
            
        }
                 //boton punto
  if (e.getSource().equals(punto)) {
            if (sob == true) {
                texto.setText(".");
                sob = false;
            } else {
                texto.setText(texto.getText() + ".");
            }
        }
        
                  //boton 0
  if (e.getSource().equals(bt0)) {
            if (sob == true) {
                texto.setText("0");
                sob = false;
            } else {
                texto.setText(texto.getText() + "0");
            }
        }
        
          //boton 1
  if (e.getSource().equals(bt1)) {
            if (sob == true) {
                texto.setText("1");
                sob = false;
            } else {
                texto.setText(texto.getText() + "1");
            }
        }
          //boton 2
  if (e.getSource().equals(bt2)) {
            if (sob == true) {
                texto.setText("2");
                sob = false;
            } else {
                texto.setText(texto.getText() + "2");
            }
        }
        //boton 3
  if (e.getSource().equals(bt3)) {
            if (sob == true) {
                texto.setText("3");
                sob = false;
            } else {
                texto.setText(texto.getText() + "3");
            }
        }
  //boton 4
  if (e.getSource().equals(bt4)) {
            if (sob == true) {
                texto.setText("4");
                sob = false;
            } else {
                texto.setText(texto.getText() + "4");
            }
        }
  //boton 5
  if (e.getSource().equals(bt5)) {
            if (sob == true) {
                texto.setText("5");
                sob = false;
            } else {
                texto.setText(texto.getText() + "5");
            }
        }
   //boton 6
  if (e.getSource().equals(bt6)) {
            if (sob == true) {
                texto.setText("6");
                sob = false;
            } else {
                texto.setText(texto.getText() + "6");
            }
        }
  //Boton 7
        if (e.getSource().equals(btn7)) {
            if (sob == true) {
                texto.setText("7");
                sob = false;
            } else {
                texto.setText(texto.getText() + "7");
            }
        }
   //boton 8
  if (e.getSource().equals(btn8)) {
            if (sob == true) {
                texto.setText("8");
                sob = false;
            } else {
                texto.setText(texto.getText() + "8");
            }
        }
   //boton 9
  if (e.getSource().equals(bt9)) {
            if (sob == true) {
                texto.setText("9");
                sob = false;
            } else {
                texto.setText(texto.getText() + "9");
            }
        }
  //boton c
    if (e.getSource().equals(btnC)) {
            if (sob == true) {
                texto.setText("");
                sob = false;
            } else {
                texto.setText(texto.getText() + "");
            }
        }

        //Boton igual
        //get soude para saber que boton eligiste
        //get text áta poner el texto
        //se abre un switch para las operaciones+
        if (e.getSource().equals(btIgual)) {
            double res = 0;
            switch (op) {
                case '/':
                    op2 = Double.parseDouble(texto.getText());
                    res = op1 / op2;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                case '+':
                    op2 = Double.parseDouble(texto.getText());
                    res = op1 + op2;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                      case '-':
                    op2 = Double.parseDouble(texto.getText());
                    res = op1 - op2;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                      case '%':
                    op2 = Double.parseDouble(texto.getText());
                    res = op1 * op2/100;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                        case '√':
                    op2 = Double.parseDouble(texto.getText());
                    res = sqrt(op1);
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                       case '*':
                    op2 = Double.parseDouble(texto.getText());
                    res = op1 * op2;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                      case 'C':
                    op2 = Double.parseDouble(texto.getText());
                    res = 0;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 0;
                        case 'x':
                    op2 = Double.parseDouble(texto.getText());
                    res = 1/op1;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                           case 'k':
                    op2 = Double.parseDouble(texto.getText());
                    res = Math.pow(op1, 2);
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    break;
                       case 'm':
                    op2 = Double.parseDouble(texto.getText());
                    if(texto.getText().isEmpty()) texto.setText("0");
                    else{
                    res = op1 *-1;
                    texto.setText(Double.toString(res));
                    sob = true;
                    op1 = 1;
                    op2 = 0;
                    }
                    break;
                    
                   case 's':
                   exit(0);
                    break;
            }
        }

    }

public static void main(String[] args) {
        new Calculadora();
    }
}
