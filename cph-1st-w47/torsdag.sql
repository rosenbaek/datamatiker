USE saklia;
SELECT * FROM actor;
SELECT * FROM actor WHERE last_name ="CAGE";


SELECT * FROM actor WHERE NOT first_name = "ZERO" and not first_name = "NICK";


SELECT * FROM actor WHERE first_name in ("NICK", "JOHNNY", "JAMES", "MORGAN" or "WHOOPI"); 
select * from actor where actor_id between "50" and "150";
SELECT * FROM actor where first_name LIKE "C%";
SELECT * FROM actor ORDER BY first_name;
SELECT * FROM actor ORDER BY last_name DESC;
SELECT COUNT(*) FROM actor;
SELECT COUNT(DISTINCT first_name) FROM actor;

select title from film where film_id in (select film_id from film_category where category_id = 11);
INSERT INTO actor (first_name, last_name) VALUES ("Christian", "Rosenbaek");

select * from actor where last_name = "Rosenbaek";
select * from film_actor;
insert into film_actor (actor_id,film_id) values (201, 25),(201, 106),(201, 140),(201, 166),(201, 361);
update actor set first_name = "Drag", last_name = "test" where actor_id = 201;

set foreign_key_checks=0;
delete from actor where actor_id = 201;
set foreign_key_checks=1;

select * from category;
select * from film join film_category on film.film_id = film_category.film_id join category on category.category_id = film_category.category_id where category.category_id = 11;