CREATE TABLE users
(
    user_id    BIGINT AUTO_INCREMENT NOT NULL,
    username   VARCHAR(255)          NULL,
    email      VARCHAR(255)          NULL,
    password   VARCHAR(255)          NULL,
    user_phone VARCHAR(255)          NULL,
    user_role  VARCHAR(255)          NULL,
    created_at datetime              NULL,
    CONSTRAINT pk_users PRIMARY KEY (user_id)
);