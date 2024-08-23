package io.loop.pages;

import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;

public class POM {

    private SmartBearLoginPage smartBearLoginPage;

    public SmartBearLoginPage getSmartBearLoginPage() {
        if(smartBearLoginPage == null) {
            smartBearLoginPage = new SmartBearLoginPage();
        }
        return smartBearLoginPage;
    }


}
