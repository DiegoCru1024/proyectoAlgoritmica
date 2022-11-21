/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class mascotaArray {

    public ArrayList<mascotaClase> mascotasArray;
    public int contador = 0;

    public void generarArreglo() {
        mascotasArray = new ArrayList<>();
    }

    public int getSize() {
        return mascotasArray.size();
    }

    public void addMascota(mascotaClase mClase) {
        mascotasArray.add(mClase);
    }

    public mascotaClase getMascota(int pos) {
        return mascotasArray.get(pos);
    }

    public mascotaClase buscarCodigo(int codigo) {
        mascotaClase mascotaEncontrada = null;
        
        for (mascotaClase mClase : mascotasArray) {
            if (mClase.getCodigo() == codigo) {
                mascotaEncontrada = mClase;
                break;
            } else {
                mascotaEncontrada = null;
            }
        }
        return mascotaEncontrada;
    }

    public void removeMascota(mascotaClase mClase) {
        mascotasArray.remove(mClase);
    }
}
