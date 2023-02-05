package com.company.testcasepostgres.web.screens.requestitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.testcasepostgres.entity.RequestItem;

@UiController("testcasepostgres_RequestItem.edit")
@UiDescriptor("request-item-edit.xml")
@EditedEntityContainer("requestItemDc")
@LoadDataBeforeShow
public class RequestItemEdit extends StandardEditor<RequestItem> {
}