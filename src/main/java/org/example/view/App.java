package org.example.view;

import java.util.Scanner;

public class App {

    private boolean continuar = true;
    private String title = "";
    private void loop() {
        while (continuar){
            try{
                System.out.println("=".repeat(50));
                System.out.println("\n".repeat(2));
                System.out.println("+-".repeat(12) + title + "+-".repeat(12));

                body();

            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*
    * Método com o código (corpo do app) que será executado no loop
    *
    * */
    protected void body() throws Throwable {
        throw new Throwable("Loop não foi definido!");
    }

    protected String input(String texto){
        Scanner in = new Scanner(System.in);
        System.out.print("\n"+texto);
        return in.nextLine();
    }

    /*
     * Método para iniciar/continuar o loop ou para parar o loop
     * @param ciclo Comanda se o loop vai ser iniciado ou se ele vai parar
     * */
    public void mainLoop(boolean ciclo){
        this.continuar = ciclo;

        loop();
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
