CREATE TABLE categories
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NULL,
    `description` VARCHAR(255)          NULL,
    image_url     VARCHAR(255)          NULL,
    active        BIT(1)                NULL,
    CONSTRAINT pk_categories PRIMARY KEY (id)
);