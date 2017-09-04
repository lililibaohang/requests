package net.dongliu.requests;

import net.dongliu.requests.executor.SessionContext;

import javax.annotation.concurrent.ThreadSafe;
import java.net.URL;

/**
 * Http request share cookies etc.
 * This class is threadsafe
 */
@ThreadSafe
public class Session {

    private final SessionContext context;

    Session(SessionContext context) {
        this.context = context;
    }

    public RequestBuilder get(String url) {
        return newRequest(Methods.GET, url);
    }

    public RequestBuilder post(String url) {
        return newRequest(Methods.POST, url);
    }

    public RequestBuilder put(String url) {
        return newRequest(Methods.PUT, url);
    }

    public RequestBuilder head(String url) {
        return newRequest(Methods.HEAD, url);
    }

    public RequestBuilder delete(String url) {
        return newRequest(Methods.DELETE, url);
    }

    public RequestBuilder patch(String url) {
        return newRequest(Methods.PATCH, url);
    }

    public RequestBuilder newRequest(String method, String url) {
        return new RequestBuilder().sessionContext(context).url(url).method(method);
    }

    public RequestBuilder get(URL url) {
        return newRequest(Methods.GET, url);
    }

    public RequestBuilder post(URL url) {
        return newRequest(Methods.POST, url);
    }

    public RequestBuilder put(URL url) {
        return newRequest(Methods.PUT, url);
    }

    public RequestBuilder head(URL url) {
        return newRequest(Methods.HEAD, url);
    }

    public RequestBuilder delete(URL url) {
        return newRequest(Methods.DELETE, url);
    }

    public RequestBuilder patch(URL url) {
        return newRequest(Methods.PATCH, url);
    }

    /**
     * Create new request with method and url
     */
    public RequestBuilder newRequest(String method, URL url) {
        return new RequestBuilder().sessionContext(context).url(url).method(method);
    }
}
