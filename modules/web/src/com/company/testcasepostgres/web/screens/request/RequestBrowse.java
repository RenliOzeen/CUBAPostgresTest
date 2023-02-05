package com.company.testcasepostgres.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.testcasepostgres.entity.Request;

@UiController("testcasepostgres_Request.browse")
@UiDescriptor("request-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class RequestBrowse extends MasterDetailScreen<Request> {
}