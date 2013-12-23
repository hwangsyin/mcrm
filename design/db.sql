-- create database
create database if not exists crm1 default character set utf8;

-- create table
-- phone
create table mt_phone (
	id bigint not null,
	number varchar(32) not null,
	type varchar(16) not null,
	contact_id bigint not null
) character set utf8;

alter table mt_phone add constraint pk_mt_phone_id primary key(id);

-- customer type
create table cu_customer_type (
	id bigint not null,
	ct_key varchar(16) not null,
	name varchar(64) not null,
	display_name varchar(128) not null,
	enable char(1) not null,
	description varchar(256)
) character set utf8;

alter table cu_customer_type add constraint pk_cu_customer_type_id primary key(id);
alter table cu_customer_type add constraint uq_cu_customer_type_key unique(ct_key);
alter table cu_customer_type add constraint chk_cu_customer_type_enable check(enable='0' or enable='1');

-- customer
create table cu_customer (
	id bigint not null,
	title varchar(32) not null,
	phone varchar(32) not null,
	name varchar(32),
	age smallint,
	email varchar(256),
	address varchar(256),
	type integer not null,
	position varchar(256),
	enable char(1) not null,
	start_time timestamp,
	end_time timestamp
) character set utf8;

alter table cu_customer add constraint pk_cu_customer_id primary key(id);
alter table cu_customer add constraint chk_cu_customer_enable check(enable='0' or enable='1');

-- session type
create table cu_session_type (
	id 
) character set utf8;