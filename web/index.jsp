<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <main>
            <header>
                <h1>JOGO: Papel, Pedra e Tesoura</h1>
            </header>
            <section>
                <form action="index2.jsp" method="POST" name="formulary" id="Form" target="Msg">
                    <fieldset>
                        <legend>Selecione, apenas, uma das opções</legend>
                        <p>
                            <input type="radio" name="opcao" id="wallper" title="Papel" value="Papel"><label for="wallper">Papel</label>
                            <input type="radio" name="opcao" id="wallper2" title="Pedra" value="Pedra"><label for="wallper2">Pedra</label>
                            <input type="radio" name="opcao" id="wallper3" title="Tesoura" value="Tesoura"><label for="wallper3">Tesoura</label>
                        </p>
                    </fieldset>
                    <br>
                    <button type="submit" name="botao" id="Botao" title="Jogar">Jogar</button>
                </form>
                <br>
                <iframe name="Msg" id="Iframe" height="144" width="676" title="Msg"></iframe>
            </section>
        </main>
    </body>
</html>
