FROM  openjdk:17
ADD target/Lawyer.jar Lawyer.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","/Lawyer.jar"]	