/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rojeru San
 */
public class Guardar {

    public boolean guardarImagen() {
        FileChooser fileChooser = new FileChooser();

        fileChooser.setDialogTitle("Guardar Código de Barras");
        FileFilter filter = new FileNameExtensionFilter("Barras Image", "PNG");

        fileChooser.addChoosableFileFilter(filter);
        int userSelection = fileChooser.showSaveDialog(new Principal());
        if (userSelection == FileChooser.APPROVE_OPTION) {
            File guardarBarras = fileChooser.getSelectedFile();
            if (!guardarBarras.toString().endsWith(".png")) {
                guardarBarras = new File(fileChooser.getSelectedFile() + ".png");
            }
            try {
                ImageIO.write(Principal.imagen, "png", guardarBarras);
                return true;
            } catch (IOException ex) {
                Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            return false;
        }
        return false;
    }
}
