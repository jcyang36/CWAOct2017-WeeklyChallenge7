create schema joyce;
drop table transaction;
select * from record;
drop table record;
UPDATE `joyce`.`record` 
SET first='John', middle= 'J', last='Smith', `company`='JHU', `degree`='BS', `duty`='Assistant',`email`='j@gmail.com', `field`='Psychology', `proficiency`='Expert', `skill`='Java',`work_dur`='2012-2013', `work_title`='Worker', `year_grad`='2010'
WHERE `id`='1';
UPDATE `joyce`.`record` 
SET first='Sally', middle= 'S', last='Adams', `company`='Amtrak', `degree`='BS', `school`='UMBC', `duty`='Assistant',`email`='s@gmail.com', `field`='Psychology', `proficiency`='Expert', `skill`='Python',`work_dur`='2012-2013', `work_title`='Worker', `year_grad`='2010'
WHERE `id`='2';
use joyce;
select * from role;
select * from user;
select * from user_roles;
INSERT INTO `joyce`.`user` (`id`, `enabled`, `password`, `username`) VALUES ('1', TRUE, 'password1', 'Bob');
INSERT INTO `joyce`.`user` (`id`, `enabled`, `password`, `username`) VALUES ('2', TRUE, 'password2', 'Betty');
INSERT INTO `joyce`.`role` (`id`, `role`) VALUES ('1', 'ROLE_SEEKER');
INSERT INTO `joyce`.`role` (`id`, `role`) VALUES ('2', 'ROLE_RECRUITER');
INSERT INTO `joyce`.`user_roles` (`user_id`, `role_id`) VALUES ('1', '2');
INSERT INTO `joyce`.`user_roles` (`user_id`, `role_id`) VALUES ('2', '1');