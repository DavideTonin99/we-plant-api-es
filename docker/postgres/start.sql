create database weplant;
revoke all privileges on database weplant from PUBLIC;
create user "we-plant" with encrypted password 'password';
grant all privileges on database weplant to "we-plant";