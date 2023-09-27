package rw.ac.auca.authentication;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email= req.getParameter("email");
        String password=req.getParameter("password");
        if ("uwabito@gmail.com".equals(email)&&"uwera@2020".equals(password)){
            req.setAttribute("email",email);
            req.getRequestDispatcher("welcome.jsp").forward(req,resp);
        }else{
            String message="incorrect Username or password";
            req.setAttribute("message",message);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}
