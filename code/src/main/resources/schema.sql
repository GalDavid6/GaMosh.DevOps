DROP TABLE IF EXISTS LOG;

CREATE TABLE
    LOG (
        id INT AUTO_INCREMENT PRIMARY KEY,
        type_request TEXT NOT NULL,
        routing TEXT NOT NULL,
        create_at TEXT NOT NULL
    );