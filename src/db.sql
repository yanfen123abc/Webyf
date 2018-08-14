drop database if exists demo;
create database demo default character set utf8;
use demo;
drop table if exists product;

create table product
(
id           int not null auto_increment,
name         varchar(20),
price        decimal(8,2),
remark       longtext,
date         timestamp default CURRENT_TIMESTAMP,
primary key (id)
);

insert into product(name, price,remark) values ('圣得西服',5000.00,'这里是简单介绍');
insert into product(name, price,remark) values ('圣得西服2',6000.00,'这里是简单介绍2');
insert into product(name, price,remark) values ('圣得西服3',7000.00,'这里是简单介绍3');

select * from product;
