<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>BANA-NA CRUD con Spring Web MVC project</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card boarder-info">

                <div class="card-header bg-info text-white">
                    <a class="btn btn-plight" href="agregar.html">Nuevo Registro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>APELLIDO(s)</th>
                                <th>CONTACTO</th>
                                <th>CORREO</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="dato" items="${lista}">
                            <tr>
                                <td>${dato.id}</td>
                                <td>${dato.nombre}</td>
                                <td>${dato.apellido}</td>
                                <td>${dato.contacto}</td>
                                <td>${dato.correo}</td>
                                <td>
                                    <a class="btn btn-warning">Editar</a>
                                    <a class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>    
                        </tbody>
                    </table>   
                </div>
            </div>
            
            <div class="image-wrapper">
                     <img src="../../../../../panquecito.jpg" alt="image"/>
            </div>
        </div>
    </body>
</html>
