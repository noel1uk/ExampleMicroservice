DROP TABLE IF EXISTS licenses;

CREATE TABLE examples (
  example_id        VARCHAR(100) PRIMARY KEY NOT NULL,
  organisation_id   TEXT NOT NULL,
  example_type      TEXT NOT NULL,
  product_name      TEXT NOT NULL,
  example_max       INT   NOT NULL,
  example_allocated INT,
  comment           VARCHAR(100));
