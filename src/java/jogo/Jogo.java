package jogo;

import java.util.Random;



public class Jogo {
    
    private String opcaoDeJogada;

    public String getOpcaoDeJogada() {
        return opcaoDeJogada;
    }

    public void setOpcaoDeJogada(String opcaoDeJogada) {
        this.opcaoDeJogada = opcaoDeJogada;
    }
    
    public String jogada(){
        
        Random random = new Random();
        
        int num = random.nextInt(3);
        String[] opcoes = {"Papel","Pedra","Tesoura"};
        String msg = "";
        
        if(this.getOpcaoDeJogada().equals("Papel")){
            if(num == 0){ // ---------------------------------------------------- * PAPEL * ----------------------------------------------------
                msg += "<h3>EMPATOU!!!</h3>";
                msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
            }
            else if(num == 1){ // ---------------------------------------------------- * PEDRA * ----------------------------------------------------
                msg += "<h3>PARABÉNS! :) ... Você ganhou!!!</h3>";
                msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
            }
            else{
                if(num == 2){ // ---------------------------------------------------- * TESOURA * ----------------------------------------------------
                    msg += "<h3>NÃO FOI DESSA VEZ! :( ... Infelizmente, você perdeu!</h3>";
                    msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
                }
            }
        }
        else if(this.getOpcaoDeJogada().equals("Pedra")){
            if(num == 0){ // ---------------------------------------------------- * PAPEL * ----------------------------------------------------
                msg += "<h3>NÃO FOI DESSA VEZ! :( ... Infelizmente, você perdeu!</h3>";
                msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
            }
            else if(num == 1){ // ---------------------------------------------------- * PEDRA * ----------------------------------------------------
                msg += "<h3>EMPATOU!!!</h3>";
                msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
            }
            else{
                if(num == 2){ // ---------------------------------------------------- * TESOURA * ----------------------------------------------------
                    msg += "<h3>PARABÉNS! :) ... Você ganhou!!!</h3>";
                    msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
                }
            }
        }
        else{
            if(this.getOpcaoDeJogada().equals("Tesoura")){
                if(num == 0){ // ---------------------------------------------------- * PAPEL * ----------------------------------------------------
                    msg += "<h3>PARABÉNS! :) ... Você ganhou!!!</h3>";
                    msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
                }
                else if(num == 1){ // ---------------------------------------------------- * PEDRA * ----------------------------------------------------
                    msg += "<h3>NÃO FOI DESSA VEZ! :( ... Infelizmente, você perdeu!</h3>";
                    msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
                }
                else{
                    if(num == 2){ // ---------------------------------------------------- * TESOURA * ----------------------------------------------------
                        msg += "<h3>EMPATOU!!!</h3>";
                        msg += "<p>Você jogou " + this.getOpcaoDeJogada() + " e o P.C. jogou " + opcoes[num] + "</p>";
                    }
                }
            }
        }
        
        return msg;
    }
}
