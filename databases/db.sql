use mydb;

create table Country(
id int not null primary key auto_increment,
name varchar(40)
);

truncate table Country;

create table Capital(
id int not null primary key auto_increment,
country_id int,
name varchar(20),
foreign key (country_id)
references Country(id)
);