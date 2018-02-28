1 - Instala package sportalclientesweb-1.19.0.jar

    ...test2/mvn install:install-file -Dfile=sportalclientesweb-1.19.0.jar -DgroupId=sanitas.bravo.clientes -DartifactId=sportalclientesweb -Dversion=1.19.0 -Dpackaging=jar
	
	
2 - Uncomment dependency:
	
	<dependency>
      <groupId>sanitas.bravo.clientes</groupId>
      <artifactId>sportalclientesweb</artifactId>
      <version>1.19.0</version>
    </dependency>
	
	
3 - Se crea el jar y se ejecuta con los siguientes argumentos:

mvn clean install -Dzendesk.ticket="1234" -Dzendesk.token="1234" -Dzendesk.url="http://localhost:8080" -Dzendesk.user="Adrian" -Dtarjetas.getDatos="datos" -Dzendesk.error.mail.funcionalidad="1" -Dzendesk.error.destinatario="dest"

	*También se podría haber cambiado la forma de coger las properties por fichero de configuración situado en resources y cargado en el applicationContext.
