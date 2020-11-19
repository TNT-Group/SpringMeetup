DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
	id bigserial NOT NULL,
	username varchar(50) NOT NULL,
	"password" varchar(50) NOT NULL,
	email varchar(50) NOT NULL,
	CONSTRAINT users_pkey PRIMARY KEY (id)
);