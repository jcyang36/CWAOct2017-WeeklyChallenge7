create schema joyce;
drop table transaction;
select * from record;
drop table record;
UPDATE `joyce`.`record` 
SET first='John', middle= 'J', last='Smith', `company`='JHU', `degree`='BS', `duty`='Assistant',`email`='j@gmail.com', `field`='Psychology', `proficiency`='Expert', `skill`='Java',`work_dur`='2012-2013', `work_title`='Worker', `year_grad`='2010'
WHERE `id`='1';
use joyce;
select * from role;
select * from user;
select * from user_roles;
INSERT INTO `joyce`.`user` (`id`, `enabled`, `password`, `username`) VALUES ('1', TRUE, 'password1', 'Bob');
INSERT INTO `joyce`.`role` (`id`, `role`) VALUES ('1', 'ROLE_USER');
INSERT INTO `joyce`.`role` (`id`, `role`) VALUES ('2', 'ROLE_ADMIN');
INSERT INTO `joyce`.`user_roles` (`user_id`, `role_id`) VALUES ('1', '2');
