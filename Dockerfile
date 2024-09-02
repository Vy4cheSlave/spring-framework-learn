FROM openjdk:8
COPY . /usr/src/app
WORKDIR /usr/src/app
CMD ["sh", "executable.sh"]