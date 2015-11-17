-- hash bcrypt
-- admin
-- patient 
-- toanqc 
-- markpit
-- kamaroy
-- longma
-- doctor
-- doctorkelly


INSERT INTO User (USERNAME, `PASSWORD`, ENABLED) values ('toanqc', '$2a$10$rNQqVynthlBeGumvLLGT5.LMK7CxihzmGj0mbP/8jxdeOk/f4mGqm', TRUE);
INSERT INTO Authority (USERNAME, AUTHORITY) values ('toanqc', 'ROLE_ADMIN');