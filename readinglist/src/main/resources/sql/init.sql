DROP TABLE IF EXISTS t_reader;
create table t_reader (
    username varchar(50),
    fullname varchar(100),
    password  varchar(50)
);

insert into t_reader(username, fullname, password) values ('Ray', 'Ray Sun', '123456');
commit;