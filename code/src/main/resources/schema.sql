DROP TABLE IF EXISTS LOG;

CREATE TABLE
    LOG (
        log_id INT AUTO_INCREMENT PRIMARY KEY,
        message TEXT NOT NULL,
        typeRequest TEXT NOT NULL,
        routing TEXT NOT NULL,
        createAt DATETIME NOT NULL
    );