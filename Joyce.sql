create schema joyce;
drop table transaction;
select * from record;
drop table record;
UPDATE `joyce`.`record` 
SET `company`='JHU', `degree`='BS', `duty`='Assistant',`email`='j@gmail.com', `field`='Psychology', `proficiency`='Expert', `skill`='Java',`work_dur`='2012-2013', `work_title`='Worker', `year_grad`='2010' 
WHERE `id`='1';
