package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.google.gson.Gson;



/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // response.setContentType("text/html;");
    // response.getWriter().println("this message is coming from the java servlet and can be accessed at \"\\hello\"");

    ArrayList<String> drakeQuotesArrayList = new ArrayList<String>();
    String[] drakeQuotesArray =  {"\"Everybody has an addiction, mine happens to be success.\" - Drake",
            "\"I was born to make mistakes, not to fake perfection.\" - Drake",
            "\"When writing the story of your life, don\'t let anyone else hold the pen.\" - Drake",
            "\"Haters will broadcast your failures, but whisper your success.\" - Drake",
            "\"Never let success get to your head and never let failure get to your heart.\" - Drake",
            "\"Strength isn\'t always shown in what you can hold on to, sometimes it\'s shown in what you can let go of.\" - Drake",
            "\"Before you give up, think of the reason you held on so long.\" - Drake",
            "\"It\'s never too late to realize what you want in your life and it\'s never wrong to fight for it.\" - Drake",
            "\"Jealousy is just love and hate at the same time.\" - Drake",
            "\"Sometimes it\'s the journey that teaches you a lot about your destination.\" - Drake",
            "\"Always felt like my vision been bigger than the bigger picture.\" - Drake",
            "\"I\'m not confrontational, but if someone challenges, I\'m not going to back down.\" - Drake",
            "\"The moment I stop having fun with it, I\'ll be done with it.\" - Drake",
            "\"Pain makes you stronger. Fear makes you braver. Heartbreak makes you wiser.\" - Drake",
            "\"Life is just a game in which the cards are facing down. I\'m in the world where things are taken, never given how long they choose to love you will never be your decision.\" - Drake",
            "\"Everybody dies but not everybody lives.\" - Drake",
            "\"I\'m trying to do better than good enough.\" - Drake",
            "\"Count your blessings, not problems.\" - Drake" ,
            "\"Live without pretending, Love without depending, Listen without defending, Speak without offending.\" - Drake",
            "\"All in all I learned a lesson from it though, you never see it coming you just get to see it go.\" - Drake",
            "\"It\'s funny when you coming in first but you hope that you\'re last, you just hope that it last.\" - Drake",
            "\"If you think I\'mma quit before I die dream on.\" - Drake",
            "\"They ain\'t make me what I am, they just found me like this.\" - Drake",
            "\"I swear this life is like the sweetest thing I\'ve ever known.\" - Drake"};

    Collections.addAll(drakeQuotesArrayList, drakeQuotesArray);

    // 2. Convert ArrayList to JSON
    String json = new Gson().toJson(drakeQuotesArrayList);

    // 3. Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);

    response.setContentType("text/html;");
    response.getWriter().println("<h1>hello world!</h1>");
    response.getWriter().println("<h1>this message is coming from the java servlet and can be accessed at \"&#47; hello\" </h1>");

  }



}
