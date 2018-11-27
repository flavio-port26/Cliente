/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author User
 */
public class Cliente {

    public double envia(double num1, int op, double num2) {
        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream dados = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream resultado = new ObjectInputStream(socket.getInputStream());
            dados.writeInt(op);
            dados.writeDouble(num1);
            dados.writeDouble(num2);
            dados.flush();

            double total = resultado.readDouble();
            return total;
        } catch (IOException ex) {
            //trataar

        }
    double total= 0.0;
        
        return total ;
    }
}
