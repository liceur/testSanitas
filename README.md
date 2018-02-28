1 - Instala package sportalclientesweb-1.19.0.jar

    ...test2/mvn install:install-file -Dfile=sportalclientesweb-1.19.0.jar -DgroupId=sanitas.bravo.clientes -DartifactId=sportalclientesweb -Dversion=1.19.0 -Dpackaging=jar
	
	
2 - Uncomment dependency:
	
	<dependency>
      <groupId>sanitas.bravo.clientes</groupId>
      <artifactId>sportalclientesweb</artifactId>
      <version>1.19.0</version>
    </dependency>
	
	
3 - Se crea el jar 

	mvn clean install
	
4 - Ejecutar app

	mvn exec:java
	
	The properties are in a file application.properties
