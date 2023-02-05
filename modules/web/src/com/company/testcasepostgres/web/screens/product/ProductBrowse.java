package com.company.testcasepostgres.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.testcasepostgres.entity.Product;

@UiController("testcasepostgres_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProductBrowse extends MasterDetailScreen<Product> {
}