create table TESTCASEPOSTGRES_REQUEST (
    ID bigint,
    --
    CUSTOMER_ID bigint not null,
    SUPPLIER_ID bigint not null,
    --
    primary key (ID)
);