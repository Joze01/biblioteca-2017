<%-- 
    Document   : footer
    Created on : 19-abr-2017, 1:20:53
    Author     : Jose
--%>

     <!-- jQuery -->
    <script src="../vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="../vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="../vendors/nprogress/nprogress.js"></script>
    <!-- validator -->
    <script src="../vendors/validator/validator.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="../respaldo/js/custom.js"></script>
    
        <!-- PNotify -->
    <script src="../vendors/pnotify/dist/pnotify.js"></script>
    <script src="../vendors/pnotify/dist/pnotify.buttons.js"></script>
    <script src="../vendors/pnotify/dist/pnotify.nonblock.js"></script>
    
    <% 
        String exito="3";
        String mensaje="";
         if(request.getParameterMap().containsKey("exito"))
        {
            exito = request.getParameter("exito");
            mensaje = request.getParameter("mensaje");
        }
        
        
        if(exito.equals("1")){
            out.println("<script> "
            + "new PNotify({ "
            + "title: 'Exito', "
            + "text: '"+mensaje+"',"
            + "type: 'success',"
            + "styling: 'bootstrap3'"
            + " });"
            + "</script>");
        }else if(exito.equals("0")){
            out.println("<script> "
            + "new PNotify({ "
            + "title: 'Error', "
            + "text: '"+mensaje+"',"
            + "type: 'error',"
            + "styling: 'bootstrap3'"
            + " });"
            + "</script>");
        }
    %> 
    