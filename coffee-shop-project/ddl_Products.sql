CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NULL,
    `description` VARCHAR(255)          NULL,
    base_price    DECIMAL               NULL,
    image_url     VARCHAR(255)          NULL,
    available     BIT(1)                NULL,
    category_id   BIGINT                NOT NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

ALTER TABLE products
    ADD CONSTRAINT FK_PRODUCTS_ON_CATEGORYID FOREIGN KEY (category_id) REFERENCES categories (id);