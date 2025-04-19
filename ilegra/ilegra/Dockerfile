FROM maven:3.9.6-eclipse-temurin-17

RUN apt-get update && \
    apt-get install -y firefox xvfb wget libgtk-3-0 libdbus-glib-1-2 libasound2t64 && \
    wget https://github.com/mozilla/geckodriver/releases/download/v0.36.0/geckodriver-v0.36.0-linux64.tar.gz && \
    tar -xvzf geckodriver-v0.36.0-linux64.tar.gz && \
    chmod +x geckodriver && \
    mv geckodriver /usr/local/bin/ && \
    rm geckodriver-v0.36.0-linux64.tar.gz

ENV DISPLAY=:99
