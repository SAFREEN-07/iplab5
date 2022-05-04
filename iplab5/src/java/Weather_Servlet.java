/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 91936
 */
public class Weather_Servlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            imgMap.put("Sunny","data:image/png;base64,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");
            imgMap.put("Partially Cloudy","https://c.neh.tw/thumb/f/720/comvecteezy366724.jpg");
            imgMap.put("Cloudy","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNtTXsKGGZuMulSwZCbPZhzW27P5RuOhgXYLxhkQTrN0AZcNT3mUQ_ErrNJBw2KO33Lxk&usqp=CAU");
            imgMap.put("Icy","https://cdn5.vectorstock.com/i/1000x1000/52/94/weather-snow-cloud-symbol-blue-color-vector-905294.jpg");
            imgMap.put("Windy","https://us.123rf.com/450wm/anggar3ind/anggar3ind1701/anggar3ind170100593/68545099-cloud-blowing-wind-cartoon.jpg?ver=6");
            imgMap.put("Rainy","https://www.pngitem.com/pimgs/m/480-4808944_stormy-weather-png-heavy-rain-clipart-transparent-png.png");
            
            weather=new Weather("Madurai","36\u00B0C","32\u00B0C","Sunny");
            map.put("Madurai",weather);
            
            weather=new Weather("Chennai","39\u00B0C","36\u00B0C","Sunny");
            map.put("Chennai",weather);
            
            weather=new Weather("Trichy","35\u00B0C","31\u00B0C","Partially Cloudy");
            map.put("Trichy",weather);
            
            weather=new Weather("Coimbatore","28\u00B0C","24\u00B0C","Icy");
            map.put("Coimbatore",weather);
            
            weather=new Weather("Salem","40\u00B0C","36\u00B0C","Highly Sunny");
            map.put("Salem",weather);
            
            weather=new Weather("Vellore","42\u00B0C","38\u00B0C","Highly Sunny");
            map.put("Vellore",weather);
            
            weather=new Ex_2_Weather("Tanjore","41\u00B0C","35\u00B0C","Cloudy");
            map.put("Tanjore",weather);
            
            weather=new Ex_2_Weather("Erode","30\u00B0C","28\u00B0C","Rainy");
            map.put("Erode",weather);
            
            weather=new Weather("Karur","31\u00B0C","29\u00B0C","Windy");
            map.put("Karur",weather);
            
            weather=new Weather("Tirupur","30\u00B0C","28\u00B0C","Rainy");
            map.put("Tirupur",weather);

            String city=request.getParameter("cityname");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Weather_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            if(map.containsKey(city))           
            {
                weather=map.get(city);
                out.println("<center><div><h1>Weather Report</h1>");
                out.println("<h2>"+weather.city+"</h2>");
                out.println("<img width='100px' height='100px' style='border:2px groove grey;border-radius:40%;' src='"+imgMap.get(weather.status)+"'/>");
                out.println("<table border=2 width='300px' height='300px' style='cell-padding:2%;text-align:center;background-color:#ffff80;font-size:large;'><tr><td>Status</td><td>"+weather.status+"</td>");
                out.println("<tr><td>High temperature 🌡</td><td>"+weather.maxTemp+"</td>");
                out.println("<tr><td>Low temperature 🌡</td><td>"+weather.minTemp+"</td></table><br>");
                out.println("</div></center>");
            }
            out.println("<h1>Servlet Weather_Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
    }// </editor-fold>

}
