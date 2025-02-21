FROM ubuntu:latest

RUN apt update && \
    DEBIAN_FRONTEND=noninteractive apt install -y openjdk-17-jdk && \
    apt install -y \
    maven \
    wget \
    tar \
    ca-certificates \
    curl \
    git \
    cron \
    vim \
    sudo \
    jq \
    lsof \
    strace

ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-arm64
ENV PATH=$JAVA_HOME/bin:$PATH
