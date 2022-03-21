# lab 12

this project writing on database and read from it and render data on screen 

**"/Albums"** route represent form to adding new album 
**"/newAlbum"** rout represent data from the database to the screen
**"/addAlbum"** that rout adds new album to the database and redirect to "newAlbum" view

**database configuration**
server.port=8081
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/album
spring.datasource.username=khadyjh97
spring.datasource.password=0000
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always