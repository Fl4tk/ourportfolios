FROM gradle:7.6.1-jdk17 AS build
WORKDIR /home/gradle/project

COPY --chown=gradle:gradle . .

RUN chmod +x gradlew && \
./gradlew clean build -x test --no-daemon && \
apt-get update && \
apt-get install -y \
  build-essential \
  libssl-dev \
  libreadline-dev \
  libgdbm-dev \
  libbz2-dev \
  libncurses-dev \
  libaio-dev \
  libxml2-dev \
  libxslt1-dev \
  libffi-dev \
  wget \
  curl \
  lsb-release \
  default-libmysqlclient-dev \
  git \
  zlib1g-dev \
  language-pack-ja-base \
  language-pack-ja \
  cron \
  vim \
  liblzma-dev \
  jq \
  iputils-ping \
  && rm -rf /var/lib/apt/lists/*

FROM openjdk:17-jdk-slim
WORKDIR /

COPY --from=build /home/gradle/project/build/libs/*.jar application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "application.jar"]
