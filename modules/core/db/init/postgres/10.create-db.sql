-- begin TESTCASEPOSTGRES_REQUEST_ITEM
create table TESTCASEPOSTGRES_REQUEST_ITEM (
    ID bigint,
    DTYPE varchar(31),
    --
    PRODUCT_ID bigint not null,
    REQUEST_ID bigint not null,
    VOLUME double precision not null,
    --
    primary key (ID)
)^
-- end TESTCASEPOSTGRES_REQUEST_ITEM
-- begin TESTCASEPOSTGRES_CUSTOMER
create table TESTCASEPOSTGRES_CUSTOMER (
    ID bigint,
    --
    NAME varchar(255) not null,
    CITY varchar(255) not null,
    --
    primary key (ID)
)^
-- end TESTCASEPOSTGRES_CUSTOMER
-- begin TESTCASEPOSTGRES_SUPPLIER
create table TESTCASEPOSTGRES_SUPPLIER (
    ID bigint,
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TESTCASEPOSTGRES_SUPPLIER
-- begin TESTCASEPOSTGRES_PRODUCT
create table TESTCASEPOSTGRES_PRODUCT (
    ID bigint,
    --
    NAME varchar(255) not null,
    COST double precision not null,
    --
    primary key (ID)
)^
-- end TESTCASEPOSTGRES_PRODUCT
-- begin TESTCASEPOSTGRES_REQUEST
create table TESTCASEPOSTGRES_REQUEST (
    ID bigint,
    --
    CUSTOMER_ID bigint not null,
    SUPPLIER_ID bigint not null,
    --
    primary key (ID)
)^
-- end TESTCASEPOSTGRES_REQUEST
