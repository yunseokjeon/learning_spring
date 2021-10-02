# Docker에서 MySQL 실행
```shell
$ docker pull mysql
$ docker images
$ docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=1234 -d -p 3306:3306 mysql:latest
$ docker ps -a
$ docker stop mysql-container
$ docker start mysql-container
$ docker restart mysql-container
$ docker exec -it mysql-container bash
root@75d05eb58083:/# mysql -u root -p
```

# Use volumes
```shell
# https://towardsdatascience.com/how-to-save-state-in-docker-a-data-scientists-guide-18bb05589010
$ docker run -v <volume_name>:<container_directory> <image_name>
$ docker run -v C:/Users/Yun/Data:/var/lib/mysql --name mysql-container -e MYSQL__ROOT_PASSWORD=1234 -d -p 3306:3306 mysql:latest

$ docker run -v C:/Users/Yun/Data:/var/lib/mysql --name mysql-container -e MYSQL__ROOT_PASSWORD=1234 -d -p 3306:3306 mysql:latest

$ docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 --name mysql-container -v D:/Data:/var/lib/mysql mysql:latest 
```

