# sprint-boot-servicio-config-server
# http://localhost:8888/servicio-items/default
# http://localhost:8888/servicio-items/dev
# http://localhost:8888/servicio-items/prod

# ---refresh del cambio---
# http://localhost:8007/actuator/refresh - POST y se refresca con el commit en las configuraciones


# DOCKER
## generar .jar: .\mvnw clean package
## generar imagen: docker build -t config-server:v1 .
## creando red: docker network create sprintcloud
## levantando servicio: docker run -d -p 8888:8888 --name config-server --network sprintcloud config-server:v1
## probando api: http://localhost:8888/servicio-items/default