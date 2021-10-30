package com.bancolombia.certification.reto.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class OpenTheBrowserException extends SerenityManagedException {
    public static final String OPEN_THE_BROWSER_FAILED = "Failed open the browser.";
    public OpenTheBrowserException(String openTheBrowserFailed, Throwable testErrorException) {
        super(testErrorException);
    }
}
