package com.company.testcasepostgres.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.testcasepostgres.entity.Supplier;

@UiController("testcasepostgres_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class SupplierBrowse extends MasterDetailScreen<Supplier> {
}