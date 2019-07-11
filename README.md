# TestAzurian
Prueba desarrollo Liferay

Componentes:
- service

  Servicio SOAP y REST de consulta a base de datos (H2) utilizando JPA.
  Por defecto está configurado para ser desplegado en un servidor Tomcat 7+, pero también existe la opcion de ejecutarlo como aplicación independiente cambiando el parámetro de empaquetado (packaging) en pom.xml de war a jar.
  
  Si se ejecuta como aplicación independiente, los servicios SOAP y REST estarán publicados en http://localhost:1234/DiscoService y http://localhost:5678/ respectivamente.
  
- list-discos-portlet

  Portlet para liferay 6.2 de despliegue, a través de componente SearchContainer, de datos consumidos desde servicios publicados.
  Se opta por consumo a vía REST.
  
  Los parámetros de HOST, PORT y endpoint del servicio están especificados en cl.az.test.helper.Constants en caso de requerir ser cambiados.
  
- table.sql

  Sentencia de creación y poblado de tabla.
