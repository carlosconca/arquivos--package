package AparelhoIphone.Iphone;

import AparelhoIphone.Internet.NavegadoInternet;
import AparelhoIphone.Midia.ReprodutorMusical;
import AparelhoIphone.Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadoInternet {
    @java.lang.Override
    public void aparelhoTelefonico() {
        System.out.println("Realizando Ligação pelo Iphone");

    }

    @java.lang.Override
    public void reproduzirmMusica() {
        System.out.println("Reproduzindo Musica pelo Iphone");


    }

    @java.lang.Override
    public void navegarInternet() {
        System.out.println("Navegando pela internet com o Iphone");


    }
}
