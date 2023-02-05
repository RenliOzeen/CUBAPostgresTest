package com.company.testcasepostgres.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testcasepostgres.entity.Customer;

@UiController("testcasepostgres_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CustomerBrowse extends MasterDetailScreen<Customer> {
}