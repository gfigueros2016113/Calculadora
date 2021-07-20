/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gabrielfigueros.sistema;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

/**
 *
 * @author Gabriel Figueros
 */
public class FXMLDocumentController implements Initializable {
    float dato1;
    float dato2;
    // Esta variable es para saber que operacion vamos a usar
    int op;
    
    
    @FXML
    private TextField valores;

    @FXML
    private Button uno;
    
    @FXML
    private Button dos;
    
    @FXML
    private Button tres;
    
    @FXML
    private Button cuatro;
    
    @FXML
    private Button cinco;
    
    @FXML
    private Button seis;
    
    @FXML
    private Button siete;
    
    @FXML
    private Button ocho;
    
    @FXML
    private Button nueve;
    
    @FXML
    private Button cero;
    
    @FXML
    private Button decimal;
    
    @FXML
    private Button suma;
    
    @FXML
    private Button resta;
    
    @FXML
    private Button multiplicacion;
    
    @FXML
    private Button division;
    
     
    @FXML
    private Button CE;
    
    @FXML
    private Button resultado;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
            if (event.getSource()== uno)
                    valores.setText (valores.getText() +"1");
            else if  (event.getSource()== dos)
                    valores.setText (valores.getText() +"2");
            else if  (event.getSource()== tres)
                    valores.setText (valores.getText() +"3");
            else if  (event.getSource()== cuatro)
                    valores.setText (valores.getText() +"4");
            else if  (event.getSource()== cinco)
                    valores.setText (valores.getText() +"5");
            else if  (event.getSource()== seis)
                    valores.setText (valores.getText() +"6");
            else if  (event.getSource()== siete)
                    valores.setText (valores.getText() +"7");
            else if  (event.getSource()== ocho)
                    valores.setText (valores.getText() +"8");
            else if  (event.getSource()== nueve)
                    valores.setText (valores.getText() +"9");
            else if  (event.getSource()== cero)
                    valores.setText (valores.getText() +"0");
            else if  (event.getSource()== decimal)
                    valores.setText (valores.getText() +".");
            
            // OPERACIONES
                    else if  (event.getSource()== suma){
                    dato1 = Float.parseFloat(valores.getText());
                    valores.setText("");
                    op = 1;
                    }else if(event.getSource()== resultado){
                       dato2 = Float.parseFloat(valores.getText());   
                       switch (op){
                            case 1:
                                 float resultadosuma = dato1 + dato2;
                                    valores.setText(String.valueOf(resultadosuma));
                                 break;
                             case 2:
                                  float resultadoresta = dato1 - dato2;
                                     valores.setText(String.valueOf(resultadoresta));
                                  break;
                             case 3:
                                  float resultadomulti= dato1 * dato2;
                                     valores.setText(String.valueOf(resultadomulti));
                                  break;
                             case 4:
                                  float resultadodivision = dato1 / dato2;
                                     valores.setText(String.valueOf(resultadodivision));
                                  break;
                              
                          }
                     
                    }
                    
                    else if  (event.getSource()== resta){
                    dato1 = Float.parseFloat(valores.getText());
                    valores.setText("");
                    op = 2;
                    }else if(event.getSource()== resultado){
                       dato2 = Float.parseFloat(valores.getText());  
                       
                    }
                    else if  (event.getSource()== multiplicacion){
                    dato1 = Float.parseFloat(valores.getText());
                    valores.setText("");
                    op = 3;
                    }else if(event.getSource()== resultado){
                       dato2 = Float.parseFloat(valores.getText());  
                       
                    }
                     else if  (event.getSource()== division){
                    dato1 = Float.parseFloat(valores.getText());
                    valores.setText("");
                    op = 4;
                    }else if(event.getSource()== resultado){
                       dato2 = Float.parseFloat(valores.getText());  
                       
                    }else if(event.getSource() == CE){
                    valores.setText("");
                    }
                     
            
            // SIGNO IGUAL ES EL QUE VA A REALIZAR LAS OPERACIONES
             
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
