```SQL
CREATE TABLE lab03(  
    seq int NOT NULL primary key AUTO_INCREMENT comment 'primary key',
    name varchar(255),
    country varchar(255)
) default charset utf8 comment '';

insert into lab03(name, country) values('홍길동','한국');
insert into lab03(name, country) values('고길동','냥국');

select * from lab03;
```