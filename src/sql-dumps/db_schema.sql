CREATE TABLE company
(
  id   VARCHAR(255) PRIMARY KEY NOT NULL,
  name VARCHAR(255)             NOT NULL
);
CREATE TABLE person
(
  dtype      VARCHAR(31)              NOT NULL,
  id         VARCHAR(255) PRIMARY KEY NOT NULL,
  name       VARCHAR(255)             NOT NULL,
  company_id VARCHAR(255)
);
CREATE TABLE seminar
(
  id         VARCHAR(255) PRIMARY KEY NOT NULL,
  date       DATE,
  name       VARCHAR(255)             NOT NULL,
  officer_id VARCHAR(255)
);
CREATE TABLE seminar_employees
(
  seminars_id  VARCHAR(255) NOT NULL,
  employees_id VARCHAR(255) NOT NULL,
  CONSTRAINT seminar_employees_pkey PRIMARY KEY (seminars_id, employees_id)
);
CREATE UNIQUE INDEX uk_niu8sfil2gxywcru9ah3r4ec5
  ON company (name);
ALTER TABLE person
  ADD FOREIGN KEY (company_id) REFERENCES company (id);
ALTER TABLE seminar
  ADD FOREIGN KEY (officer_id) REFERENCES person (id);
ALTER TABLE seminar_employees
  ADD FOREIGN KEY (seminars_id) REFERENCES seminar (id);
ALTER TABLE seminar_employees
  ADD FOREIGN KEY (employees_id) REFERENCES person (id);