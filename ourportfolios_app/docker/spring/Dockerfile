FROM ubuntu:latest

RUN apt -y update && apt install -y \
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
    strace \
    maven


# Javaインストール
RUN wget https://download.oracle.com/java/23/latest/jdk-23_linux-aarch64_bin.tar.gz && \
    tar -xvf jdk-23_linux-aarch64_bin.tar.gz && \
    mv /jdk-23.* /jdk-23 && \
    mkdir -p /usr/lib/jvm/ && \
    mv /jdk-23 /usr/lib/jvm/ && \
    rm jdk-23_linux-aarch64_bin.tar.gz

ENV JAVA_HOME=/usr/lib/jvm/jdk-23
ENV PATH=$JAVA_HOME/bin:$PATH

# バイナリ実行用
RUN DEBIAN_FRONTEND=noninteractive apt install qemu-user qemu-user-static libc6-arm64-cross -y && \
    apt-get install qemu-user-static

WORKDIR /ourportfolios

# ポートを開放
EXPOSE 8000

ENV QEMU_LD_PREFIX=/usr/aarch64-linux-gnu/:$QEMU_LD_PREFIX
ENV LD_LIBRARY_PATH=/usr/lib/x86_64-linux-gnu:$LD_LIBRARY_PATH
