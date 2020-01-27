/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tjee.bg.projekt.view;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.tjee.bg.projekt.controller.UserSessionBean;
import pl.tjee.bg.projekt.controller.file.FileAccess;
import pl.tjee.bg.projekt.controller.file.FileAccess_Service;
import pl.tjee.bg.projekt.controller.file.FileDownload;
import pl.tjee.bg.projekt.controller.file.FileListEntry;

/**
 *
 * @author Bartem
 */
@WebServlet(name = "FileList", urlPatterns = {"/FileList"})
public class FileList extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            FileAccess fa = new FileAccess_Service().getFileAccessPort();
            List<FileListEntry> files = fa.getFileList(null);
            String sessionId = null;
//            head
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pliki</title>");
            out.println("<link rel='stylesheet' href='css/style.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<main>");

            out.println("<nav>");
            if (request.getSession().getAttribute("userSession") != null) {
                UserSessionBean usb = (UserSessionBean) request.getSession().getAttribute("userSession");

                out.println("<a class='nav-link' href='logout'>Wyloguj</a>");
                out.println("<span class='nav-link'> | " + usb.getName() + "</span>");
                sessionId = usb.getSessionId();

            } else {
                out.println("<a class='nav-link' href='login.jsp'>Zaloguj</a>");
            }
            out.println("</nav>");

//        upload
            if (sessionId != null) {

                out.println("<section id='upload-container'>");
                out.println("<h1>Przesyłanie</h1>");
                out.println("<form method='post' action='Upload' enctype='multipart/form-data'>");
                out.println("<input type='hidden' name='userid' value='" + sessionId + "'/>");
                out.println("<label for='desc'>Opis<br/></label>");
                out.println("<textarea required name='desc' name='id'></textarea><br/>");
                out.println("<label for='file'>Plik<br/></label>");
                out.println("<input type='file' required name='file' id='file'><br/>");
                out.println("<input class='button' type='submit' name='action' value='Prześlij'/>");
                out.println("</form>");
                out.println("</section>");
            }

//        list
            out.println("<section id='file-container'>");
            out.println("<h1>Lista plików</h1>");
            out.println("<ul>");
            for (FileListEntry f : files) {
                out.println("<li>");
//            name
                out.println("<div>");
                out.println(f.getName());
                out.println("</div>");
//            author
                out.println("<div>");
                out.println(f.getAuthor() == null ? "" : f.getAuthor());
                out.println("</div>");
//            expand
                out.println("<details>");
                out.println("<summary>Opis</summary>");
//            action
                out.println("<form method='post' action=''>");
                out.println("<input type='hidden' name='hidden' value='Testźż'/>"); //TODO remove + chech 
                out.println("<input type='hidden' name='file' value='" + f.getId() + "'/>");
                out.println("<input type='hidden' name='userid' value='" + sessionId + "'/>");
                out.println("<input type='submit' name='action' value='Pobierz'/>");
                if (sessionId != null) {
                    out.println("<input type='submit' name='action' value='Usuń'/>");
                }
                out.println("</form>");
//                description
                out.println("<p>");
                out.println(f.getDescription());
                out.println("</p>");
                out.println("</details>");

                out.println("</li>");
            }
            out.println("</ul>");
            out.println("</section>");

            out.println("</main>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        FileAccess fa = new FileAccess_Service().getFileAccessPort();

        System.out.println("log " + request.getCharacterEncoding());
        System.out.println("log " + request.getParameter("action"));
        System.out.println("log " + request.getParameter("file"));
        System.out.println("log " + request.getParameter("hidden"));

        switch (request.getParameter("action")) {
            case "Pobierz":
                FileDownload file = fa.download(null, Integer.parseInt(request.getParameter("file")));
                response.setContentType(file.getType());
                response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
                try (PrintWriter out = response.getWriter()) {
                    InputStream data = new ByteArrayInputStream(file.getData());
                    while (data.available() > 0) {
                        out.write(data.read());
                    }
                }
                break;
            case "Usuń":
                fa.delete(null, Integer.parseInt(request.getParameter("file")));
                break;
            default:
                response.sendRedirect(request.getContextPath() + "/FileList");

        }

        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
