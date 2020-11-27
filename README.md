# TallerdeProductividadBasadaenHerramientasTecnologicas
Proyecto Integrador Fase IV   Fernando Gutierrez Arevalo

Link de Video del demo: https://vimeo.com/user108462304/review/484325938/2ea78ae264

Descripción del problema

No hay problema, pero tampoco hay optimización, entonces, esto funge como un problema. Empezar un negocio , puede, y debe ser al principio algo rudimentario. Uno puede identificar clientes constantes conforme ellos van comprando en un negocio, pero cuando se tiene una gran cartera de clientes constantes, entonces la personalización podría ser mucho más compleja. Se requiere monitorear los ingreso y la posibilidad de generación de facturas, en caso de ser requeridas.

Solución

La implementación de un sitio para redirigir las ventas, una liga en la biografia de la cuenta de Bana-na, para redirigir los pedidos a través de ese sitio en Internet. Donde se muestra campos en donde se tengan que especificar datos particulares como dirección, nombre completo, correo y comentarios adicionales al pedido. Sin embargo, el resto de selección de productos de panquecitos será ponderado por un seleccionador de items, tipo interfaz de rappi, donde solo se escogen los productos y se indica la cantidad, más un comentario adicional por objeto. Estos pedidos generan una notificación vía mail y un indicador de pedidos para cuentas de administradores dentro del sitio.

Arquitectura

Los requisitos del sistema a desarrollar, constan del uso de una computadora para mantenerla como un servidor, donde en él, se tendrá el backend desarrollado en Java, así como toda la arquitectura de datos. Una vez descargado el repositorio, se puede observar una distribución de carpetas con los contenidos de sitios web (Web Pages) donde allí, se encuentran los archivos jsp y html, esto opera en conjunción con los archivos de la carpeta web-INF, especialmente el uso del archivo dispatcher-servlet.xml; al nivel de la carpeta Web Pages, está la carpeta con los contenidos de los paquetes, que en ellos se encuentran mis controladores, wrappers, y conexiones a la base de datos. Especialmente, dentro de la carpeta controller, se encuentra el archivo java "Controlador.java". Este archivo, junto con dispatcher-servlet.xml, administran el redireccionamiento de peticiones html, por lo tanto dando el mayor control a todo el Backend del proyecto.

Tabla de Contenidos

Primero, el usuario administrador de Bana-na, deberá hacer login con credenciales de administrador al sitio desarrollado para poder dar de alta todos sus productos con sus descripciones. Posteriormente, podrá habilitar el uso de la plataforma en modo de producción para el uso de clientes.

La inserción de datos del cliente en campos de formulario dinámico, al darle clic al botón de submit, se guardará una instancia de los datos contenidos de las etiquetas del formulario en base al esquema de la base de datos para clientes.

• Al solicitar pedido a domicilio, se despliega una pequeña alerta donde se advierte al usuario que, al confirmar pedido a domicilio, implica la aceptación de términos y condiciones de privacidad de uso de datos sensibles de bana-na.
• Se requiere que para formalizar pedido con los siguientes datos:
“Nombre”, “apellidos”, “producto1”.” cantidad1” “producto2.” Cantidad2”, “teléfono (10 digitos)”, “rango de hora de entrega”, “domicilio”, “requiere factura”. Dichos datos son instanciados y guardados en otra tabla de la base de datos en base al esquema de pedidos.
• Cuando se confirmé el pedido, se dirige al cliente a otra ruta (apartado del sitio), donde pueden indicar en otros campos, si desean el pedido a domicilio, y/o, una factura electrónica.
• Cuando un pedido es confirmado su status pasa a pendiente por corroborar con el cliente, entonces la administradora contacta al cliente por teléfono para consolidar el pedido.
• Entonces la administradora, cambia el estatus del pedido en el sitio de bana-na con credenciales de administradora.
• En caso que el cliente requiera factura, y desee pagar por transferencia bancaria, se le solicitará subir una captura de pantalla del recibo de la transferencia de su banco. Ésta, deberá ser subida a un apartado de almacenamiento de archivos; dicha liga, se abre en otra pestaña del navegador. En dicha liga, el sitio permite descargar la factura de un pedido, con el número de dicho pedido, nombre del cliente que realizó la compra, y la captura de pantalla. Dicho documento se guardará también en la base de datos como tipo de dato blob.


Servidor de Aplicación: Glassfish 5
Base de datos: MySQL
Java Version: 8 o superior

Instalación:

Ocupé Netbeans, lo descargué de su sitio oficial https://netbeans.org/ 
En él, puedo descargar y referir un proyecto con origen de mi repositorio en github; hacemos un pull y podemos analizar el contenido de la branch master. 

Pruebas Unitarias:

Para realizar pruebas unitarias, se utiliza la branch develop. Se abrirá la carpeta Test Packages, y se utilizará la clase Prueba.java. Este archivo, debe ser puesto a correr dentro del IDE, pero para ello debe ser configurado un archivo .txt donde se tendrán contenidas los datos de administrador, para no caer en vista de la API para usuarios normales. La prueba unitaria definida por default, es abrir el sitio desde un navegador Chrome/FireFox, hará un login con una cuenta particular de administrador; y realizará un pedido de panquecitos para devolvernos el sitio con la generación del pedido realizado.

Esta solución se implementa en un ambiente local, así como la dirección provista por servicios de hosteo gratuitos (Hostinger).
Si debe haber una configuración del sitio, previo a su uso en mood de producción, pero es muy facil hacer la configuración.

