CREATE TABLE IF NOT EXISTS phonebook(
                          phonebook_id int GENERATED BY DEFAULT AS IDENTITY NOT NULL,
                          first_name VARCHAR(30),
                          last_name VARCHAR(30),
                          three_name VARCHAR(30),
                          number_phone VARCHAR(30),
                          address VARCHAR(30),
                          description VARCHAR(30),
                          CONSTRAINT pk_phonebook PRIMARY KEY (phonebook_id)
);