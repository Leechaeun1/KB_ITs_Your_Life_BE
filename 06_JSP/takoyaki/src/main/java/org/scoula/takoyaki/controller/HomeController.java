package org.scoula.takoyaki.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeController {
    public static String getIndex(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        return "welcome";
    }
}
