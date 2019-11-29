CREATE DATABASE app;
CREATE USER app WITH PASSWORD 'app';
GRANT ALL PRIVILEGES ON DATABASE app TO app;

\connect app

CREATE TABLE public.client
(
    id uuid NOT NULL,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    client_phone varchar(100) NOT NULL,
    client_email varchar(100) NOT NULL,
    CONSTRAINT users_pkey PRIMARY KEY (id)
);
ALTER TABLE public.client
    OWNER to app