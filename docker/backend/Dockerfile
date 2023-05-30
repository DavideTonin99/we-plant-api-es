FROM ubuntu:18.04

RUN apt-get update -y
RUN apt-get install -y curl
RUN apt install -y openjdk-8-jdk openjdk-8-jre
RUN apt install -y maven

RUN curl -fsSL https://deb.nodesource.com/setup_11.x | bash
RUN apt-get install -y nodejs
RUN curl -sL https://dl.yarnpkg.com/debian/pubkey.gpg | gpg --dearmor | tee /usr/share/keyrings/yarnkey.gpg >/dev/null
RUN echo "deb [signed-by=/usr/share/keyrings/yarnkey.gpg] https://dl.yarnpkg.com/debian stable main" | tee /etc/apt/sources.list.d/yarn.list
RUN npm install -y --global yarn

RUN apt-get install -y build-essential

# COMANDI PER INSTALLAZIONE E CONFIGURAZIONE APACHE

WORKDIR /we-plant-api

EXPOSE 8080
EXPOSE 9000
EXPOSE 3001
# EXPOSE PORTE PER HTTP E HTTPS