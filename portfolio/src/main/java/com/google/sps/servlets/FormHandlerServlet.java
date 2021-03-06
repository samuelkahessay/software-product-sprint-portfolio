package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String textValue = request.getParameter("text-input");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + textValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println("Your favourite album is: " + textValue);

    // Parse response so spaces are seen as "%20"
    response.sendRedirect("https://pitchfork.com/search/?query=" + URLEncoder.encode(textValue, StandardCharsets.UTF_8));

  }
}