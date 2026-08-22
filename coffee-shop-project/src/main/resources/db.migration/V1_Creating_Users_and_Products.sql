CREATE TABLE users
(
    user_id    BIGINT AUTO_INCREMENT NOT NULL,
    username   VARCHAR(255)          NOT NULL,
    email      VARCHAR(255)          NOT NULL,
    password   VARCHAR(255)          NOT NULL,
    user_phone VARCHAR(255)          NOT NULL,
    user_role  VARCHAR(255)          NOT NULL,
    image_url  VARCHAR(255)          NOT NULL,
    created_at datetime              NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (user_id)
);

CREATE TABLE categories
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NOT NULL,
    `description` VARCHAR(255)          NOT NULL,
    image_url     VARCHAR(255)          NOT NULL,
    active        BIT(1)                NOT NULL,
    CONSTRAINT pk_categories PRIMARY KEY (id)
);

CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NOT NULL,
    `description` VARCHAR(255)          NOT NULL,
    base_price    DECIMAL               NOT NULL,
    image_url     VARCHAR(255)          NOT NULL,
    available     BIT(1)                NOT NULL,
    category_id   BIGINT                NOT NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

ALTER TABLE products
    ADD CONSTRAINT FK_PRODUCTS_ON_CATEGORYID FOREIGN KEY (category_id) REFERENCES categories (id);