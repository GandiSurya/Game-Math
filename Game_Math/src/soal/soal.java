/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author LK5_8
 */
public class soal {
    private int level;
    
    Scanner input = new Scanner(System.in);

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public soal() {
        this.level = 1;
    }
    
    public void reset(){
        this.level = 1;
    }
    
    public int randomAngka(int min, int max) {
        Random r = new Random();
        int angka = r.nextInt(max - min + 1) + min;
        return angka;
    }   
}

