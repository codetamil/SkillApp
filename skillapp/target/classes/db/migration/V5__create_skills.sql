CREATE TABLE skills(id INT PRIMARY KEY AUTO_INCREMENT,
is_active INT NOT NULL DEFAULT 1,
cat_id INT NOT NULL, 
FOREIGN KEY(cat_id) REFERENCES category(id)
);

