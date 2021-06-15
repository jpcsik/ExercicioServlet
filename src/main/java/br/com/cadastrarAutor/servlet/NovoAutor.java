package br.com.cadastrarAutor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadastrarAutor.modelo.Autor;
import br.com.cadastrarAutor.modelo.Banco;

@WebServlet("/novoAutor")
public class NovoAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nomeAutor = request.getParameter("nome");
		String emailAutor = request.getParameter("email");
	
		Autor autor = new Autor();
		autor.setNome(nomeAutor);
		autor.setEmail(emailAutor);
		
		Banco banco = new Banco();
		banco.adiciona(autor);
		
		response.sendRedirect("listaAutores");
	}


}
