/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Resume;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Nevil
 */
public class Resume extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "\n"
                    + "<head>\n"
                    + "  <title>Registration Page</title>\n"
                    + "  <style>\n"
                    + "    /* CSS styling for navigation tabs */\n"
                    + "    ul.nav-tabs {\n"
                    + "      list-style-type: none;\n"
                    + "      margin: 0;\n"
                    + "      padding: 0;\n"
                    + "      overflow: hidden;\n"
                    + "    }\n"
                    + "\n"
                    + "    ul.nav-tabs li {\n"
                    + "      float: left;\n"
                    + "    }\n"
                    + "\n"
                    + "    ul.nav-tabs li a {\n"
                    + "      display: block;\n"
                    + "      color: #000;\n"
                    + "      text-align: center;\n"
                    + "      padding: 14px 16px;\n"
                    + "      text-decoration: none;\n"
                    + "    }\n"
                    + "\n"
                    + "    ul.nav-tabs li a:hover {\n"
                    + "      background-color: #ddd;\n"
                    + "    }\n"
                    + "\n"
                    + "    /* CSS styling for forms */\n"
                    + "    .tab-content {\n"
                    + "      display: none;\n"
                    + "    }\n"
                    + "\n"
                    + "    .tab-content.active {\n"
                    + "      display: block;\n"
                    + "    }\n"
                    + "\n"
                    + "    form {\n"
                    + "      margin: 20px;\n"
                    + "    }\n"
                    + "\n"
                    + "    input[type=\"text\"],\n"
                    + "    select {\n"
                    + "      width: 50%;\n"
                    + "      padding: 12px 20px;\n"
                    + "      margin: 8px 0;\n"
                    + "      border: 1px solid #ccc;\n"
                    + "      box-sizing: border-box;\n"
                    + "    }\n"
                    + "\n"
                    + "    input[type=\"submit\"] {\n"
                    + "      background-color: #4CAF50;\n"
                    + "      color: white;\n"
                    + "      padding: 14px 20px;\n"
                    + "      margin: 8px 0;\n"
                    + "      border: none;\n"
                    + "      cursor: pointer;\n"
                    + "      width: 30%;\n"
                    + "    }\n"
                    + "\n"
                    + "    input[type=\"submit\"]:hover {\n"
                    + "      background-color: #45a049;\n"
                    + "    }\n"
                    + "  </style>\n"
                    + "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\n"
                    + "<script>\n"
                    + "$(document).ready(function(){\n"
                    + "$(\"#submit\").hide();\n"
                    + "$('#major').keyup(function(){"
                    + "  var fname=$(\"#fname\").val();\n"
                    + "var lname=$('#lname').val();"
                    + "var email=$('#email').val();"
                    + "var u=$('#university').val();"
                    + "var d=$('#degree').val();"
                    + "var m=$('#major').val();"
                    + "var s=$('#sem').val();"
                    + "if(fname.length > 0 && lname.length>0 && email.length>0 && u.length>0 && d.length>0 && m.length>0 && s.length>0)\n"
                    + "  {\n"
                    + "   $(\"#submit\").show(); \n"
                    + "  }\n"
                    + "});"
                    + "});\n"
                    + "</script>"
                    + "</head>\n"
                    + "<body>\n"
                    + "  <ul class=\"nav-tabs\">\n"
                    + "    <li><a href=\"#personal\">Personal Information</a></li>\n"
                    + "    <li><a href=\"#educational\">Description</a></li>\n"
                    + "  </ul>\n"
                    + "\n"
                    + "  <div id=\"personal\" class=\"tab-content active\">\n"
                    + "    <form method='POST'>\n"
                    + "      <h2>Personal Information</h2>\n"
                    + "      <label for=\"fname\">First Name:</label>\n"
                    + "      <input type=\"text\" id=\"fname\" name=\"fname\" required>\n<br>"
                    + "\n"
                    + "      <label for=\"lname\">Last Name:</label>\n"
                    + "      <input type=\"text\" id=\"lname\" name=\"lname\" required>\n<br>"
                    + "\n"
                    + "      <label for=\"email\">Email:&emsp;&emsp;</label>\n"
                    + "      <input type=\"text\" id=\"email\" name=\"email\" required>\n<br>"
                    + "\n"
                    + "      <h2>Educational Information</h2>\n"
                    + "      <label for=\"university\">University:</label>\n"
                    + "      <input type=\"text\" id=\"university\" name=\"university\" required>\n<br>"
                    + "\n"
                    + "      <label for=\"degree\">Degree:&emsp; </label>\n"
                    + "      <input type=\"text\" id=\"degree\" name=\"degree\" required>\n<br>"
                    + "      <label for=\"major\">Current sem:</label>\n"
                    + "      <input type=\"text\" id=\"sem\" name=\"sem\" required>\n<br>"
                    + "\n"
                    + "  </div>\n"
                    + "\n"
                    + "  <div id=\"educational\" class=\"tab-content\">\n"
                    + "      <h2>Description</h2>\n"
                    + "      <label for=\"major\">Description:</label>\n"
                    + "      <input type=\"text\" id=\"major\" name=\"major\" required>\n<br>"
                    + "\n"
                    + "      <input type=\"submit\" id='submit' value=\"Download\">\n"
                    + "    </form>\n"
                    + "  </div>\n"
                    + "\n"
                    + "  <script>\n"
                    + "    // JavaScript code to handle tab navigation\n"
                    + "    const tabs = document.querySelectorAll('ul.nav-tabs li');\n"
                    + "    const tabContents = document.querySelectorAll('.tab-content');\n"
                    + "\n"
                    + "    tabs.forEach((tab, index) => {\n"
                    + "      tab.addEventListener('click', () => {\n"
                    + "        tabs.forEach((tab) => tab.classList.remove('active'));\n"
                    + "        tab.classList.add('active');\n"
                    + "\n"
                    + "        tabContents.forEach((content) =>\n"
                    + "          content.classList.remove('active')\n"
                    + "        );\n"
                    + "        tabContents[index].classList.add('active');\n"
                    + "      });\n"
                    + "    });\n"
                    + "  </script>\n"
                    + "</body>\n"
                    + "\n"
                    + "</html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String u = request.getParameter("university");
        String d = request.getParameter("major");
        String s = request.getParameter("sem");

        String out = "First Name :" + fname + " " + lname + "\n" + "Email :" + email + "\n\n" + "Objective :\n" + d + "\n\nUniversity :" + u + "\n" + "Current Sem :" + s;

        String fileName = fname + ".doc";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(out.getBytes());
        }

        response.setContentType("application/msword");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);

        try (FileInputStream fis = new FileInputStream(fileName); OutputStream os = response.getOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        }
        File file = new File(fileName);
        file.delete();
    }
}
