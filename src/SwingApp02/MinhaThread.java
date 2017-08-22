package SwingApp02;


import SwingApp02.Main;

public class MinhaThread implements Runnable{
    public void run() {
        Main.criarGUI();
    }
}
