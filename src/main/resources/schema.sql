--DROP TABLE IF EXISTS user_info;

CREATE TABLE user_info (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  mobile VARCHAR(250) DEFAULT NULL,
  password VARCHAR(250) DEFAULT NULL
);