CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE users
(
    id         BIGINT    DEFAULT global_seq.nextval PRIMARY KEY,
    login       VARCHAR(255)            NOT NULL,
    password   VARCHAR(255)            NOT NULL,
    is_active BOOLEAN   DEFAULT TRUE  NOT NULL,
    account_non_locked   BOOLEAN   DEFAULT TRUE  NOT NULL,
    role VARCHAR(255)            NOT NULL
);