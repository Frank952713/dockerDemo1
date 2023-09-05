#基础镜像使用openjdk:8
FROM openjdk:8
#作者
MAINTAINER ww
#指定临时文件目录为tmp
VOLUME /tmp
#将jar包添加到容器中并且更名为ww1_docker.jar
ADD dockerDemo1-0.0.1-SNAPSHOT.jar ww1_docker.jar
#运行jar包
RUN bash -c 'touch /ww1_docker.jar'
ENTRYPOINT ["java","-jar","/ww1_docker.jar"]
#暴露6001端口作为微服务
EXPOSE 6001
