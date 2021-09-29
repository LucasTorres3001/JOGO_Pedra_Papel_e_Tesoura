<%@page import="jogo.Jogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>

    <body>
        <%
            Jogo jogo = new Jogo();
            
            String opcao;
            
            opcao = request.getParameter("opcao");
            
            jogo.setOpcaoDeJogada(opcao);
            
            out.print(jogo.jogada());
            
        %>
    </body>
</html>
