package br.com.cadastrarAutor.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadastrarAutor.modelo.Autor;
import br.com.cadastrarAutor.modelo.Banco;

@WebServlet("/listaAutores")
public class ListaAutores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco = new Banco();
		List<Autor> lista = banco.getAutores();
		request.setAttribute("autores", lista);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listaAutores.jsp");
		rd.forward(request, response);
		
	}

}
