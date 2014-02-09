package org.easyHttp

data public class RequestHeaders(val accept: String = "*/*",
                                 val acceptCharSet: String = "",
                                 val host: String = "127.0.0.1",
                                 val from: String = "",
                                 val contentType: String = "")
