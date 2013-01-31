/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amu
 */
public class ClsCookieUtil {

    /**
     *this fun creates cookie
     * @param cookieName
     * @param cookieValue
     * @param response
     * @throws Exception
     */
    public void createCookie(String cookieName, String cookieValue, HttpServletResponse response) throws Exception {
        try {
            Cookie cookie = new Cookie(cookieName, cookieValue);
            cookie.setMaxAge(60);
            response.addCookie(cookie);

        } catch (Exception e) {
            Logger.getLogger(ClsCookieUtil.class.getName()).log(Level.SEVERE, "error in creating cookie", e);
            throw e;
        }

    }

    public void deletCookie(String cookieName, HttpServletRequest request) throws Exception {
        try {
               Cookie cookies[] = request.getCookies();
                Cookie myCookie = null;
                if (cookies != null) {
                    for (int i = 0; i < cookies.length; i++) {
                       if (cookies[i].getName().equals(cookieName)) {
                            myCookie = cookies[i];
                            myCookie.setMaxAge(-1);
                            break;
                        }
                    }
                }
        } catch (Exception e) {
            Logger.getLogger(ClsCookieUtil.class.getName()).log(Level.SEVERE, "error in deleting cookie", e);
            throw e;
        }
    }

    public String getCookieValue(String cookieName, HttpServletRequest request) throws Exception {
       String cookieValue="";
       try {
               Cookie cookies[] = request.getCookies();
                          if (cookies != null) {
                    for (int i = 0; i < cookies.length; i++) {
                       if (cookies[i].getName().equals(cookieName)) {
                            cookieValue = cookies[i].getValue();
                            break;
                        }
                    }
                }
        } catch (Exception e) {
            Logger.getLogger(ClsCookieUtil.class.getName()).log(Level.SEVERE, "error in getting cookie value", e);
            throw e;
        }
       return cookieValue;
    }

}
