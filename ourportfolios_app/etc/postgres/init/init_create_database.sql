CREATE ROLE ourportflios WITH LOGIN PASSWORD 'ourportflios';

CREATE DATABASE ourportflios
  WITH 
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    OWNER = ourportflios
    TEMPLATE = template0;
